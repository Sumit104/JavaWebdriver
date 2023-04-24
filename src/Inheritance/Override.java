package Inheritance;

class vehicle{
	
	void run() {
		
		System.out.println("Vehicle is running");
	}
}

class bike extends vehicle{
	
	void run() {
		
		System.out.println("Bike is running");
	}
}

class car extends bike{
	
	void run() {
		
		System.out.println("Car is running");
	}
}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car a=new car();
a.run();
	}

}
