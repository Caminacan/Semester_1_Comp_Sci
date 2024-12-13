/*
 *	Author: Campbell Walch
 *  Date: 9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter an integer: ");
		num1 = sc.nextInt();
		System.out.print("Enter another integer(bigger than the last one): ");
		num2 = sc.nextInt();
		System.out.println("\nYour range is " + num1 + " to " + num2 + ".");
		System.out.println("Here are 5 random numbers in that range: ");
		System.out.print( (int) (Math.random() * (num2-num1)) + num1 );
		System.out.print(", ");
		System.out.print( (int) (Math.random() * (num2-num1)) + num1 );
		System.out.print(", ");
		System.out.print( (int) (Math.random() * (num2-num1)) + num1 );
		System.out.print(", ");
		System.out.print( (int) (Math.random() * (num2-num1)) + num1 );
		System.out.print(", ");
		System.out.print( (int) (Math.random() * (num2-num1)) + num1 );
		System.out.print(". ");
	}
}
