import java.util.ArrayList;

public class C206_CaseStudy {
	private static final int OPTION_Account = 4;
	
	private static final int OPTION_Order_bill = 3;
	
	private static final int OPTION_LunchBox = 2;

	private static final int OPTION_MenuItem = 1;
	
	private static final int OPTION_Monthly_Menu = 5;
	
	private static final int OPTION_QUIT = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<LunchBox> LunchBoxList = new ArrayList<LunchBox>();
		ArrayList<MenuItem> MenuItemList = new ArrayList<MenuItem>();
		
		MenuItemList.add(new MenuItem("W001","Western", "ChickenChop", 30));
		LunchBoxList.add(new LunchBox("LB001","Western",2,"2022-01-01"));
		
		int option = 0;

		while (option != OPTION_QUIT) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == OPTION_MenuItem) {
				// View all items
				//ResourceCentre.viewAllCamcorder(camcorderList);
				//ResourceCentre.viewAllChromebook(chromebookList);

			} else if (option == OPTION_LunchBox) {
				// Add a new item
				//ResourceCentre.setHeader("ADD");			
				lunch_box_menu();
				
				int itemType = Helper.readInt("Enter option to select service type > ");

				if (itemType == 1) {
					
					LunchBox lb = addLunchBox();
					C206_CaseStudy.addCamcorder(LunchBoxList, lb);
					System.out.println("Lunch Box Order added");

				} else if (itemType == 2) {
					C206_CaseStudy.viewAllLunchBoxOrder(LunchBoxList);

				}else if (itemType == 3) {
						
					
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_Order_bill) {
				// Loan item
				//ResourceCentre.setHeader("LOAN");			
				//itemTypeMenu();
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Loan camcorder
					
				} else if (itemType == 2) {
					// Loan Chromebook
				
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_Account) {
				// Return item
				//ResourceCentre.setHeader("RETURN");				
				//itemTypeMenu();
				
				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == 1) {
					// Return camcorder
				
				} else if (itemType == 2) {
					// Return Chromebook
					
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_QUIT) {
				System.out.println("Bye! Have a great time!");
			} 
			else if (option == OPTION_Monthly_Menu){
				
			}else {
				System.out.println("Invalid option");
			}

		}

	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("Luch Box APP");
		System.out.println("1. Menu Items");
		System.out.println("2. Lunch Box");
		System.out.println("3. Order Bill");
		System.out.println("4. Account");
		System.out.println("5. Monthly Menu");
		System.out.println("6. Quit");
		Helper.line(80, "-");

	}

	/**
	 * @param string
	 */
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	
	
	
	//================================= Option 1 Menu item =================================
	//================================= Option 2 LunchBox ADD=================================
	
	public static void lunch_box_menu() {
		System.out.println("1. Add lunch box Order");
		System.out.println("2. View Lunch Box Order");
		System.out.println("3. Delete Lunch Box Order");
	}
	public static void lunch_box_category_menu() {
		System.out.println("1. Western Cuisine");
		System.out.println("2. Asian Cuisine");
		System.out.println("3. Vegetarian Cuisine");
	}
	
	public static LunchBox addLunchBox() {
		String lunch_box_id = Helper.readString("Enter Lunch Box ID > ");
		String description = Helper.readString("Enter description > ");
		int amount = Helper.readInt("Enter amount of order > ");
		String date=Helper.readString("Enter the date >");
		//double price=;

		LunchBox lb= new LunchBox(lunch_box_id, description, amount,date);
		return lb;
		
	}
	public static void addCamcorder(ArrayList<LunchBox> LunchBoxList, LunchBox lb) {
		
		LunchBoxList.add(lb);
		
	}
	//================================= Option 2 LunchBox View=================================
	public static String retrieveAllLunchBoxOrder(ArrayList<LunchBox> LunchBoxList) {
		String output = "";

		for (int i = 0; i < LunchBoxList.size(); i++) {

			output += String.format("%-84s\n", LunchBoxList.get(i).toString());
					
		}
		return output;
	}
	public static void viewAllLunchBoxOrder(ArrayList<LunchBox> LunchBoxList) {
		C206_CaseStudy.setHeader("Lunch Box Order LIST");
		String output = String.format("%-20s %-20s %-20s %-20s\n", "Lunch Box ID", "DESCRIPTION","Amount of Order","Order Date" );
		 output += retrieveAllLunchBoxOrder(LunchBoxList);	
		System.out.println(output);
	}
	//================================= Option 2 LunchBox Delete=================================
	
	//================================= Option 3 Order Bill =================================
	//================================= Option 4 Account =================================
	//================================= Option 5 Monthly Menu =================================
	
	
	}


