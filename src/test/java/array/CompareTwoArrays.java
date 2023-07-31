package array;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		Integer [] myArray1 = {1,2,3,4,5};
		Integer [] myArray2 = {1,2,3,4,5};
		
		compareArrays(myArray1, myArray2);
	}
	
	private static void compareArrays(Integer[] myArray1, Integer[] myArray2) {
		System.out.println(Arrays.toString(myArray1).equals(Arrays.toString(myArray2)));
		
	}

}
