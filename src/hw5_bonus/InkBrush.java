package hw5_bonus;

public class InkBrush extends Pen {

	private double price;

	public String write() {
		return "沾墨汁再寫";
	}

	public InkBrush(double price, String brand) {
		super(price, brand);
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price * 0.9;
	}
}
