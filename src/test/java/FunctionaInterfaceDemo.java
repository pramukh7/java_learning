interface FunctionalInterface {
	//public void printName();
	public String printNameWithParameter(String name);

}

/*
 * class FunctionaInterfaceDemo1 implements FunctionalInterface { public void
 * printName() { System.out.println("Jai Swaminarayan");
 * 
 * } }
 */


public class FunctionaInterfaceDemo
{
	public static void main(String [] args)
	{
		//FunctionalInterface fn = new FunctionaInterfaceDemo1();
		//fn.printName();
		FunctionalInterface fn = (name)-> "Jai Swaminarayan"+name;
		System.out.println(
				fn.printNameWithParameter
				(" Pramukh Swami ane Mahant Swami Maharaj"));
	}
	
}