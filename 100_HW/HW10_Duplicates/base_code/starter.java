/*
 *	Author: Campbell Walch
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		// 1. Set Array Values
		int [] array = new int[20];
		System.out.println("The Values of the Array are: ");
		for(int i = 0; i < array.length; i++){
			int rand = (int) (Math.random() * 9) + 1;
			array[i] = rand;
			System.out.print(array[i] + " ");
		}
		
		// 2. Find Duplicates of Target Number
		int target = (int) (Math.random() * 9) + 1;
		System.out.println("\n-------------------------------------------");
		System.out.println("The number to look for is: " + target);
		int numOfDuplicates = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == target){
				System.out.println("Duplicate found at index number: " + i);
				numOfDuplicates++;
			}
		}
		System.out.println("The total number of duplicates is: " + numOfDuplicates);
		System.out.println("-------------------------------------------");
		for(int i = 0; i < array.length; i++){
			if(i == 0){
				if(array[i] == array[i+1]){
					System.out.println("Two in a row found at indexes: " + i + " and " + (i+1) + ". The number is: " + array[i]);
				}
			}
			else if (array[i] == array[i-1]){
				System.out.println("Two in a row found at indexes: " + (i-1) + " and " + i + ". The number is: " + array[i]);
			}
			
			
		}
		
	}
	
}
