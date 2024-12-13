/*
 *	Author:  Campbell Walch
 *  Date: 8/30/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double buck;
		String name;
		int age, day, month, year;
		System.out.print("What is your name: ");
		name = sc.nextLine();
		System.out.print("What is your age: ");
		age = sc.nextInt();
		System.out.print("What month were you born: ");
		month = sc.nextInt();
		System.out.print("What day were you born: ");
		day = sc.nextInt();
		System.out.print("What year were you born: ");
		year = sc.nextInt();
		System.out.print("If you had a dollar and 2 quarters how much money would you have?(0.0-#): ");
		buck = sc.nextDouble();
		System.out.println("\nYour name is " + name + " and you are " + age + " years old!!");
		System.out.println("You were born on " + month + "/" + day + "/" + year + "!!");
		System.out.println("You have " + buck + " in your wallet!");
		
	}
}
