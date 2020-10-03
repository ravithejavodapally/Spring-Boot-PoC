package com.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
/*	public EntityModel<User> getUserByName(String name){
	List<User> users = findAll();
	
	return users.stream().findFirst(x -> x.getName().equals(name));
		
		
	}*/

}
