package Revature;
class Employee{
	String name;
	int age;
	long Salary;
	Employee(String name,int age,long Salary){
		this.name=name;
		this.age=age;
		this.Salary=Salary;
	}
}
class Trainee extends Employee{
	int Id;
	long Stiphend;
	Trainee(String name,int age,long Salary,int Id,long Stiphend){
		super(name,age,Salary);
		this.Id=Id;
		this.Stiphend=Stiphend;
	}
	public void display() {
		System.out.println("The Employee Name is: "+name);
		System.out.println("The Employee Age is: "+age);
		System.out.println("The Employee Salary is: "+Salary);
		System.out.println("The Trainee Id is: "+Id);
		System.out.println("The Trainee Stiphend is: "+Stiphend);
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee s=new Trainee("Virat Kohli",30,90000,24322,10000);
		//UpCasting
		//SuperclassName varname=(SuperClassName)subclass ref var;
		Employee d=(Employee)s;
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.Salary);
		s.display();
		

	}

}
