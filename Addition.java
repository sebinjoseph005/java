package java1;

import java.util.Scanner;

public class Addition {
	public static void main(String[]args) {
		
	System.out.println("enter the 2 required numbers");
	Scanner s=new Scanner(System.in);  //used to scan here
	
	int a=s.nextInt();		//variable that needs to be read
	int b=s.nextInt();
	
	int c=a+b;			//c is the sum of 2 numbers 
	System.out.println("result:"+c);
	
	
	}
}
