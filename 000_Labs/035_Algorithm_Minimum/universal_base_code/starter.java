/*
 *	Author:  Campbell Walch
 *  Date: 11/5/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		// Variables
		
		int numOfElements = 60;
		int [] algorithm = new int[numOfElements];
		
		// Set values
		
		for(int x = 0; x < numOfElements; x++){
			int rand = (int)(Math.random() * 99) + 1;
			algorithm[x] = rand;
		}
		
		// Minimum
		
		int min = 100;
		for(int i = 0; i < numOfElements; i++){
			if(algorithm[i] < min){
				min = algorithm[i];
			}
		}
		
		// Maximum
		
		int max = 1;
		for (int b = 0; b < numOfElements; b++){
			if(algorithm[b] > max){
				max = algorithm[b];
			}
		}
		
		// Average
		
		int avg = 0;
		for(int c = 0; c < numOfElements; c++){
			avg += algorithm[c];
		}
		avg = avg/numOfElements;
		
		// Print
		System.out.println("Out of the " + numOfElements + " values:");
		System.out.println("\nThe minimum is: " + min);
		System.out.println("The maximum is: " + max);
		System.out.println("The average is: " + avg);
		
		
	}
}
