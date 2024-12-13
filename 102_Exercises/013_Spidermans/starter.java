/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman test = new Spiderman();
		Spiderman two = new Spiderman("Tobey Maguire", 49, "Green Goblin");
		Spiderman three = new Spiderman("Andrew Garfield", 41);
		three.setVillain("Electro");
		System.out.print(three.getVillain());
			
		
	}
}
