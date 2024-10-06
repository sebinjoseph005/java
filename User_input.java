package java1;

import java.util.Scanner;

public class User_input {
	public static void main (String[]args){
		Scanner scanner=new Scanner(System.in);
		
		 System.out.println("Enter youe name:");
		 String name=scanner.nextLine();
		 
		 System.out.println("Your age is: ");
		 int age=scanner.nextInt();
		 scanner.nextLine();

		 System.out.println("what is your favourite food?: ");
		 String food=scanner.nextLine();
		 
		 System.out.println("Your name is:"+name);
		 System.out.println(name+" your age is: "+age);
		 System.out.println("your favourite food is:"+food);
		 
	}
}
