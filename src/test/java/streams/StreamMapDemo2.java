package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.map.HashedMap;

public class StreamMapDemo2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("aarna","sanjay", "akshar","vaishali");
		printLengthOfName(names);
	}
	
	private static void printLengthOfName(List<String> names)
	{
	
		Map<String, Integer> nameWithLength = new HashedMap<>();
		List<Integer> namesLength = new ArrayList<>();
		namesLength = names
		.stream()
		.map(name->name.length())
		.collect(Collectors.toList());
		int i=0;
		for(String name:names)
		{
			nameWithLength.put(name, namesLength.get(i));
			i++;
		}
		System.out.println(nameWithLength);
	}

}
