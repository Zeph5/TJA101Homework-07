package hw5;

//第四題
//請搭配 MyRectangle.java

public class MyRectangleMain {

	public static void main(String[] args) {

		MyRectangle mr1 = new MyRectangle();
		mr1.setWidth(10);
		mr1.setDepth(20);
		System.out.println("寬是：" + mr1.getWidth());
		System.out.println("深是：" + mr1.getDepth());
		System.out.println("面積是：" + mr1.getArea());

		System.out.println();

		MyRectangle mr2 = new MyRectangle(10, 20);
		System.out.println("寬是：" + mr2.getWidth());
		System.out.println("深是：" + mr2.getDepth());
		System.out.println("面積是：" + mr2.getArea());
	}

}
