/*
 *	Author:  Campbell Walch
 *  Date: 11/14/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first and last name with a space in between: ");
		String name = sc.nextLine();
		int space = name.indexOf(" ");
		String lastName = name.substring(space, name.length());
		System.out.println("Your last name is: " + lastName);

		
	}
}
