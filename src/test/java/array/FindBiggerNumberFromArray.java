package array;
import java.util.Arrays;

public class FindBiggerNumberFromArray {

	public static void main(String[] args) {
		int [] numArray = {21,3,26,5,4,13};
		System.out.println(getBigestNumber(numArray));
		

	}
	
	private static Integer getBigestNumber(int[] numArray)
	{
		Arrays.sort(numArray);
		return numArray[numArray.length-1];
		
	}

}
