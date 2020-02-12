package hardwarestore;

public class InventoryItem extends HardwareItem{
	/**
	 * Quantity of the inventory item
	 */
	private int quantity;
	
	/**
	 * Initializes an inventory item
	 * @param item
	 * @param quantity
	 */
	public InventoryItem(HardwareItem item, int quantity) {
		super(item.getName(), item.getCost());
		this.quantity = quantity;
	}

	/**
	 * Returns the inventory item quantity
	 * @return the quantity of the item
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity of the inventory item
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Returns the total quantity cost the inventory item
	 */
	@Override
	public double getCost() {
		return super.getCost() * quantity;
	}

	/**
	 * Prints the information of the inventory item
	 */
	@Override
	public void getInfo() {
		System.out.println("Name: " + this.getName() + ", " + "Unit Price: $" + this.getCost() + ", Quantity: " + this.quantity);
		
	}
	
}
