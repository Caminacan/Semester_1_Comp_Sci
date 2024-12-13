/*
 *	Author: Campbell Walch	
 *  Date: 10/21/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("Kevin");
		dog1.setAge(5);
		Dog dog2 = new Dog("Bernard","Golden Retriever");
		boolean dog1sl = dog1.isSleeping();
		if(dog1sl)
			System.out.println(dog1.name + " barked!");
		else
			System.out.println(dog1.name + " is asleep!");
		boolean dog2sl = dog2.isSleeping();
		if(dog2sl == false && dog1sl == true)
			System.out.println(dog2.name + " barked too!");
		if(dog2sl == true && dog1sl == true)
			System.out.println(dog2.name + " barked too!");
		// (Added Thing):
		if (dog2sl == false && dog1sl == false)
			System.out.println(dog2.name + " is sleeping too!");
	}
	
}
