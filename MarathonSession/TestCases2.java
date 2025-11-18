package MarathonSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to avoid captcha pop up 
		driver.findElement(By.xpath("//a[text()='Try different image']")).click();
		
		//type the details in search field 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		
		//Click the search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//printed the total number of results
		String totalnoofresult = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println(totalnoofresult);
		
		//Selected skybags from the brands left panel
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul//li//i)[3]")).click();
		
		//Selected American tourist from the brands left panel
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul//li//i)[4]")).click();
		
		//Clicking the sort by option 
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		
		//Select the New Arriavls 
		driver.findElement(By.id("s-result-sort-select_4")).click();
		
		//to printed the last one from the new arrivals 
		String firstbaginfo = driver.findElement(By.xpath("(//div[@role='listitem'])[1]")).getText();
		System.out.println(firstbaginfo);
		
		//System.out.println("--------------");
		
		//to get the title of the page
		String title = driver.getTitle();
		System.out.println(title);

		//close the browser
		driver.close();

	}

}
