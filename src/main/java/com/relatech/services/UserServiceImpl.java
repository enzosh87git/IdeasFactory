package com.relatech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public User addUser(User user) {
		return dao.addUser(user);
	}

	@Override
	public List<User> getListUsers() {
		return dao.getListUsers();
	}

	@Override
	public User updateUser(User user) {
		return dao.updateUser(user);
	}

	@Override
	public void deleteUser(User user) {
		dao.deleteUser(user);
	}

}
