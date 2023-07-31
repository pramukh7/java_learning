package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLargestAndSmallestElementFromUnsortedArray {

	public static void main(String[] args) {
		Integer [] myArray = {5,3,99,2,7,8,83,13,1,50,2};
			//findLargestAndSmallestElement(myArray);
		findLargestAndSmallestElement1(myArray);
	}
	
	//1st way
	private static void findLargestAndSmallestElement(Integer [] myArray)
	{
		List<Integer> list = new ArrayList<>(Arrays.asList(myArray));
		Collections.sort(list);
		System.out.println("Smallest Element is " + list.get(0));
		System.out.println("Largest Element is " + list.get(list.size()-1));
		
	}
	
	//second way
	private static void findLargestAndSmallestElement1(Integer [] myArray)
	{
		//{5,3,2,99,7,8,83,13,1,50,2}
		int smallNumber=myArray[0];
		int largeNumber=myArray[0];
		for(int i=1; i<myArray.length;i++)
		{
				if(myArray[i] > largeNumber)
				{
					largeNumber = myArray[i];
				}
				if(myArray[i] < smallNumber)
				{
					smallNumber = myArray[i];
				}
				
		}
		System.out.println("Smallest Element is " + smallNumber);
		System.out.println("Largest Element is " + largeNumber);
	}

}
