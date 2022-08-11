import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//========Menu Item Test===========
	private MenuItem MI1;
	private MenuItem MI2;
	private MenuItem MI3;
	private ArrayList<MenuItem> MenuItemList;
	
	
	//=================================
	private LunchBox lb1;
	private LunchBox lb2;


	
	private ArrayList<LunchBox> LunchBoxList;
	
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		MI1 = new MenuItem("M0001", "Chicken Rice", "Asian", 3.00);
		MI2 = new MenuItem("M0002", "Mee Goreng", "Asian", 3.00);
		MI3 = new MenuItem("M0003", "Pizza", "Western", 4.00);
		
		lb1 = new LunchBox("LB001", "Western", 40,"2022-09-09");
		lb2 = new LunchBox("LB002", "Asian", 20,"2022-09-09");
		
		MenuItemList = new ArrayList<MenuItem>();
		LunchBoxList=new ArrayList<LunchBox>() ;
		
	}

	@After
	public void tearDown() throws Exception {
		MI1 = null;
		MI2 = null;
		MI3 = null;
		MenuItemList = null;
		
		lb1=null;
		lb2=null;
		LunchBoxList = null;
	}

	@Test
	public void testAddMenuItem() { 
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Menu Item arraylist to add to", MenuItemList);
		
		//Give	n an empty list, after adding 1 item, the size of the list is 1?
		C206_CaseStudy.addMenuItem(MenuItemList, MI1);
		assertEquals("Test if that Menu item arrayList size is 1?", 1, MenuItemList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Menu Item is added same as 1st item of the list?",MI1,MenuItemList.get(0));
		
		// If add another item. The size of the list is 2?
		C206_CaseStudy.addMenuItem(MenuItemList, MI2);
		assertEquals("Test if that Menu item arrayList size is 2?", 2, MenuItemList.size());
		assertSame("Test that Menu Item is added same as 2nd item of the list?",MI2,MenuItemList.get(1));
		
		
		// If add another item. The size of the list is 3?
		C206_CaseStudy.addMenuItem(MenuItemList, MI3);
		assertEquals("Test if that Menu item arrayList size is 3?", 3, MenuItemList.size());
		assertSame("Test that Menu Item is added same as 3rd item of the list?",MI3,MenuItemList.get(2));
	}
	
	@Test
	public void testRetrieveAllMenuItem() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Menu Item arraylist to add to", MenuItemList);
		
		//test if the list of Menu Item retrieved from the SourceCentre is empty
		String allMenuItem = C206_CaseStudy.retrieveAllMenuItem(MenuItemList);
		String testoutput = "";
		assertEquals("Check MenuItemList",testoutput,allMenuItem );
		
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addMenuItem(MenuItemList, MI1);
		C206_CaseStudy.addMenuItem(MenuItemList, MI2);
		assertEquals("Test if that Menu item arrayList size is 2?", 2, MenuItemList.size());
		
		
	}
	
	
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


}
