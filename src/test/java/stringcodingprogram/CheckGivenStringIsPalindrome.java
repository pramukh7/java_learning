package stringcodingprogram;
/*
 * A string is called a palindrome string if the 
 * reverse of that string is the same as the 
 * original string. For example, radar , level
 */
public class CheckGivenStringIsPalindrome {

	public static void main(String[] args) {
		String originalString = "radar";
		System.out.println("Give String is Palindrome==>"+isPalindrome(originalString));
		originalString = "OM";
		System.out.println("Give String is Palindrome==>"+isPalindrome(originalString));
	}
	
	private static boolean isPalindrome(String originalString)
	{
		boolean isPalindrome=false;
		String reverseString = "";
		for(int i=originalString.length()-1;i>=0;i--)
		{
			reverseString = reverseString + originalString.charAt(i);
		}
		if(originalString.equals(reverseString))
		{
			isPalindrome = true;
		}
		return isPalindrome;
	}

}
