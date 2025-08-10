package org.tnsif.sf.c2tc.basicjava;

public class Variable {
			int a= 10;//instance var
			void print()
			{
				String msg= "hello";//local var
				System.out.println(msg);
			}
			
			static String message = "hello students"; //static var
			
			public static void main(String[] args) {
				Variable obj = new Variable();
				System.out.println("the value of a" +obj.a);
				obj.print();
				System.out.println(message);
				

			}

		


	}


