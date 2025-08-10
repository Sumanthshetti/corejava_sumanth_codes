package variable;

import corejavasvit.tnsif.Variable;

public class Variabledemo {
	int a= 10;//instance var
	void print()
	{
		String msg= "hello";//local var
		System.out.println(msg);
	}
	
	static String message = "hello students"; //static var
	
	public static void main(String[] args) {
		Variabledemo obj = new Variabledemo();
		System.out.println("the value of a" +obj.a);
		obj.print();
		System.out.println(message);
		

	}

}
