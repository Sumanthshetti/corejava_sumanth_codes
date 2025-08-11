package org.tnsif.sf.c2tc.oops_concepts;

class Human
{
	private int age;
	private String name; // select goto source & click getter and setter
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.setAge (26);
		obj.setName ( "Neha");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge (27);
		obj.setName ("Rama");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	}

}
