package pkg;

public class CVMath {		
	static int actingSquare;
	
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static int findMagicSquare(int count){
		actingSquare = count*count;
		if(checkSumSq(actingSquare) && (actingSquare/count) == count){
			return actingSquare;
		}
		else{
			return 0;
		}
	}
	private static boolean checkSumSq(int actingSquare){
		int sum = 0;
		for(int x = 1; x <= actingSquare; x++){
			//System.out.print("loop2");
			sum += x;
			if(sum == actingSquare){
				return true;
			}
		}
		
		return false;
	}
	private static long magicSquare(long n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return 34 * magicSquare(n-1) - magicSquare(n-2) + 2;
	}
	
	
	
}
