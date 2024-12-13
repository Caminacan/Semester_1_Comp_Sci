package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
    public String role = "default";
    Scanner sc = new Scanner(System.in);
    // public String role = new String("Warrior");
	public int Strength = 5, Dexterity = 5, Intelligence = 5, Charisma = 5;
	
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
	public static void myToString(myCharacter character){
		System.out.println("Your role is: " + character.role);
		System.out.println("Your strength stat is: " + character.Strength);
		System.out.println("Your dexterity stat is: " + character.Dexterity);
		System.out.println("Your intelligence stat is: " + character.Intelligence);
		System.out.println("Your charisma stat is: " + character.Charisma);
		System.out.println("-------------------------------------------------------");
	}
	
	
}

