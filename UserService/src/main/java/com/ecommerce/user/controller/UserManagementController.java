package com.ecommerce.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.user.model.User;

@RestController
@RequestMapping("/user")
public class UserManagementController {
	
	@Value("${greeting}")
	private String msg;
	
	@GetMapping("/getUserInfo")
	public User getUserInfo() {
		System.out.println(this.msg);
		User user = new User();
		user.setUserId("sivaroyala");
		user.setUserEmail("sivaroyala1986@gmail.com");
		user.setAddress("address");
		
		return user;
		
	}

}
