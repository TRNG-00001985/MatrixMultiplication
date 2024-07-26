package reva;

import java.util.Arrays;

public class TransposeOfMatrix {
	public static void main(String args[]) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr1=new int[arr[0].length][arr[0].length];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr1[i][j]=arr[j][i];
			}
		}
		System.out.print(Arrays.deepToString(arr1));
	}

}
