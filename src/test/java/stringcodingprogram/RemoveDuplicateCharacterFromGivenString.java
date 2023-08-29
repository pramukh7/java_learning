package stringcodingprogram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromGivenString {

	public static void main(String[] args) {
		String myString = "java";
		System.out.println(removeDuplicateCharacter(myString));
		myString = "Aarna";
		System.out.println(removeDuplicateCharacter(myString));
	}
	
	private static String removeDuplicateCharacter(String myString)
	{
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<myString.length();i++)
		{
			if(!set.contains(myString.toLowerCase().charAt(i)))
			{
				set.add(myString.charAt(i));
				sb.append(myString.charAt(i));
			}
		}
		
		return sb.toString();
	}

}
