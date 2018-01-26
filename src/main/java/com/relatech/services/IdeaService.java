package com.relatech.services;

import java.util.List;

import com.relatech.model.Idea;

public interface IdeaService {
	
	Idea save(Idea idea);
	
	Idea update(Idea idea);
	
	Idea getId(int id);
	
	Idea deleteId(int id);
	
	List<Idea> list();
}