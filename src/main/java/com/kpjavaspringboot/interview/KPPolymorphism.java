package com.kpjavaspringboot.interview;

public class KPPolymorphism {

	public static void main(String args[]) {

			Parent parent = new Child();
			System.out.println("Class : parent.className : "+ parent.className);
			System.out.print("Super Class Name : " );
			parent.print();


			Child child = new Child();
			System.out.println("Class : child.className : " + child.className) ;
			System.out.print("Super Class Name : " );
			child.print();
			System.out.print("Class Name : child.printSuperClassName(); : " );
			child.printSuperClassName();
			System.out.print("Class Name : child.printDerivedClassName(); : " );
			child.printDerivedClassName();

		}

	static class Parent {
		public String className = "Parent";

		void print() {
			System.out.println("Class from Child Derived from Parent : "+ className);
		}


	}
	static class Child extends Parent {
		public String className = "Child";

		void printSuperClassName() {
			System.out.println("Class from parent : "+ super.className);
		}

		void printDerivedClassName() {
			System.out.println("Class from parent : "+ className);
		}
	}



}
