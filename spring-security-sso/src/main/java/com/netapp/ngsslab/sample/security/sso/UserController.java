/**
 * 
 */
package com.netapp.ngsslab.sample.security.sso;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenaz
 *
 */
@RestController
public class UserController {

	/**
	 * @param principal
	 * @return
	 */
	@RequestMapping("/user/me")
	public Principal user(Principal principal) {
		System.out.println(principal);
		return principal;
	}
}
