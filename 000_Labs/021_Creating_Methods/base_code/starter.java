/*
 *	Author:  Campbell Walch 
 *  Date: 9/25/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static String method1(){
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Write a sentence: ");
		a = sc.nextLine();
		return a;	
	}
	
	public static String method2(String str1, String str2){
		String b;
		b = str1 + " " + str2;
		return b;
	}
	
	public static void main(String args[]) {
		String str1 = method1();
		String str2 = method1();
		String str3 = method2(str1, str2);
		System.out.println("\n");
		System.out.println("This is using the methods!\n");
		System.out.println(str1);
		System.out.println(str3);
		
	}
}
