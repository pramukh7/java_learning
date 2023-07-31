package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapDemo2 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Swaminarayan","Akshar Purushottam Maharaj","Pramukh Swami Maharaj","Mahant Swami Maharaj");
		List<String> list2 = Arrays.asList("Akshar","Aarna","Vaishali","Sanjay");
		List<String> list3 = Arrays.asList("Het","Dhyan","Dada","Dadi");
	
		printFlatMap(list1, list2, list3);
	}
	
	private static void printFlatMap(
			List<String> list1,
			List<String> list2,
			List<String> list3
			)
	{
		List<List<String>> lists = new ArrayList<>();
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		
		
		List<String> newList = 
				lists
				.stream()
				.flatMap(list->list.stream())
				.collect(Collectors.toList());
		System.out.println(newList);
		
		//Filter with Map on inner stream
		List<String> newList1 = 
				lists
				.stream()
				.flatMap(list->
					list
					.stream()
					.filter(name->name.length()>=5))
					.map(name->name.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(newList1);
	}
	
}
