package My_project;

import java.util.*;

public class Type_coversions {
	public static void main(String args[]) {
		//AUTO CASTING
		/*System.out.println("enter a num");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double b=a;
		System.out.println("double is "+b);*/
		
		//MANUAL CASTING
			System.out.println("enter a num");
			Scanner sc=new Scanner(System.in);
			double a=sc.nextDouble();
			int b=(int)a;
			System.out.println("casted is "+b);
	}
	
}
