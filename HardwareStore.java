package hardwarestore;

public class HardwareStore {
	
	/**
	 * List of all customers in the store
	 */
	private Customer[] customers;
	private int customerIndex;
	
	/**
	 * List of all the staff in the store
	 */
	private Staff[] storeStaff;
	private int staffIndex;
	
	/**
	 * List of all the inventory items in the store
	 */
	
	/**
	 * List of all the items in the inventory
	 */
	private Inventory inventory;
	
	/**
	 * Initializes a Hardware store object
	 */
	public HardwareStore() {
		customers = new Customer[100];
		storeStaff = new Staff[100];
		customerIndex = 0;
		staffIndex = 0;
		inventory = new Inventory();
	}
	
	/**
	 * @param customer
	 */
	public void addCustomer(Customer customer) {
		customers[customerIndex] = customer;;
		customerIndex++;
	}
	
	/**
	 * Removes the customer from the store
	 * @param customerName
	 * @return true if customer removed otherwise returns false
	 */
	public boolean removeCustomer(String customerName) {
		Customer[] newArray = new Customer[100];
		int index = 0;
		for(int i = 0; i < customerIndex; i++) {
			if(!customers[customerIndex].getName().equals(customerName)) {
				newArray[index] = customers[i];
				index++;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Adds a staff to the store
	 * @param staff
	 */
	public void addStaff(Staff staff) {
		storeStaff[staffIndex] = staff;
		staffIndex++;
	}
	
	/**
	 * Returns a staff object with the specified name
	 * @param staffName 
	 * @return Staff object if exists otherwise returns null
	 */
	public Staff getStaff(String staffName) {
		for(int i = 0; i < staffIndex; i++) {
			if(storeStaff[i].getName().equals(staffName)) {
				return storeStaff[i];
			}
		}
		return null;
	}
	
	/**
	 * Returns a customer object with the specified name
	 * @param customerName
	 * @return Customer object if exists otherwise returns null
	 */
	public Customer getCustomer(String customerName) {
		for(int i = 0; i < customerIndex; i++) {
			if(customers[i].getName().equals(customerName)) {
				return customers[i];
			}
		}
		return null;
	}
	
	/**
	 * Prints the information of all the items in the inventory
	 */
	public void getInventoryItems() {
		inventory.getAllItems();
	}
	
	/**
	 * Adds an item to the inventory
	 * @param item
	 */
	public void addInventory(InventoryItem item) {
		inventory.addItem(item);
	}
	
	/**
	 * Gets a specified quantity of particular item from the inventory
	 * @param itemName
	 * @param quantity
	 */
	public void getInventory(String itemName, int quantity) {
		inventory.removeItem(itemName, quantity);
	}
	
}
