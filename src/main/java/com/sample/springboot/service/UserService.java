package com.sample.springboot.service;

import java.util.Map;

import com.sample.springboot.dao.UserDao;
import com.sample.springboot.domain.User;

public class UserService {
	UserDao dao = new UserDao();
	
	public void create(String userName, String password) throws Exception {
		User user = dao.read(userName);
		if(null == user) {
			dao.create(userName, password);
		}else
			throw new Exception("User doesn't exist");
	}
	
	public void update(String userName, String password)  
	{		
			User user = dao.read(userName);
			
				dao.update(userName, password);
			

	}
	
	public User read(String userName) throws Exception {
		User user = dao.read(userName);
		if(null == user) {
			throw new Exception("User doesn't exist");
		}
		return user;

	}
	
	public  	Map<String, String> list() {
		
				Map<String, String> h2=dao.list();
				return h2;

	}

}
