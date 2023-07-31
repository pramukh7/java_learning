
public class FindLengthOfEvenWord {
	
	public static void main(String[] args) {
		String myString = "Jai Swaminarayan";
		findEvenWordLength(myString);
		
	}
	
	private static void findEvenWordLength(String myString)
	{
		String [] newStringArray = myString.split(" ");
		for(String str:newStringArray)
		{
			if(FindEvenNumber(str.length()) != 0)
			{
			System.out.println("Even Word is [ " + str +" ] and Count is [ " +FindEvenNumber(str.length())+" ]");
			}
		}
	}
	
	private static int FindEvenNumber(int num)
	{
		if (num%2 == 0)
		{
			return num;
		}
		return 0;
	}

}
