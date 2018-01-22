package com.relatech.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.relatech.model.User;

@Repository
@Transactional
public class UserDaoImpl extends AbstractDao implements UserDao {

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getListUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	
}
