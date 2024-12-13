/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in a number: ");
        int num1 = sc.nextInt();
        System.out.print("Type in another number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of these numbers is: " + sum);
        
	}
}