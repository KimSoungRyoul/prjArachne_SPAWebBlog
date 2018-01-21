package org.prj.arachne;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.prj.arachne.domain.User;
import org.prj.arachne.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MybatisConfigTest {

	
	@Autowired
	private UserMapper userMapper;
	
	
	
	@Test
	public void testUserMapper() {
		
		User userInput=new User("sky5367", "1234");
		
		userMapper.insert(userInput);
		
		
		User user= userMapper.selectOne("sky5367");
		
		
		assertEquals(userInput, user);
		
		
	}
}
