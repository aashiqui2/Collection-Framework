package collection.ArrayListLearning;

public class Laptop {
	String brand;
	int price;
	int gb;
	boolean touch;
	
	@Override
	public String toString() {
		return this.brand + " " + this.price + " " + this.gb + " " + this.touch;
	}

	public Laptop(String brand, int price, int gb, boolean touch) {
		this.brand = brand;
		this.price = price;
		this.gb = gb;
		this.touch = touch;
	}
	
}
