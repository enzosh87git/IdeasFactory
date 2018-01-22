package com.relatech.services;

import java.util.List;

import com.relatech.model.Idea;

public interface IdeaService {
	
	Idea add(Idea idea);
	
	Idea update(Idea idea);
	
	void delete(Idea idea);
	
	List<Idea> getList();
}