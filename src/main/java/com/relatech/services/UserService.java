package com.relatech.services;

import java.util.List;

import com.relatech.model.User;

public interface UserService {

	User add(User user);

	List<User> getList();

	User update(User user);

	void delete(User user);

}