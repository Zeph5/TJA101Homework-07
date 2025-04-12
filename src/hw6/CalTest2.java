package hw6;

public class CalTest2 {

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();
		try {c1.useCalculator();} catch (CalException e) {}
		
		try {Calculator2 c2 = new Calculator2(2,0); c2.setX(0);} catch (CalException e) {}
		
		Calculator2 c3 = new Calculator2();
		try {c3.setX(0); c3.setY(-3);} catch (CalException e) {}
		
	}
}
