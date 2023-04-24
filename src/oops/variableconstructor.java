package oops;

public class variableconstructor {
	
	int empid;
	String ename;
	int eage;
	
	variableconstructor(int id, String name, int age)
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
	//Assigning values to variables using constructor
	variableconstructor obj=new variableconstructor(101, "Sumit", 25);
	obj.display();
	
	variableconstructor obj1=new variableconstructor(102, "Amit", 30);
	obj1.display();
	
	
}
}
