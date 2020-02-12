package hardwarestore;
import java.util.ArrayList;

public class Inventory {
	/**
	 * List of all the items in the inventory
	 */
	private ArrayList<InventoryItem> items;
	
	/**
	 * Initializes an inventory object
	 */
	public Inventory() {
		items = new ArrayList<InventoryItem>();
	}
	
	/**
	 * Adds an item to the inventory
	 * @param item
	 */
	public void addItem(InventoryItem item) {
		items.add(item);
	}
	
	/**
	 * Prints the information of all the items in the inventory
	 */
	public void getAllItems() {
		for(int i = 0; i < items.size(); i++) {
			items.get(i).getInfo();
		}
	}
	
	/**
	 * Removes a specified item with specified quantity from the inventory
	 * @param itemName
	 * @param quantity
	 * @return true if item is removed otherwise returns false
	 */
	public boolean removeItem(String itemName, int quantity) {
		InventoryItem inventoryItem = null;
		for(int i = 0; i < items.size(); i++) {
			if(items.get(i).getName().equals(itemName)){
				inventoryItem = items.remove(i);
				inventoryItem.setQuantity(inventoryItem.getQuantity() - quantity);
				items.add(inventoryItem);
				return true;
			}
		}
		return false;
	}
}
