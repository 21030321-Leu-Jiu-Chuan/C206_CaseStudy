import java.time.LocalDate;

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
public class OrderBill extends LunchBox{
	private String BillID;
	private double total;
	private String duedate;
	public OrderBill(String lunch_box_id, String billID,double total, String duedate) {
		super(lunch_box_id);
		this.BillID = billID;
		this.total = total;
		this.duedate = duedate;
	}
	public String getBillID() {
		return BillID;
	}
	public void setBillID(String billID) {
		BillID = billID;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

}
