package hw5;

public class Homework0409_Methods {

// 第一題
// 請搭配 Homework0409_01.java

	public static void starSquare(int width, int height) {
		int grid[][] = new int[width][height];
		if (width > 0 && height > 0) {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("您提共的數字無法成為長方形");
		}
	}

// 第二題
// 請搭配 Homework0409_02.java

	public static int randAvg(int randomNum[]) {
		int avg = 0;

		for (int i = 0; i < 10; i++) {
			avg = avg + randomNum[i];
		}
		avg = avg / 10;
		return avg;
	}

// 第三題
// 請搭配 Homework0409_03.java	

	public static int maxElement(int x[][]) {

		int highestNum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (highestNum < x[i][j]) {
					highestNum = x[i][j];
				} else {
					continue;
				}
			}
		}
		return highestNum;
	}

	public static double maxElement(double x[][]) {

		double highestNum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (highestNum < x[i][j]) {
					highestNum = x[i][j];
				} else {
					continue;
				}
			}
		}
		return highestNum;
	}

// 第四題
// 請看 MyRectangle.java 以及 MyRectangleMain.java

// 第五題
// 請搭配 Homework0409_05.java
	public static char[] genAuthCode() {

		char auth[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D',
				'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
				'Z' };
		char randCode[] = new char[8];

		for (int i = 0; i < 8; i++) {
			int randNum = (int) (Math.random() * (auth.length));
			randCode[i] = auth[randNum];
		}
		return randCode;
	}

}