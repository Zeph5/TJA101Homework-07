package hw5_bonus;

public class Pencil extends Pen {

	private double price;

	public String write() {
		return "削鉛筆再寫";
	}

	public Pencil(double price, String brand) {
		super(price, brand);
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price * 0.8;
	}

}
