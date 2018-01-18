package com.relatech.services;

import java.util.List;

public interface CommentService {

	Comment addComment(Comment comment);

	List<Comment> getListComments();

	Comment updateComment(Comment comment);

	void deleteComment(Comment comment);

}
