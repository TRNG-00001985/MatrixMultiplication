package reva;

public class MaxMinusMin {
	public static void main(String args[]) {
		int[] arr= {78,93,20,64,10,2};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i>max) {
				max=i;
			}else if(i<min){
				min=i;
			}else {
				continue;
			}
		}
		System.out.print(max-min);
	}

}
