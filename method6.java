package Java_Method_Example;
import java.util.Scanner;

public class method6 {

    static void num(int x){
        if(x<=18){
            System.out.print("You are below 18 or 18.");
        }
            else if(x<=60){
                System.out.print("Your age is between 18+ to 60 .");
            }
            else if(x>60){
                System.out.println("Your age is 60+");
            }
            else 
            {
                System.out.println("Enter a Valid Number ");
            }

        }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a age You want to Check :-");
        int x=scn.nextInt();
        
        num(x);
    }
}
