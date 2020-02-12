package hardwarestore;
import java.util.Scanner;

public class HardwareStoreDriver {
	/**
	 * The hardware store
	 */
	private static HardwareStore store = new HardwareStore();
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		store.addStaff(new Staff("John", "1", "Manager"));
		Scanner in = new Scanner(System.in);
		String choice = "";
		do {
			System.out.println("1. Staff");
			System.out.println("2. Customer");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			choice = in.nextLine();
			
			switch(choice) {
				case "1": staffFunctions(in);
				break;
				case "2": customerFunctions(in);
				break;
			}
			
			System.out.println();
		}while(!choice.equals("3"));

	}
	
	/**
	 * Provides customers the functionality to buy and see the items in the inventory
	 * @param in
	 */
	private static void customerFunctions(Scanner in) {
		System.out.print("Enter customer name: ");
		String customerName = in.nextLine();
		
		Customer customer = store.getCustomer(customerName);
		if(customer == null) {
			System.out.println("No customer exists");
			return;
		}
		
		System.out.println();
		System.out.println("1. Get Inventory");
		System.out.println("2. Show Inventory");
		System.out.print("Enter choice: ");
		String choice = in.nextLine();
		System.out.println();
		System.out.println();
		String itemName = "";
		int quantity = 0;
		
		switch(choice) {
		case "1": System.out.println("Get Inventory");
		  System.out.print("Item name: ");
		  itemName = in.nextLine();
		  System.out.print("Quantity: ");
		  quantity = in.nextInt();
		  in.nextLine();
		  store.getInventory(itemName, quantity);
		  break;
		case "2": System.out.println("Show Inventory");
		 		store.getInventoryItems();
		  break;
		}
	}
	
	/**
	 * Provides the staff with functionality to add customers, 
	 * remove customers, add inventory item, get inventory item
	 * and display inventory items
	 * @param in
	 */
	private static void staffFunctions(Scanner in) {
		System.out.print("Enter staff name: ");
		String staffName = in.nextLine();
		
		Staff staff = store.getStaff(staffName);
		if(staff == null) {
			System.out.println("No such staff exists");
			return;
		}
		
		System.out.println();
		System.out.println("1. Add Customer");
		System.out.println("2. Remove Customer");
		System.out.println("3. Add Inventory");
		System.out.println("4. Get Inventory");
		System.out.println("5. Show Inventory");
		System.out.print("Enter choice: ");
		String choice = in.nextLine();
		System.out.println();
		String customerName = "";
		String contactNumber = "";
		String itemName = "";
		double itemPrice;
		int quantity = 0;
		switch(choice) {
			case "1": System.out.println("Add Customer");
					System.out.print("Enter customer name:"); 
					customerName = in.nextLine();
					System.out.print("Enter customer contact number: ");
					contactNumber = in.nextLine();
					store.addCustomer(new Customer(customerName, contactNumber));
					System.out.println("Customer added!");
					break;
			case "2": System.out.println("Remove Customer");
					System.out.print("Enter customer name:"); 
					customerName = in.nextLine();
					if(store.removeCustomer(customerName)) {
						System.out.println("Customer removed!");
					}
					else {
						System.out.println("Error! No such customer exists");
					}
					break;
			case "3": System.out.println("Add Inventory");
					  System.out.print("Item name: ");
					  itemName = in.nextLine();
					  System.out.print("Item unit price: ");
					  itemPrice = in.nextDouble();
					  in.nextLine();
					  System.out.print("Quantity: ");
					  quantity = in.nextInt();
					  in.nextLine();
					  store.addInventory(new InventoryItem(new HardwareItem(itemName, itemPrice), quantity)) ;
					  break;
			case "4": System.out.println("Get Inventory");
			  System.out.print("Item name: ");
			  itemName = in.nextLine();
			  System.out.print("Quantity: ");
			  quantity = in.nextInt();
			  in.nextLine();
			  store.getInventory(itemName, quantity);
			  break;
			case "5": System.out.println("Show Inventory");
			 		store.getInventoryItems();
			  break;
					
		}
			
	}
	

}
