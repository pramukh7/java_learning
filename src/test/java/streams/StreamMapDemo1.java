package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapDemo1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(
				Arrays.asList("aarna","sanjay", "akshar","vaishali"));
		printnameInUpperCase(names);
	}
	
	private static void printnameInUpperCase(List<String> names)
	{
		names
		.stream()
		.filter(name->name =="aarna")
		.map(name->name.toUpperCase())
		.forEach(name->System.out.println(name));
	}

}
