/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		String upsen = sentence.toUpperCase();
		String lowsen = sentence.toLowerCase();
		boolean everyOther = true;
		for(int i = 0; i < sentence.length(); i++){
			if(everyOther){
				System.out.print(lowsen.substring(i,i+1));
			}
			else if(everyOther == false){
				System.out.print(upsen.substring(i,i+1));
			}
			everyOther = !everyOther;
			
			
		}
		
		
		
		
		
		
	}
}
