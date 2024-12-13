/*
 *	Author: Campbell Walch 
 *  Date: 9/20/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Variables
		Scanner sc = new Scanner(System.in);
		String role, name, title;
		int points = 20;
		int strengthPoints = 0, dexPoints = 0, intPoints = 0, chaPoints = 0;
		
		//Code
		System.out.println("What is your name?");
		name = sc.nextLine();
		
		System.out.println("\nWhat is your title? (Ex: Slayer of Dragons)");
		title = sc.nextLine();
		
		System.out.println("\nWhat role would you like to have?");
		System.out.println("Wizard | Warrior | Rogue");
		role = sc.nextLine();
		//Wizard
		if (role.equals("Wizard") || role.equals("wizard")){
			role = "Wizard";
			System.out.println("You are a " + role + "!");
		}
		//Warrior
		else if (role.equals("Warrior") || role.equals("warrior")){
			role = "Warrior";
			System.out.println("You are a " + role + "!");
		}
		//Rogue
		else if (role.equals("Rogue") || role.equals("rogue")){
			role = "Rogue";
			System.out.println("You are a " + role + "!");
		}
		else{
			System.out.print("You didn't pick a role this time.");
		}
	
		System.out.println("\nYou have 20 points to spend on skills: \n");
		System.out.println("Strength - Buff and able to carry larger items\nDexterity - Agile and moves quick\nIntelligence - Better at magic spells!\nCharisma - How personable");
		// Strength
		if (points > 0){
			System.out.print("\nHow many points would like to put into strength?(1-10): ");
			strengthPoints = sc.nextInt();
			if (strengthPoints > 10){
			System.out.print("\nNot a valid amount of points - Try again: ");
			strengthPoints = sc.nextInt();
				if (strengthPoints > 10){
					System.out.print("Not valid - You get 0");
					strengthPoints = 0;
				}
			}
			points = points - strengthPoints;
		}
		System.out.println("You have " + points + " points left.");
		
		// Dexterity
		if (points > 0){
			System.out.print("\nHow many points would like to put into Dexterity?(1-10): ");
			dexPoints = sc.nextInt();
			if (dexPoints > 10 || dexPoints > points){
				System.out.print("\nNot a valid amount of points - Try again: ");
				dexPoints = sc.nextInt();
				if (dexPoints > 10){
					System.out.print("Not valid - You get 0");
					dexPoints = 0;
				}
			}
			points = points - dexPoints;
		}
		System.out.println("You have " + points + " points left.");
		
		// Intelligence
		if (points > 0){
			System.out.print("\nHow many points would like to put into Intelligence?(1-10): ");
			intPoints = sc.nextInt();
			if (intPoints > 10 || intPoints > points){
			System.out.print("\nNot a valid amount of points - Try again: ");
			intPoints = sc.nextInt();
				if (intPoints > 10){
					System.out.print("Not valid - You get 0");
					intPoints = 0;
				}
			}
			points = points - intPoints;
		}
		System.out.println("You have " + points + " points left.");
		
		// Charisma
		if (points > 0){
			System.out.print("\nHow many points would like to put into Charisma?(1-10): ");
			chaPoints = sc.nextInt();
			if (chaPoints > 10 || chaPoints > points){
				System.out.print("\nNot a valid amount of points - Try again: ");
				chaPoints = sc.nextInt();
				if (chaPoints > 10){
					System.out.print("Not valid - You get 0");
					chaPoints = 0;
				}
			}
			points = points - chaPoints;
		}
		
		if (points != 0) System.out.print("\n\nYou have " + points + " point(s) for next time!");
		
		//Character
		System.out.println("\n\nYou are " + name + " the " + title + " ");
		System.out.println("You are a " + role + " with the following stats: ");
		System.out.println("Strength - " + strengthPoints);
		System.out.println("Dexterity - " + dexPoints);
		System.out.println("Intelligence - " + intPoints);
		System.out.println("Charisma - " + chaPoints);
		
	}
}
