package Swap;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60,b=75;
		System.out.println("Before swapping value..."+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping value.."+a+" "+b);
	}

}
