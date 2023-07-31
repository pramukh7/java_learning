package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Student {
	private int id;
	private String name;
	private String city;
}

public class StreamFlatMapDemo4 {
	
	public static void main(String[] args) {
		printFlatMap();
	}
	
	private static void printFlatMap()
	{
		List<Student> list1 = 
				new ArrayList<Student>();
		list1.add(new Student(1, "Aarna", "Ahmedabad"));
		List<Student> list2 = 
				new ArrayList<Student>();
		list2.add(new Student(2, "Sanjay", "Sobhasan"));
		List<Student> list3 = 
				new ArrayList<Student>();
		list3.add(new Student(3, "Akshar", "Toronto"));
		List<Student> list4 = 
				new ArrayList<Student>();
		list4.add(new Student(4, "Vaishali", "Ahmedabad"));
		
		List<List<Student>> lists = new ArrayList<>();
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		lists.add(list4);
		
		List<Student> newList = 
				lists
				.stream()
				.flatMap(list->list.stream())
				.collect(Collectors.toList());
		
		newList
		.forEach(name->
		System.out.println(name.getName() +" "+ name.getCity()));
		
		//Filter with Map on inner stream
		List<String> newList1 = 
				lists
				.stream()
				.flatMap(list -> list.stream()
					.filter(s -> s.getName().length() <= 5)
					.map(n -> n.getName().toUpperCase()))
				.collect(Collectors.toList());
		System.out.println(newList1);
	}
}
