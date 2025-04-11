package hw5_bonus;

public class SwordMan extends Hero {
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, int exp) {
		super(name, level, exp);
	}
	
	@Override
	public void attack() {
		System.out.println("揮劍");
	}
	
}
