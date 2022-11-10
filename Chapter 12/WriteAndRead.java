import java.util.Random;

/*
 * Author: Sierra Andersen
 * Created: 10 Nov 2022
 * 
 * This program writes 100 random integers to a text file, reads those integers from the text file, and displays the numbers in increasing order.
 */
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class WriteAndRead {

	public static void main(String[] args) throws Exception {
		//Creates a file if it does not already exist.
		File file = new File("Exercise12_15.txt");
		if(file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		
		//Create an array of 100 integers.
		int [] array = random100();
		
		//Print the array to the file.
		try(PrintWriter output = new PrintWriter(file);){
			for(int i = 0; i < array.length; i++) {
				output.print(array[i]+" ");
			}
		}
		
		//Read data from the file and add to an ArrayList
		Scanner input = new Scanner(file);
		ArrayList<Integer> list = new ArrayList<>();
		
		while(input.hasNext()) {
			list.add(input.nextInt());
		}
		
		//Sort list and print out
		java.util.Collections.sort(list);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
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

}
