package Java_Learning;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		String color = scan.nextLine();
		
		
		if(color.equals("Red"))
		{
			System.out.println("Stop");
		}
		else if (color.equals("Yellow"))
		{
			System.out.println("Get ready");
		}
		else if (color.equals("Green"));
		{
			System.out.println("Go");
		}
	}

}
