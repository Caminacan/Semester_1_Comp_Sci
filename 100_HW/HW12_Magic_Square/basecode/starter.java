import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		// System.out.println(CVMath.findMid(2,3,1));
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Magic Squares would you like to find: ");
		int inp = sc.nextInt();
		sc.nextLine();
		System.out.print("\n");
		int i = 1;
		int sqcount = 0;
		while(sqcount < inp){
			if(CVMath.findMagicSquare(i) !=0){
				System.out.print(CVMath.findMagicSquare(i) + ", ");
				sqcount++;
			}
			i++;
		}

		
		
		
	}
}
