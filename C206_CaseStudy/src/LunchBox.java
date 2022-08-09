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
public class LunchBox {

	private String lunch_box_id;
	private int amount_of_order;
	//private double price ;
	private String description;
	private String date;
	
	
	public LunchBox(String lunch_box_id,String description,int amount_of_order,String date) {
		this.amount_of_order=amount_of_order;
		this.lunch_box_id=lunch_box_id;
		this.description=description;
		this.date=date;
		//this.price=price;
	}


	public String getLunch_box_id() {
		return lunch_box_id;
	}


	public void setLunch_box_id(String lunch_box_id) {
		this.lunch_box_id = lunch_box_id;
	}


	public int getAmount_of_order() {
		return amount_of_order;
	}


	public void setAmount_of_order(int amount_of_order) {
		this.amount_of_order = amount_of_order;
	}


	/*public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
*/

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String toString(){
		String output = super.toString();
		output=String.format("%-20s %-20s %-20d %-20s", lunch_box_id , description,amount_of_order,date);
		return output;
	}

	
}
