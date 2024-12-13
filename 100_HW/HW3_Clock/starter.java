/*
 *	Author: Campbell Walch
 *  Date:9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Variables
		int weekday = 7;
		int weekend = 10;
		int day;
		Scanner sc = new Scanner(System.in);
		// Input
		System.out.print("What day of the week is it?(Sunday: 0, Monday: 1, Tuesday: 2, Wednesday: 3, Thursday: 4, Friday: 5, Saturday: 6): ");
		day = sc.nextInt();
		// Days
		if (day == 0) // Sunday  
			System.out.println("It's the weekend! You can sleep in until: " + weekend + ":00 am");
		
		if (day == 1) // Monday
			System.out.println("It's a weekday! You need to wake up at " + weekday + ":00 am");
		
		if (day == 2) // Tuesday
			System.out.println("It's a weekday! You need to wake up at " + weekday + ":00 am");
		
		
		if (day == 3) // Wednesday
			System.out.println("It's a weekday! You need to wake up at " + weekday + ":00 am");
		
		if (day == 4) // Thursday
			System.out.println("It's a weekday! You need to wake up at " + weekday + ":00 am");
		
		if (day == 5) // Friday
			System.out.println("It's a weekday! You need to wake up at " + weekday + ":00 am");
		
		if (day == 6) // Saturday
			System.out.println("It's the weekend! You can sleep in until: " + weekend + ":00 am");
	}
}
