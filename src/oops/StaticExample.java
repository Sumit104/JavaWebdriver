package oops;

public class StaticExample {

	int a;
	static int b;
	
	void m1() {
		
		System.out.println("No Static");
	}
	
static void m2() {
	b=100;
		
		System.out.println("Static");
		System.out.println(b);
	}

void m3() {
	
	a=100;
	b=200;
	
	System.out.println("No Static");
	System.out.println("Sum:" +(a+b));
}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Static variables and method can be accessed without making object.
		b=200;
		m2();
		StaticExample se =new StaticExample();
		se.m3();
		System.out.println(b);
		

	}

}
