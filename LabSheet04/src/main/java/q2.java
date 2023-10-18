import java.util.Scanner;
public class q2 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number 01: ");
        int n1 = scan.nextInt();
        
        System.out.println("Enter number 02: ");
        int n2 = scan.nextInt();
        
        if(n1>n2){
            System.out.println("number 1 greater than number 2");
        }
        else if(n1==n2){
            System.out.println("number 1 equal to number 2");
        }
        else{
            System.out.println("number 1 smaller than number 2");
        }
    }
}
