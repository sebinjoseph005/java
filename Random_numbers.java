package java1;

import java.util.Random;
public class Random_numbers {
	public static void main(String[]args) {
		
		Random random= new Random();
		
		//int x=random.nextInt(6)+1;
		boolean x=random.nextBoolean();
		//Double x=random.nextDouble();
		
		System.out.println(x);
	}
}
