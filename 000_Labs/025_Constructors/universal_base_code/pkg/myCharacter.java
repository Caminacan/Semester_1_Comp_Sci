package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
    public String role = "default";
    Scanner sc = new Scanner(System.in);
    // public String role = new String("Warrior");
	public int Strength = 0, Dexterity = 0, Intelligence = 0, Charisma = 0;
	
    public myCharacter() {
        this.role = "No Role";
    }
	
	
	public myCharacter(String role){
		if(role.equals("Warrior")){
			this.role = "Warrior";
		    System.out.println("You chose a Warrior, How brave!");
		}
		else if(role.equals("Wizard")){
			this.role = "Wizard";
		    System.out.println("You chose a Wizard, How intelligent!");
		}
		else if(role.equals("Rogue")){
			this.role = "Rogue";
		    System.out.println("You chose a Rogue, How cunning!");
		}
		else{
			this.role = "No Role";
			System.out.println("Not a valid role.");
		}
	
	}
}

