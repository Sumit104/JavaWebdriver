package oops;

public class EmployeeObj {
	
	int id;
	String ename;
	int age;
	
	void display()
	{
		System.out.println(id);
		System.out.println(ename);
		System.out.println(age);
	}
	
public static void main(String args[])
{
	//Assigning values to variables using Object creation
	EmployeeObj emp1=new EmployeeObj();
	emp1.id=101;
	emp1.ename="Ram";
	emp1.age=25;
	emp1.display();
	
	System.out.println(" ");
	
	EmployeeObj emp2=new EmployeeObj();
	emp2.id=102;
	emp2.ename="Ramesh";
	emp2.age=25;
	emp2.display();

	
}

}
