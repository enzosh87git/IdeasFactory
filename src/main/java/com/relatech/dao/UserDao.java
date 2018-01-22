package com.relatech.dao;

import java.util.List;

import com.relatech.model.User;

public interface UserDao {

	User addUser(User user);

	List<User> getListUsers();

	User updateUser(User user);

	void deleteUser(User user);

}
