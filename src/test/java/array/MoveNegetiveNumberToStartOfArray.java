package array;

import java.util.Arrays;

public class MoveNegetiveNumberToStartOfArray {

	public static void main(String[] args) {
		Integer [] myArray = {3,6,-8,20,-11,13};
		
		//moveNegativeNumberFirst(myArray);
		moveNegativeNumberFirst1(myArray);
	}
	
	//1st way
	private static void moveNegativeNumberFirst(Integer [] myArray) {
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
	}
	
	//2nd way
		private static void moveNegativeNumberFirst1(Integer [] myArray) {
			//{3,6,-8,20,-11,13}
			Integer[] newArray = new Integer[myArray.length];
			int j=0;
			for(int i=0;i<myArray.length;i++)
			{
				if(myArray[i] < 0)
				{
					newArray[j] = myArray[i];
					j++;
				} 	
				
			}
			
			for(int i=0;i<myArray.length;i++)
			{
				if(myArray[i] > 0)
				{
					newArray[j] = myArray[i];
					j++;
				} 	
				
			}
			System.out.println(Arrays.toString(newArray));
		}

}
