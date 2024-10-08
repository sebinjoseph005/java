package java1;

import java.util.Scanner;
public class Nested_loop {
		public static void main(String[]args) {
			//nested loop=its a loop that is inside another loop
			
			Scanner scanner=new Scanner(System.in);
			int rows;
			int coloumn;
			String symbol="";
			
			System.out.println("enter the number of rows you need: ");
			rows= scanner.nextInt();
			System.out.println("enter the number of coloumns you need: ");
			coloumn= scanner.nextInt();
			
			
			System.out.println("enter the symbol that u wanna display: ");
			symbol= scanner.next();
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<coloumn;j++) {
					System.out.print(symbol);
				}
				System.out.println();
			}
		}
}
