/*
 *	Author: Campbell Walch
 *  Date:9/12/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Here's the next 5 following numbers: ");
		System.out.print(a + ", " + (a+1) + ", " + (a+2) + ", " + (a+3) + ", " + (a+4) + ", " + (a+5));
		System.out.println("\nHere are the next 5 following multiples of " + a + ": ");
		System.out.print(a + ", " + (a*2) + ", " + (a*3) + ", " + (a*4) + ", " + (a*5) + ", " + (a*6));
		double b = a;
		System.out.println("\nHere is " + a + " divided by 100: ");
		System.out.println((b/100));
		System.out.println("Here is " + a + " divided by 10: ");
		System.out.println((b/10));
		

	}
}
