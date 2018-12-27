package com.sample.springboot.rest;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.domain.User;
import com.sample.springboot.service.UserService;

@RestController
public class UserRestService {

	UserService userService = new UserService();

	/**
	 * hello method automatically maps to this method
	 * 
	 * @return string value
	 */
	@RequestMapping("/")
	public String hello() {
		return "Application is up";
	}

	/**
	 * create method
	 * 
	 * @param user which accepts username password
	 * @return string value
	 * @throws Exception
	 */
	@PostMapping("/create")
	public @ResponseBody String create(@RequestBody User user) throws Exception {
		userService.create(user.getUserName(), user.getPassword());
		return "SUCCESS";
	}

	/**
	 * update method
	 * 
	 * @param user as username and password
	 * @return string value
	 * @throws Exception
	 */
	@PostMapping("/update")
	public String update(User user) throws Exception {
		userService.update(user.getUserName(), user.getPassword());
		return "updated sucessfully";
	}

	/**
	 * list method
	 * 
	 * @return all the values in list
	 */
	@RequestMapping("/list")
	public List<User> list() {
		List<User> h3 = userService.list();

		return h3;
	}

	/**
	 * read method
	 * 
	 * @param userName
	 * @return Username
	 * @throws Exception
	 */
	@GetMapping("/read")
	public User read(String userName) throws Exception {
		return userService.read(userName);
	}

}
