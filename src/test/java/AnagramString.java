import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String myString1 = "radar";
		String myString2 = "ardar";
		System.out.println(
				"Given String is Anagram==>" 
		+checkStringAnagramOrNot(myString1, myString2));
	}
	
	private static boolean checkStringAnagramOrNot(String firstString, String secondString)
	{
		String firstShortedString = shortedString(firstString);
		String secondShortedString = shortedString(secondString);
		if(!firstShortedString.equals(secondShortedString))
		{
			return false;
		}
		return true;
		
	}
	
	private static String shortedString(String str)
	{
		char [] newArray = str.toCharArray();
		Arrays.sort(newArray);
		return Arrays.toString(newArray);
	}

}
