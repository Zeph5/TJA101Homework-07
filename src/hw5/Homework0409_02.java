package hw5;

//第二題
//請搭配 Homework0409_Methods

public class Homework0409_02 {

	public static void main(String[] args) {

		int randomAvg[] = new int[10];

		System.out.println("1-100 您抽到的是：");
		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * 100) + 1;
			randomAvg[i] = x;
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("這10個數字的平均是：" + Homework0409_Methods.randAvg(randomAvg));
	}
}
