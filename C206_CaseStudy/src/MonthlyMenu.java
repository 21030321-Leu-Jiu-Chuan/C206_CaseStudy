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
public class MonthlyMenu {
	private String Monthly_Menu_id;
	private String Category;
	private String MonthlymenuDescription;
	private double Price;

	
	public MonthlyMenu(String ID,String MonthlymenuDescription , String Category, double Price) {
		
		this.Monthly_Menu_id = ID;
		this.Category = Category;
		this.MonthlymenuDescription = MonthlymenuDescription;
		this.Price = Price;
	}



	public String getMonthlyID() {
		return Monthly_Menu_id;
	}



	public void setID(String id) {
		Monthly_Menu_id = id;
	}



	public String getCategory() {
		return Category;
	}



	public void setCategory(String category) {
		Category = category;
	}


	public String getMonthlyMenuDescription() {
		return MonthlymenuDescription;
	}


	
	public void setMonthlyMenuDescription(String MonthlymenuDescription) {
		this.MonthlymenuDescription = MonthlymenuDescription;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}
	
	
	public String toString(){
		String output = super.toString();
		output=String.format("%-20s %-20s %-20s %-20.2f\n",Monthly_Menu_id,MonthlymenuDescription,Category,Price);
		return output;
	}
}
