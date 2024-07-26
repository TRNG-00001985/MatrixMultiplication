package reva;

public class SumOfDigits {
	public static void main(String args[]) {
	int n=836;
	int res=0;
	while(n!=0) {
		res+=n%10;
		n=n/10;
		
	}
	System.out.print(res);
	}
}
