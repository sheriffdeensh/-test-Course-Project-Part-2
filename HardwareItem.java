package hardwarestore;

public class HardwareItem implements Item{

	/**
	 * Name of the hardware item
	 */
	private String name;
	
	/**
	 * Hardware item unit price
	 */
	private double unitPrice;
	
	/**
	 * Initializes a Hardware item
	 * @param name
	 * @param unitPrice
	 */
	public HardwareItem(String name, double unitPrice) {
		this.name = name;
		this.unitPrice = unitPrice;
	}

	/**
	 * Returns the name of the hardware item
	 * @return hardware item name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the hardware item
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the unit price of the hardware item
	 * @param unitPrice
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * Returns the cost of the hardware item
	 */
	@Override
	public double getCost() {
		return this.unitPrice;
	}

	/**
	 * Prints the information of the hardware item
	 */
	@Override
	public void getInfo() {
		System.out.println("Name: " + this.name + ", " + "Unit Price: $" + this.unitPrice);	
	}

	
}
