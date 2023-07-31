package lambdaExpression;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		Integer [] myArray = {1,2,4,5,7,8,9};
		
		Predicate<Integer> predicate = p->(p>5);
		
		System.out.println(predicate.test(23));
		System.out.println(predicate.test(3));

	}

}
