package MarathonSession1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCases1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tatacliq.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement brand = driver.findElement(By.xpath("//div[@class='DesktopHeader__categoryAndBrand'][2]"));
		
		//Move the cursor to the brand 
		Actions mousehover =new Actions(driver);
		mousehover.moveToElement(brand).perform();
		
		//Select watch and accessories from the selected brand
		WebElement watch = driver.findElement(By.xpath("//div[@aria-label='Watches & Accessories button, Press right arrow or Enter to expand']"));
		
		Actions secondmousehover= new Actions(driver);
		secondmousehover.moveToElement(watch).perform();
		
		//Selected first option from the feature brands 
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		//Select the sort
		driver.findElement(By.xpath("(//div[@class='SelectBoxDesktop__base']/select/option)[4]")).click();
		
		//Selected Men from the category 
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		
		//Printed all the watch price
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("(//div[@class='ProductDescription__priceHolder'])/h3"));

		for (WebElement watch1 : price) {
			System.out.println(watch1.getText());
			
		}
		
		//Clicked the first one from the list and switched to another tab
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		
		driver.switchTo().window("");
		
		//Clicked Add to bag 
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		
		System.out.println("----------");
		
		//Printed the cart count 
		WebElement cart = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		System.out.println(cart.getText());
		
		//Clicked the cart icon
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();

		//Comparing the two prices are similar 
		String price1 = driver.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']")).getText().replaceAll("[^\\d.]", "");
		String price2 = driver.findElement(By.xpath("//div[@class='DesktopCheckout__price']")).getText().replaceAll("[^\\d.]", "");
		//String amount1 = price1.getText().replace("₹ ", "").trim();
		//String amount2 = price2.getText().replace("₹ ", "").trim();
		
		//System.out.println(price1);
		//System.out.println(price2);
		
		int amu1=(int)Double.parseDouble(price1);
		int amu2 = Integer.parseInt(price2);
		
		System.out.println(amu1);
		System.out.println(amu2);
		
		if (amu1 == amu2) {
			System.out.println("Price is matched");
			
		}
		else {
			System.out.println("Price not matched");
		}
		
		
		//Closed all the tab
		driver.quit();
}
}
