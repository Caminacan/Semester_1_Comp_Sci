/*
 *	Author:  Campbell Walch
 *  Date: 9/18/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int randomnum,input;
		Scanner sc = new Scanner(System.in);
		randomnum = (int) (Math.random() * 999) + 1;
		System.out.print("Guess a number between 1 and 1000: ");
		input = sc.nextInt();
		
		if(randomnum == input){
			System.out.println("You got it correct!!!");
		}
		else if (input > randomnum){
			System.out.println("Too high!");
		}
		else if (input < randomnum){
			System.out.println("Too low!");
		}
		
	}
}
