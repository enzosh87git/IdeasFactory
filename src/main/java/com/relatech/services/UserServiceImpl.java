package com.relatech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relatech.dao.UserDao;
import com.relatech.model.User;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao usdao;
	
	@Override
	public User add(User user) { return usdao.addUser(user); }

	@Override
	public List<User> getList() { return usdao.getListUsers(); }

	@Override
	public User delete(int id) { return usdao.deleteUser(id); }

	@Override
	public User findUser(int id) { return usdao.findUser(id); }

	@Override
	public User update(User user) { return usdao.updateUser(user); }

}
