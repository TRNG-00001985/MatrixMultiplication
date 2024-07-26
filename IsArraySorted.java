package reva;

import java.util.Arrays;

public class IsArraySorted {
	public static void main(String args[]) {
		int[] arr= {21,75,10,63,76};
		int[] arr2=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			int ele=arr[i];
			arr2[j++]=ele;
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));
		if(arr==arr2) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}
		
   }
}
