package accessmodifier;

class privateclass
{
	private int i=10;
	private void display()
	{
		System.out.println("Access within class");
	}
	
}

public class Accessmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
privateclass a=new privateclass();
a.i=20;    //showing error as modifier is private
a.display();  //showing error
	}

}
