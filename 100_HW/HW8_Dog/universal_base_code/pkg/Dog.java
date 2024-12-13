package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	// Global Variables
	public String name;
	public int age;
	public String breed;
	// Constructors
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big Red Dog";
	}
	public Dog(String n){
		name = n;
		age = 1;
		breed = "Dog Dog";
	}
	public Dog(String n,String b){
		name = n;
		breed = b;
		age = 1;
	}
	public Dog(String n, int a){
		name = n;
		age = a;
		breed = "Dog Dog";
	}
	// Methods
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String b){
		breed = b;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int r = (int)(Math.random() * 2) + 1;
		if(r == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " barked!");
	}
	
}
