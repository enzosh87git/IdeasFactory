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

	@Override
	public User addUser(User user) {
		persist(user);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		User user = findUser(id); 
		delete(user); 
		return user;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<User> getListUsers() { return getSession().createCriteria(User.class).list(); }

	@SuppressWarnings("deprecation")
	@Override
	public User findUser(int id) {
		Criteria c = getSession().createCriteria(User.class);
		c.add(Restrictions.eq("id", id));
		return (User) c.uniqueResult();
	}
	
}
