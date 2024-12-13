package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
    public String role = "No Role";
    public Scanner sc = new Scanner(System.in);
	public int Strength, Dexterity, Intelligence, Charisma;
	
    public myCharacter() {
        this.role = "No Role";
    }/*
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
	}*/
	public static void myToString(myCharacter character){
		System.out.println("Your role is: " + character.role);
		System.out.println("Your strength stat is: " + character.Strength);
		System.out.println("Your dexterity stat is: " + character.Dexterity);
		System.out.println("Your intelligence stat is: " + character.Intelligence);
		System.out.println("Your charisma stat is: " + character.Charisma);
		System.out.println("-------------------------------------------------------");
	}
	public static String setRole(String role){
		if(role.equals("Warrior") || role.equals("Wizard") || role.equals("Rogue")){
			return role;
		}
		else{
			return "No Role";
		}
	}
	public static int setStrength(int Str){
		if(Str < 0){
			Str = 0;
		}
		return Str;
	}
	public static int setDexterity(int Dex){
		if(Dex < 0){
			Dex = 0;
		}
		return Dex;
	}
	public static int setIntelligence(int Int){
		if(Int < 0){
			Int = 0;
		}
		return Int;
	}
	public static int setCharisma(int Cha){
		if(Cha < 0){
			Cha = 0;
		}
		return Cha;
	}
	public static boolean setAll(String role, int Str, int Dex, int Int, int Cha, myCharacter character){
		character.role = setRole(role);
		character.Strength = setStrength(Str);
		character.Dexterity = setDexterity(Dex);
		character.Intelligence = setIntelligence(Int);
		character.Charisma = setCharisma(Cha);
		if(!character.role.equals("No Role") && character.Strength > -1 && character.Dexterity > -1 && character.Intelligence > -1 && character.Charisma > -1){
			return true;
		}
		else{
			return false;
		}
	}
	
}

