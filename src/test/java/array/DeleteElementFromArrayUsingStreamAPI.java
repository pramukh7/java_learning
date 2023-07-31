package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteElementFromArrayUsingStreamAPI {

	public static void main(String[] args) {
		Integer [] myArray = {1,2,4,6,8,9,7,13};
		int index = 2;
		System.out.println(deleteElementFromArray(myArray, index));
		

	}
	
	private static String deleteElementFromArray(Integer [] myArray, int index)
	{
		System.out.println("Original Array=>"+ Arrays.toString(myArray));
		int[] newArray = IntStream.range(0, myArray.length).filter(i->i!=index).map(i->myArray[i]).toArray();
		return Arrays.toString(newArray);
	}

}
