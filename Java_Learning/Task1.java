package Java_Learning;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score<50) {
			
			System.out.println("You need to improve");
		}
		else if (score>=50 && score<=70)
		{
			System.out.println("Good Job"); 
		}
		else if (score >=70)
		{
			System.out.println("Excellent");
		}
	}

}
