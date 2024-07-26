package reva;
class A{
	int m=90;
	public void m1() {
		System.out.print("Hii Im Parent Class");
	}
}
class B extends A{
	int m=98;
	public void m2() {
		System.out.print("Hii Im Child Class");
	}
}
class Main{
	public static void main(String args[]) {
		A s=new A();
		B s2=new B();
		System.out.println(s.m);
		s.m1();
		System.out.println(s2.m);
		s2.m2();
	}
}
