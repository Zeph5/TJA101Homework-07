package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator2 {

	private int x = 1;
	private int y = 1;

	public void useCalculator() throws CalException {
		int i = 0;
		while (i < 1) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("請輸入 x 的值");
				int x = sc.nextInt();
				this.x = x;
				
				System.out.println("請輸入 y 的值");
				int y = sc.nextInt();
				if (y == 0 && x == 0) {
					System.out.println("--0 的 0 次方沒有意義--");
					System.out.println();
					throw new CalException();
				} else if (y < 0) {
					System.out.println("--次方為負值，結果回傳不為整數！--");
					System.out.println();
					throw new CalException();
				} else {
					this.y = y;
				}
				powerXY(x, y);
			} catch (InputMismatchException e) {
				System.out.println("--輸入格式不正確--");
				System.out.println();
				continue;
			} catch (CalException e) {
				continue;
			}
			i++;
		}
	}

	public Calculator2() {
	}

	public Calculator2(int x, int y) throws CalException {
		this.x = x;
		setY(y);
	}

	public void setX() throws CalException {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i < 1) {
			try {
				System.out.println("請輸入 x 的值");
				int x = sc.nextInt();
				if (y == 0 && x == 0) {
					System.out.println("--0 的 0 次方沒有意義--");
					System.out.println();
					throw new CalException();
				} else {
					this.x = x;
				}
			} catch (InputMismatchException e) {
				System.out.println("--輸入格式不正確--");
				System.out.println();
				continue;
			} catch (CalException e) {
				continue;
			}
			i++;
		}
	}

	public void setX(int x) throws CalException {
		try {
			if (y == 0 && x == 0) {
				System.out.println("--0 的 0 次方沒有意義--");
				System.out.println();
				throw new CalException();
			} else {
				this.x = x;
			}
		} catch (InputMismatchException e) {
			System.out.println("--輸入格式不正確--");
			System.out.println();
		} catch (CalException e) {
		}
	}

	public void setY() throws CalException {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i < 1) {
			try {
				System.out.println("請輸入 y 的值");
				int y = sc.nextInt();
				if (y == 0 && x == 0) {
					System.out.println("--0 的 0 次方沒有意義--");
					System.out.println();
					throw new CalException();
				} else if (y < 0) {
					System.out.println("--次方為負值，結果回傳不為整數！--");
					System.out.println();
					throw new CalException();
				} else {
					this.y = y;
				}
			} catch (InputMismatchException e) {
				System.out.println("--輸入格式不正確--");
				System.out.println();
				continue;
			} catch (CalException e) {
				continue;
			}
			i++;
		}
	}

	public void setY(int y) throws CalException {
		try {
			if (y == 0 && x == 0) {
				System.out.println("--0 的 0 次方沒有意義--");
				System.out.println();
				throw new CalException();
			} else if (y < 0) {
				System.out.println("--次方為負值，結果回傳不為整數！--");
				System.out.println();
				throw new CalException();
			} else {
				this.y = y;
			}
		} catch (InputMismatchException e) {
			System.out.println("--輸入格式不正確--");
			System.out.println();
		} catch (CalException e) {
		}
	}

	public void getX() {
		System.out.println("現在的 x 是：" + x);
		;
	}

	public void getY() {
		System.out.println("現在的 y 是：" + y);
	}

	public void powerXY() {
		double power = x * Math.pow(x, (y - 1));
		System.out.println(x + " 的 " + y + " 次方等於 " + (int) power);
		System.out.println();
	}

	public void powerXY(int x, int y) {
		double power = x * Math.pow(x, (y - 1));
		System.out.println(x + " 的 " + y + " 次方等於 " + (int) power);
		System.out.println();
	}

}
