package oops;

public class MethodOverloading {
	
	int a;
	int b;
	
	void sum() //First Method
	{
		
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int x, int y)  //Second Method
	{
		
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z)  //Third Method
	{
		
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y)   //Fourth Method
	{
		
		System.out.println(x+y);
	}


	

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(20, 30);
		obj.sum(10, 20, 30);
		obj.sum(10, 20.33);
		
	}

}
