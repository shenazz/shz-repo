/**
 * 
 */
package com.netapp.ngsslab.sample.security.sso;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.jose4j.json.JsonUtil;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.jwt.consumer.JwtContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * @author shenaz
 *
 */
@Component
@Order()
public class MyCustomFilter implements Filter {

	private JwtConsumer jwtConsumer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		jwtConsumer = new JwtConsumerBuilder().setSkipAllValidators().setDisableRequireSignature().setSkipSignatureVerification().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		final String authHeader = req.getHeader("Authorization");
		if (authHeader != null && authHeader.startsWith("Bearer")) {
			final String accessToken = authHeader.split("Bearer")[1].trim();

			JwtContext jwtContext;
			try {
				jwtContext = jwtConsumer.process(accessToken);
				logJWTClaims(jwtContext);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		chain.doFilter(request, response);

	}

	/**
	 * @param jwtContext
	 */
	private void logJWTClaims(JwtContext jwtContext) {
		System.out.println(prettyPrintJson(JsonUtil.toJson(jwtContext.getJwtClaims().getClaimsMap())));
	}

	/**
	 * @param flatJson
	 * @return
	 */
	private String prettyPrintJson(String flatJson) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(flatJson);
		return gson.toJson(je);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// nothing
	}

}
