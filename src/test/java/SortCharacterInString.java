import java.util.Arrays;

/*
 * Sort character in to string means any string you provide, it will
 * sort by character like java it should sort like aajv.
 */

public class SortCharacterInString {
	
	public static void main(String[] args) {
		String myString = "java";
		SortCharacterInToString(myString);
	}
	
	private static void SortCharacterInToString(String myString) {
		char newCharArray[] = myString.toCharArray();
		Arrays.sort(newCharArray);
		String newString= new String(newCharArray);
		
		System.out.println(newString);
	}

}
