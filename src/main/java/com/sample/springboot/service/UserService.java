package com.sample.springboot.service;

import java.util.List;
import java.util.Map;

import com.sample.springboot.dao.UserDao;
import com.sample.springboot.domain.User;

public class UserService {
	UserDao dao = new UserDao();

	/**
	 * create method
	 * 
	 * @param userName
	 * @param password
	 * @throws Exception
	 */

	public void create(String userName, String password) throws Exception {
		User user = dao.read(userName);
		if (null == user) {
			dao.create(userName, password);
		} else
			throw new Exception("User already exist");
	}

	/**
	 * 
	 * update method
	 * 
	 * @param userName
	 * @param password
	 * @throws Exception
	 */
	public void update(String userName, String password) throws Exception {
		User user = dao.read(userName);
		if (null != user) {
			dao.update(userName, password);
		} else
			throw new Exception("user dosent exists");

	}

	/**
	 * read method
	 * 
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public User read(String userName) throws Exception {
		User user = dao.read(userName);
		if (null == user) {
			throw new Exception("User doesn't exist");
		}
		return user;

	}

	/**
	 * list method
	 * 
	 * @return list
	 */
	public List<User> list() {

		List<User> h2 = dao.list();
		return h2;

	}

}
