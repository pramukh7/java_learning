package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	
	String firstName;
	String lastName;
	int age;
	String city;
	
	public Student(String firstName, String lastName, int age, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
	}
	
}
public class Demo2 {

	//And , or and negate joins
	public static void main(String[] args) {
	
	Predicate<Student> sp1 = student->(student.firstName == "Maharaj");
	Predicate<Student> sp2 = student->(student.city == "Akshardham");
	
	//And
	if(sp1.and(sp2).test(new Student("Maharaj","Swami",49, "Akshardham")))
		System.out.println("Swaminarayan Bhagwan ni Jai");
	
	
	//or
		if(sp1.or(sp2).test(new Student("Maharaj","Swami",49, "Akshardham1")))
			System.out.println("GunatitaNand Swami Maharaj ni Jai");
	
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Maharaj","Swami",49, "Akshardham"));
		students.add(new Student("Swami","Swami",49, "Akshardham1"));
		students.add(new Student("Mahant","Swami",49, "RobbinsVilley"));
		//negate
		Predicate<List<Student>> preps = p->(p.get(0).firstName == "Swami");
		
			System.out.println(preps.negate().test(students));
		
		}
}
