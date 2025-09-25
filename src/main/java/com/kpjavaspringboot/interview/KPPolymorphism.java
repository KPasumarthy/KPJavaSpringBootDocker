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

			GrandChild grandChild = new GrandChild();
			System.out.println("Class : child.className : " +  grandChild.className) ;
			System.out.print("Super Class Name : " );
			grandChild.print();
			System.out.print("Class Name : grandChild.printSuperClassName(); : " );
			grandChild.printSuperClassName();
			System.out.print("Class Name : grandChild.printDerivedClassName(); : " );
			grandChild.printDerivedClassName();

			GreatGrandChild greatGrandChild = new GreatGrandChild();
			System.out.println("Class : child.className : " +  greatGrandChild.className) ;
			System.out.print("Super Class Name : " );
			greatGrandChild.print();
			System.out.print("Class Name : greatGrandChild.printSuperClassName(); : " );
			greatGrandChild.printSuperClassName();
			System.out.print("Class Name : greatGrandChild.printDerivedClassName(); : " );
			greatGrandChild.printDerivedClassName();
			System.out.print("Class Name : GreatGreatGrandChild	java: cannot inherit from final com.kpjavaspringboot.interview.KPPolymorphism.GreatGrandChild ");

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

	static class GrandChild extends Child {
		public String className = "GrandChild";

		void printSuperClassName() {
			System.out.println("Class from parent : "+ super.className);
		}

		void printDerivedClassName() {
			System.out.println("Class from parent : "+ className);
		}
	}

	static final class GreatGrandChild extends GrandChild {
		public String className = "GreatGrandChild";

		void printSuperClassName() {
			System.out.println("Class from parent : "+ super.className);
		}

		void printDerivedClassName() {
			System.out.println("Class from parent : "+ className);
		}
	}

	//	///KP : java: cannot inherit from final com.kpjavaspringboot.interview.KPPolymorphism.GreatGrandChild
	//	static  class GreatGreatGrandChild extends GreatGrandChild {
	//		public String className = "GreatGrandChild";
	//
	//		void printSuperClassName() {
	//			System.out.println("Class from parent : "+ super.className);
	//		}
	//
	//		void printDerivedClassName() {
	//			System.out.println("Class from parent : "+ className);
	//		}
	//	}

}
