/*
 *	Author:  Campbell Walch
 *  Date: 9/27/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		myCharacter character = new myCharacter();
		System.out.println("Your role is: " + character.role);
		System.out.println("Your strength stat is: " + character.Strength);
		System.out.println("Your dexterity stat is: " + character.Dexterity);
		System.out.println("Your intelligence stat is: " + character.Intelligence);
		System.out.println("Your charisma stat is: " + character.Charisma);
		
	}
}
