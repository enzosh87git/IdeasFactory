package com.relatech.dao;

import java.util.List;

import com.relatech.model.Comment;

public interface CommentDao {

	Comment addComment(Comment comment);

	List<Comment> getListComments();

	Comment updateComment(Comment comment);

	void deleteComment(Comment comment);
}
