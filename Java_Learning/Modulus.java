package Java_Learning;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Modulus is used to store the remainder values 
		
		int a = 15;
		
		if(a%3 ==0 && a%5 ==0)  //using logical operator comparing the two values which is divisible by both the number 
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
