import java.util.*;
public class Main {
	public static void main(String[] args) {
		int max,i,n;
		int a[];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		n=scn.nextInt();
		a=new int[n];
		
		System.out.println("Enter the Number");
		
		for(i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
 		}
 		max=max_num(a,n);
  System.out.println("The Largest Number is "+max);
  }
  
  static int max_num(int[]a, int n){
  	int i, m=0;
  	for(i=0;i<n;i++){
  		if(a[i]>m){
  	     m=a[i];
  			}
  	}
  	return m;
  }
}