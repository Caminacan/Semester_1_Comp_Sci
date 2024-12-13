/*
 *	Author: Campbell Walch
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		 int [] array1 = new int[1001];
		 int [] array2 = new int[1001];
		 
		 // Array 1
		 int count1 = 3;
		for(int i = 0; i < 1000; i++){
			count1 += 3;
			array1[i] = count1;
		}
		
		for(int i = 0; i < 1000; i++){
			System.out.println(array1[i]);
		}
		
		 // Array 2
		 int count2 = 1000;
		for(int i = 0; i <= 1000; i++){
			array2[i] = count2;
			count2 = count2 - 1;
		}
		for(int i = 0; i <= 1000; i++){
			System.out.println(array2[i]);
		}
	}
}
