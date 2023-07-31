
public class ReverseStringUsingRecursiveMethod {

	public static void main(String[] args) {
		String myString="Sanjay";
		System.out.println(recursive(myString));
	}
	
	private static String recursive(String myString)
	{
		if(myString.length() <= 1 || myString == null)
		{
			return myString;
		}
		
		return recursive(myString.substring(1))+myString.charAt(0);
	}

}
