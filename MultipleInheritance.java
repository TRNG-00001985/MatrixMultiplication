package Revature;
interface a{
	public void m1();
	
}
interface b{
	public void m2();
}
interface c extends a,b{
	public void m3();
}
class d implements c{
	public void m1() {
		System.out.println("Hii im method1");
	}
	public void m2() {
		System.out.println("Hii im method2");
	}
	public void m3() {
		System.out.println("Hii im method3");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d s=new d();
		s.m1();
		s.m2();
		s.m3();

	}

}
