package org.tnsif.sf.c2tc.interfacedemo;

public class MarkerInterface {
    public static void main(String[] args) {
        Registerable s = new Student(102,"neha",12000.3,"java");
        Registerable s1 = new Student(103,"ramu",13000,"java");

        if(s instanceof Registerable) {
            System.out.println("Student is registered for this course");
        } else {
            System.out.println("Student is not registered for this course");
        }
    }
}
