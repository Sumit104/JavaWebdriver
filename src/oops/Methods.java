package oops;

public class Methods {
	
	int a;
	int b;
	int c;
	int d;
	
	
	void Simple()
	{
		System.out.println(a+b);
	}
	
	void Parameter(int x, int y)
	{
		c=x;
		d=y;
		System.out.println(c+d);
	}
	
	int Return()
	{
		return(a+b);
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
	Methods a=new Methods();
	a.a=100;
	a.b=200;
	a.Simple();
	a.Parameter(300, 400);
	int r=a.Return();
	System.out.println(r);
	

}
}