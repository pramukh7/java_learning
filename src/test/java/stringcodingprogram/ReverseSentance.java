package stringcodingprogram;

public class ReverseSentance {

	public static void main(String[] args) {
		String myString = "Java is Cool!";
		
		System.out.println(reverseSentence(myString));

	}
	
	private static String reverseSentence(String myString)
	{
		String [] splittedString = myString.split(" ");
		String newString = "";
		for(int i=splittedString.length-1;i>=0;i--)
		{
			newString = newString + " " +splittedString[i];
		}
		return newString;
	}

}
