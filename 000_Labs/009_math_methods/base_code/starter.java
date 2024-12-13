/*
 *	Author:  Campbell Walch
 *  Date: 9/6/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int a; // Problem
		double b,c,d; // Problems
		// Problem A
		int aa,ab; // Mini Variables
		aa = 13 - 6 * 11;
		ab = 30 % 7 * (-2);
		a = Math.max(aa,ab);
		System.out.println("Max = " + a);
		// Problem B
		double ba; // Mini Variable
		ba = 3*8+31%7;
		b = Math.sqrt(ba);
		System.out.println("Square Root = " + b);
		// Problem C
		double ca,cb; // Mini Variables
		ca = 37/3;
		cb = 35%21;
		c = Math.pow(ca,cb);
		System.out.println("Power = " + c);
		// Problem D
		double da,db; // Mini Variables
		double daa; // Mini-Mini Variable
		daa = 14%3;
		da = Math.pow(2,daa);
		db = Math.sqrt(12);
		d = Math.max(da,db);
		System.out.println("Max = " + d);
	}
}
