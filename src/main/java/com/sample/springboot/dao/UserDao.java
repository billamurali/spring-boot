package com.sample.springboot.dao;

import java.util.HashMap;
import java.util.Map;

import com.sample.springboot.domain.User;

public class UserDao {
	
	Map<String, String> userDb =new HashMap<String, String>();
	
	
	public void create(String userName, String password) {
		//transaction
		//Entity convert
		//table.create
		//Comitt
		//Optional: entity to Pojo
		userDb.put(userName, password);
	}
	
	
	public void update(String userName, String password) {
		userDb.put(userName, password);
	}
	
	
	public User read(String userName) {
		String password = userDb.get(userName);
		return password == null ? null : new User(userName, password);
	}
	
	public Map<String, String> list() 
	{	
		return userDb;

	}

}
