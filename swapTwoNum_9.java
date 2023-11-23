import java.util.*;
public class Main {
	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter two Number :- ");
    int x=scn.nextInt();
    int y=scn.nextInt();
    int swap;
    
    System.out.println("Before swap number X is "+x+" And Y is "+y);	

       
        swap=x;
        x=y;
        y=swap;
        
        
        System.out.println("After  swap number X is "+x+" And Y is "+y);
	}
}