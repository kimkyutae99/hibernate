package org.zerock.hibernate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.zerock.domain.BoardVO;

public class UserHibernateProviderImpl  implements UserProvider {
	
	public void insertUser(BoardVO boardVO) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(boardVO);
		
		tx.commit();
		session.close();
	}

	
	public BoardVO findUser(String userId) {
		return new BoardVO();
	}
	
	public BoardVO updateUser(String userId, String updateName) {
		return new BoardVO();
	}

	
}
