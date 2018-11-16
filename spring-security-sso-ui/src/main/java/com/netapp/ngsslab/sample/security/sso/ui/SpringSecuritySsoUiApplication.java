package com.netapp.ngsslab.sample.security.sso.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

/**
 * @author shenaz
 *
 */
@SpringBootApplication
public class SpringSecuritySsoUiApplication extends SpringBootServletInitializer {

	/**
	 * @return
	 */
	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySsoUiApplication.class, args);
	}
}
