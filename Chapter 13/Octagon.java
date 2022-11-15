/*
 * Author: Sierra Andersen
 * Created: 14 Nov 2022
 * 
 * This class is a subclass of GeometricObject. It can create an octagon, an eight-sided shape.
 */
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	//Construct a default Octagon object
	double side = 1.0;
	
	Octagon(){
		
	}
	
	//Construct an octagon with a specific side length
	Octagon(double side){
		this.side = side;
	}
	
	//Returns the side length of the octagon
	public double getSide() {
		return side;
	}
	
	//Calculates the area of the octagon
		@Override
		public double getArea() {
			double area = (2+4/Math.sqrt(2))*side*side;
			return area;
		}
		
		//Calculates the perimeter of the triangle
		@Override
		public double getPerimeter() {
			return side*8;
		}
		
		//Creates a String to describe the triangle
		@Override
		public String toString() {
			return "side length = " + side;
		}
		
		@Override
		public int compareTo(Octagon o) {
			if(getArea() > o.getArea())
				return 1;
			else if (getArea() < o.getArea())
				return -1;
			else
				return 0;
		}
		
		@Override
		public Object clone() {
			try {
				Octagon octoClone = (Octagon)super.clone();
				return octoClone;
			}
			catch(CloneNotSupportedException ex){
				return null;
			}
			
		}

}
