package Inheritance;

class A{
	
	int a;
	int b;
	
	void sum()
	{
		System.out.println(a+b);
	}
}

class B extends A{
	
	int x;
	int y;
	
	void Multiple()
	{
		System.out.println(a*b);
	}
}

public class Single {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	B obj=new B();
	obj.a=10;
	obj.b=20;
	obj.sum();
	//obj.x=10;
	//obj.y=20;
	obj.Multiple();
	

	}

}
