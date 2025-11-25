package Java_Learning;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a integer array, get input for 5 number and print their sum and total
		
		int[] mark = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		mark[0] = scan.nextInt();
		mark[1] = scan.nextInt();
		mark[2] = scan.nextInt();
		mark[3] = scan.nextInt();
		mark[4] = scan.nextInt();
		
		System.out.println(mark[0] + mark[1] + mark[2] + mark[3] + mark[4]);
		
	}

}
