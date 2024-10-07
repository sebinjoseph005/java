package java1;

import java.util.Scanner;
public class Math_class2 {
	public static void main(String[]args) {
		
		double x;
		double y;
		double z;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the side x: ");
		x=scanner.nextDouble();
		
		System.out.println("enter the side y: ");
		y=scanner.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse of the triangle is: "+z);
		
		scanner.close();
	}
}
