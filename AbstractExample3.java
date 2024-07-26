package reva;
abstract class Shape{
	String color;
	abstract public void area();
	public void color() {
		this.color=color;
	}
}
class Rectangle extends Shape{
	int width;
	int height;
	Rectangle (int width,int height){
		this.width=width;
		this.height=height;
	}
	@Override
	public void area() {
		System.out.println("The Area Of Rectagle is: "+width*height);
	}
	
}
class Circle extends Shape{
	int a;
	int b;
	Circle(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public void area() {
		System.out.println("The Area Of Circle is: "+a*b*b);
	}
}


public class AbstractExample3 {
	public static void main(String args[]) {
		Rectangle s=new Rectangle(23,45);
		s.area();
		Circle b=new Circle(10,2);
		b.area();
		
	}

}
