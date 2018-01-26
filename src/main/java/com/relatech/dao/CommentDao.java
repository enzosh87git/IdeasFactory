package com.relatech.dao;

import java.util.List;

import com.relatech.model.Comment;
import com.relatech.model.Idea;

public interface CommentDao {

	Comment addComment(Comment comment);
	
	Comment updateComment(Comment comment);

	Comment deleteComment(int id);

	List<Comment> getListComments();

	Comment findComment(int id);
}
