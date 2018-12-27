package com.sample.springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sample.springboot.domain.User;
/**
 * 
 * @author Murali
 *
 */
public class UserDao{

	Map<String, String> userDb = new HashMap<String, String>();

	public void create(String userName, String password) {
		userDb.put(userName, password);
	}

	public void update(String userName, String password) {
		userDb.put(userName, password);

	}

	public User read(String userName) {
		String password = userDb.get(userName);
		return password == null ? null : new User(userName, password);
	}

	public List<User> list() {
		List<User> myList = (List<User>) new ArrayList<User>();
		Iterator<Map.Entry<String, String>> itr = userDb.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			myList.add(new User(entry.getKey(), entry.getValue()));

		}

		return myList;

	}

}
