package singleInheritance;


//class A{
//	int age;
//}
//class B extends A{
//	public B(int i) {
//	 //System.out.println(i);
//	}
//	public B() {
//		// TODO Auto-generated constructor stub
//	}
//	String name;
//}
//public class Solution {
//
//	public static void main(String[] args) {
//		B b =new B();
//		B b1 = new B(10);
//		System.out.println(b.name);
//		System.out.println(b.age);
//
//	}
//

 class A{
	 void print() {
		 System.out.println("A");
	 }
 }
 class B extends A{
	 void print() {
		 System.out.println("B");
	 }
 }
 class C extends B{
	 void print() {
		 System.out.println("C");
	 }
 }
 public class Solution {
	 
	 	public static void main(String[] args) {
	 		A b =new B();
	 		b.print();
	 		B c =new C();
	 		c.print();
	 		//C a =new A();
	 		//a.print();
	 		//b.print2();
	 		
//	 		B c =new ();
//	 		c.print2();
	 		
	 		//System.out.println(b.print);
	 		//System.out.println(b.age);
	 
	 	}
	 
	 }