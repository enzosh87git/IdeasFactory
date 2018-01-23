package com.relatech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relatech.dao.CommentDao;
import com.relatech.model.Comment;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao cdao;
	
	@Override
	public Comment save(Comment comment) { return cdao.addComment(comment);	}

	@Override
	public Comment getId(int id) { return cdao.findComment(id); }

	@Override
	public Comment deleteId(int id) { return cdao.deleteComment(id); }

	@Override
	public List<Comment> list() {return cdao.getListComments(); }

}
