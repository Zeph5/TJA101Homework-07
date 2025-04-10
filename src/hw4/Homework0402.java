package hw4;

import java.util.Scanner;

public class Homework0402 {
	
	public static void main(String[] args) {

// 第一題
		System.out.println("第一題");
		System.out.println();
		
		int numberX = 0;
		int numbersArray[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		while(numberX == 0) {
			for(int i = 0; i < numbersArray.length; i++) {
			numberX = numberX + numbersArray[i];}
			numberX = numberX / numbersArray.length;};
		System.out.println("該陣列的平均值為: " + numberX);
		System.out.print("該陣列中的以下數字大於平均值: "); 
		for(int i = 0; i < numbersArray.length; i++) {
			if(numbersArray[i] > numberX) {
				System.out.print(numbersArray[i] + " ");};
			}
		System.out.println();
		System.out.println();
		System.out.println("============");
		System.out.println();
		
// 第二題
		System.out.println("第二題");
		System.out.println();
		
		String str = "Hello World";
		char reStr[] = str.toCharArray();
		for(int i = reStr.length - 1 ; i >= 0 ; i--) {
			
			System.out.print(reStr[i]);
			
		};
		System.out.println();
		System.out.println();
		System.out.println("============");
		System.out.println();
		
// 第三題
		System.out.println("第三題");
		System.out.println();
		
		String planets[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int vowelCount = 0;
		
		for(int i = 0; i < planets.length; i++) {
			char pVowels[] = planets[i].toCharArray();
			for(int j = 0; j < pVowels.length; j++) {
				if(pVowels[j] == 'a' || pVowels[j] == 'e' || pVowels[j] == 'i' || pVowels[j] == 'o' || pVowels[j] == 'u') {
					vowelCount = vowelCount + 1;
				}
			}
		}
		System.out.println("In all the planets, there are " + vowelCount + " vowels.");
		System.out.println();
		System.out.println("============");
		
// 第四題
		System.out.println("第四題");
		System.out.println();
		
		int lend[][] = {
		{25,32,8,19,27},
		{2500,800,500,1000,1200}};
		int lendCount = 0;
		
		System.out.println("請輸入想借的金額:");
		Scanner sc = new Scanner(System.in);
		int borrow = sc.nextInt();
		
		if(borrow > 0 && borrow <= 2500) {
			System.out.print("有錢可借的員工編號: ");
			for(int i = 0 ; i < lend[1].length ; i++) {
				if(borrow <= lend[1][i]) {
					System.out.print(lend[0][i] + " ");
					lendCount++;
				}
			}
			System.out.print("共 " + lendCount + " 人!");
		}
		else if(borrow > 2500) {
			System.out.print("沒人能借你啦!");
		}
		else {
			System.out.print("你輸入的是什麼東西?!");
		}
		System.out.println();
		System.out.println();
		System.out.println("============");
		System.out.println();
		
// 第五題
		System.out.println("第五題");
		System.out.println();
		
		//正常版月日
		int yearDays[][] = {
			{1,2,3,4,5,6,7,8,9,10,11,12},
			{31,28,31,30,31,30,31,31,30,31,30,31}
		};
		//閏年版月日
		int yearLeapDays[][] = {
			{1,2,3,4,5,6,7,8,9,10,11,12},
			{31,29,31,30,31,30,31,31,30,31,30,31}
		};
		
		int dayOfYear = 0;
		
		int getDate[] = new int[3];
		
		System.out.println("Please enter year month day:");
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			if (scan.hasNextInt()) {
				getDate[i] = scan.nextInt();
			}
		}
				
		int year = getDate[0];
		int month = getDate[1];
		int day = getDate[2];
		
		if(year % 4 == 0) {
		if(month <= 12 && month >= 1 && day >= 1 && day <= yearLeapDays[1][month-1]) {
			for(int i = 0; i < month-1; i++) {
				dayOfYear = dayOfYear + yearLeapDays[1][i];}
			dayOfYear = dayOfYear + day;
			System.out.println("It is the " + dayOfYear + " day of the year.");
			}
		else {
					System.out.println("Error in entered date!");
			}
		} else {
			if(month <= 12 && month >= 1 && day >= 1 && day <= yearDays[1][month-1]) {
				for(int i = 0; i < month-1; i++) {
					dayOfYear = dayOfYear + yearDays[1][i];}
				dayOfYear = dayOfYear + day;
				System.out.println("It is the " + dayOfYear + " of the year.");
				}
			else {
						System.out.println("Error in entered date!");
				}
		}
		System.out.println();
		System.out.println("============");
		System.out.println();
		
// 第六題
		System.out.println("第六題");
		System.out.println();	
		
		//6次考試，每次考試分數
		int score[][] = {
			{10,35,40,100,90,85,75,70},
			{37,75,77,89,64,75,70,95},
			{100,70,79,90,75,70,79,90},
			{77,95,70,89,60,75,85,89},
			{98,70,89,90,75,90,89,90},
			{90,80,100,75,50,20,99,75}
		};
		
		//1-8號同學，當次考試最高分次數(起始值0)
		int studentCount[] = {0,0,0,0,0,0,0,0};
		
		int studentNum;
		int highScore;
		int highScoreStudent;
		
		//迴圈地幾次考試
		for (int i = 0; i < score.length; i++) {
			
			//重置最高分，最高分的同學
			highScore = 0;
			highScoreStudent = 0;
			
			//迴圈每個同學分數
			for(int j = 0; j < score[i].length; j++) {
				
				//當分數大於本次考試暫時的最高分就會進入if
				if(highScore < score[i][j]) {
				//紀錄本次考試暫時最高分
				highScore = score[i][j];
				//紀錄本次考試最高分的同學
				highScoreStudent = j;
				}
				//若沒有比暫時最高分高就下一個
				else {
				continue;}
				}
			//在比較完本次考試最高分後更新紀錄最高分次數的陣列
			studentCount[highScoreStudent] = studentCount[highScoreStudent] + 1;
			}
		
		//六次考試統計完後輸出第二個陣列的學號以及最高分次數
		System.out.println("以下是同學考試分數最高的次數:");
		for(int i = 0; i < studentCount.length; i++) {
		studentNum = i + 1;
		System.out.println(studentNum + " 號同學考最高分 " + studentCount[i] + " 次。");
		}
	}
}
