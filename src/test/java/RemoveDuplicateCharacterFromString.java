import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		String myString = "Sanjay";
		System.out.println(removeDuplicateCharacter(myString));

	}
	
	private static String removeDuplicateCharacter(String myString)
	{
		char [] newCharArray = myString.toCharArray();
		StringBuilder stb = new StringBuilder();
		Set<Character> newSet = new HashSet<Character>(); 
		for(char c:newCharArray)
		{
			if(!newSet.contains(c))
			{
				newSet.add(c);
				stb.append(c);
			}
		}
		return stb.toString();
	}

}
