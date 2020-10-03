package com.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static Integer userCount = 3;

	static {
		users.add(new User(1, "Teja", new Date()));
		users.add(new User(2, "Sonu", new Date()));
		users.add(new User(3, "Mani", new Date()));
	}
	
	public List<User> findAll()
	{
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
		
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
			
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
	
}