import java.util.Scanner;
public class q1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number 01: ");
        int n1 = scan.nextInt();
        
        System.out.println("Enter number 02: ");
        int n2 = scan.nextInt();
        
        int div;
        div=n1%n2;
        
        if(div==0){
            System.out.print("Divisible");
        }
        else{
            System.out.print("Not Divisible");
        }
        
    }
}
