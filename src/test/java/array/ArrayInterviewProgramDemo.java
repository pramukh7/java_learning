package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayInterviewProgramDemo {

	public static void main(String[] args) {
		String [] colors = {"Red", "Blue", "Orange"};
		convertArrayToList(colors);

	}
	
	private static void convertArrayToList(String [] myArray)
	{
		//Three different ways to convert array to list
		//1
		//List list = Arrays.asList(myArray);
		//System.out.println(list);
		
		//2
		//List list = new ArrayList<>();
		//Collections.addAll(list, myArray);
		//System.out.println(list);
		
		//3
		List<String> list = new ArrayList<>();
		for(String color:myArray)
		{
			list.add(color);
		}
		System.out.println(list);
		
	}

}
