package com.netapp.ngsslab.service.authserver.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.util.matcher.RequestMatcher;

/**
 * @author shenaz
 *
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Value("${resource.id:spring-boot-application}")
	private String resourceId;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter#configure(org.springframework
	 * .security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer)
	 */
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		// @formatter:off
        resources.resourceId(resourceId);
        // @formatter:on
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter#configure(org.springframework
	 * .security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	public void configure(HttpSecurity http) throws Exception {
		// @formatter:off
        	http.requestMatcher(new OAuthRequestedMatcher())
                .authorizeRequests()
                	.antMatchers(HttpMethod.OPTIONS).permitAll()
                    .anyRequest().authenticated();
        // @formatter:on
	}

	/**
	 * @author shenaz
	 *
	 */
	private static class OAuthRequestedMatcher implements RequestMatcher {

		public boolean matches(HttpServletRequest request) {
			String auth = request.getHeader("Authorization");
			// Determine if the client request contained an OAuth Authorization
			boolean haveOauth2Token = (auth != null) && auth.startsWith("Bearer");
			boolean haveAccessToken = request.getParameter("access_token") != null;
			return haveOauth2Token || haveAccessToken;
		}
	}

}
