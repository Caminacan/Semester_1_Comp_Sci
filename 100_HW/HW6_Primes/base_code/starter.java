/*
 *	Author:Campbell Walch	
 *  Date:10/7/24
*/

import java.util.Scanner;

class starter {
	
	public static boolean checkPrime(int input){
		int count = input - 1;
		boolean yes = false;
		if (input == 2){
			yes = true;
			return yes;
		}
		while (count >= 2){
			if (input%count != 0){
				yes = true;
			}
			if (input%count == 0){
				yes = false;
				break;
			}
			count--;
		}
		return yes;
	}
	
	public static void printPrimes(int input){
		boolean check;
		while(input >= 2){
			check = checkPrime(input);
			if (check) System.out.print(input + ", ");
			input--;
		}

		return;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;
		boolean prime;
		System.out.print("Enter an integer and I'll print out all the Prime Number Below that: ");
		input = sc.nextInt();
		printPrimes(input);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
