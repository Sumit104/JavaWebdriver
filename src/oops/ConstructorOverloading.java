package oops;

public class ConstructorOverloading {
	
	int a;
	int b;
	double c=0.0;
	
	ConstructorOverloading() //First constructor
	{
		
		a=10;
		b=20;
		c=30.34;
	}
	
	ConstructorOverloading(int x, int y)  //Second constructor
	{
		
		a=x;
		b=y;
		
	}
	
	ConstructorOverloading(int x, int y, double z)  //Third constructor
	{
		a=x;
		b=y;
		c=z;
		
	}
	
	void display()   //Fourth Method
	{
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorOverloading a1=new ConstructorOverloading();
		//ConstructorOverloading a2=new ConstructorOverloading(30, 40);
		ConstructorOverloading a3=new ConstructorOverloading(50, 60, 66.88);
		a3.display();
	}

}
