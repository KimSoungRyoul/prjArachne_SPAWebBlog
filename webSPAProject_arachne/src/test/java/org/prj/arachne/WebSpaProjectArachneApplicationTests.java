package org.prj.arachne;

import static org.junit.Assert.*;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prj.arachne.domain.TistoryBoard;
import org.prj.arachne.domain.tistory.TistoryCategory;
import org.prj.arachne.util.TistoryParserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j
public class WebSpaProjectArachneApplicationTests {

	@Autowired
	private TistoryParserUtil tistoryParserUtil;


	@Test
	public void contextLoads() {


		List<TistoryBoard> boards=tistoryParserUtil.parsingPostList(TistoryCategory.DEVDIARY);


		log.info(boards.toString());


		assertNotNull(boards);


	}

}
