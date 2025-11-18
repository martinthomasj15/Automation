package Java_Learning;

public class Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int score = 99;
		
		if(score>35 && score<60)   // First if this condition is false then it will check the next else if condition 
		{
			System.out.println("Video game");
		}
		else if(score>60 && score<90)  // If this condition is true then it will not check the other condition 
		{
			System.out.println("I phone");
		}
		
		else if (score>90)
		{
			System.out.println("Mak book");
		}
	
	}

}
