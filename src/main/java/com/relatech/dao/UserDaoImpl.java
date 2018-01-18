package it.team.dao;

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
	@SuppressWarnings("unchecked")
	public List<User> getListUsers() {
		return getSession().createCriteria(User.class).list();
	}

	@Override
	public User updateUser(User user) {
		update(user);
		return user;
	}

	@Override
	public void deleteUser(User user) {
		delete(user);
	}

}
