package come.relatech.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CommentDaoImpl extends AbstractDao implements CommentDao {

	@Override
	public Comment addComment(Comment comment) {
		persist(comment);
		return comment;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Comment> getListComments() {
		return getSession().createCriteria(Comment.class).list();
	}

	@Override
	public Comment updateComment(Comment comment) {
		update(comment);
		return comment;
	}

	@Override
	public void deleteComment(Comment comment) {
		delete(comment);
	}

}
