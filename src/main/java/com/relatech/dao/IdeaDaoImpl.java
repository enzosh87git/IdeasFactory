package com.relatech.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.relatech.model.Idea;

@Repository
@Transactional
public class IdeaDaoImpl extends AbstractDao implements IdeaDao {

	@Override
	public Idea addIdea(Idea idea) {
		persist(idea);
		return idea;
	}

	@Override
	public Idea deleteIdea(int id) {
		Idea idea = findIdea(id); 
		delete(idea); 
		return idea;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Idea> getListIdeas() {
		return getSession().createCriteria(Idea.class).list();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Idea findIdea(int id) {
		Criteria c = getSession().createCriteria(Idea.class);
		c.add(Restrictions.eq("id", id));
		return (Idea) c.uniqueResult();
	}
	
}
