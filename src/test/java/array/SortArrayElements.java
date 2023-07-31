package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayElements {

	public static void main(String[] args) {
	String [] colors = {"red","green","blue","orange"};
	
	sortArrayElements(colors);

	}
	
	private static void sortArrayElements(String [] colors)
	{
		List<String> list = new ArrayList<>(Arrays.asList(colors));
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	

}
