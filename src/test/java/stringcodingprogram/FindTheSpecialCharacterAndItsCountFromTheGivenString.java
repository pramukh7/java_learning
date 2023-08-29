package stringcodingprogram;

import java.util.ArrayList;
import java.util.List;

public class FindTheSpecialCharacterAndItsCountFromTheGivenString {

	public static void main(String[] args) {

		String myString = "Jai Swaminarayan!* SwamiBapa () ";
		
		FindTheSpecialCharacterAndItsCount(myString);
	}
	private static void FindTheSpecialCharacterAndItsCount(String myString)
	{
	
		List<Character> specialCharacters = new ArrayList<Character>();
		String newStringAfterRemoveSpecialCharacters="";
		
		for(int i=0;i<myString.length();i++)
		{
			if(Character.isAlphabetic(myString.charAt(i)) 
					|| Character.isDigit(myString.charAt(i)) 
					|| Character.isWhitespace(myString.charAt(i))
				)
			{
				newStringAfterRemoveSpecialCharacters = newStringAfterRemoveSpecialCharacters + myString.charAt(i);
				
			}
			else 
			{
				specialCharacters.add(myString.charAt(i));
			}
					
		}
		
		System.out.println("String without Special Characters =>" + newStringAfterRemoveSpecialCharacters);
		System.out.println("===============================");
		System.out.println("Special Characters" + specialCharacters);
		System.out.println("Total Special Characters are=>"+ specialCharacters.size());
	}

}
