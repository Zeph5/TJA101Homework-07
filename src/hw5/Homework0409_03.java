package hw5;

//第三題
//請搭配 Homework0409_Methods

public class Homework0409_03 {

	public static void main(String[] args) {

		int arrayInt[][] = { { 1, 6, 3 }, { 9, 5, 2 } };
		double arrayDouble[][] = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		System.out.println("這些數字中最大的是：" + Homework0409_Methods.maxElement(arrayInt));
		System.out.println("這些數字中最大的是：" + Homework0409_Methods.maxElement(arrayDouble));
	}

}
