package stringcodingprogram;

import java.util.Arrays;

/*
 * An anagram of a string is another string that contains the same characters, 
 * only the order of characters can be different. 
 * For example, “abcd” and “dabc” are an anagram of each other. 
 * Examples: Input: str1 = “listen” str2 = “silent”
 */
public class CheckGivenStringIsAnagram {

	public static void main(String[] args) {
		String str1 = "Silent";
		String str2 = "Listen";
		isAnagram(str1, str2);
		
		str1 = "Silent";
		str2 = "Lesten";
		isAnagram(str1, str2);

	}
	
	private static void isAnagram(String str1, String str2)
	{
		boolean isAnagram = true;
		String firstString = sortString(str1.toLowerCase());
		String secondString = sortString(str2.toLowerCase());
		if(!firstString.equals(secondString))
		{
			isAnagram = false;
		}
		if(isAnagram)
		{
			System.out.println("Given String is Anagram");
		}
		else
		{
			System.out.println("Given String is not Anagram");
		}
		
	}
	
	private static String sortString(String str)
	{
		char [] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return Arrays.toString(charArray);
	}

}
