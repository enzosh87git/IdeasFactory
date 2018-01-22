package com.relatech.dao;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.relatech.model.Idea;

@Repository
@Transactional
public class IdeaDaoImpl extends AbstractDao implements IdeaDao {

	public Idea addIdea(Idea idea) {
		// TODO Auto-generated method stub
		return null;
	}

	public Idea updateIdea(Idea idea) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteIdea(Idea idea) {
		// TODO Auto-generated method stub
		
	}

	public List<Idea> getListIdeas() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
