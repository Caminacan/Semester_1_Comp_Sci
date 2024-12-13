/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String inp = sc.nextLine();
		for(int i = 0; i < inp.length(); i++){
			System.out.println(inp.substring(i,i+1));
		}

		
	}
}
