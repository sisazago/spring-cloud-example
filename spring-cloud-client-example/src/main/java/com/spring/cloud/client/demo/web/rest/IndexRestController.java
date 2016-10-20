package com.spring.cloud.client.demo.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.client.demo.domain.User;

@RestController
@RefreshScope
public class IndexRestController {
	
	@Value("${user.role}")
    private String role;
	
	@Value("${user.name}")
	private String username;
	
	@RequestMapping( value = "/developer")
	public ResponseEntity<?> response() {
		User user = new User();
		user.setName(username);
		user.setRole(role);
		user.setMessage(String.format("Hello! You're %s and you'll become a(n) %s...\n", username, role));
		return ResponseEntity.ok(user);
	}
}
