package com.relatech.services;

import java.util.List;

import com.relatech.model.User;

public interface UserService {

	User add(User user);

	User update(User user);
	
	List<User> getList();
	
	User findUser(int id);

	User delete(int id);
	
	User findUsername( String username );

}