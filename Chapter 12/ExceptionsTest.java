/*
 * Author: Sierra Andersen
 * Created: 9 Nov 2022
 * 
 * This creates an array of 100 integers and allows the user to pick one. The program explicitly tests for the arrayIndexOutOfBoundsException.
 */
import java.util.Random;
import java.util.Scanner;

public class ExceptionsTest {

	public static void main(String[] args) {
		int [] array = random100();
		printChoice(array);


	}

	//Creates an array of 100 random integers
	public static int[] random100() {
		int[] array = new int[100];
		Random ran1 = new Random();

		for (int i = 0; i<array.length; i++) {
			array[i]=ran1.nextInt();
		}

		return array;
	}

	public static void printChoice(int[] array){
		System.out.println("Type a number (0-99) to choose a random integer: ");

		Scanner input = new Scanner(System.in);
		int index = input.nextInt();

		try{
				int choice = array[index];
				System.out.println("The random number at index " + index + " is " + choice);
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of Bounds");
		}
	}

}
