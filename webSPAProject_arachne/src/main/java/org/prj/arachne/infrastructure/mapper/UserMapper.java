package org.prj.arachne.infrastructure.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.prj.arachne.domain.User;



@Mapper
public interface UserMapper {

	public List<User> selectList(String id);
	
}
