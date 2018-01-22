package com.relatech.dao;

import java.util.List;

import com.relatech.model.Idea;

public interface IdeaDao {
	
	Idea addIdea(Idea idea);
	
	Idea updateIdea(Idea idea);
	
	void deleteIdea(Idea idea);
	
	List<Idea> getListIdeas();
}
