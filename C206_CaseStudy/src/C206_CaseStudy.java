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
		System.out.println("Sherman is sohai");
	int option = -1;

		while (option != OPTION_QUIT) {

			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == OPTION_MenuItem) {
				C206_CaseStudy.Menu_item_menu();
				int Menu_item_option = Helper.readInt("Enter option to select service type > ");
				if (Menu_item_option == 1) {
					//view
				}
				else if (Menu_item_option == 2) {
					//Add
				}
				else if(Menu_item_option == 3) {
					//Delete
				}
				
				
			} else if (option == OPTION_LunchBox) {
						
				C206_CaseStudy.lunch_box_menu();
				int lunchbox_item = Helper.readInt("Enter option to select service type > ");

				if (lunchbox_item == 1) {
					
					LunchBox lb = addLunchBox();
					C206_CaseStudy.insertLunchBox(LunchBoxList, lb);
					System.out.println("Lunch Box Order added");

				} else if (lunchbox_item == 2) {
					C206_CaseStudy.viewAllLunchBoxOrder(LunchBoxList);

				}else if (lunchbox_item == 3) {
					C206_CaseStudy.deleteLunchBoxOrder(LunchBoxList);	
					
				} else {
					System.out.println("Invalid type");
				}

			}else if (option == OPTION_Order_bill) {
			

			} else if (option == OPTION_Account) {
		
			}else if (option == OPTION_Monthly_Menu){
				
			} 
			else if (option == OPTION_QUIT) {
				System.out.println("Bye! Have a great time!");
			}else {
				System.out.println("Invalid option");
			}

		}

	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("Lunch Box APP");
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
	public static void Menu_item_menu() {
		System.out.println("1. View Menu item");
		System.out.println("2. Add Menu item");
		System.out.println("3. Delete Menu item");
	}
	public static void Menu_item_category_menu() {
		System.out.println("1. Western Cuisine");
		System.out.println("2. Asian Cuisine");
		System.out.println("3. Vegetarian Cuisine");
	}
	
	//================================= Option 1 Menu item (View) =================================
	public static String retrieveAllMenuItem(ArrayList<MenuItem> MenuItemList) {
		String output = "";
		for(int i = 0; i < MenuItemList.size();i++) {
			output += String.format("%-94s\n", MenuItemList.get(i).toString());
		}
		return output;
	}
	public void ViewMenuItem(ArrayList<MenuItem> MenuItemList) {
		C206_CaseStudy.setHeader("Menu Item LIST");
		String output = String.format("%-20s %-20s %-20s %-20s\n", "ID", "Description","Category", "Price" );
		output += retrieveAllMenuItem(MenuItemList);
		System.out.println(output);
	}
	//================================= Option 1 Menu item (ADD) =================================
	//================================= Option 1 Menu item (Delete)=================================
	
	//================================= Option 2 LunchBox (ADD)=================================
	
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
	public static void insertLunchBox(ArrayList<LunchBox> LunchBoxList, LunchBox lb) {
		
		LunchBoxList.add(lb);
		
	}
	//================================= Option 2 LunchBox (View)=================================
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
	//================================= Option 2 LunchBox (Delete)=================================
	public static void deleteLunchBoxOrder(ArrayList<LunchBox> LunchBoxList) {
		
		String deleteID=Helper.readString("Enter the Lunch Box ID you want to delete>");
		for (int i = 0; i < LunchBoxList.size(); i++) {
			if(LunchBoxList.get(i).getLunch_box_id()==deleteID) {
				LunchBoxList.remove(i);
				System.out.println("Remove Successfully");

			}else {
				System.out.println("Please Insert a valid Lunch Box ID");
			}
			
		}
	}
	//================================= Option 3 Order Bill =================================
	//================================= Option 4 Account =================================
	//================================= Option 5 Monthly Menu =================================
	

	
	}
	
	



