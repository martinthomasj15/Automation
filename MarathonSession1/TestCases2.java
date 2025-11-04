package MarathonSession1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class TestCases2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		Shadow sha =new Shadow(driver);
		sha.setImplicitWait(5);
		sha.findElementByXPath("//span[text()='Products']").click();
		sha.findElementByXPath("//a[text()='See all product pricing\']").click();
		driver.findElement(By.xpath("(//a[contains(@href,'agentforce')])[1]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	
		
	}
	
}
