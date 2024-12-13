/*
 *	Author:  Campbell Walch
 *  Date: 10/11/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		myCharacter character = new myCharacter();
		String role;
		int Str, Dex, Int, Cha;
		boolean itworked = false;
		myCharacter.myToString(character);
		System.out.println("What role do you choose?");
		role = sc.nextLine();
		System.out.println("How much Strength do you want?");
		Str = sc.nextInt();
		System.out.println("How much Dexterity do you want?");
		Dex = sc.nextInt();
		System.out.println("How much Intelligence do you want?");
		Int = sc.nextInt();
		System.out.println("How much Charisma do you want?");
		Cha = sc.nextInt();
		itworked = myCharacter.setAll(role, Str, Dex, Int, Cha, character);
		if(itworked){
			System.out.println("\nAll variables were set correctly.\n");
		}
		else{
			System.out.println("\nAt least one variable was incorrect.\n");
		}
		myCharacter.myToString(character);
		
	}
}
