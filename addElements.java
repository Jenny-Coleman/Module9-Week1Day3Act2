import java.util.Scanner;

public class addElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		double nums[][] = {
				{1, 5, 2.5, 6.9, 2},
				{5, 7, 8.0, 7.1, 5},
				{6, 8, 4.5, 6.5, 7},
				{9, 5, 7.5, 9.5, 7}
				};
		*/
		
		double nums[][] = new double[4][5];
		System.out.println("Enter the numbers from left to right, top to bottom:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				nums[i][j] = sc.nextDouble();
			}
		}
		
		double col1 = 0;
		for (int k = 0; k < 4; k++) {
			col1 += nums[k][0];
		}
		
		double col2 = 0;
		for (int k = 0; k < 4; k++) {
			col2 += nums[k][1];
		}
		
		double col3 = 0;
		for (int k = 0; k < 4; k++) {
			col3 += nums[k][2];
		}
		
		double col4 = 0;
		for (int k = 0; k < 4; k++) {
			col4 += nums[k][3];
		}
		
		double col5 = 0;
		for (int k = 0; k < 4; k++) {
			col5 += nums[k][4];
		}
		
		System.out.println("Column 1: " + col1);
		System.out.println("Column 2: " + col2);
		System.out.println("Column 3: " + col3);
		System.out.println("Column 4: " + col4);
		System.out.println("Column 5: " + col5);
	}

}
