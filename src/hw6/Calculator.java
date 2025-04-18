package hw6;

public class Calculator {

	private int x;
	private int y;
	
	public Calculator() {	
	}
	
	public Calculator(int x, int y) throws CalException{
		if (x == 0 && y == 0) {
			System.out.println("0 的 0 次方沒有意義");
			System.out.println();
			throw new CalException ("0 的 0 次方沒有意義");
		} else if(y < 0) {
			System.out.println("次方為負值，結果回傳不為整數");
			System.out.println();
			throw new CalException ("次方為負值，結果回傳不為整數");
		} else {
			this.x = x;
			this.y = y;
		}

	}
	
	public void setX(int x) throws CalException{
		if(y == 0 && x == 0) {
			System.out.println("0 的 0 次方沒有意義");
			System.out.println();
			throw new CalException ("0 的 0 次方沒有意義");
		} else {
			this.x = x;
		}
	}
	
	public void setY(int y) throws CalException{
		if(y == 0 && x == 0) {
			System.out.println("0 的 0 次方沒有意義");
			System.out.println();
			throw new CalException ("0 的 0 次方沒有意義！");
		} else if(y < 0){
			System.out.println("次方為負值，結果回傳不為整數");
			System.out.println();
			throw new CalException ("次方為負值，結果回傳不為整數！");
		} else {
			this.y = y;
		}

	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int powerXY() {
		double power = x*Math.pow(x,(y-1));
		return (int)power;
	}
}
