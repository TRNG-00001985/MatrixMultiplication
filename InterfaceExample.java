package reva;
interface Transaction{
	public void deposit(double Amount);
	public void WithDraw(double Amount1);
}
class ATM implements Transaction{
	public void deposit(double Amount) {
		System.out.println("Deposit Success: "+Amount);
	}
	public void WithDraw(double Amount1){
		System.out.println("WithDraw Success: "+Amount1);
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM A=new ATM();
		A.deposit(3000);
		A.WithDraw(1000);

	}

}
