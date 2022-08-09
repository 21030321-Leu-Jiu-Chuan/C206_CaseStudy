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
		ArrayList<LunchBox> camcorderList = new ArrayList<LunchBox>();
		
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
				//itemTypeMenu();
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add a camcorder
					//Camcorder cc = inputCamcorder();
					///ResourceCentre.addCamcorder(camcorderList, cc);
					//System.out.println("Camcorder added");

				} else if (itemType == 2) {
					// Add a Chromebook
					//Chromebook cb = inputChromebook();
					//ResourceCentre.addChromebook(chromebookList, cb);
					//System.out.println("Chromebook added");

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
	
	
	
	}


