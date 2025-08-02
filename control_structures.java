package My_project;

import java.util.Scanner;

public class control_structures {
	public static void main(String args[]) {
		System.out.println("employee details:");
		Scanner sc=new Scanner(System.in);
		int Id=sc.nextInt();
	
		float exp=sc.nextFloat();
     	/*sc.nextLine();
		String name=sc.nextLine();
		String dept=sc.nextLine();*/
		double sal=sc.nextDouble();
		/*boolean ft=sc.nextBoolean();
		long phno=sc.nextLong();
		System.out.println("Empid="+Id+"\n"+"Empname="+name+"\n"+"Empdept="+dept+"\n"+"Empexp="+exp+"\n"+"empsal="+sal+"\n"+"empft="+ft+"\n"+"empphno="+phno);*/
		int hra=sc.nextInt();
		int da=sc.nextInt();
		int pf=sc.nextInt();
		double h=(sal*hra)/100;
		double d=(sal*da)/100;
		double p=(sal*pf)/100;
		double gross=sal+h+d+1000-p;
		System.out.println(gross);
		if(gross>=5000) {
			System.out.println("Eligible to the loan");
		}
		else {
			System.out.println("Not Eligible to the loan");
		}	
	}

}
