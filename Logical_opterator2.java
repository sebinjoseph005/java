package java1;

import java.util.Scanner;
public class Logical_opterator2 {
	public static void main(String[]args){
		
		// logical operators = used to connect two or more expressions
			//	&& (AND) both conditions must be true
			//	||= (OR) either condition must be true
			//	(NOT) reverses boolean value of condition
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("You are playing a game! Press q OR Q to quit ");
	String response=scanner.nextLine();
	
	//if(!response.equals("q") && !response.equals("Q"))
	if(response.equals("q") || response.equals("Q")) {
		System.out.println("You have Quit the game.....hahahah(study now)");
	}
	else {
		System.out.println("you are still playing the game....(moms gonna scold u later)");
	}
	
	}
	
	
}

