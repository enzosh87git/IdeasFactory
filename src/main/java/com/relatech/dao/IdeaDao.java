package com.relatech.dao;

import java.util.List;

import com.relatech.model.Idea;

public interface IdeaDao {

	Idea addIdea(Idea idea);

	Idea deleteIdea(int id);

	List<Idea> getListIdeas();

	Idea findIdea(int id);

}
