package stringcodingprogram;

import java.util.HashSet;
import java.util.Set;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String myString = "Jai Swaminarayan";
		System.out.println(firstRepeatedCharacter(myString));
		
	}
	
	
	private static char firstRepeatedCharacter(String str)
	{
		char firstRepeatedCharacter = ' ';
		Set<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(set.contains(str.charAt(i)))
			{
				firstRepeatedCharacter = str.charAt(i);
				break;
			}
			else
			{
				set.add(str.charAt(i));
			}
		}
		return firstRepeatedCharacter;
	}


}
