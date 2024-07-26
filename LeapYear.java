package reva;

public class LeapYear {
	public static void main(String args[]) {
	int n=2020;
	if ( n%400==0 || n%100!=0 && n%4==0) {
		System.out.println("Leap Year");
	}else {
		System.out.println("Not a Leap Year");
	}

}

}