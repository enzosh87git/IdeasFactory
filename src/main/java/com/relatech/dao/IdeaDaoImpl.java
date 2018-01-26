package com.relatech.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Idea> getListIdeas() {
		//return getSession().createCriteria(Idea.class).list();
		Criteria c = getSession().createCriteria(Idea.class);
		//c.setProjection(Projections.distinct(Projections.property("id")));
		c.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return c.list();
	}

	@Override
	public Idea findIdea(int id) {
		Criteria c = getSession().createCriteria(Idea.class);
		c.add(Restrictions.eq("id", id));
		return (Idea) c.uniqueResult();
	}

	@Override
	public Idea updateIdea(Idea idea) {
		update(idea);
		return idea;
	}
	
}
