package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Here I just created Integer array 1 to 20
 */
public class FindMissingNumberFromIntegerArray1To100 {

	public static void main(String[] args) {
		Integer [] myArray = {1,2,3,4,5,6,7,8,10,12,13,14,15,17,18,20};
		findMissingIntegerFromArray(myArray);

	}
	
	private static void findMissingIntegerFromArray(Integer[] myArray) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(myArray));
		List<Integer> newList = new ArrayList<>();
		for(int i=1;i<=20;i++)
		{
			if(!list.contains(i))
			{
				newList.add(i);
			}
		}
		System.out.println(newList);
	}

}
