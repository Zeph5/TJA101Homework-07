package hw1;

public class Homework0320 {

	public static void main(String[] args) {

// 第一題
		
		int num01 = 12;
		int num02 = 6;

		System.out.println("第一題");
		System.out.println("A: 12 + 6 = " + (num01 + num02));
		System.out.println("A: 12 x 6 = " + (num01 * num02));

		System.out.println("\n============\n");

// 第二題
		
		int num03 = 200 / 12;
		int num04 = 200 % 12;

		System.out.println("第二題");
		System.out.println("A: " + "一共是" + num03 + "打" + num04 + "顆蛋");
		System.out.println("\n============\n");

// 第三題	
		
		int num05 = 256559 / 60; //取得256559秒以"分鐘"呈現並只取整數 = 4275分鐘 
		int num06 = num05 / 60; //取得256559秒以"小時"呈現並只取整數 = 71小時
		
		int num07 = num06 / 24;
		//取得256559秒以"天"呈現並只取整數 = 2天
		int num08= num06 % 24;
		//取得256559秒以"小時"呈現轉換成"天"時剩下的"小時"數並只取整數 = 71小時 - 2天 = 23小時
		int num09 = num05 % 60;
		//取得256559秒以"分鐘"呈現轉換成"小時"時剩下的"分鐘"數並只取整數 = 4275分鐘 - (71小時) = 15 分鐘
		int num10 = 256559 % 60;
		//取得256559秒轉換成分鐘時剩下的"秒"數 = 256559秒 - 4275分鐘 = 59秒

		System.out.println("第三題");
		System.out.println("A: " + "256559秒一共是" + num07 + "天" + num08 + "小時" + num09 + "分" + num10 + "秒");

//	第三題 - 第二版
//		
//		int days = 256559 / (60*60*24); //256559秒轉換成"天"並只取整數
//		int hours = (256559/60/60) % 24; //256559秒以"小時"呈現，取得轉換成"天"時的餘數並只取整數
//		int minutes = (256559/60) % 60; //256559秒以"分鐘"呈現，取得轉換成"小時"時的餘數並只取整數
//		int seconds = 256559 % 60; //取得256559秒轉換成"分鐘"時的餘數
//		
//		System.out.println("A: " + "256559秒一共是" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
		System.out.println("\n============\n");

// 第四題
		
		double pi = 3.1415;
		int radius = 5;
		double area = pi * (radius * radius);
		double cir = pi * (radius * 2);

		System.out.println("第四題");
		System.out.println("A: " + "圓面積是" + area + "，而圓周長是" + cir);
		System.out.println("\n============\n");

// 第五題
		
		byte year = 1;
		double money = 1500000;
		double interest = 0.02;

		while (year <= 10) {
			money = money + (money * interest);
			year++;
		}

		System.out.println("第五題");
		System.out.println("A: " + "本金加利息我現在有" + money);

// 第五題 - 同學的版本
		
//		money = 1500000;
//		money=money*Math.pow((1+interest),10);
//		System.out.println("A: " + "本金加利息我現在有" + money);

//		同學跟我分享的解法，發現答案不太一樣
//		他的答案是1828491.629992136
//		我的答案是1828491.6299921356
//		我的第二版1828491.6299921358

// 第五題 - 第二版
		
//		money = 1500000;
//		for(year = 1; year <= 10; year++) {
//			money = money * (1 + interest);
//		}
//		System.out.println("A: " + "本金加利息我現在有" + money);
//		
//		System.out.println("\n============\n");

// 第六題
		
		System.out.println("第六題");
		System.out.println("A: " + (5 + 5));
		// 答案是10因為數字5加數字5等於10

		System.out.println("A: " + (5 + '5'));
		// 答案是58因為第一個5是數字而第二個5有''所以是char遇到數學公式時以unicode0035計算，而0035是16進位，在十進位是53

		System.out.println("A: " + (5 + "5"));
		// 答案是55因為第一個5是數字而第二個5有""所以是String被歸類為字串不被數學公式影響
		System.out.println(" --- 詳解請看//解說 --- ");
	}

}