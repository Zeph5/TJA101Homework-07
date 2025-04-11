package hw5_bonus;

public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private int exp;
	
	
	public int maxExp(){
		int startingMaxExp = 100;
		double maxExp;
		if (level == 1) {
			maxExp = startingMaxExp;
			return (int)maxExp;
		}
		else {
			maxExp = 100*Math.pow(1.2,(level - 1));
			return (int)maxExp;
		}
	}
	public Hero() {
		this("David", 1, 0);
	}

	
	public Hero(String name, int level, int exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void gainEXP(int gainExp) {
		exp = exp + gainExp;
		while (exp >= maxExp()) {
				exp = exp - maxExp();
				level++;
			System.out.println(name + " 升等");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public double getExp() {
		return exp;
	}
	
	public void getHeroInfo() {
		System.out.println("Hero Name: " + name);
		System.out.println("Level: " + level);
		System.out.println("Exp : " + exp + "/" + maxExp());
	}
	
	public abstract void attack();
	
	public void move() {
		System.out.println("跑步");
	};
	
	public void defend() {
		System.out.println("做防禦動作");
	}
}
 