package reva;

public class ConstructorOverloading {
	String EmployeeName;
	String Id;
	String CompanyName;
	long Salary;
	String Role;
	String BloodGroup;
	String City;
	ConstructorOverloading(){
		
	}
	ConstructorOverloading(String EmployeeName,String Id){
		this.EmployeeName=EmployeeName;
		this.Id=Id;
		
	}
	ConstructorOverloading(String EmployeeName,String Id,String CompanyName){
		this.EmployeeName=EmployeeName;
		this.Id=Id;
		this.CompanyName=CompanyName;
		
	}
	ConstructorOverloading(String EmployeeName,String Id,String CompanyName,long Salary,String Role,String BloodGroup,String City){
		this.EmployeeName=EmployeeName;
		this.Id=Id;
		this.CompanyName=CompanyName;
		this.Salary=Salary;
		this.Role=Role;
		this.BloodGroup=BloodGroup;
		this.City=City;
	}
	public void display() {
		System.out.println(EmployeeName);
		System.out.println(Id);
		System.out.println(CompanyName);
		System.out.println(Salary);
		System.out.println(Role);
		System.out.println(BloodGroup);
		System.out.println(City);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading s1=new ConstructorOverloading("Archana","TM926352");
		s1.display();
		ConstructorOverloading s2=new ConstructorOverloading("Vamshi","SA7352","Sigma Advanced System");
		s2.display();
		ConstructorOverloading s3=new ConstructorOverloading("Suresh Pilli","MB37253","Mercedes Benz",1200000,"Automation Test Engineer","O+","Benguluru");
		s3.display();

	}

}
