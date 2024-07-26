package Revature;
interface I1{
	public void m1();
	public void m2();
	public void m3();
}
class Class implements I1{
	public void m1() {
		System.out.println("Building related data members into single unit is called Encapsulation");
	}
	public void m2() {
		System.out.println("One entity into many forms is called Polymorphism");
	}
	public void m3() {
		System.out.println("Inheriting its members from superclass to subclass is called Inheritance.");
	}
}
class Class1 implements I1{
	public void m1() {
		System.out.println("The process hiding unessential things to user and providing essential things to user is called Abstraction.");
	}
	public void m2() {
		System.out.println("The process converting technical error messages into user friendly error messages is called Exception Handling.");
	}
	public void m3() {
		System.out.println("We can Achieve Multilevel inheritance by using Interfaces.");
	}
}
public class UpcastingExample2 {
	public static void main(String args[]) {
		I1 s=new Class();
		s.m1();
		s.m2();
		s.m3();
		I1 s1=new Class1();
		s1.m1();
		s1.m2();
		s1.m3();
		
	}

}
