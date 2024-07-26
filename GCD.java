package reva;

public class GCD {
	public static void main(String args[]) {
		int m=12;
		int n=8;
		int res=Integer.MIN_VALUE;
		for(int i=2;i<n;i++) {
				if(m%i==0 && n%i==0) {
					if(i>res) {
						res=i;
					}
				}
			}
		System.out.print(res);
	}

}
