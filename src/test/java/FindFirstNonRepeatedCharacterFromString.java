import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class FindFirstNonRepeatedCharacterFromString {
	
	public static void main(String[] args) {
		String myString = "SSGGBBSSYYPPMM";
		System.out.println(findNonRepeatedCharacter(myString));
	}

	private static String findNonRepeatedCharacter(String myString)
	{
		char [] newCharArray = myString.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(Character c : newCharArray)
		{
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) +1);
			}
		}
		
		for(Entry<Character, Integer> e: map.entrySet())
		{
			if(e.getValue().equals(1))
			{
				return "Non Repeated  Character is [ "+ e.getKey() +" ] and count is [ " + e.getValue() +" ]";
			}
		}
		return "Non Repeated Character Not Exist in the String";
	}
}
