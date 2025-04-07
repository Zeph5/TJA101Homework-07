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
		
		System.out.print("有錢可借的員工編號: ");
		for(int i = 0 ; i < lend.length ; i++) {
			for (int j = 0 ; j < lend[i].length ; j++) {
				if(borrow <= lend[i][j]) {
				System.out.print(lend[0][j] + " ");
				lendCount++;
				}
			}
		}
		System.out.print("共 " + lendCount + " 人!");
		System.out.println();
		System.out.println();
		System.out.println("============");
		System.out.println();
		
// 第五題
		System.out.println("第五題");
		System.out.println();
		
		int getDate[] = new int[3];
		int yearDays[][] = {
			{1,2,3,4,5,6,7,8,9,10,11,12},
			{31,28,31,30,31,30,31,31,30,31,30,31}
		};
		int yearLeapDays[][] = {
				{1,2,3,4,5,6,7,8,9,10,11,12},
				{31,29,31,30,31,30,31,31,30,31,30,31}
			};
		
		int dayOfYear = 0;
		int x;
		
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
		int score[][] = new int[6][8];
							
		score[0][0] = 10;
		score[0][1] = 35;
		score[0][2] = 40;
		score[0][3] = 100;
		score[0][4] = 90;
		score[0][5] = 85;
		score[0][6] = 75;
		score[0][7] = 70;

		score[1][0] = 37;
		score[1][1] = 75;
		score[1][2] = 77;
		score[1][3] = 89;
		score[1][4] = 64;
		score[1][5] = 75;
		score[1][6] = 70;
		score[1][7] = 95;
		
		score[2][0] = 100;
		score[2][1] = 70;
		score[2][2] = 79;
		score[2][3] = 90;
		score[2][4] = 75;
		score[2][5] = 70;
		score[2][6] = 79;
		score[2][7] = 90;
		
		score[3][0] = 77;
		score[3][1] = 95;
		score[3][2] = 70;
		score[3][3] = 89;
		score[3][4] = 60;
		score[3][5] = 75;
		score[3][6] = 85;
		score[3][7] = 89;
		
		score[4][0] = 98;
		score[4][1] = 70;
		score[4][2] = 89;
		score[4][3] = 90;
		score[4][4] = 75;
		score[4][5] = 90;
		score[4][6] = 89;
		score[4][7] = 90;
		
		score[5][0] = 90;
		score[5][1] = 80;
		score[5][2] = 100;
		score[5][3] = 75;
		score[5][4] = 50;
		score[5][5] = 20;
		score[5][6] = 99;
		score[5][7] = 75;
		
		
		int studentCount[][] = new int[8][2];
		studentCount[0][0] = 0;
		studentCount[1][0] = 0;
		studentCount[2][0] = 0;
		studentCount[3][0] = 0;
		studentCount[4][0] = 0;
		studentCount[5][0] = 0;
		studentCount[6][0] = 0;
		studentCount[7][0] = 0;
		
		int studentNum = 0;
		int highScore;
		int z;
		
		for (int i = 0; i < score.length; i++) {
			z = 0;
			highScore = 0;
			for(int j = 0; j < score[i].length; j++) {
				if(highScore < score[i][j]) {
				highScore = score[i][j];
				z = j;
				}
				else {
				continue;}
				}
			studentCount[z][0] = studentCount[z][0] + 1;
			}
		for(int i = 0; i < studentCount.length; i++) {
		studentNum = i + 1;
		System.out.println(studentNum + " 號同學考最高分 " + studentCount[i][0] + " 次。");
		}
	}
}
