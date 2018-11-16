package com.netapp.ngsslab.sample.security.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author shenaz
 *
 */
@SpringBootApplication
@EnableResourceServer
public class SpringSecuritySsoApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySsoApplication.class, args);
	}
}
