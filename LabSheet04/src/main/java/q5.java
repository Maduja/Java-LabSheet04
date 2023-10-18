import java.util.Scanner;
public class q5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Your mark: ");
        int mark = scan.nextInt();
        
        if((90<=mark)&(mark<=100)){
            System.out.print("your grade is A");
        }
        else if((80<=mark)&(mark<=89)){
            System.out.print("your grade is B");
        }
        else if((70<=mark)&(mark<=79)){
            System.out.print("your grade is C");
        }
        else{
            System.out.print("your grade is D");
        }
    }
}
