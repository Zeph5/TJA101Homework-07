package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		int i = 0;
		int x = 1;
		int y = 1;

		while (i < 1) {

			Scanner sc = new Scanner(System.in);

			System.out.println("請輸入 x 的值");
			try {
				x = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
				System.out.println();
				continue;
			}

			System.out.println("請輸入 y 的值");
			try {
				y = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
				System.out.println();
				continue;
			}

			try {
				Calculator cal = new Calculator(x, y);
				System.out.println(cal.getX() + "的" + cal.getY() + "次方等於 " + cal.powerXY());
				System.out.println();
				System.out.println("現在的 x 是：" + cal.getX());
				System.out.println("現在的 y 是：" + cal.getY());
				System.out.println();

				System.out.println("請輸入新的 x 的值");
				cal.setX(sc.nextInt());
				System.out.println("請輸入新的 y 的值");
				cal.setY(sc.nextInt());
				System.out.println(cal.getX() + "的" + cal.getY() + "次方等於 " + cal.powerXY());
				System.out.println();
				System.out.println("現在的 x 是：" + cal.getX());
				System.out.println("現在的 y 是：" + cal.getY());
			} catch (CalException e) {
				continue;
			}

			sc.close();
			i++;
		}
	}
}
