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
	
	
	//==============LunchBox Test=================
	private LunchBox lb1;
	private LunchBox lb2;
	
	private ArrayList<LunchBox> LunchBoxList;
	
	//=============== Order Bill Test================
	private OrderBill OB1;
	private OrderBill OB2;
	
	private ArrayList<OrderBill> BillList;
	
	
	
	//==============Account Test=================
	private Account acc1;
	private Account acc2;
	
	private ArrayList<Account> AccountList;
	
	public C206_CaseStudyTest() {
		super();
	}

	//=============== Monthly Menu Test================
		private MonthlyMenu MM1;
		private MonthlyMenu MM2;
		
		private ArrayList<MonthlyMenu> MonthlyMenuList;
	
	@Before
	public void setUp() throws Exception {

		MI1 = new MenuItem("M0001", "Chicken Rice", "Asian", 3.00);
		MI2 = new MenuItem("M0002", "Mee Goreng", "Asian", 3.00);
		MI3 = new MenuItem("M0003", "Pizza", "Western", 4.00);
		
		lb1 = new LunchBox("LB001", "Western", 40,"2022-09-09");
		lb2 = new LunchBox("LB002", "Asian", 20,"2022-09-09");
		
		
		OB1 = new OrderBill("LB001", "BL001", 50.00, "2022-10-10");
		OB2 = new OrderBill("LB002", "BL002", 180.00, "2022-10-10");
		
		acc1 = new Account("ACC001", "Peter", "student");
		acc2 = new Account("ACC002", "Mary", "student");
		
		MM1 = new MonthlyMenu("MM001", "March", "Western", 60.00);
		MM2 = new MonthlyMenu("MM002", "August", "Asian", 65.00);
		
		AccountList=new ArrayList<Account>();
		MenuItemList = new ArrayList<MenuItem>();
		LunchBoxList=new ArrayList<LunchBox>() ;
		BillList = new ArrayList<OrderBill>();
		MonthlyMenuList = new ArrayList<MonthlyMenu>();

		
	}

// ============================== Test for Menu item ================================================

	@Test
	public void testAddMenuItem() { 
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Menu Item arraylist to add to", MenuItemList);
		
		//Give an empty list, after adding 1 item, the size of the list is 1?
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
		
		//test if the list of Menu Item retrieved from the C206_CaseStudy is empty
		String allMenuItem = C206_CaseStudy.retrieveAllMenuItem(MenuItemList);
		String testoutput = "";
		assertEquals("Check MenuItemList",testoutput,allMenuItem );
		
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addMenuItem(MenuItemList, MI1);
		C206_CaseStudy.addMenuItem(MenuItemList, MI2);
		assertEquals("Test if that Menu item arrayList size is 2?", 2, MenuItemList.size());
		
		//test if the expected output string same as the list of Menu Item retrieved from the C206_CaseStudy
		
		allMenuItem = C206_CaseStudy.retrieveAllMenuItem(MenuItemList);
		
		testoutput = String.format("%-20s %-20s %-20s %-20.2f\n", "M0001", "Chicken Rice", "Asian", 3.00);
		testoutput += String.format("%-20s %-20s %-20s %-20.2f\n", "M0002", "Mee Goreng", "Asian", 3.00);
		
		assertEquals("Check that MenuItem", testoutput, allMenuItem);
	}
	
	
	
	@Test
	public void DeleteMenuItem() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Menu Item arraylist to add to", MenuItemList);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 
		C206_CaseStudy.addMenuItem(MenuItemList, MI1);
		C206_CaseStudy.addMenuItem(MenuItemList, MI2);
		assertEquals("Test if that Menu item arrayList size is 2?", 2, MenuItemList.size());
		
		//Given that the size of the list is 2, after removing one 1 item, the size of the list is 1
		C206_CaseStudy.doDeleteMenuItem(MenuItemList, "M0001");
		assertEquals("Check that the arraylist is 1", 1 , MenuItemList.size());
		
		//Given that the size of the list is 1, after removing one 1 item, the size of the list is 0
		C206_CaseStudy.doDeleteMenuItem(MenuItemList, "M0002");
		assertEquals("Check that the arraylist is 0", 0, MenuItemList.size());
	}
	
	
//========================================== Test For LunchBox ===================================================	
	@Test
	public void testAddLunchBoxOrder() {
		//fail("Not yet implemented");
		// write your code here 
		assertNotNull("Test if there is valid  Lunch Orders arraylist to add to", LunchBoxList);
		
		C206_CaseStudy.insertLunchBox(LunchBoxList, lb1);		
		assertEquals("Test if that  Lunch Orders arraylist size is 1?", 1, LunchBoxList.size());
		
		assertSame("Test that  Lunch Orders is added same as 1st item of the list?", lb1, LunchBoxList.get(0));
		
		C206_CaseStudy.insertLunchBox(LunchBoxList, lb2);
		
		assertEquals("Test that  Lunch Orders arraylist size is 2?", 2, LunchBoxList.size());
		assertSame("Test that  Lunch Orders is added same as 3rd item of the list?", lb2, LunchBoxList.get(1));
		
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
	
	@Test
	public void DeleteLunchBoxOrder() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid LunchBox arraylist to add to", LunchBoxList);
		
		//Given an empty list, after adding 1 items, test if the size of the list is 1 
		C206_CaseStudy.insertLunchBox(LunchBoxList, lb1);
		assertEquals("Test if that LunchBox arrayList size is 1?", 1, LunchBoxList.size());
		
		//Given that the size of the list is 1, after removing one 1 item, the size of the list is 1
		C206_CaseStudy.doDeleteLunchBoxOrder(LunchBoxList, "LB001");
		assertEquals("Check that the arraylist is 0", 0 , LunchBoxList.size());
		
	}
	
	
	//========================================== Test for User Account ==================================================
	@Test
	public void testAddAccount() { 
		assertNotNull("Test if there is valid Account arraylist to add to", AccountList);
		
		C206_CaseStudy.insertAccount(AccountList, acc1);
		assertEquals("Test if that Account arrayList size is 1?", 1, AccountList.size());
		
		assertSame("Test that Accountm is added same as 1st item of the list?",acc1,AccountList.get(0));
		
		C206_CaseStudy.insertAccount(AccountList, acc2);
		assertEquals("Test if that Account arrayList size is 2?", 2, AccountList.size());
		assertSame("Test that Account is added same as 2nd item of the list?",acc2,AccountList.get(1));

	}
	@Test
	public void testRetrieveAllAccount() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Account arraylist to add to", AccountList);
		
		//test if the list of Account retrieved from the C206_CaseStudy is empty
		String allAccount = C206_CaseStudy.retrieveUserAccount(AccountList);
		String testoutput = "";
		assertEquals("CheckAccountList",testoutput,allAccount );
		
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.insertAccount(AccountList, acc1);
		C206_CaseStudy.insertAccount(AccountList, acc2);
		assertEquals("Test if that Account arrayList size is 2?", 2, AccountList.size());
		
		//test if the expected output string same as the list of Account retrieved from the C206_CaseStudy
		
		allAccount = C206_CaseStudy.retrieveUserAccount(AccountList);
		
		testoutput += String.format("%-20s %-20s %-20s\n", "ACC001", "Peter", "student");
		testoutput += String.format("%-20s %-20s %-20s\n", "ACC002", "Mary", "student");
		
		assertEquals("Check that Account", testoutput, allAccount);
	}
	@Test
	public void DeleteAccount() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Account arraylist to add to", AccountList);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 
		C206_CaseStudy.insertAccount(AccountList, acc1);
		C206_CaseStudy.insertAccount(AccountList, acc2);
		assertEquals("Test if that Account arrayList size is 2?", 2, AccountList.size());
		
		//Given that the size of the list is 2, after removing one 1 item, the size of the list is 1
		C206_CaseStudy.doDeleteAccount(AccountList, "ACC001");
		assertEquals("Check that the arraylist is 1", 1 , AccountList.size());
		
		//Given that the size of the list is 1, after removing one 1 item, the size of the list is 0
		C206_CaseStudy.doDeleteAccount(AccountList, "ACC002");
		assertEquals("Check that the arraylist is 0", 0, AccountList.size());
	}
	
	
	//========================================== Test For Order Bill ===================================================	
	@Test
	public void TestAddOrdersBill() {
		//fail("Not yet implemented");
		// write your code here 
		assertNotNull("Test if there is valid Lunch Orders arraylist to add to", BillList);
		
		//Give an empty list, after adding 1 item, the size of the list is 1?
		C206_CaseStudy.insertOrderBill(BillList, OB1);
		assertEquals("Test if that Bill arrayList size is 1?", 1, BillList.size());
		//C206_CaseStudy.addOrdersBill(LunchBoxList, BillList);
		//assertEquals("Test if that Order Bill arrayList size is 1?", 1, MenuItemList.size());
		
		//The item just added is as same as the first item of the list
		//assertSame("Test that Menu Item is added same as 1st item of the list?",MI1,MenuItemList.get(0));
		assertSame("Test that OrderBill is added same as 1st item of the list?",OB1,BillList.get(0));
		
		// If add another item. The size of the list is 2?
		//C206_CaseStudy.addMenuItem(MenuItemList, MI2);
		//assertEquals("Test if that Menu item arrayList size is 2?", 2, MenuItemList.size());
		//assertSame("Test that Menu Item is added same as 2nd item of the list?",MI2,MenuItemList.get(1));
		C206_CaseStudy.insertOrderBill(BillList, OB2);
		assertEquals("Test if that Bill arrayList size is 2?", 2, BillList.size());
		assertSame("Test that Bill is added same as 2nd item of the list?",OB2,BillList.get(1));

		
	}
	
	public void testretrieveAllOrderBill() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Bill arraylist to add to", BillList);
		
		//test if the list of OrderBill retrieved from the SourceCentre is empty
		String AllOrderBill= C206_CaseStudy.retrieveOrderBill(BillList);
		String testOutput = "";
		assertEquals("Check that ViewAllBilllist", testOutput, AllOrderBill);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.insertOrderBill(BillList, OB1);
		C206_CaseStudy.insertOrderBill(BillList, OB2);
		assertEquals("Test if that Bill arraylist size is 2?", 2, BillList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		AllOrderBill= C206_CaseStudy.retrieveOrderBill(BillList);
		
		testOutput = String.format("%-20s %-20s %-20.2f %-20s \n","LB001", "BL001", 50.00, "2022-10-10");
		testOutput += String.format("%-20s %-20s %-20.2f %-20s \n","LB002", "BL002", 180.00, "2022-10-10");
	
		assertEquals("Check that ViewAllunchBoxOrderlist", testOutput, AllOrderBill);
		
	}
	@Test
	public void DeleteOrderBill() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Bill arraylist to add to", BillList);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 
		C206_CaseStudy.insertOrderBill(BillList, OB1);
		C206_CaseStudy.insertOrderBill(BillList, OB2);
		assertEquals("Test if that Bill arrayList size is 2?", 2, BillList.size());
		
		//Given that the size of the list is 2, after removing one 1 item, the size of the list is 1
		C206_CaseStudy.doDeleteOrderBill(BillList, "BL002");
		assertEquals("Check that the arraylist is 1", 1 , BillList.size());
		
		//Given that the size of the list is 1, after removing one 1 item, the size of the list is 0
		C206_CaseStudy.doDeleteOrderBill(BillList, "BL001");
		assertEquals("Check that the arraylist is 0", 0,BillList.size());
	}
	
	//========================================== Test For Monthly Menu ===================================================
	@Test
	public void testCreateMonthlymenu() { 
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Monthly Menu arraylist to add to", MonthlyMenuList);
		
		//Give an empty list, after adding 1 item, the size of the list is 1?
		C206_CaseStudy.CreateMonthlyMenu(MonthlyMenuList, MM1);
		assertEquals("Test if that Monthly Menu arrayList size is 1?", 1, MonthlyMenuList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that monthly menu is added same as 1st item of the list?",MM1,MonthlyMenuList.get(0));
		
		// If add another item. The size of the list is 2?
		C206_CaseStudy.CreateMonthlyMenu(MonthlyMenuList, MM2);
		assertEquals("Test if that Monthly Menu arrayList size is 2?", 2, MonthlyMenuList.size());
		assertSame("Test that monthly menu is added same as 2nd item of the list?",MM2,MonthlyMenuList.get(1));
	
	}
	@Test
	public void testViewMonthlyMenu() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Monthly Menu arraylist to add to", MonthlyMenuList);
		
		//test if the list of Menu Item retrieved from the C206_CaseStudy is empty
		String allMonthlyMenu = C206_CaseStudy.GetMonthlyMenu(MonthlyMenuList);
		String testoutput = "";
		assertEquals("Check MonthlyMenuList",testoutput,allMonthlyMenu );
		
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.CreateMonthlyMenu(MonthlyMenuList, MM1);
		C206_CaseStudy.CreateMonthlyMenu(MonthlyMenuList, MM2);
		assertEquals("Test if that Monthly Menu arrayList size is 2?", 2, MonthlyMenuList.size());
		
		//test if the expected output string same as the list of Menu Item retrieved from the C206_CaseStudy
		
		allMonthlyMenu = C206_CaseStudy.GetMonthlyMenu(MonthlyMenuList);
		
		testoutput = String.format("%-20s %-20s %-20s %-20.2f\n", "MM001", "March", "Western", 60.00);
		testoutput += String.format("%-20s %-20s %-20s %-20.2f\n", "MM002", "August", "Asian", 65.00);
		
		assertEquals("Check that MonthlyMenu", testoutput, allMonthlyMenu);
	}
	@Test
	public void deleteMonthlyMenu() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Monthly Menu arraylist to add to", MonthlyMenuList);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 
		C206_CaseStudy.CreateMonthlyMenu(MonthlyMenuList, MM1);
		C206_CaseStudy.CreateMonthlyMenu(MonthlyMenuList, MM2);
		assertEquals("Test if that Monthly Menu arrayList size is 2?", 2, MonthlyMenuList.size());
		
		//Given that the size of the list is 2, after removing one 1 item, the size of the list is 1
		C206_CaseStudy.doDeleteMonthlyMenu(MonthlyMenuList, "MM001");
		assertEquals("Check that the arraylist is 1", 1 , MonthlyMenuList.size());
		
		//Given that the size of the list is 1, after removing one 1 item, the size of the list is 0
		C206_CaseStudy.doDeleteMonthlyMenu(MonthlyMenuList, "MM002");
		assertEquals("Check that the arraylist is 0", 0, MonthlyMenuList.size());
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



}
