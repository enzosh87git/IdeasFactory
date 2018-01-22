package com.relatech.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(Object obj) {
		getSession().saveOrUpdate(obj);

	}

	public void delete(Object obj) {
		getSession().delete(obj);
	}
	
}
