
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
<<<<<<< HEAD
		ArrayList<MonthlyMenu> MonthlyMenuList = new ArrayList<MonthlyMenu>();
=======
		ArrayList<OrderBill>BillList=new ArrayList<OrderBill>();
>>>>>>> branch 'master' of https://github.com/21030321-Leu-Jiu-Chuan/C206_CaseStudy.git

		
		LunchBoxList.add(new LunchBox("LB001", "Western", 30,"2022-09-09"));
		


		ArrayList<Account> AccountList = new ArrayList<Account>();

		int option = -1;


		while (option != OPTION_QUIT) {

			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == OPTION_MenuItem) {
				C206_CaseStudy.Menu_item_menu();
				int Menu_item_option = Helper.readInt("Enter option to select service type > ");
				if (Menu_item_option == 1) {
					// view
					C206_CaseStudy.ViewMenuItem(MenuItemList);
				} else if (Menu_item_option == 2) {
					// Add
					MenuItem MI = InputMenuItem();
					C206_CaseStudy.addMenuItem(MenuItemList, MI);
					System.out.println("Menu Item added");

				} else if (Menu_item_option == 3) {
					// Delete
					C206_CaseStudy.deleteMenuItem(MenuItemList);
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

				} else if (lunchbox_item == 3) {
					C206_CaseStudy.deleteLunchBoxOrder(LunchBoxList);

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_Order_bill) {
				C206_CaseStudy.billMenu();
				int order_bill_option=Helper.readInt("Enter option to select service type >");
				if(order_bill_option==1) {
					C206_CaseStudy.addOrdersBill(LunchBoxList, BillList);	
				}
				else if(order_bill_option==2) {
					C206_CaseStudy.viewOrderBill(BillList);
				}
				else if(order_bill_option==3) {
					C206_CaseStudy.deleteOrderBill(BillList);
				}
				else {
					System.out.println("Invalid service");
				}
			} else if (option == OPTION_Account) {
				C206_CaseStudy.Account_menu();
				int account_option = Helper.readInt("Enter option to select service type > ");

				if (account_option == 1) {

					Account acc = addAccount();
					C206_CaseStudy.insertAccount(AccountList, acc);
					System.out.println("Account user added");

				} else if (account_option == 2) {
					C206_CaseStudy.viewUserAccount(AccountList);

				} else if (account_option == 3) {
					C206_CaseStudy.deleteUserAccount(AccountList);

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_Monthly_Menu) {

			} else if (option == OPTION_QUIT) {
				System.out.println("Bye! Have a great time!");
			} else {
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

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	// ================================= Option 1 Menu item =================================
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

	// ================================= Option 1 Menu item (View)=================================
	public static String retrieveAllMenuItem(ArrayList<MenuItem> MenuItemList) {
		String output = "";
		for (int i = 0; i < MenuItemList.size(); i++) {

			output += String.format("%-84s\n", MenuItemList.get(i).toString());

		}
		return output;
	}

	public static void ViewMenuItem(ArrayList<MenuItem> MenuItemList) {
		C206_CaseStudy.setHeader("Menu Item LIST");
		String output = String.format("%-20s %-20s %-20s %-20s\n", "ID", "Description", "Category", "Price");
		output += retrieveAllMenuItem(MenuItemList);
		System.out.println(output);
	}

	// ================================= Option 1 Menu item (ADD)=================================
	public static MenuItem InputMenuItem() {
		String id = Helper.readString("Enter Menu ID > ");
		String description = Helper.readString("Enter description > ");
		String category = Helper.readString("Enter Category > ");
		double Price = Helper.readDouble("Enter the price of the item > ");

		MenuItem MI = new MenuItem(id, description, category, Price);
		return MI;
	}
	public static void addMenuItem(ArrayList<MenuItem> MenuItemList, MenuItem MI) {
		MenuItemList.add(MI);
	}

	// ================================= Option 1 Menu item(Delete)=================================

	public static void deleteMenuItem(ArrayList<MenuItem> MenuItemList) {
		String id = Helper.readString("Enter the ID you want to delete > ");
		for (int i = 0; i < MenuItemList.size(); i++) {
			if (MenuItemList.get(i).getID().equalsIgnoreCase(id)) {
				MenuItemList.remove(i);
				System.out.println("Remove Successfully!");
			} else {
				System.out.println("Nothing to delete");
			}
		}

	}

	// ================================= Option 2 LunchBox(ADD)=================================

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
		String date = Helper.readString("Enter the date >");
		// double price=;


		LunchBox lb= new LunchBox(lunch_box_id, description, amount,date);

		return lb;

	}
	public static void insertLunchBox(ArrayList<LunchBox> LunchBoxList, LunchBox lb) {
		LunchBoxList.add(lb);

	}

	// ================================= Option 2 LunchBox(View)=================================
	public static String retrieveAllLunchBoxOrder(ArrayList<LunchBox> LunchBoxList) {
		String output = "";

		for (int i = 0; i < LunchBoxList.size(); i++) {

			output += String.format("%-84s\n", LunchBoxList.get(i).toString());

		}
		return output;
	}

	public static void viewAllLunchBoxOrder(ArrayList<LunchBox> LunchBoxList) {
		C206_CaseStudy.setHeader("Lunch Box Order LIST");
		String output = String.format("%-20s %-20s %-20s %-20s\n", "Lunch Box ID", "DESCRIPTION", "Amount of Order",
				"Order Date");
		output += retrieveAllLunchBoxOrder(LunchBoxList);
		System.out.println(output);
	}

	// ================================= Option 2 LunchBox (Delete)=================================
	public static void deleteLunchBoxOrder(ArrayList<LunchBox> LunchBoxList) {

		String deleteID = Helper.readString("Enter the Lunch Box ID you want to delete>");
		for (int i = 0; i < LunchBoxList.size(); i++) {

			if(LunchBoxList.get(i).getLunch_box_id().equalsIgnoreCase(deleteID)) {

			

				LunchBoxList.remove(i);
				System.out.println("Remove Successfully");
			}
			 else {
				System.out.println("Please Insert a valid Lunch Box ID");
			
			}
			
	}
	}
	// ================================= Option 3 Order Bill =================================
	public static void billMenu() {
		System.out.println("1. Add Order Bill");
		System.out.println("2. View Order Bill");
		System.out.println("3. Delete Order Bill");
	}
	public static void addOrdersBill(ArrayList<LunchBox>LunchBoxList,ArrayList<OrderBill>BillLists) {
		double price=7;
		double total=0;
		String billID = Helper.readString("Enter Order Bill ID > ");
		String lunchboxID=Helper.readString("Enter Lunch Box to bill >");
		String dueDate=Helper.readString("Enter Due Date for Bill >");
		for(LunchBox a:LunchBoxList) {
			if(lunchboxID.equalsIgnoreCase(a.getLunch_box_id())) {
				total=a.getAmount_of_order()*price;
				BillLists.add(new OrderBill(lunchboxID,billID,total,dueDate));
			}
			else {
				System.out.println("Enter a valid lunchboxID!");
			}
		}
	}
	public static void viewOrderBill(ArrayList<OrderBill>BillLists) {
		String output="";
		output+=String.format("%-20s %-20s %-20s %-20s\n", "Order Bill ID","Lunch Box ID","Total Price","Due Date");
		for(OrderBill a:BillLists) {
			output+=String.format("%-20s %-20s %-20.2f %-20s\n",a.getBillID(),a.getLunch_box_id(),a.getTotal(),a.getDuedate());
		}
		System.out.println(output);
	}
	public static void deleteOrderBill(ArrayList<OrderBill>BillLists) {
		String ID=Helper.readString("Enter ID to delete >");
		for (int i = 0; i < BillLists.size(); i++) {

			if(BillLists.get(i).getBillID().equalsIgnoreCase(ID)) {

			

				BillLists.remove(i);
				System.out.println("Remove Successfully");
			}
			 else {
				System.out.println("Please Insert a valid Order Bill ID");
			
			}
			
	}
	}
	
	// ================================= Option 4 Account (ADD)=================================
	public static void Account_menu() {
		System.out.println("1. Add User Account");
		System.out.println("2. View User Account");
		System.out.println("3. Delete User Account");
	}

	public static Account addAccount() {
		String acc_id = Helper.readString("Enter ID > ");
		String name = Helper.readString("Enter name > ");
		String role = Helper.readString("Enter role >");

		Account acc = new Account(acc_id, name, role);
		return acc;

	}

	public static void insertAccount(ArrayList<Account> AccountList, Account acc) {

		AccountList.add(acc);

	}

	// ================================= Option 4 Account (VIEW)
	// =================================
	public static String retrieveUserAccount(ArrayList<Account> AccountList) {
		String output = "";

		for (int i = 0; i < AccountList.size(); i++) {

			output += String.format("%-84s\n", AccountList.get(i).toString());

		}
		return output;
	}

	public static void viewUserAccount(ArrayList<Account> AccountList) {
		C206_CaseStudy.setHeader("Account List");
		String output = String.format("%-20s %-20s %-20s\n", "ID", "name", "role");
		output += retrieveUserAccount(AccountList);
		System.out.println(output);
	}

	// ================================= Option 4 Account (DELETE) =================================
	public static void deleteUserAccount(ArrayList<Account> AccountList) {

		String deleteID = Helper.readString("Enter the User Account ID you want to delete>");
		for (int i = 0; i < AccountList.size(); i++) {
			if (AccountList.get(i).getAcc_id().equalsIgnoreCase(deleteID)) {
				AccountList.remove(i);
				System.out.println("Remove Successfully");

			} else {
				System.out.println("Please enter a valid User Account ID");
			}

		}
	}
	// ================================= Option 5 Monthly Menu =================================

}
