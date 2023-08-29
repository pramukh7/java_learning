package stringcodingprogram;

public class PrintWordThatHaveEvenLength {

	public static void main(String[] args) {

		String myString = "Jai Swaminarayan";
		
		System.out.println(printWordThatHaveEvenLength(myString));
		myString = "Jai Swaminarayan!";
		
		System.out.println(printWordThatHaveEvenLength(myString));
	}
	private static String printWordThatHaveEvenLength(String str)
	{
		String [] strArray = str.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			if(strArray[i].length() %2 == 0)
			{
				return strArray[i];
			}
		}
		return "No Word that have Even Length";
	}

}
