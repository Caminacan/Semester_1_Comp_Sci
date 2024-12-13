/*
 *	Author:  Campbell Walch
 *  Date: 11/13/24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Wizards
		String wzname = "WIZARD";
		Wizard [] wizs = new Wizard[100];
		for (int i = 0; i < wizs.length; i++){
			wizs[i] = new Wizard(wzname);
		}
		
		// Warriors
		String wrname = "WARRIOR";
		Warrior [] wars = new Warrior[100];
		for (int i = 0; i < wars.length; i++){
			wars[i] = new Warrior(wrname);
		}
		
		int warcount = 0, wizcount = 0;
		while(true){
			wizs[wizcount].attack(wars[warcount]);
			if(wars[warcount].isDead()){
				if (warcount < 99) warcount++;
			}
			wars[warcount].attack(wizs[wizcount]);
			if(wizs[wizcount].isDead()){
				if(wizcount < 99) wizcount++;;
				
			}
			
			
			if(wizs[99].isDead()){
				int wrlives = 0;
				for(int i = 0; i < wars.length; i++){
					if(wars[i].isDead() == false){
						wrlives++;
					}
				}
				System.out.println("Warriors Win!\nThere are |" + wrlives + "| warriors left standing.");
				break;
			}
			if(wars[99].isDead()){
				int wzlives = 0;
				for(int i = 0; i < wizs.length; i++){
					if(wizs[i].isDead() == false){
						wzlives++;
					}
				}
				System.out.println("Wizards Win!\nThere are |" + wzlives + "| wizards left standing.");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
	}
}
