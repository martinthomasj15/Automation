package Java_Learning;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//salary and Loan process 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your salary: ");  // For better understanding 
		int salary = scan.nextInt();
		
		System.out.println("What is ypur age?:");
		int age = scan.nextInt();
		
		
		if(salary>=20000 || age<25)
		{
			System.out.println("Eligble for Loan");
			System.out.println("How much loan amount you want?: ");
			int loan = scan.nextInt();
			
			if (loan<5000) {
				System.out.println("Loan Approved");
			}
			else {
				System.out.println("Loan Not Approved");
			}
			
		}
		else
		{
			System.out.println("No Loan");
		}
		
	}

}
