import java.util.Scanner;
public class q8 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter hours: ");
        int h = scan.nextInt();
        
        if(h>30){
            int sum=0;
            int first_hours = 30*50;
            sum=sum + first_hours;
            int x = h-30;
            if(x>25){
                int sec_hours = 25*75;
                sum=sum + sec_hours;
                int y = x-25;
                int bal_hours = y * 100;
                sum=sum + bal_hours;
            }
        System.out.println(sum);
        }
        else{
            int sum = h*50;
            System.out.println(sum);
            }
        }
        
    }

