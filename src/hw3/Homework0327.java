package hw3;

import java.util.*;

public class Homework0327 {

	public static void main(String[] args) {

// 第一題
		System.out.println("請輸入三個整數:");
		
		Scanner sc = new Scanner(System.in);
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		sc.close();
		
		if(data1 <= 0 || data2 <= 0 || data3 <= 0) {
			System.out.println("這不是三角形");
		}
		else if(data1 == data2 && data1 == data3) {
			System.out.println("這是正三角形");
		}
		else if(data1 == data2 || data1 == data3 || data2 == data3) {
			System.out.println("這是等腰三角形");
		}
		else if((data1*data1)+(data2*data2)==(data3*data3) || (data1*data1)+(data3*data3)==(data2*data2) || (data3*data3)+(data2*data2)==(data1*data1)) {
			System.out.println("這是直角三角形");
		}
		else{
			System.out.println("這是其他三角形");
		}

// 第二題		
//		System.out.println("I want to play a game >:)");
//		System.out.println("我們來玩終極密碼，1~9 之間猜我心中的數字");
//		System.out.println("請注意你只有三次機會");
//		
//		int B = 1;
//		int C = 9;		
//		int X;
//		X = (int)(Math.random()*C)+1;
//		int tries = 1;
//		int maxTries = 3;
//		
//		Scanner numbergame = new Scanner(System.in);
//		
//		do {
//			int A = numbergame.nextInt();
//			if (A > C || A < B){
//			System.out.println("請提共範圍內的數字");
//			}
//			else if (X == A) {
//			System.out.println("答對了，這次就放過你吧");
//			break;
//			}
//			else if (tries == maxTries && X != A) {
//				System.out.println("錯！你的機會用完了，受死吧!");
//			tries++;
//			}
//			else if(X > A) {
//			B = A+1;
//			System.out.println("錯！" + B + "~" + C +"再猜一次");	
//			tries++;
//			}
//			else {
//			C = A-1;
//			System.out.println("錯！" + B + "~" + C +"再猜一次");	
//			tries++;
//			}
//		} while (tries <= maxTries);
//		
//		System.out.println("遊戲結束！");	

// 第二題 - 進階版
//		System.out.println("I want to play a game >:)");
//		System.out.println("我們來玩終極密碼，1~100 之間猜我心中的數字");
//		System.out.println("請注意你只有十次機會");
//		
//		int B = 1;
//		int C = 100;
//		int X;
//		X = (int)(Math.random()*C)+1;
//		int tries = 1;
//		int maxTries = 10;
//		
//		Scanner numbergame = new Scanner(System.in);
//		
//		do {
//			int A = numbergame.nextInt();
//			if (A > C || A < B){
//			System.out.println("請提共範圍內的數字");
//			}
//			else if(X == A) {
//			System.out.println("答對了，這次就放過你吧");
//			break;
//			}
//			else if (tries == maxTries && X != A) {
//				System.out.println("錯！你的機會用完了，受死吧!");
//			tries++;
//			}
//			else if(X > A) {
//			B = A+1;
//			System.out.println("錯！" + B + "~" + C +"再猜一次");	
//			tries++;
//			}
//			else {
//			C = A-1;
//			System.out.println("錯！" + B + "~" + C +"再猜一次");	
//			tries++;
//			}
//		} while (tries <= maxTries);
//		
//		System.out.println("遊戲結束！");	

// 第三題
//		int badNum;
//		int goodNumCount;
//		int printTime = 0;
//		System.out.println("請輸入1~9你不想看到的數字");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		List<Integer> validNumbers = new ArrayList<>();
//
//		if (num > 0 && num < 10) {
//			goodNumCount = 0;
//			for (badNum = 1; badNum <= 49; badNum++) {
//				if (badNum % 10 == num || badNum / 10 == num) {
//					continue;
//				}
//				validNumbers.add(badNum);
//				goodNumCount++;
//				System.out.print(badNum + "\t");
//				printTime++;
//				if (printTime == 6) {
//					System.out.println();
//					printTime = 0;
//				}
//			}
//			System.out.println();
//			System.out.println("一共有" + goodNumCount + "個數字沒有" + num);
//			Collections.shuffle(validNumbers);
//			System.out.println("建議您可以選: ");
//			for (int i = 0; i < 6; i++) {
//				System.out.print(validNumbers.get(i) + "\t");
//			}
//		}
//		else {
//			System.out.println("您所提共的並不是1~9");
//		}
	}
}