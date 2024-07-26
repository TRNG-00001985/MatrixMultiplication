package reva;

public class AccessModifiers {
public int pubvar=0;
private int privar=1;
protected int provar=92;
public void pubmethod() {
	System.out.print("public");
}
private void priMethod() {
	System.out.print("private");
}
protected void promethod() {
	System.out.print("protected");
}
}
class child extends AccessModifiers{
	public static void main(String args[]) {
		AccessModifiers a=new AccessModifiers();
		System.out.print(a.pubvar);
		System.out.print(a.provar);
	}
}

