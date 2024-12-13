/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(pigLatinify(sentence));
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(pigLatinify(word) + " ");
			
			sentence = sentence.substring(space+1);
		}
		
		
		
		
		
		
	}
	public static String pigLatinify(String word){
		String checkSen = word.toLowerCase();
		if(!checkSen.substring(0,1).equals("a") && !checkSen.substring(0,1).equals("e") && !checkSen.substring(0,1).equals("i") && !checkSen.substring(0,1).equals("o") && !checkSen.substring(0,1).equals("u") && !checkSen.substring(0,1).equals("y")){
			if(checkSen.substring(1,2).equals("a") && checkSen.substring(1,2).equals("e") && checkSen.substring(1,2).equals("i") && checkSen.substring(1,2).equals("o") && checkSen.substring(1,2).equals("u") && checkSen.substring(1,2).equals("y")){
				// double consonant
				String app = word.substring(0,2);
				word = word.substring(2);
				return word + "-" + app + "ay";
			}
			else{
			// single consonant
				String app = word.substring(0,1);
				word = word.substring(1);
				return word + "-" + app + "ay";	
			}
		}
		else{
			// vowel start (add "way")
			return word + "-way";
			
			
		}
	}
	
	
	
	
	
	
}
