package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapDemo1 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		printFlatMap(list1, list2, list3);
	}
	
	private static void printFlatMap(
			List<Integer> list1,
			List<Integer> list2,
			List<Integer> list3)
	{
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		
		//just printing the all lists into 1 new list
		List<Integer> newList = 
				lists.stream()
				.flatMap(list->list.stream())
				.collect(Collectors.toList());
		System.out.println(newList);
		
		//performing operation one each list element and adding to the new list
		//adding 10 to each list element
		List<Integer> newList1 = 
				lists.stream()
				.flatMap(list->list.stream().map(num->num+10))
				.collect(Collectors.toList());
		System.out.println(newList1);
	}

}
