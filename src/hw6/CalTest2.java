package hw6;

public class CalTest2 {

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();
		try {c1.useCalculator();} catch (CalException e) {}
		
		try { Calculator2 c2 = new Calculator2(2,-3);
		c2.powerXY();} catch (CalException e) {}
	
	}
}
