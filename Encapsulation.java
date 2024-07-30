package SamplePrograms;
class Program{
	private String Name;
	private int Age;
	private String EmpyId;
	Program(String Name,int Age,String EmpyId){
		this.Name=Name;
		this.Age=Age;
		this.EmpyId=EmpyId;
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String Name) {
		this.Name=Name;	
	}
	public String setName() {
		return this.Name;
	}
	
	public int  getAge() {
		return this.Age;
	}
	public void setAge(int Age) {
		this.Age=Age;
		
	}
	public String  getEmpyId() {
		return this.EmpyId;
	}
	public void setEmpyId(String EmpyId) {
		this.EmpyId=EmpyId;
		
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program a=new Program("Pooja",22,"73");
		System.out.println(a.setName());
		System.out.println(a.getAge());
		System.out.println(a.getEmpyId());
		
	
	}

}
