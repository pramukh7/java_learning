import static org.hamcrest.CoreMatchers.is;

public class Compare2StringWithoutAnyBuiltInMethod {

	public static void main(String[] args) {
		String str1="Swaminarayan";
		String str2="Swaminarayan";
		System.out.println("Two String are Equal ==>"
		+CompareTwoString(str1, str2));

	}
	
	private static boolean CompareTwoString(String str1, String str2)
	{
		boolean isCompare=true;
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				isCompare = false;
				break;
			}
		}
		return isCompare;
	}
}
