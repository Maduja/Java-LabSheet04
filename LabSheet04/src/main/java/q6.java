import java.util.Scanner;
public class q6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter cost price: ");
        float cp = scan.nextFloat();
        
        System.out.println("Enter selling price: ");
        float sp = scan.nextFloat();
        
        if(sp>cp){
            System.out.print("there is a profit");
        }
        else{
            System.out.print("there is a loss");
        }
    }
}
