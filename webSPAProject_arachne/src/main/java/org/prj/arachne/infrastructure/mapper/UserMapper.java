package org.prj.arachne.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.exceptions.PersistenceException;
import org.prj.arachne.domain.User;



@Mapper
public interface UserMapper {

	public void insert(User user)throws PersistenceException;
	
	public User selectOne(String id) throws PersistenceException;
	
	
}
