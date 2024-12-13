/*
 *	Author:  Campbell Walch
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int numOfElements = 100;
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		int [] algorithm = new int[numOfElements];
		
		for(int x = 0; x < numOfElements; x++){
			int rand = (int)(Math.random() * 99) + 1;
			algorithm[x] = rand;
		}
		
		toStringArray(algorithm);
		int avg = getArrayAverage(algorithm);
		int max = getArrayMax(algorithm);
		int min = getArrayMin(algorithm);
		
	}
	
	public static void toStringArray(int [] x){
		for(int i = 0; i < numOfElements; i++){
			System.out.println("#" + (i+1) + ": " + x[i]);
		}
	}
	
	public static int getArrayAverage(int [] x){
		int avg = 0;
		for(int i = 0; i < numOfElements; i++){
			avg += x[i];
		}
		avg = avg/numOfElements;
		return avg;
	}
	
	public static int getArrayMax(int [] x){
		int max = 1;
		for (int i = 0; i < numOfElements; i++){
			if(x[i] > max){
				max = x[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] x){
		int min = 100;
		for(int i = 0; i < numOfElements; i++){
			if(x[i] < min){
				min = x[i];
			}
		}
		return min;
	}
	
	
	
	
	
}
