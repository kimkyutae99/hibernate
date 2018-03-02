package org.zerock.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.zerock.domain.BoardVO;

public interface UserProvider {
	
public void insertUser(BoardVO user);
	
	public BoardVO findUser(String userId);
	
	public BoardVO updateUser(String userId, String updateName);

}
