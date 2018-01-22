package com.relatech.services;

import java.util.List;

import com.relatech.model.Comment;

public interface CommentService {

	Comment add(Comment comment);

	List<Comment> getList();

	Comment update(Comment comment);

	void delete(Comment comment);

}
