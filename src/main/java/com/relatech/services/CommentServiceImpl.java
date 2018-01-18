package com.relatech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao dao;

	@Override
	public Comment addComment(Comment comment) {
		return dao.addComment(comment);
	}

	@Override
	public Comment updateComment(Comment comment) {
		return dao.updateComment(comment);
	}

	@Override
	public void deleteComment(Comment comment) {
		dao.deleteComment(comment);
	}

	@Override
	public List<Comment> getListComments() {
		return dao.getListComments();
	}

}
