package com.relatech.services;

import java.util.List;

import com.relatech.model.Comment;

public interface CommentService {

	Comment save(Comment comment);

	Comment update(Comment comment);
	
	Comment getId(int id);

	Comment deleteId(int id);

	List<Comment> list();
}
