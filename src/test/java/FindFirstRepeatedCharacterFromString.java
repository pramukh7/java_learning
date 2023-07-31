import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedCharacterFromString {

	public static void main(String[] args) {
		String myString = "Vaishuu";
		System.out.println(findFirstRepeatedCharacter(myString));
	}
	
	private static String findFirstRepeatedCharacter(String myString)
	{
		Set<Character> set = new HashSet<>();
		for(int i=0;i<myString.length();i++)
		{
			if(set.contains(myString.charAt(i))) {
				return myString.charAt(i) + "";
			} else {
				set.add(myString.charAt(i));
			}
		}
		return "No Repeated Character";
	}
}
