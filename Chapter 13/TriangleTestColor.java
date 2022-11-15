/*
 * Author: Sierra Andersen
 * Created: 7 Nov 2022
 * 
 * This program tests the Triangle class and its inheritance of GeometricObject.
 */
import java.util.Scanner;

public class TriangleTestColor {

	public static void main(String[] args) {
		
		GeometricObjectColor[] geoArray = new GeometricObjectColor[5];
		for(int i = 0; i<geoArray.length; i++) {
			geoArray[i] = new TriangleColor(i+1, i+1, i+1);
			System.out.printf("Area: %.2f \n", geoArray[i].getArea());
			
			if(geoArray[i] instanceof Colorable) {
				((Colorable)geoArray[i]).howToColor();
			}
		}
	}
}
