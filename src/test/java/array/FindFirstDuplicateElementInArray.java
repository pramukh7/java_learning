package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstDuplicateElementInArray {

	public static void main(String[] args) {
		Integer [] myArray = {1,2,3,6,8,9,12,45,56,67,13,43,13,4,8};
		//findFirstDuplicateElement(myArray);
		System.out.println(findFirstDuplicateElementSecondWay(myArray));
	}
	
	//first way
	private static void findFirstDuplicateElement(Integer[] myArray)
	{
	
		List<Integer> list = new ArrayList<>();
		for(Integer number:myArray)
		{
				if(list.contains(number))
				{
					System.out.println("First Duplicate Element=> "+number);
					break;
				}else {
					list.add(number);
				}
				
		}
	}
	
	//second way
	//first way
	private static String findFirstDuplicateElementSecondWay(Integer[] myArray)
	{
	
		for(int i=0;i<myArray.length;i++) {
			
			for(int j=i+1;j<myArray.length;j++)
			{
				if(myArray[i] == myArray[j])
				{
					return "First Duplicate Element is => "+myArray[j];
				}
			}
		}
		return "No Duplicate Element";
	}

}