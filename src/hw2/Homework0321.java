package hw2;

public class Homework0321 {

	public static void main(String[] args) {

// 第一題

		int multi2;
		int multi2ans = 0;

		for (multi2 = 1; multi2 <= 1000; multi2++) {
			if (multi2 % 2 == 0) {
				multi2ans = multi2ans + multi2;
			}
		}
		System.out.println("第一題");
		System.out.println(multi2ans);
		System.out.println("\n============\n");

// 第二題

		int multi10 = 1;
		int run10;

		for (run10 = 2; run10 <= 10; run10++) {
			multi10 = multi10 * run10;
		}
		System.out.println("第二題");
		System.out.println(multi10);
		System.out.println("\n============\n");

// 第三題

		int multi_10 = 1;
		int run_10 = 2;
		while (run_10 <= 10) {
			multi_10 = multi_10 * run_10;
			run_10++;
		}
		System.out.println("第三題");
		System.out.println(multi_10);
		System.out.println("\n============\n");

// 第四題

		int multi__10 = 1;

		System.out.println("第四題");
		for (multi__10 = 1; multi__10 <= 10; multi__10++) {
			System.out.print(multi__10 * multi__10 + " ");
		}
		System.out.println();
// 第四題 - 第二版
//		int run__10;
//		int grow__10 = 1;
//		
//		multi__10 = 0;
//		for(run__10 = 1; run__10 <= 10; run__10++) {
//			multi__10 = multi__10 + grow__10;
//			System.out.print(multi__10 + " ");
//			grow__10 += 2;
//		}
//		System.out.println();
		System.out.println("\n============\n");

// 第五題

		int noFourNum;
		int noFourCount = 0;

		System.out.println("第五題");
		for (noFourNum = 1; noFourNum <= 49; noFourNum++) {
			if (noFourNum % 10 == 4 || noFourNum / 10 == 4) {
				continue;
			}
			noFourCount++;
			System.out.print(noFourNum + " ");
		}
		System.out.println();
		System.out.println("一共有" + noFourCount + "個數字沒有4");
		System.out.println("\n============\n");

// 第六題

		int numX, numY = 1;

		System.out.println("第六題");
		for (numX = 10; numX >= 1; numX--) {
			for (numY = 1; numY <= numX; numY++) {
				System.out.print(numY + " ");
			}
			System.out.println();
		}
		System.out.println("\n============\n");

// 第七題

		int letterUni = 65;
		int letterIncrease;
		int letterPrintTimes;
		char letterOut;

		System.out.println("第七題");
		for (letterIncrease = 0; letterIncrease <= 5; letterIncrease++) {
			for (letterPrintTimes = 0; letterPrintTimes <= letterIncrease; letterPrintTimes++) {
				letterOut = (char) letterUni;
				System.out.print(letterOut + " ");
			}
			letterUni++;
			System.out.println();
		}
	}

}