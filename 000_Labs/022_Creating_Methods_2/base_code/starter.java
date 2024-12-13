/*
 *	Author:  Campbell Walch
 *  Date: 9/25/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int base, int power) {
		int x, count = 1;
		x = base;
		while (count < power) {
			base = base * x;
			count++;
		}
		return base;
	}

	public static void main(String args[]) {
		int value = pow(4,2);
		System.out.print(value);


		
	}
}
