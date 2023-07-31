
/*
 * Welcome To Java World.
 * Output : World Java To Welcome.
 */
public class ReverseWordsInString {

	public static void main(String[] args) {
		String myString = "Welcome To Java World";
		System.out.println(reverseWords(myString));
	}
	
	private static String reverseWords(String myString)
	{
		String [] newStringArray = myString.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=newStringArray.length;i>0;i--)
		{
			sb.append(newStringArray[i-1]+" ");
		}
		return sb.toString();
	}

}
