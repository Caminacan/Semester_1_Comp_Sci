/* 
    Lecture note example - If Statements
*/
    import java.util.Scanner;
    
class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int answer1,answer2;
        System.out.println("You have just gotten home from school! What would you like to do?:");
        System.out.print("1: Homework  |  2: Play Games  |  3: Do Something Outside\n");
        answer1 = sc.nextInt();
        
        if (answer1 == 1){
            System.out.println("\nYou sit down to do homework and get a lot of it done! now you are able to spend some free time!");
            System.out.println("What would you like to do with your free time?: ");
            System.out.print("1: Video Games  |  2: Go For a Walk  |  3: Workout\n");
            answer2 = sc.nextInt();
            if (answer2 == 1) System.out.print("");
                
            else if (answer2 == 2) System.out.print("");
                
            else if (answer2 == 3) System.out.print("");
                
            else
                
            }
        }
        
        else if (answer1 == 2){
            System.out.println("\nYou play games, and end up having fun, but now most of your day is gone!");
            System.out.println("What would you like to do next?: ");
            System.out.print("1: Homework  |  2: Homework  |  3: Homework\n");
            answer2 = sc.nextInt();
            
            
        }
        
        else if (answer1 == 3){
            System.out.println("\nYou go for a walk and feel very productive now you are motivated to get things done!");
            System.out.println("What would you like to do next?: ");
            System.out.print("1: Homework  |  2: Workout  |  3: Video Games\n");
            answer2 = sc.nextInt();
            
        }
        
        else{
            System.out.print("\nNot one of the options....\nSystem ending....");
        }
        
	}
}