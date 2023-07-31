package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheSecondHighestNumberFromArray {
	
	public static void main(String[] args) {
		Integer [] myArray = {3,5,8,85,9,12,13,45,44,23,88,34};
		
		//findSecondHighestElementFromArray(myArray);
		//findSecondHighestElementFromArray1(myArray);
		findSecondHighestElementFromArray2(myArray);
	}

	//1st Way
	private static void findSecondHighestElementFromArray(Integer[] myArray) {
		List<Integer> list = new ArrayList<>(Arrays.asList(myArray));
		Collections.sort(list);
		System.out.println("Second Highest Element==>" + list.get(list.size()-2));
	}
	
	//2nd way
	private static void findSecondHighestElementFromArray1(Integer[] myArray) {

		Arrays.sort(myArray);
			
		System.out.println("Second Highest Element==>" + myArray[myArray.length-2]);
	}
	
	//3rd way
	private static void findSecondHighestElementFromArray2(Integer[] myArray) {
			//{3,5,8,85,9,12,13,45,44,23,88,34}
		Arrays.sort(myArray);
		int largestElement = myArray[0];
		int secondLargestElement = myArray[0];
		for(int i=1;i<myArray.length;i++)
		{
			if(myArray[i] > largestElement)
			{
				secondLargestElement = largestElement;
				largestElement = myArray[i];
			}  
			if(myArray[i] < largestElement)
			{
				secondLargestElement = myArray[i];
			}
		}
			
		System.out.println("Second Highest Element==>" + secondLargestElement);
	}
	
}
