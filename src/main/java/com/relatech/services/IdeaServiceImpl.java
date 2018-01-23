package com.relatech.services;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relatech.dao.IdeaDao;
import com.relatech.model.Idea;

@Service
public class IdeaServiceImpl implements IdeaService {

	@Autowired
	private IdeaDao idao;
	
	@Override
	public Idea save(Idea idea) { 
		idea.setTime(Timestamp.from(Instant.now()));
		return idao.addIdea(idea); }

	@Override
	public Idea deleteId(int id) { return idao.deleteIdea(id); }

	@Override
	public Idea getId(int id) { return idao.findIdea(id); }

	@Override
	public List<Idea> list() { return idao.getListIdeas(); }

}
