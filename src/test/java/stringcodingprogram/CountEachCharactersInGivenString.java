package stringcodingprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountEachCharactersInGivenString {

	public static void main(String[] args) {
		String myString = "Jai Swaminarayan Sanjay";
		
		CountEachCharactersInGivenString(myString);

	}
	private static void CountEachCharactersInGivenString(String myString) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<myString.length();i++)
		{
			if(map.containsKey(myString.toUpperCase().charAt(i)))
			{
			map.put(myString.toUpperCase().charAt(i), map.get(myString.toUpperCase().charAt(i))+1);
			}
			else {
			map.put(myString.toUpperCase().charAt(i), 1);
			}
		}
		System.out.println(map);
	}

}
