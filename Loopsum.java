package java1;

import java.util.Scanner;

public class Loopsum {
	public static void main (String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=s.nextInt();
		int sum=0;
		
		for(int i=0;i<num;i++) {
			sum=sum+i;
		}
		System.out.println("reuslt:"+sum);
	}
}
