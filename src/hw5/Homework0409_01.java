package hw5;

import java.util.Scanner;

//第一題
//請搭配 Homework0409_Methods

public class Homework0409_01 {

	public static void main(String[] args) {

		System.out.println("請輸入長與寬：");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		Homework0409_Methods.starSquare(x, y);
	}

}
