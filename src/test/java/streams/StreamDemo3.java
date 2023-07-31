package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Swaminarayan");
		names.add("Pramukh Swami Maharaj");
		names.add("Mahant Swami Maharaj");
		names.add("Akshar");
		names.add(null);
		names.add("Aarna");
		names.add("Vaishali");
		names.add("Sanjay");
		names.add(null);
		
		printName(names);

	}
	
	private static void printName(List<String> names)
	{
		names
		.stream()
		.filter(name-> name != null)
		.forEach(name->System.out.println(name));
	}

}
