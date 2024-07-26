package reva;

public class SwapBitWise{
	public static void main(String args[]) {
	int a=3; //100
	int b=4; // 101
	a=a^b;
	// a=111
	b=a^b;
	//b=011
	a=a^b;
	//a=100
	System.out.println(a);
	
	System.out.print(b);
}
}
