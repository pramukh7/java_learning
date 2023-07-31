
public class PalindromString {

	public static void main(String[] args) {
		String myString = "radar";
		System.out.println(
				"Given String ("+ myString +") is palindrom==>" 
		+checkStringParindromOrNot(myString));
	}
	
	private static boolean checkStringParindromOrNot(String str)
	{
		char[] charArray = str.toCharArray();
		boolean isPalindrom=false;
		String reverseString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseString = reverseString + charArray[i];
		}
		if(reverseString.equals(str))
		{
			isPalindrom = true;
		}
		return isPalindrom;
	}

}
