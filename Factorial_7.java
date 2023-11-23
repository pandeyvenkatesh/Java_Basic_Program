import java.util.*;
    public class Main {
	public static void main(String[] args) {
		System.out.println("Enter a Number You want to Check Factorial Number :- ");
		Scanner Scn= new Scanner(System.in);
		int x=Scn.nextInt();
		int fact=1;
		for(int i=1;i<=x;i++){
			
		fact=fact*i;
	}
	System.out.println("The Given  Factorial Number is :- "+ fact);
}
    }
    