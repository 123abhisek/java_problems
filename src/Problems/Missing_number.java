package Problems;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Missing number in array

public class Missing_number {
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
		}
		
	}

	public static void main(String[] args) {

		int N = 2;
		int[] arr = {1};
		int[] temp = new int[N];
		
		for (int i=0;i<arr.length;i++) {
			temp[arr[i]-1]=1;
		}
		
		for(int a :temp) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		for(int j=0;j<temp.length;j++) {
			if(temp[j] == 0) {
				System.out.println(j+1);
			}
		}
		
	}

}
