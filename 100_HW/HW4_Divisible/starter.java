/*
 *	Author: Campbell Walch
 *  Date: 9/23/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a number: ");
		a = sc.nextInt();
		System.out.println("Give me another number");
		b = sc.nextInt();
		System.out.println("\n");
		// int a
		if ((a%2) == 0){
			System.out.println(a + " is an even number!");
		}
		else if ((a%2) != 0){
			System.out.println(a + " is an odd number!");
		}
		if ((a % 3) == 0) System.out.println(a + " is divisible by 3!");
		if ((a % 4) == 0) System.out.println(a + " is divisible by 4!");
		if ((a % 5) == 0) System.out.println(a + " is divisible by 5!");
		if ((a%3) != 0 && (a%4) != 0 && (a%5) != 0) System.out.print(a + " is not divisible by 3, 4, or 5!");
		
		System.out.println("\n");
		
		// int b
		if ((b%2) == 0){
			System.out.println(b + " is an even number!");
		}
		else if ((b%2) != 0){
			System.out.println(b + " is an odd number!");
		}
		if ((b % 3) == 0) System.out.println(b + " is divisible by 3!");
		if ((b % 4) == 0) System.out.println(b + " is divisible by 4!");
		if ((b % 5) == 0) System.out.println(b + " is divisible by 5!");
		if ((b%3) != 0 && (b%4) != 0 && (b%5) != 0) System.out.print(b + " is not divisible by 3, 4, or 5!");
		
	}

}