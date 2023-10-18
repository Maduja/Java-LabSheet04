import java.util.Scanner;
public class q3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number 01: ");
        int n1 = scan.nextInt();
        
        System.out.println("Enter number 02: ");
        int n2 = scan.nextInt();
        
        System.out.println("Enter number 03: ");
        int n3 = scan.nextInt();
        
        if((n1>n2)&(n1>n3)){
            System.out.print("The max number is: "+n1);
        }
        else if((n2>n1)&(n2>n3)){
            System.out.print("The max number is: "+n2);
        }
        else{
            System.out.print("The max number is: "+n3);
        }
    }
}
