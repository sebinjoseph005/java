package java1;

public class Array2 {
	public static void main(String[]args) {
		//array= used to store multiple value in a single array
		
		String[] cars= new String[4];
		
		cars[0]="Buggati";
		cars[1]="Porshe";
		cars[2]="Alto 8000";
		cars[3]="Baleno";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
	}	
}	