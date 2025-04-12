package hw6;

public class CalTest2 {

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();
		try {
			c1.useCalculator();
		} catch (CalException e) {
		}
		System.out.println();
		try {
			c1.setX();
			c1.setY();
		} catch (CalException e) {
		}
		c1.powerXY();
		c1.getX();
		c1.getY();
		System.out.println();
		
		try {
			Calculator2 c2 = new Calculator2(2, 3);
			c2.powerXY();
			System.out.println();
			c2.setX(4);
			c2.setY(5);
			c2.powerXY();
			c2.getX();
			c2.getY();
		} catch (CalException e) {
		}
	}
}
