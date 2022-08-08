/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name:Sherman Poon
 * Student ID: 21011378
 * Class: C208
 * Date/Time created: Monday 08-08-2022 11:37
 */

/**
 * @author 21011378
 *
 */


public class MenuItem {
	private String ID;
	private String Category;
	private String menuDescription;
	private double Price;

	
	public MenuItem(String ID, String Category, String menuDescription, double Price) {
		
		this.ID = ID;
		this.Category = Category;
		this.menuDescription = menuDescription;
		this.Price = Price;
	}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getCategory() {
		return Category;
	}



	public void setCategory(String category) {
		Category = category;
	}


	public String getMenuDescription() {
		return menuDescription;
	}


	
	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}
	
	
	
	
	

}
