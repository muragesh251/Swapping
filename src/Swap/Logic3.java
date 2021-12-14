package Swap;

public class Logic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65,b=75;
		System.out.println("Before swapping value"+a+" "+b);
		b=a+b-(a=b);
		System.out.println("After swapping value "+a+" "+a);
	}

}
