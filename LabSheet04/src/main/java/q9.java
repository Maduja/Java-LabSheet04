import java.util.Scanner;
public class q9 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter grade:");
        char grade = scan.next().charAt(0);
        
        switch (grade){
            case 'A':
                System.out.print("Excellent");
            break;
            case 'B':
                System.out.print("Well Done");
            break;
            case 'C':
                System.out.print("Good");
            break;
            case 'D':
                System.out.print("You Pass");
            break;
            case 'F':
                System.out.print("Better Try Again");
            break;
            default:
                System.out.print("Invalid Grade");
            break;
                
          
        }
    }
}
