package com.relatech.dao;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class IdeaDaoImpl extends AbstractDao implements IdeaDao {

	@Override
	public Idea addIdea(Idea idea) {
		persist(idea);
		return idea;
	}

	@Override
	public Idea updateIdea(Idea idea) {
		update(idea);
		return idea;
	}

	@Override
	public void deleteIdea(Idea idea) {
		delete(idea);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Idea> getListIdeas() {
		return getSession().createCriteria(Idea.class).list();
	}

}
