package hardwarestore;

public class Staff extends Person{
	/**
	 * The designation of the staff
	 */
	private String designation;
	
	/**
	 * Id of the staff
	 */
	private String staffId;
	
	/**
	 * Initializes a staff object
	 * @param name
	 * @param staffId
	 * @param designation
	 */
	public Staff(String name, String staffId, String designation) {
		super(name);
		this.designation = designation;
		this.staffId = staffId;
	}

	/**
	 * Returns the designation of the staff
	 * @return staff designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Sets the designation of the staff
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Returns the staff id
	 * @return staff id
	 */
	public String getStaffId() {
		return staffId;
	}

	/**
	 * Sets the staff id
	 * @param staffId
	 */
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	/**
	 * Prints the staff information
	 */
	public void getInfo() {
		System.out.println("Staff Id: " + this.staffId + ", Name: " + this.getName() + ", " + this.getDesignation());
	}
}
