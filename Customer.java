package hardwarestore;

public class Customer extends Person{
	
	/**
	 * Customer contact number
	 */
	private String contactNumber;
	
	/**
	 * Initializes a customer object
	 * @param name
	 * @param contactNumber
	 */
	public Customer(String name, String contactNumber) {
		super(name);
		this.contactNumber = contactNumber;
	}

	/**
	 * Returns the customer contact number
	 * @return customer contact number
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * Sets the customer contact number
	 * @param contactNumber 
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * Prints the customer information
	 */
	public void getInfo() {
		System.out.println("Name: " + this.getName() + ", " + "Contact number: " + this.contactNumber);
	}
	
}
