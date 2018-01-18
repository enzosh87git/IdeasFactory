package com.relatech.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdeaServiceImpl implements IdeaService {
	
	@Autowired
	private IdeaDao dao;

	@Override
	public Idea addIdea(Idea idea) {
		return dao.addIdea(idea);
	}

	@Override
	public Idea updateIdea(Idea idea) {
		return dao.updateIdea(idea);
	}

	@Override
	public void deleteIdea(Idea idea) {
		dao.deleteIdea(idea);

	}
	
	@Override
	public List<Idea> getListIdeas() {
		return dao.getListIdeas();
	}
	
}
