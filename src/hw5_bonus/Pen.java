package hw5_bonus;

abstract class Pen {

	private double price;
	private String brand;

	public Pen() {

	}

	public Pen(double price, String brand) {
		this.price = price;
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public abstract String write();
}
