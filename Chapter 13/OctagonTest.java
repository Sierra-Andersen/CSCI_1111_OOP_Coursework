/*
 * Author: Sierra Andersen
 * Created: 14 Nov 2022
 * 
 * This class tests the Octagon class by cloning an octagon and comparing it to the previous octagon.
 */
public class OctagonTest {

	public static void main(String[] args) {
		Octagon o1 = new Octagon(7);
		Octagon o2 = (Octagon)o1.clone();
		
		System.out.println("Octagon1 " + o1.toString());
		System.out.println("Octagon2 " + o2.toString());
		System.out.println(o1.compareTo(o2));


	}

}
