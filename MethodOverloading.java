package reva;

public class MethodOverloading {
	public static void multiplication(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	public static void multiplication(int a,int b,int c,int d) {
		System.out.println(a*b*c*d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication(10,20,30);
		multiplication(21,45,67,90);

	}

}
