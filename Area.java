

import java.util.Scanner;

public class Area {
	static double value;
	static String shape;

	double function(int length) {
		return length * length;
	}

	double function(int length, int breadth) {
		return length * breadth;
	}

	double function(float radius) {
		return Math.PI * radius * radius;
	}

	double function(double radius) {
		return 4 * Math.PI * radius * radius;
	}

	public String toString() {
		return "The area of " + shape + " is " + value + "\n";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Area area = new Area();

		System.out.println("Square");
		System.out.print("Enter length of square:\t");
		shape = "Square";
		value = area.function(sc.nextInt());
		System.out.println(area);

		System.out.println("Rectangle");
		System.out.print("Enter length and breadth of rectangle:\t");
		shape= "Rectangle";
		value = area.function(sc.nextInt(), sc.nextInt());
		System.out.println(area);

		System.out.println("Circle");
		System.out.print("Enter radius of circle:\t");
		shape = "Circle";
		value = area.function(sc.nextFloat());
		System.out.println(area);

		System.out.println("Sphere");
		System.out.print("Enter radius of sphere:\t");
		shape = "Sphere";
		value = area.function(sc.nextDouble());
		System.out.println(area);


	}
}
