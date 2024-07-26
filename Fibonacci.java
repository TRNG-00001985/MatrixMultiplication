package reva;

public class Fibonacci {
	public static void main(String args[]) {
		int n=10;
		int n1=0;
		int n2=1;
		int n3;
		if(n==0 || n==1 || n==2) {
			System.out.println(n);
		}else {
			for(int i=2;i<n;++i) {
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
				
			}
		}
	}
}
