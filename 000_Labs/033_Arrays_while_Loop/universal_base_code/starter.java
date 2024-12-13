/*
 *	Author:  Campbell Walch
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
		int i = 0, x = 0;
		while(i<1000){
			int rand = (int)(Math.random() * 9) + 1;
			num[i] = rand;
			i++;
		}
		while(x < 1000){
			System.out.println(num[x]);
			x++;
		}
		
	}
}
