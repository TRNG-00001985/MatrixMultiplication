package reva;
class A{
	public void m1() {
		System.out.println("This Is First Method");
	}
}
class B extends A{
	public void m1() {
		System.out.println("This Is Second Method");
	}
}

class Methodoverriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.m1();
		B b=new B();
		b.m1();

	}

}
