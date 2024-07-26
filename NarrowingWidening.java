package Revature;

public class NarrowingWidening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//explicit widening
		int v=90;
		System.out.println((double)v);
		//implicit widening
		int a=78;
		double s=a;
		System.out.println(s);
		//explicit narrowing
		double d=12;
		System.out.println((int)d);
		//implicit narrowing 
		short f=10;
		int n=f;
		System.out.println(n);
	}

}
