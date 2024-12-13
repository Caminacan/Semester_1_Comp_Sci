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
		int [] num = new int[1000];
		for(int i = 0; i < 1000; i++){
			int rand = (int)(Math.random() * 9) + 1;
			num[i] = rand;
		}
		for(int x = 0; x < 1000; x++){
			System.out.println(num[x]);
		}

		
	}
}
