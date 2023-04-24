package Inheritance;

class C{
	
	int a;
	int b;
	
	void sum()
	{
		System.out.println(a+b);
	}
}

class D extends C{
	
	int x;
	int y;
	
	void Multiple()
	{
		System.out.println(a*b);
	}
}

class E extends D{
	
	void Divide() {
		
		System.out.println(x/y);
		System.out.println(a/b);
		
		
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E obj=new E();
		obj.a=200;
		obj.b=10;
		obj.x=100;
		obj.y=20;
		obj.sum();
		obj.Multiple();
		obj.Divide();
		
	}

}
