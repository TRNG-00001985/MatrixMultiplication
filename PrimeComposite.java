package reva;

public class PrimeComposite {
public static void main(String args[]) {
	int n=2;
	if (n==0 || n==1) {
		System.out.println("Composite");
	}
	int count=0;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			count++;
		}else {
			continue;
		}
	}
	if(count==0) {
		System.out.print("Prime");
	}else {
		System.out.println("Composite");
	}
}
}
