package oops;

public class variablemethod {
int empid;
String ename;
int eage;

void setdata(int id, String name, int age)
{
	empid=id;
	ename=name;
	eage=age;
}

void display()
{
	System.out.println(empid);
	System.out.println(ename);
	System.out.println(eage);
}

public static void main(String args[])
{
	//Assigning variables using method
	variablemethod emp=new variablemethod();
	emp.setdata(101, "Rakesh", 20);
	emp.display();
	
	System.out.println(" ");
	
	variablemethod emp1=new variablemethod();
	emp1.setdata(102, "Jitesh", 25);
	emp1.display();
}
}
