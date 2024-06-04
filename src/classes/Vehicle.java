package classes;

public abstract class Vehicle {
	
	private String name;
	private String color;
	private int nWheels;
	
	public Vehicle() { }	
	
	public Vehicle(String name, String color, int nWheels) {
		this.name = name;
		this.color = color;
		this.nWheels = nWheels;
	}
	
	
	public String toString() {
		return "**********************\n" + 
			   "Vehicle name: " + this.name + "\n" + 
			   "Color: " + this.color + "\n" + 
			   "nWheels: " + this.nWheels + "\n";
	}

	public abstract float computePrice();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getnWheels() {
		return nWheels;
	}
	public void setnWheels(int nWheels) {
		this.nWheels = nWheels;
	}
	
	

}
