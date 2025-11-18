package Java_Learning;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		int total = a+b+c+d+e;
		
		int avg = total/5;
		
		if(avg<35)
		{
			System.out.println("Need Additional class");
			
		}
		else
		{
			System.out.println("Good to go");
		}

	}

}
