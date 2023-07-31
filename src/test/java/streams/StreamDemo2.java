package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Swaminarayan");
		names.add("Pramukh Swami Maharaj");
		names.add("Mahant Swami Maharaj");
		names.add("Akshar");
		names.add("Aarna");
		names.add("Vaishali");
		names.add("Sanjay");
		printName(names);
	}
	
	private static void printName(List<String> names) {
		List<String> filterNames = new ArrayList<>();
		filterNames = names.stream()
		.filter(name->(name.length() >=5 && name.length() <=8))
		.collect(Collectors.toList());
		System.out.println(filterNames);
	}

}
