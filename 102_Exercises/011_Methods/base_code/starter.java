/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
	public static boolean isLeapYear(int year){
		boolean leap;
		if ((year%4) == 0){
			return leap = true;
		}
		return leap = false;
	}
	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.
	public static int getDigitSum(int number){
		int digit1, digit2, digit3, digit4, digit5;
		digit1 = number/10000;
		digit2 = (number/1000)%10;
		digit3 = (number/100)%10;
		digit4 = (number/10)%10;
		digit5 = number%10;
		int sum = digit1 + digit2 + digit3 + digit4 + digit5;
		return sum;
	}
	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.
	public static void printIfConsecutive(int num1, int num2, int num3){
		if ( (num2-1) == num1 && (num2+1) == num3){
			System.out.println(num1 + " " + num2 + " and " + num3 + " are consecutive.");
		}
		else{
			System.out.println("Those are not consecutive.");
		}
	}

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");
		
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);
		
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
		
	}
}
