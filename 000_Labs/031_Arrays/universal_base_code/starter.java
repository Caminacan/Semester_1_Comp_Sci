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
		int [] test = new int[10];
		int count = 9;
		for(int i = 0; i < 9; i++){
			test[i] = count;
			count = count - 1;
		}
		for(int x = 0; x<10; x++){
			System.out.println(test[x]);
		}
		
		
	}
}
