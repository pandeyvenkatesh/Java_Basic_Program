package Java_Method_Example;
import java.util.Scanner;
public class method4 {

    static int add(){
     Scanner scn=new Scanner(System.in);
     System.out.print("Enter a Number :-");
     int x=scn.nextInt();
     System.out.print("Enter second Number :-");
     int y=scn.nextInt();
     int z=x+y;
     
    System.out.print("The Sum of two number is :-"+z);
    return z; 

    }
    public static void main(String[] args){
    add();
    }
    
}
