/*
 * Author: Sierra Andersen
 * Created: 7 Nov 2022
 * 
 * This program tests the Triangle class and its inheritance of GeometricObject.
 */
import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		//Initialize triangle sides
		double side1;
		double side2;
		double side3;
		
		//Check if triangle sides are valid
		do{
			System.out.println("Enter three sides of a triangle: ");
			side1 = input.nextDouble();
			side2 = input.nextDouble();
			side3 = input.nextDouble();
			if(!isValid(side1, side2, side3))
				System.out.println("That is not a valid triangle. The total length of two sides of a triangle must be greater than the length of the third.");
		}while(!isValid(side1, side2, side3));
		
		//Initialize the Triangle object;
		Triangle t1 = new Triangle(side1, side2, side3);
		
		//Choose the color of the triangle
		System.out.println("Type the color of the triangle: ");
		String color = input2.nextLine();
		t1.setColor(color);
		
		//Choose if the triangle is filled
		System.out.println("Is the triangle filled? Y/N");
		String choice = input.next();
		boolean filled=true;
		if(choice.equalsIgnoreCase("Y")) {
			filled = true;
		}
		else if (choice.equalsIgnoreCase("N")) {
			filled = false;
		}
		else 
			System.out.println("You did not type Y or N. The triangle will be filled.");
		
		t1.setFilled(filled);
		
		//Print information about the triangle.
		System.out.println(t1.toString());
		System.out.printf("Area: %.3f \n", t1.getArea());
		System.out.printf("Perimeter: %.3f \n", t1.getPerimeter());
		System.out.println("Color: "+ t1.getColor());
		System.out.println("Date Created: " + t1.getDateCreated());
		System.out.println("Filled: " + t1.isFilled());
		

	}
	
	
	public static boolean isValid(double side1, double side2, double side3) {
		
		//test if the sides form a triangle
		if(((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1))
			return true;
		else
			return false;

	}

}
