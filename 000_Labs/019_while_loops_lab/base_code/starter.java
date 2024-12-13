/*
 *	Author:  Campbell Walch
 *  Date: 9/25/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name;
		int count, counter = 0;
		System.out.println("What is your name: ");
		name = sc.nextLine();
		System.out.println("How many times do you want me to say your name: ");
		count = sc.nextInt();
		while(counter <= count){
			System.out.println(name);
			counter = counter + 1;
		}



		
	}
}
