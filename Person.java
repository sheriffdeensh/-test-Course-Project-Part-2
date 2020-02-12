package hardwarestore;

public abstract class Person {
	/**
	 * Name of the person
	 */
	private String name;
	
	/**
	 * Person constructor
	 * @param name
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the name of the person
	 * @return person name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Prints the information of the person
	 */
	public abstract void getInfo();
}
