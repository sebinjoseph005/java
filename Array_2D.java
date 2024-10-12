package java1;

public class Array_2D {
	public static void main(String[]args) {
		//2D array=its an array of arrays
		
		String[][] cars=new String[3][3];
		
		cars[0][0]="Alto 800";
		cars[0][1]="Swift";
		cars[0][2]="  Porshe";
		cars[1][0]="Mustang";
		cars[1][1]="  Benz";
		cars[1][2]="  BMW";
		cars[2][0]="Audi";
		cars[2][1]="  Mini cooper";
		cars[2][2]="Nano";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+"        ");
			}
		}
		
	}
	
}
