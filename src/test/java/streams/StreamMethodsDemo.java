package streams;

import java.util.Arrays;
import java.util.List;

public class StreamMethodsDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,5,7,4,2,4,5);
		List<Integer> list1 = Arrays.asList(2,2,5,7,40,2,4,5);
		//distinct
		//printDistinct(list);
		
		//limit
		//printLimit(list);
		//printLimitWithDistinct(list1);
		
		//count
		//printCount(list1);
		
		//min max
		printMinMax(list1);
	}
	
	private static void printDistinct(List<Integer> list)
	{
		list.stream().distinct().forEach(num->System.out.println(num));
		
	}
	
	private static void printLimit(List<Integer> list)
	{
		list.stream().limit(2).forEach(num->System.out.println(num));
		//output is 1,2
	}
	
	private static void printLimitWithDistinct(List<Integer> list)
	{
		list.stream().distinct().limit(2).forEach(num->System.out.println(num));
		//output is 2,5
	}
	
	private static void printCount(List<Integer> list)
	{
		System.out.println(list.stream().distinct().count());
		//output is 2,5
	}
	
	private static void printMinMax(List<Integer> list)
	{
		System.out.println("Min Value=>"+
				list
				.stream()
				.min((val1, val2)->val1.compareTo(val2)).get());
		System.out.println("Max Value=>"+
				list
				.stream()
				.max((val1, val2)->val1.compareTo(val2)).get());
	}
	
	

}
