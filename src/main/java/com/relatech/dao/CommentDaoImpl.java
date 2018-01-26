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

	@Override
	public Comment addComment(Comment comment) {
		persist(comment);
		return comment;
	}

	@Override
	public Comment deleteComment(int id) {
		Comment comment = findComment(id); 
		delete(comment); 
		return comment;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Comment> getListComments() { 
		return getSession().createCriteria(Comment.class).list(); 
	}

	@SuppressWarnings("deprecation")
	@Override
	public Comment findComment(int id) {
		Criteria c = getSession().createCriteria(Comment.class);
		c.add(Restrictions.eq("id", id));
		return (Comment) c.uniqueResult();
	}

	@Override
	public Comment updateComment(Comment comment) {
		update(comment);
		return comment;
	}

}
