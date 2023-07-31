
public class SwapTwoNumber {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		//approach 1
		/*
		 * int c=a; a = b; b = c;
		 */
		//System.out.println(a + " " + b);
		
		//second approach
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}
	
	
}
