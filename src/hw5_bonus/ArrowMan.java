package hw5_bonus;

public class ArrowMan extends Hero {
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, int exp) {
		super(name, level, exp);
	}

	@Override
	public void attack() {
		System.out.println("放弓箭");
	}
}
