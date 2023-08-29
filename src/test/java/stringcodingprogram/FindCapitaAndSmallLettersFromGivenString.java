package stringcodingprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCapitaAndSmallLettersFromGivenString {

	public static void main(String[] args) {

		String myString = "*Aarna is Cool!";
		System.out.println(findCapitalAndSmallLetters(myString));

	}
	
	private static Map<String, List<Character>> findCapitalAndSmallLetters(String myString)
	{
		Map<String, List<Character>> map = new HashMap<>();
		List<Character> upper = new ArrayList<>();
		List<Character> lower = new ArrayList<>();
		List<Character> special = new ArrayList<>();
		
		for(int i=0;i<myString.length();i++)
		{
			if(Character.isUpperCase(myString.charAt(i)))
			{
				upper.add(myString.charAt(i)); 
			}
			else if(Character.isLowerCase(myString.charAt(i)))
			{
				lower.add(myString.charAt(i));
			}
			else
			{
				special.add(myString.charAt(i));
			}
		}
		map.put("Upper", upper);
		map.put("Lower", lower);
		map.put("Special", special);
		return map;
	}
	
	

}
