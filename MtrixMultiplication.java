package reva;

import java.util.Arrays;

public class MtrixMultiplication {
	public static void main(String args[]) {
		int[] arr= {12,34,54,32,12,45};
		int[] arr2= {32,90,54,21,10,45};
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[i]*arr2[i];
		}
		System.out.print(Arrays.toString(res));
		System.out.println(Arrays.toString(arr));
	}
	
	

}

