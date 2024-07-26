package reva;

public class ConstructorChaining {
	String direction;
	int speed;
	String distance;
	String Time;
	String AvgSpeed;
	 ConstructorChaining(String direction,int speed,String distance,String Time){
		 this.direction=direction;
		 this.speed=speed;
		 this.distance=distance;
		 this.Time=Time;
	 }
	 ConstructorChaining(String direction,int speed,String distance,String Time,String AvgSpeed){
		 this.direction=direction;
		 this.speed=speed;
		 this.distance=distance;
		 this.Time=Time;
		 this.AvgSpeed=AvgSpeed;
	 }
	 public void display() {
		 System.out.println(direction);
		 System.out.println(speed);
		 System.out.println(distance);
		 System.out.println(Time);
		 System.out.println(AvgSpeed);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining s1=new ConstructorChaining("East",200,"67Km","08:23AM");
		s1.display();
		ConstructorChaining s2=new ConstructorChaining("North",90,"890Km","12:29PM","66Km/hr");
		s2.display();

	}

}
