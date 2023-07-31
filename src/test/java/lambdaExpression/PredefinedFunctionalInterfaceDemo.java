package lambdaExpression;

import java.util.function.Predicate;

class Employee {
	private String name;
	private int salary;
	private int experience;
	
	public Employee(String name, int salary, int experience) {
		super();
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getExperience() {
		return experience;
	}
	
}

public class PredefinedFunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		//check the length of the string is > 4 or not
		/*
		 * Integer [] myArray = {1,4,7,9,10}; Predicate<String> pre = str ->
		 * (str.length() > 4);
		 * 
		 * System.out.println(pre.test("SwamiBapa"));
		 */
		
		//example : 2 Print array Elements whose size is > 5 from String array
		/* output
		 * Sanjay Vaishali Akshar
		 */
		/*
		 * String myArray [] = {"Sanjay", "Vaishali", "Aarna", "Akshar"};
		 * Predicate<String[]> pre = str -> { for(String name:str) { if(name.length() >
		 * 5) { System.out.println(name); } } return false; }; pre.test(myArray);
		 */
		
		//Return Employee Object name if Salary > 50K and Exp > 3
		Predicate<Employee> pre = emp -> {
			if(emp.getSalary() > 50000 && emp.getExperience() > 3)
			{
				System.out.println(emp.getName());
			}
			return false;
		};
		
		Employee emp = new Employee("Aarna", 55000, 4);
		Employee emp1 = new Employee("Askhar", 49000, 4);
		pre.test(emp);
		pre.test(emp1);
		
	}
}
