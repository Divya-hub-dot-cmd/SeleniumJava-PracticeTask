package week1.day1;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		System.out.println("Before Swapping");
		System.out.println("The value of x is:" +x);
		System.out.println("The value of y is:" +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping");
		System.out.println("The value of x is:" +x);
		System.out.println("The value of y is:" +y);

	}

}
