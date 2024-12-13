/* 
    Lecture note example - Methods
*/

class LectureMethod{
    
    public static void main(String args[]) {
       // printAnimal();
       // greetName("Ryan");
       double myraise = raise(100000.62, 3);
       System.out.println(myraise);
       myraise = raise(myraise, 6);
       System.out.println(myraise);
	}
	/*
	public static void printAnimal(){
	    System.out.println("      __");
	    System.out.println("(___()'`;");
	    System.out.println("/,    /`");
	    System.out.println("\\\\\"--\\\\");
	}
    
   public static void greetName(String name){
       System.out.print("Salutations, " + name + ".");
   }
   */
    
   private static double raise(double salary, int percent){
       double nSalary = salary + (salary*(percent/100.0));
       return nSalary;
   }
	
}