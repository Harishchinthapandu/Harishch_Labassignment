package day1_labassignment;

import java.util.Arrays;

public class Assignment1_copy {

	public static void main(String[] args) {
		int arr[]={4,5,6,7,67};
		int copyOfArr[]=ArrayOp.copyOf(arr);
		for(int i=0;i<copyOfArr.length;i++) {
			System.out.print(copyOfArr[i]+" ");
		}
	}
}
	class ArrayOp{
	public static int[] copyOf(int[] array) {
		
		return Arrays.copyOf(array , array.length);
	}
	}

	

