package reva;

public class MaxMinValue {
	public static void main(String args[]) {
		int[] arr= {38,34,56,78,97,93,1,67,0,99};
		
		int minValue=Integer.MAX_VALUE;
		int maxValue=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i<minValue) {
				minValue=i;
			}else if(i>maxValue) {
				maxValue=i;
			}else {
				continue;
			}
		}
		System.out.println(minValue);
		System.out.print(maxValue);
	}
}
