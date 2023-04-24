package Interface;

class Final1{
	
	 final int a=20;
	 
	 final void m1() {
		 
		 //a=20;//Final field cannot be assigned
	 }
}

final class Final2 extends Final1{
	
/*void m1() {
	
}
}*/  //final method cannot be overridden
	
/*   class A extends Final2{
	
}   */ //Final class cannot be overridden.

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Example");
	}

}
}
