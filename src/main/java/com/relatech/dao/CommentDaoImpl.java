package com.relatech.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.relatech.model.Comment;

@Repository
@Transactional
public class CommentDaoImpl extends AbstractDao implements CommentDao {

	public Comment addComment(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Comment> getListComments() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comment updateComment(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

}
