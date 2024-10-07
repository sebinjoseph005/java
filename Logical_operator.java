package java1;

public class Logical_operator {
	public static void main(String[]args){
		
		// logical operators = used to connect two or more expressions
			//	&& (AND) both conditions must be true
			//	||= (OR) either condition must be true
			//	(NOT) reverses boolean value of condition
		
		int temp=28;
		if(temp>30) {
			System.out.println("Its Hot outside");
		}
			if(temp>=20 && temp<=30){
			System.out.println("Its Warm outside");
		}
			else {
				System.out.println("Its cold outside");
			}
		
	}
}
