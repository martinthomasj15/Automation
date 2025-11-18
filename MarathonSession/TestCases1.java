package MarathonSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCases1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("guest");
		
		
		ChromeDriver driver= new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.pvrcinemas.com/");
		
		//Maximized the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
//		
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//div[@id='cinema']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='INOX Chennai Citi Centre,Dr. R. K. Salai Chennai']")).click();
		
		
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[4]")).click();
		
		
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[4]")).click();
		
		
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click();

		
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		
	
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		
	    driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[1]")).click();
	    
	    
	    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	}

}
