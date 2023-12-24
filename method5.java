package Java_Method_Example;
import java.util.Scanner;
public class method5 {

   static int add(int x,int y){
    int c=x+y;
    System.out.print("The Sum of Two Number is :-"+c);
    return c;

   } 
   static int sub(int x,int y){
    int c=x-y;
    System.out.print("The Substraction of two Number is :-"+c);
    return c;
   }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter First Number :-");
        int x=scn.nextInt();
        System.out.print("Enter Second Number :-");
        int y=scn.nextInt();

        add(x,y);
        sub(x,y);
    }
    
}
