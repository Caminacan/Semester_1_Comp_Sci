/*
 *	Author:  Campbell Walch
 *  Date: 9/12/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter another number: ");
		int num2 = sc.nextInt();
		if (num1 != num2){
			System.out.print("These numbers are not equal!");
		}
		if (num1 == num2){
			System.out.print("These numbers are equal!");
		}
		
	}
}
