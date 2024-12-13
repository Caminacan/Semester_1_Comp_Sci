/*
 *	Author:  Campbell Walch
 *  Date: 9/25/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int guess, secret;
		secret = (int)(Math.random() * 999) + 1;
		String right = "Wow! you got it!";
		String wrong = "That's wrong, Nice try!";
		boolean correct = false;
		
		while (correct == false){
			System.out.println("\nGuess a number: ");
			guess = sc.nextInt();
			if(secret == guess){
				System.out.println(right);
				correct = true;
			}
			else if (guess != secret){
				System.out.println(wrong);
			}
			
		}



		
	}
}
