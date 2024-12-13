/*
 *	Author:  Campbell Walch
 *  Date: 9/16/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		// Input
		System.out.print("Give me a number: ");
		num1 = sc.nextInt();
		System.out.print("Give me another number: ");
		num2 = sc.nextInt();
		System.out.print("Give me another number: ");
		num3 = sc.nextInt();
		// Code
		//Largest
		if ((num1 > num2) && (num1 > num3)){
			System.out.println(num1 + " is the largest number out of the three.");
		}
		if ((num2 > num1) && (num2 > num3)){
			System.out.println(num2 + " is the largest number out of the three.");
		}
		if ((num3 > num2) && (num3 > num1)){
			System.out.println(num3 + " is the largest number out of the three.");
		}
		// Smallest
			if ((num1 < num2) && (num1 < num3)){
			System.out.println(num1 + " is the smallest number out of the three.");
		}
		if ((num2 < num1) && (num2 < num3)){
			System.out.println(num2 + " is the smallest number out of the three.");
		}
		if ((num3 < num2) && (num3 < num1)){
			System.out.println(num3 + " is the smallest number out of the three.");
		}
	}
}
