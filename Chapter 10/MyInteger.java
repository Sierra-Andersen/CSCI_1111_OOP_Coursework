/*
 * Author: Sierra Andersen
 * Created: 01 Nov 2022
 * 
 * This class is a group of integers that can be tested for being even, odd, or prime.
 */


public class MyInteger {
	
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if((value % 2) == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() {
		if((value % 2) == 0)
			return false;
		else
			return true;
	}
	
	//Working right here.
	public boolean isPrime() {
		for(int i = 2; i<= (value/2); i++) {
			if((value%i) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isEven(int value) {
		if((value % 2) == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int value) {
		if((value % 2) == 0)
			return false;
		else
			return true;
	}
	
	public static boolean isPrime(int value) {
		for(int i = 2; i<= (value/2); i++) {
			if((value%i) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isEven(MyInteger value) {
		if(value.isEven())
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger value) {
		if(value.isOdd())
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger value) {
		
			if(value.isPrime())
				return true;
			else
				return false;
	}
	
	public boolean equals(int value) {
		if(this.value == value)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger value) {
		if(value.equals(this.value))
			return true;
		else
			return false;
	}
	
	public static int parseInt(char[] value) {
		int number = 0;
		
		for(int i = 0; i<value.length; i++) {
			number +=(value[i]-48)*Math.pow(10,(value.length-1-i));
		}
		
		return number;
	}
	
	public static int parseInt(String value) {
		int number = 0;
		
		for(int i = 0; i<value.length(); i++) {
			number += (value.charAt(i)-48)*Math.pow(10,(value.length()-1-i));
		}
		
		return number;
	}

}
