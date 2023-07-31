/*
 * "Jai Swaminarayan"
 * Vowels : 7
 */
public class HowManyVowelsInAString {

	public static void main(String[] args) {
		String myString = "Jai Swaminarayan";
		countVowelsInAString(myString);
	}
	
	private static void countVowelsInAString(String myString)
	{
		char [] newCharArray = myString.toLowerCase().toCharArray();
		int count  = 0;
		for(char c:newCharArray)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		System.out.println(
				"Total number of Vowels in the String are ==> "+count);
	}

}
