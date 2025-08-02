package My_project;
import java.util.*;

public class operations {
	public static void main(String args[]) {
		System.out.println("enter 2 numbers: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("Addition: "+sum);
		int diff=a-b;
		System.out.println("Subtraction: "+diff);
		int product=a*b;
		System.out.println("Multiplication: "+product);
		if(b!=0) {
		   int div=a/b;
		   System.out.println("Division: "+div);
		   int mod=a%b;
		   System.out.println("Modulus: "+mod);
		}
		else {
			System.out.println("Division: cannot divide by zero!");
			System.out.println("Modulus: cannot module by zer0!");
		}  
	}

}
