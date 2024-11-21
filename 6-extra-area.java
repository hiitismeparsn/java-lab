import java.util.Scanner;

interface Shape {
	void getArea();
}



class Triangle implements Shape{
	Scanner sx = new Scanner(System.in);
	double length, height;
	public void getArea() {

		System.out.println("Enter length: ");
		length = sx.nextInt();

		System.out.println("Enter height: ");
		height = sx.nextInt();



		System.out.println("The area of triangle is: " + (length * height * 0.5));
	}

}


class Rectangle implements Shape{

	Scanner sx = new Scanner(System.in);
	double length, height;
	public void getArea() {

		System.out.println("Enter length: ");
		length = sx.nextInt();

		System.out.println("Enter height: ");
		height = sx.nextInt();

		System.out.println("The area of rectangle is: " + (length * height));
	}
}


class Circle implements Shape{
	double radius;

	Scanner sx = new Scanner(System.in);
	public void getArea() {
		System.out.println("Enter radius: ");
		radius = sx.nextInt();
		System.out.println("The area of circle is: " + ((radius*radius) * Math.PI));
	}


}


class Main {
	public static void main(String args[]) {

		Triangle T1 = new Triangle();
		Rectangle R1 = new Rectangle();
		Circle C1 = new Circle();
		

		T1.getArea();
		R1.getArea();
		C1.getArea();
	}}
