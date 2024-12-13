/*
 *	Author:  Cambpell Walch
 *  Date: 9/27/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		myCharacter character1 = new myCharacter();
		System.out.print("What role would you like to have: ");
		String input = sc.nextLine();
		myCharacter character2 = new myCharacter(input);
		System.out.println(character2.role);
		System.out.println(character1.role);
		
		
		
		
	
	}
}
