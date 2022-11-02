/*
 * Author: Sierra Andersen
 * Created: 01 Nov 2022
 * 
 * This test the MyInteger class and all of its methods.
 */
public class TestMyInteger {

	public static void main(String[] args) {

		//Create MyInteger test object
		MyInteger myInt1 = new MyInteger(52);
		MyInteger myInt2 = new MyInteger(47);
		MyInteger myInt3 = new MyInteger(52);
		String intStatus;
		
		//Test for even, odd, and prime.
		
		System.out.println("num1 = " + myInt1.getValue());
		if(myInt1.isPrime()) {
			if(myInt1.isEven())
				intStatus = "even and prime.";
			else
				intStatus = "odd and prime.";
		}
		else {
			if(myInt1.isOdd())
				intStatus = "odd and composite.";
			else
				intStatus = "even and composite.";
		}
		
		System.out.println("num1 is " + intStatus);
		System.out.println();
		
		
		System.out.println("num2 = " + myInt2.getValue());
		if(MyInteger.isPrime(myInt2)) {
			if(MyInteger.isEven(myInt2))
				intStatus = "even and prime.";
			else 
				intStatus = "odd and prime.";
		}
		else {
			if(MyInteger.isOdd(myInt2))
				intStatus = "odd and composite.";
			else
				intStatus = "even and composite.";
			
		}
		
		System.out.println("num2 is " + intStatus);
		System.out.println();
		
		//Test for equality to another MyInteger or int.
		System.out.println("num 3 = " + myInt3.getValue());
		System.out.println("num 1 = num 2 " + myInt1.equals(myInt2));
		System.out.println("num 1 = num 3 " + myInt1.equals(myInt3));
		System.out.println();
		
		int i = 47;
		int j = 4;
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		System.out.println("num 2 = i " + myInt2.equals(i));
		System.out.println("num 2 = j " + myInt2.equals(j));
		System.out.println();
		
		//Test the parsing for char[] and String.
		char [] c = {'5', '2', '1'};
		
		for (int k = 0; k<c.length; k++) {
			System.out.println(c[k]);
		}
		
		System.out.println("This array represents the digits in " + MyInteger.parseInt(c));
		System.out.println();
		
		String s = "895";
		System.out.println("This is a string " + s + "  " +s+ " + 5 = " + s+5);
		int s2 = MyInteger.parseInt(s);
		System.out.println("Now the string is the number " + s2 + "  " + s2 + " + 5 = " + (int)(s2+5));
		
	}

}
