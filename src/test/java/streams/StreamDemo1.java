package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		lists.add(20);
		lists.add(7);
		lists.add(67);
		lists.add(44);
		lists.add(88);
		lists.add(39);
		lists.add(93);
		lists.add(13);
		lists.add(7);
		
		//without streams api to find even number
		/*
		 * List<Integer> evenNumber = new ArrayList<>(); for(Integer number:lists) {
		 * if(number%2==0) evenNumber.add(number); } System.out.println(evenNumber);
		 */
		
		
		//with Stream API filter() and collect() methods
		//System.out.println(lists.stream().filter(number -> number%2 == 0).collect(Collectors.toList()));
		
		//with Stream API filter() and foreach() methods
		//lists.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		//with Stream API filter(), map() and reduce() methods
		//System.out.println(lists.stream().filter(n->n%2==0).map(n->n.toString()).reduce("",String::concat));
		//with Stream API filter(), map() and collect() methods
		System.out.println(lists.stream().filter(n->n%2==0).map(n->n.toString()).collect(Collectors.toList()));

	}

}
