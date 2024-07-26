package reva;
abstract class MainClass{
	abstract public void m1();
	abstract public void m2();
	
}
abstract class MiniClass extends MainClass{
	abstract public void m1();
	abstract public void m3();
	// this is code
}
class MiniMiniClass extends MiniClass{
	public void m1() {
		System.out.println("Hii im first method");
	}
	public void m2() {
		System.out.println("Hii im second method");
	}
	public void m3() {
		System.out.println("Hii im third method");
	}
	public void m4() {
		System.out.println("Hii im fourth method");
	}
}
public class AbstractExampple2 {
	public static void main(String args[]) {
		MiniMiniClass s=new MiniMiniClass();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		
	}

}
