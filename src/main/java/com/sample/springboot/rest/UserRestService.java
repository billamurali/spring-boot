package com.sample.springboot.rest;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.domain.User;
import com.sample.springboot.service.UserService;

@RestController
public class UserRestService {
	
	UserService userService = new UserService();
//	UserDao userDao1 = new UserDao();
	
	@RequestMapping("/")
	public String hello() {
		return "Application is up";
	}
	
	@PostMapping("/create")
	public String create(User user) throws Exception {
		 userService.create(user.getUserName(), user.getPassword());
		 return "SUCCESS";
	}

	
	  @PostMapping("/update") 
	  public String update(User user)  
	  { 
		  userService.update(user.getUserName(), user.getPassword());
		  return "updated sucessfully";
	  }
	  
	  @RequestMapping("/list") 
	  public Map<String, String> list() 
	  { 
		  Map<String, String> h3=	userService.list();
		
		  return h3; 
	  }
	 
	@RequestMapping("/read")
	public User read(String userName) throws Exception {
		return userService.read(userName);
	}
	  
	 

}
