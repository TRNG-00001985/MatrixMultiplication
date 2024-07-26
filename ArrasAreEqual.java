package reva;

import java.util.Arrays;

public class ArrasAreEqual {
	public static void main(String args[]) {
		int[] arr= {87,90,23,21};
		int[] arr1= {87,90,23,21};
		int[] arr2= {90,39,48,82,37,75};
		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr, arr2));
		System.out.println(Arrays.equals(arr1, arr2));
	}

}
