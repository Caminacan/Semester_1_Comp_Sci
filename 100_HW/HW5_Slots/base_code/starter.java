/*
 *	Author: Campbell Walch
 *  Date: 9/30/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int a = slots();
	}
	
	
	
	public static int slots(){
			// Variables
		int money = 100, wager = 0, slot1, slot2, slot3;
		String input1 = "\0", input2 = "\0";
		boolean cont = false, wagcont = true;
		Scanner sc = new Scanner(System.in);
		
		//Code
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. You have $100.");
		System.out.println("2. Inputer a wager that is lower than your total amount of money.");
		System.out.println("3. The slot Machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("------------------------------------------------------------------------");
		System.out.print("\nWould you like to play the Slot Machine? (Yes/yes/Y/y) : ");
		
		while (!input1.equals("Yes") || !input1.equals("yes") || !input1.equals("Y") || !input1.equals("y")){
			input1 = sc.nextLine();
			if(input1.equals("Yes") || input1.equals("yes") || input1.equals("Y") || input1.equals("y")){
				cont = true;
				System.out.println("Great let's play!!");
				break;
			}
			else if(input1.equals("No") || input1.equals("no") || input1.equals("N") || input1.equals("n")){
				System.out.println("You have " + money + " dollars for next time!");
				break;
			}
			else{
				System.out.print("That wasn't correct, try again : ");
			}
		}
		
		while (cont == true) {
			System.out.print("\nYou have " + money + " dollars. Enter in your wager: ");
			while (wagcont == true){
				wager = sc.nextInt();
				sc.nextLine();
				if (wager > money){
					wagcont = true;
					System.out.print("\nYou only have " + money + " dollars, go lower: ");
				}
				else if (wager <= 0){
					wagcont = true;
					System.out.print("\nNice try, No zeros or negatives! Go higher: ");
				}
				else wagcont = false;
			}
			
			slot1 = (int)(Math.random() * 9) + 1;
			slot2 = (int)(Math.random() * 9) + 1;
			slot3 = (int)(Math.random() * 9) + 1;
			System.out.println("\nYour rolls are:\n");
			System.out.println("_________________________");
			System.out.println("  | " + slot1 + " | " + slot2 + " | " + slot3 + " |");
			System.out.println("_________________________");
			if (slot1 == slot2 && slot1 == slot3){
				System.out.println("Wow! Jackpot!!! Triple your money!");
				money = (money - wager) + (wager*3);
			}
			else if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3){
				System.out.println("Wow! Two are matching, you double your money!");
				money = (money - wager) + (wager*2);
			}
			else{
				System.out.println("Yikes.. You lost your money.");
				money = money - wager;
			}
			if(money == 0){
				break;
			}
			input2 = "yuh";
			Scanner bs = new Scanner(System.in);
			System.out.print("-------------------------------------------------------------");
			System.out.print("\n\nYou have " + money + " dollars! Would you like to continue? (Yes/yes/Y/y) : ");
			while(true){
				input2 = bs.nextLine();
				
				if(input2.equals("Yes") || input2.equals("yes") || input2.equals("Y") || input2.equals("y")){
					cont = true;
					break;
				}
				else if(input2.equals("No") || input2.equals("no") || input2.equals("N") || input2.equals("n")){
					System.out.print("You have " + money + " dollars for next time!");
					break;
				}
				else{
					System.out.print("Not a valid input. Try again! : ");
					
				}
			}
			
			wagcont = true;
			wager = 0;
			if(money == 0){
				break;
			}
			if(input2.equals("No") || input2.equals("no") || input2.equals("N") || input2.equals("n")){
				break;
			}
		}
		return 0;
	}
}
