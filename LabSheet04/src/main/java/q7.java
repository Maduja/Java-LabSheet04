import java.util.Scanner;
public class q7 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter speed: ");
        int s = scan.nextInt();
        
        if(s>100){
            System.out.println("Fine is Rs.1000");
        }
        else if((81<=s)&(90>=s)){
             System.out.println("Fine is Rs.500");
        }
        else if((91<=s)&(100>=s)){
             System.out.println("Fine is Rs.750");
        }
        else{
            System.out.println("no fine");
        }
    }
}
