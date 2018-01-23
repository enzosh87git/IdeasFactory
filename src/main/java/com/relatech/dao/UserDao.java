package com.relatech.dao;

import java.util.List;

import com.relatech.model.User;

public interface UserDao {

	User addUser(User user);

	User deleteUser(int id);

	List<User> getListUsers();

	User findUser(int id);

}
