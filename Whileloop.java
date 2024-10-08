package java1;

import java.util.Scanner;
public class Whileloop {
		public static void main(String[]args) {
			
			Scanner scanner=new Scanner(System.in);
			String name="";
			
			while(name.isBlank()){
				System.out.println("Enter you name... (or this loop will continue for your life)");
				name=scanner.nextLine();
			}
				
				System.out.println("helloooo  "+name);
		}
}
