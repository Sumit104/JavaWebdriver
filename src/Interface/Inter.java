package Interface;

interface Interstate{
	
	int a=5;
	void display();
}

public class Inter implements Interstate {
	
	public void display() {
		
		System.out.println("New " +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inter obj=new Inter();
obj.display();
	}

}
