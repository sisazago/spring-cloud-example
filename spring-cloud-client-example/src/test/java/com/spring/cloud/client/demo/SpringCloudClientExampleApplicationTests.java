package com.spring.cloud.client.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.spring.cloud.client.demo.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudClientExampleApplicationTests {

	@Test
	public void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		
		Assert.assertNotNull("User exists", restTemplate.getForObject("http://localhost:8080/developer", User.class));
	}

}
