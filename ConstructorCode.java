package reva;

public class ConstructorCode{
	String movieName;
	String HeroName;
	String HeroineName;
	long collection;
	ConstructorCode(String movieName,String HeroName,String HeroineName,long collection){
		this.movieName=movieName;
		this.HeroineName=HeroName;
		this.HeroineName=HeroineName;
		this.collection=collection;
	}
	public void display() {
		System.out.println(movieName);
		System.out.println(HeroName);
		System.out.println(HeroineName);
		System.out.println(collection);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCode n=new ConstructorCode("Magadheera","RamCharan","Kajal Agarwal",936342);
		n.display();
		ConstructorCode n1=new ConstructorCode("Maharshi","MaheshBabu","Pooja hegde",93284621);
		n1.display();
		

	}

}
