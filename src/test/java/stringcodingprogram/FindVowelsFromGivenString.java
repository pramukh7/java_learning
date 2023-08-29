package stringcodingprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindVowelsFromGivenString {

	public static void main(String[] args) {
		String myString = "Aarna";
		getVowelsFromGivenString(myString);

	}
	
	private static void getVowelsFromGivenString(String myString)
	{
		List<Character> vowels = new ArrayList<Character>();
		for(int i=0;i<myString.length();i++)
		{
			switch(myString.toLowerCase().charAt(i))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowels.add(myString.charAt(i));
				break;
			}
		}
		
		System.out.println(vowels);

}
}