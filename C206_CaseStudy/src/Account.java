/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name:Sherman Poon
 * Student ID: 21011378
 * Class: C208
 * Date/Time created: Monday 08-08-2022 11:38
 */

/**
 * @author 21011378
 *
 */
public class Account {
	private String acc_id;
	private String name;
	private String role;
	

	public Account(String acc_id, String name, String role) {
	super();
	this.acc_id = acc_id;
	this.name = name;
	this.role = role;
}

	/**
	 * @return the acc_id
	 */
	public String getAcc_id() {
		return acc_id;
	}
	/**
	 * @param acc_id the acc_id to set
	 */
	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	public String toString(){
		String output = super.toString();
		output=String.format("%-20s %-20s %-20s", acc_id , name,role);
		return output;
	}

}
