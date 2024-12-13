package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(){
		actor = "Unknown";
		age = 0;
		villain = "Unknown";
	}
	public Spiderman(String n){
		actor = n;
		age = 0;
		villain = "Unknown";
	}
	public Spiderman(int a){
		actor = "Unknown";
		age = a;
		villain = "Unknown";
	}
	public Spiderman(String v){
		actor = "Unknown";
		age = 0;
		villain = v;
	}
	public Spiderman(String n, int a){
		actor = n;
		age = a;
		villain = "Unknown";
	}
	public Spiderman(String n, int a, String v){
		actor = n;
		age = a;
		villain = v;
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setAge(int a){
		age = a;
	}
	public void setVillain(String v){
		villain = v;
	}
	public void setActor(String a){
		actor = a;
	}
	public String getActor(){
		return actor;
	}
	public int getAge(){
		return age;
	}
	public String getVillain(){
		return villain;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
