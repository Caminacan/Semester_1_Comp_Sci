/*
 *	Author:  Campbell Walch
 *  Date: 10/28/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	String name;
	int age;

	public PooleDwarf() {		// Default Constructor
		this.name = new String("");
		this.age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public boolean isSameName(String name){
		if(this.name.equals(name)){
			return true;
		}
		else{
			return false;
		}
	}
}

