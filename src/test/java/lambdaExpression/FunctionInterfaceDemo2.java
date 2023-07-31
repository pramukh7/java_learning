package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class NewStudent {
	private String firstName;
	private String lastName;
	private String city;
	private int salary;
	
	public NewStudent(String firstName, String lastName, String city, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}

	public int getSalary() {
		return salary;
	}
}

public class FunctionInterfaceDemo2 {
	
	public static void main(String[] args) {
		getStudents();
	}
	
	private static void getStudents()
	{
		List<NewStudent> students = new ArrayList<>();
		
		students.add(new NewStudent("Akshar", "Patel", "Etobicoke", 450000));
		students.add(new NewStudent("Aarna", "Patel", "Etobicoke", 500000));
		students.add(new NewStudent("Vaishali", "Patel", "Ahmedabad", 400000));
		students.add(new NewStudent("Sanjay", "Patel", "Sobhasan", 430000));
		
		Function<NewStudent, NewStudent> stds = st->{
			if(st.getFirstName().contains("A"))
			{
				return st;
			}
			return null;
		};
		
		for(NewStudent st:students)
		{
			NewStudent std = stds.apply(st);
			if(std!=null)
			{
			System.out.println(std.getFirstName());
		}
		}
	}
}
