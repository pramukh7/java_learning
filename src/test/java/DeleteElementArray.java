import java.util.Arrays;

public class DeleteElementArray {

	public static void main(String[] args) {
		int [] numArray = {21,3,26,5,4,13};
		System.out.println(Arrays.toString(deleteArrayElement(numArray, 26)));
		

	}
	
	private static int[] deleteArrayElement(int[] numArray, int element)
	{
		int [] newArray = new int [numArray.length-1];
		int j=0;
		for(int i=0;i<numArray.length;i++)
		{
			
			if(numArray[i] != element)
			{
				newArray[j] = numArray[i];
				j++;
			}
		}
		return newArray;
	}

}
