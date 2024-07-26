package reva;

 class NonStaticVar {
	static String brand;
	int cost;
	int ram;
	String processor;
	String color;
	String battery;
	public void display() {
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(ram);
		System.out.println(processor);
		System.out.println(color);
		System.out.println(battery);
	}


	public static void main(String args[]) {
		NonStaticVar s1=new NonStaticVar();
		s1.brand="Realme";
		s1.cost=10000;
		s1.ram=8;
		s1.processor="OctaHertz";
		s1.color="White";
		s1.battery="5000mAh";
		s1.display();
		
	}
}
