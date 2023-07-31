package lambdaExpression;

import java.util.function.Function;

public class FunctionInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the length of each name
		  String myArray [] = {"Sanjay", "Vaishali", "Aarna", "Akshar"};
		  
		  Function<String, Integer> fi = f->(f.length());
		  for(String s:myArray)
		  {
			  System.out.println(fi.apply(s));
		  }
		 
	}

}
