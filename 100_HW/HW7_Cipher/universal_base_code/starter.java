/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		//First
		System.out.println(Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r"));
		System.out.println("");
		System.out.println(Cipher.encode("sv8vq17r 1r q25 85rq"));
		System.out.println("");
		System.out.println(Cipher.encode("q25 z5l qv wpx85s f 1r gg"));
		System.out.println("");
		System.out.println(Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33));
		System.out.println("");
		System.out.println(Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d"));
		System.out.println("");
		System.out.println(Cipher.keyedEncode("a8 1oy 92 1kx rxdj in 4", 8));
		System.out.println("");
		System.out.println(Cipher.keyedEncode("12xgx2cy g3d e98e6c3 gzc 4s bgv2z8xc vgz8gf5c 3g4cy", 29));
		System.out.println("");
		System.out.println(Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw"));
		System.out.println("");
		// Second
		int key = 1;
		while (key <= 36){
			System.out.print(Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", key));
			System.out.println(" ( " + key + " )");
			key++;
		}
		System.out.println(" / / / / / / / / / / /");
		int key2 = 1;
		while (key2 <= 36){
			System.out.print(Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", key2));
			System.out.println(" ( " + key2 + " )");
			key2++;
		}
		// Third
		String msg;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter a message for us to decode: ");
		msg = sc.nextLine();
		System.out.println("This is your message encoded: ");
		System.out.println(Cipher.encode(msg));
		// Fourth 
		// My message is (1 s9w ij x1y5r y1rq5w1w3 qv q25 r9x5 rvw3 vw yvvu)
		
		
		
		
		
		
		
		
		
		
	}
}
