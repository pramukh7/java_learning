import java.util.HashMap;
import java.util.Map;

/*
 * Example : "Jai Swaminarayan" is a String
 * Words : 1) Jai 2) Swaminarayan so total 2 Words
 * Characters : Jai words has 3 characters
 * and Swaminarayan words has 12 characterds
 */
public class CountWordsInStringAndCountCharactersInWords {

	public static void main(String[] args) {
		String myString = "Jai Swaminarayan";
		System.out.println(countWordsAndCountCharacters(myString));
	}
	
	private static Map<String, Integer> countWordsAndCountCharacters(String myString)
	{
		Map<String, Integer> wordsAndCharCount = 
				new HashMap<String, Integer>();
		String [] newStringArray = myString.split(" ");
		System.out.println("Total Words is String are==> "
		+ newStringArray.length);
		int wordCount=0;
		for(String word:newStringArray)
		{
			char [] newCharArray = word.toCharArray();
			int count=0;
			for(char chr:newCharArray)
			{
				count++;
			}
			wordCount++;
			wordsAndCharCount.put(word, count);
		}
		
		return wordsAndCharCount;
	}

}
