package reva;
interface States{
	public void Telangana();
	public void Andhrapradesh();
	public void Kerala();
}
class A implements States{
	public void Telangana() {
		System.out.println("Famous for Rice Production");
	}
	public void Andhrapradesh() {
		System.out.println("Famous for Rice Fruits");
	}
	public void Kerala() {
		System.out.println("Famous for Rice Spices");
	}
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.Telangana();
		a.Andhrapradesh();
		a.Kerala();

	}

}
