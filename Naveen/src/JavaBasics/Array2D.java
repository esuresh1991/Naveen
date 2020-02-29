package JavaBasics;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[][] = new String [3][5];
		System.out.println(a.length);
		System.out.println(a[0].length);

		a[0][0] = "A";
		a[0][1] = "B";
		a[0][2] = "C";
		a[0][3] = "D";
		a[0][4] = "F";
		
		a[1][0] = "A1";
		a[1][1] = "B1";
		a[1][2] = "C1";
		a[1][3] = "D1";
		a[1][4] = "F1";
		
		a[2][0] = "A2";
		a[2][1] = "B2";
		a[2][2] = "C2";
		a[2][3] = "D2";
		a[2][4] = "F2";
		
		System.out.println(a[2][0]);
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		
		for (int row=0; row<a.length; row++)
		{
			for (int col=0; col<a[1].length; col++)
			{
				System.out.println(a[row][col]);
			}
				
		}
		
		
		
		
	}

}
