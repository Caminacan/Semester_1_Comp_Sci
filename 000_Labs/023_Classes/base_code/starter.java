/*
 *	Author:  Campbell Walch
 *  Date: 9/27/24
*/

import java.util.Scanner;
import java.util.Random;

class Character {
	String role = new String("Warrior");
	int Strength = 10, Dexterity = 4, Intelligence = 2, Charisma = 4;
}
class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		System.out.println("Your role is: " + myCharacter.role);
		System.out.println("Your strength stat is: " + myCharacter.Strength);
		System.out.println("Your dexterity stat is: " + myCharacter.Dexterity);
		System.out.println("Your intelligence stat is: " + myCharacter.Intelligence);
		System.out.println("Your charisma stat is: " + myCharacter.Charisma);


		
	}
}
