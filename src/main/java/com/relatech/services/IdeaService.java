package com.relatech.services;

public interface IdeaService {
	
	Idea addIdea(Idea idea);
	
	Idea updateIdea(Idea idea);
	
	void deleteIdea(Idea idea);
	
	List<Idea> getListIdeas();
}