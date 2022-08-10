import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private LunchBox lb1;
	private LunchBox lb2;
	private LunchBox lb3;

	
	private ArrayList<LunchBox> LunchBoxList;
	
	public C206_CaseStudyTest() {
		super();
	}
	@Before
	public void setUp() throws Exception {
		lb1 = new LunchBox("LB001", "Western", 40,"2022-09-09");
		lb2 = new LunchBox("LB002", "Asian", 20,"2022-09-09");
		lb3=new LunchBox("LB003", "Asian", 20,"2022-09-09");
		
		
		LunchBoxList=new ArrayList<LunchBox>() ;
		
	}


	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	@Test
	public void testAddLunchBoxOrder() {
		//fail("Not yet implemented");
		// write your code here 
		assertNotNull("Test if there is valid Chromebook arraylist to add to", LunchBoxList);
		
		LunchBox.addLunchBox(LunchBoxList, lb1);		
		assertEquals("Test if that Chromebook arraylist size is 1?", 1, LunchBoxList.size());
		
		assertSame("Test that Chromebook is added same as 1st item of the list?", lb1, LunchBoxList.get(0));
		
		LunchBox.addLunchBox(LunchBoxList, lb2);
		LunchBox.addLunchBox(LunchBoxList, lb3);
		assertEquals("Test that Camcorder arraylist size is 3?", 3, LunchBoxList.size());
		assertSame("Test that Camcorder is added same as 3rd item of the list?", lb3, LunchBoxList.get(2));
		
	}
	
	@After
	public void tearDown() throws Exception {
		lb1=null;
		lb2=null;
		lb3=null;
		LunchBoxList = null;
		
	}

}
