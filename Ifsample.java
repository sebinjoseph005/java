 package java1;

import java.util.Scanner;

public class Ifsample {
	public static void main (String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=s.nextInt();
		
		if(num<0) {
			System.out.println("the number is negative");
		}else
		System.out.println("the number is positive");
	}

}
