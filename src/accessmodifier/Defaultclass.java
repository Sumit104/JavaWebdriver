package accessmodifier;

import pack1.C;

public class Defaultclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new A();
obj.a=20;
obj.display();


C cobj=new C();
cobj.s="Name";
cobj.Strings();
System.out.println(cobj.s.length());

	}

}
