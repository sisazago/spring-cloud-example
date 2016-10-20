package com.spring.cloud.client.demo.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexRestController {
	
	@Value("${user.role}")
    private String role;
	
	@Value("${user.name}")
	private String username;
	
	@RequestMapping( value = "/developer", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String whoami() {
		return String.format("Hello! You're %s and you'll become a(n) %s...\n", username, role);
	}
}
