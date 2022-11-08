/*
 * Author: Sierra Andersen
 * Created: 7 Nov 2022
 * 
 * The Triangle class is a subclass of GeometricObject. The class allows a user to create a Triangle object with 3 sides.
 * The class can find the area and perimeter of the triangle and display the information as a String.
 */
public class Triangle
		extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//Construct a default triangle.
	public Triangle(){
	}
	
	//Construct a Triangle with the given sides.
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Return the 1st side of the triangle
	public double getSide1() {
		return side1;
	}
	
	//Return the 2nd side of the triangle
	public double getSide2() {
		return side2;
	}
	
	//Return the 3rd side of the triangle
	public double getSide3() {
		return side3;
	}
	
	//Calculates the area of the triangle
	public double getArea() {
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	//Calculates the perimeter of the triangle
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	//Creates a String to describe the triangle
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
