package org.tnsif.sf.c2tc.oops_concepts;

	class Course //parent
	{
		String coursename="Java Programming";
		
		void showCourse()
		{
			System.out.println("Course :"+coursename);
		}
	}
	class Student extends Course //child
	{
		String name="Sumanth";
		
		void showStudent()
		{
			System.out.println("Student:" + name);
		}
	}

	public class SingleInheritence {


		public static void main(String[] args) {
			Student s=new Student();
		
			s.showStudent();
			s.showCourse();

		}

	}
