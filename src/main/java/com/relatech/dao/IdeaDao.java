package com.relatech.dao;

import java.time.LocalDate;

public interface IdeaDao {
	
	Idea addIdea(Idea idea);
	
	Idea updateIdea(Idea idea);
	
	void deleteIdea(Idea idea);
	
	List<Idea> getListIdeas();
}
