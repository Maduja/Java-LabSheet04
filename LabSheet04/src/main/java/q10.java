import java.util.Scanner;
public class q10 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter number 2:");
        int n2 = scan.nextInt();
        System.out.println("Enter operator:");
        char opr = scan.next().charAt(0);
        
        switch(opr){
            case'+':
                int add = n1+n2;
                System.out.print("addition is: "+add);
            break;
            case'-':
                int sub = n1-n2;
                System.out.print("subtraction is: "+sub);
            break;
            case'*':
                int mul = n1*n2;
                System.out.print("multiplication is: "+mul);
            break;
            case'/':
                int div = n1/n2;
                System.out.print("divition is: "+div);
            break;
            default:
                System.out.print("invalid");
            break;
                
        }
        
        
    }
}
