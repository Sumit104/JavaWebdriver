package Inheritance;

class Bank{
	
	int ROI()
	{
		return 0;
	}
}

class SBI extends Bank {
	
	int ROI()
	{
		return 5;
	}
}

class HDFC extends Bank{
	
	int ROI()
	{
		return 6;
	}
}

public class Overridehierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI s=new SBI();
System.out.println(s.ROI());

HDFC h=new HDFC();
System.out.println(h.ROI());
	}

}
