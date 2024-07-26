package reva;

import java.util.Arrays;

public class CombineArrays {
	public static void main(String args[]) {
		int[] a= {2,4,5,6,7,8};
		int[] b= {5,6,7,8,9};
		int[] c=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			int ele=a[i];
			c[j++]=ele;
		}
		for(int i=0;i<b.length;i++)
		{
			int ele1=b[i];
			c[j++]=ele1;
		}
		System.out.println(Arrays.toString(c));
	}
	
}
