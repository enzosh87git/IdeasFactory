package com.relatech.services;

import java.util.List;

public interface UserService {

	User addUser(User user);

	List<User> getListUsers();

	User updateUser(User user);

	void deleteUser(User user);

}