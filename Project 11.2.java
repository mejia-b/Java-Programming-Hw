public class PersonDriver {

	public static void main(String[] args) {
		Person person1 = new Person();
		Student student1 = new Student();
		Employee employee1 = new Employee();
		Faculty faculty1 = new Faculty();
		Staff staff1 = new Staff();
		
		System.out.println(person1.toString());
		System.out.println(student1.toString());
		System.out.println(employee1.toString());
		System.out.println(faculty1.toString());
		System.out.println(staff1.toString());
		
	}//end of main 

}//end of PersonDriver class

___________________________________________________________________________________________________________

public class Person {
	private String name = "Brenda";
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	public Person(){
		super();
	}//default constructor

	public Person(String name) {
		super();
		this.name = name;
	}//end of constructor

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}//end of toString
}//end of Person class

___________________________________________________________________________________________________________

public class Student extends Person {
	private final int FRESHMAN = 1;
	private final int SOPHMORE = 2;
	private final int JUNIIOR = 3; 
	private final int SENIOR = 4;
	
	public Student(){
		super();
	}//default consructor
	
	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + "]";
	}//end of toString
}//end of Student extends Person class

___________________________________________________________________________________________________________

public class Employee extends Person {
	private int office;
	private double salary;
	private MyDate dateHired = new MyDate();
	
	public Employee(){
		super();
	}//default constructor
	
	@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + "]";
	}//end of toString
}//end of Employee extends Person class

___________________________________________________________________________________________________________

import java.util.*;
public class MyDate {
	private int month;
	private int day; 
	private int year;
	
	public MyDate(){
		GregorianCalendar date = new GregorianCalendar();
		month = date.get(Calendar.MONTH);
		day = date.get(Calendar.DAY_OF_MONTH);
		year = date.get(Calendar.YEAR);
	}//default constructor

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}//end of MyDate class

___________________________________________________________________________________________________________

public class Faculty extends Employee {
	private int officeHours;;
	private String rank;
	
	public Faculty(){
		super();
	}//default constructor

	@Override
	public String toString() {
		return "Faculty [toString()=" + super.toString() + "]";
	}
}//end of Faculty extends Employee

___________________________________________________________________________________________________________

public class Staff extends Employee {
	private String title;
	
	public Staff(){
		super();
	}//default constructor

	@Override
	public String toString() {
		return "Staff [toString()=" + super.toString() + "]";
	}
}//end of Staff extends Employee

//////////////////////////////  OUTPUT //////////////////////////

Person [name=Brenda]
Student [toString()=Person [name=Brenda]]
Employee [toString()=Person [name=Brenda]]
Faculty [toString()=Employee [toString()=Person [name=Brenda]]]
Staff [toString()=Employee [toString()=Person [name=Brenda]]]


