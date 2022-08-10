import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private LunchBox lb1;
	private LunchBox lb2;


	
	private ArrayList<LunchBox> LunchBoxList;
	
	public C206_CaseStudyTest() {
		super();
	}
	@Before
	public void setUp() throws Exception {
		lb1 = new LunchBox("LB001", "Western", 40,"2022-09-09");
		lb2 = new LunchBox("LB002", "Asian", 20,"2022-09-09");
		
		
		
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
		
		C206_CaseStudy.insertLunchBox(LunchBoxList, lb1);		
		assertEquals("Test if that Chromebook arraylist size is 1?", 1, LunchBoxList.size());
		
		assertSame("Test that Chromebook is added same as 1st item of the list?", lb1, LunchBoxList.get(0));
		
		C206_CaseStudy.insertLunchBox(LunchBoxList, lb2);
		
		assertEquals("Test that Camcorder arraylist size is 2?", 2, LunchBoxList.size());
		assertSame("Test that Camcorder is added same as 3rd item of the list?", lb2, LunchBoxList.get(1));
		
	}
	@Test
	public void testretrieveAllLunchBoxOrder() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Lunch Box Order arraylist to add to", LunchBoxList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
		String allLunchBoxOrder= C206_CaseStudy.retrieveAllLunchBoxOrder(LunchBoxList);
		String testOutput = "";
		assertEquals("Check that ViewAllLunchBoxOrderlist", testOutput, allLunchBoxOrder);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.insertLunchBox(LunchBoxList, lb1);
		C206_CaseStudy.insertLunchBox(LunchBoxList, lb2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, LunchBoxList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allLunchBoxOrder= C206_CaseStudy.retrieveAllLunchBoxOrder(LunchBoxList);

		testOutput = String.format("%-20s %-20s %-20d %-20s \n","LB001","Western", 40,"2022-09-09");
		testOutput += String.format("%-20s %-20s %-20d %-20s \n","LB002","Asian", 20,"2022-09-09");
	
		assertEquals("Check that ViewAllunchBoxOrderlist", testOutput, allLunchBoxOrder);
		
	}
	@After
	public void tearDown() throws Exception {
		lb1=null;
		lb2=null;
		LunchBoxList = null;
		
	}

}
