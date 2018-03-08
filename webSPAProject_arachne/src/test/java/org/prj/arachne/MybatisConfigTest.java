package org.prj.arachne;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.prj.arachne.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MybatisConfigTest {

	
	
	
	
	@Test
	public void testUserMapper() {
		
		User userInput=new User("sky5367", "1234","김성렬");
		
		
		
		
		
		
	}
}
