package stringcodingprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacterFromGivenString {

	public static void main(String[] args) {
		String myString = "AABBCCVVSSEFFGG";
		System.out.println(firstNonRepeatedCharacter(myString));
	}
		
	private static String firstNonRepeatedCharacter(String str)
	{
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else
			{
				map.put(str.charAt(i), 1);
			} 
		}
		
		for(Entry<Character, Integer> e: map.entrySet())
		{
			if(e.getValue().equals(1))
			{
				return "First Non Repeated Character is=>"+e.getKey();
			}
		}
		return "There is no Non Repeated Character";
	}
}
