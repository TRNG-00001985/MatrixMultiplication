package reva;

public class LCM {
	public static void main(String args[]) {
		int m=11;
		int n=55;
		int res=Integer.MAX_VALUE;
		for(int i=2;i<n;i++) {
				if(m%i==0 && n%i==0) {
					if(i<res) {
						res=i;
					}
				}
			}
		System.out.print(res);
	}
}
