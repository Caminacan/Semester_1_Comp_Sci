/*
 *	Author:  Campbell Walch
 *  Date: 9/20/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Variables
		Scanner sc = new Scanner(System.in);
		String role;
		//Code
		System.out.println("What role would you like to have?");
		System.out.println("Wizard | Warrior | Rogue");
		role = sc.nextLine();
		//Wizard
		if (role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You are a Wizard!");
		}
		//Warrior
		else if (role.equals("Warrior") || role.equals("warrior")){
			System.out.println("You are a Warrior!");
		}
		//Rogue
		else if (role.equals("Rogue") || role.equals("rogue")){
			System.out.println("You are a Rogue!");
		}
		else{
			System.out.print("Not a valid option");
		}
	}
}
