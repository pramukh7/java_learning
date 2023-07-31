package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueElementsFromAtleastTwoArray {

	public static void main(String[] args) {

		Integer [] array1 = {1,2,6,13,7};
		Integer [] array2 = {7,9,5,3,13,6};
		Integer [] array3 = {12,22,66,5,1};
		
		FindUniqueElementsFrom(array1, array2, array3);

	}
	
	private static void FindUniqueElementsFrom(Integer [] array1,
			Integer [] array2,
			Integer [] array3) {
	
		List<Integer> l1 = Arrays.asList(array1);
		List<Integer> l2 = Arrays.asList(array2);
		List<Integer> l3 = Arrays.asList(array3);
		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.addAll(l1);
		hashSet.addAll(l2);
		hashSet.addAll(l3);
		
		List<Integer> finalList = new ArrayList<>();
		for(Integer number:hashSet) {
			if((l1.contains(number) && l2.contains(number)) 
					|| (l2.contains(number) && l3.contains(number))
					|| (l1.contains(number) && l3.contains(number))
					) {
				finalList.add(number);
			}
		}
		System.out.println(finalList);
		
	}

}
