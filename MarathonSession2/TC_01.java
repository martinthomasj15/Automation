package MarathonSession2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.xpath("//span[text()='Log In with Email']")).click();
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("martinthomas3988@gmail.com");

		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("//input[@class='gid-input slds-input']")).sendKeys("Testing@12345");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.findElement(By.xpath("//a[text()='Remind Me Later']")).click();
	}

}
