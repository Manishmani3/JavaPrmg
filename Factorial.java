package Firstproject;
import java.util.Scanner;
public class Factorial {
	public static void main(String [] args ) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Whic no do you want factorial of ?");
		int n=sc.nextInt();
		int res=1;
//		for(i=1;i<=n;i++ ) {
//			fact=fact*i;
//		}
		while(n>0) {
			res=res*n;
			n--;
		}
		System.out.println("the answer is "+res);
	}
}
