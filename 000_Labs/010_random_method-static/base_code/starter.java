/*
 *	Author:  Campbell Walch
 *  Date: 9/10/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x,y;
		double z,w;
		x = (int) (Math.random() * 10);
		System.out.println(x);
		y = (int) (Math.random() * 100) + 1;
		System.out.println(y);
		z = (2.5 + Math.random())*1.0;
		System.out.println(z);
		w = 14 + Math.random() * (589-14);
		System.out.println(w);
		
	}
}
