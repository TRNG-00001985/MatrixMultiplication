package reva;

public class AverageArray {
	public static void main(String args[]) {
		int[] arr= {12,21,33,44,22,90,89};
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.print((float)sum/arr.length);
	}

}
