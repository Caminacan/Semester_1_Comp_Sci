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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		int spaceCount = 0;
		for(int i = 0; i < sentence.length(); i++){
			if(sentence.substring(i,i+1).equals(" ")){
				spaceCount++;
			}
		}
		int [] spaces = new int[spaceCount];
	//	int spaceCountTemp = spaceCount;
		spaceCount = 0;
		for(int x = 0; x < sentence.length(); x++){
			if(sentence.substring(x,x+1).equals(" ")){
				spaces[spaceCount] = x;
				spaceCount++;
			}
		}
		spaceCount--;
		for(int z = sentence.length(); z > 0; z--){
			if(spaces[spaceCount] == z){
				System.out.print(sentence.substring(spaces[spaceCount]));
				sentence = sentence.substring(0, spaces[spaceCount]);
				if(z > 1 && spaceCount > 0){
					spaceCount--;
				}
			}
		}
		System.out.print(" " + sentence);
	}
}
