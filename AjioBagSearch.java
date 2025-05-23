package week4.day1;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;
public class AjioBagSearch {

	public static void main(String[] args) {
		// Step 1: Set up WebDriver
		WebDriver driver = new EdgeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		             // Step 2: Launch Ajio website
		             driver.get("https://www.ajio.com/");
		             
		             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		             
		             // Maximize the browser window
		             driver.manage().window().maximize();

		             // Step 3: Search for 'bags' in the search box
		             driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		             driver.findElement(By.xpath("//span[contains(@class,'ic-search')]")).click();

		             // Step 4: Click on 'Men' under 'Gender'
		             driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();

		             // Step 5: Click on 'Fashion Bags' under 'Category'
		             driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		         
		             // Step 6: Get the count of items found
		             WebElement itemCount = driver.findElement(By.xpath("//div[@class='length']"));
		             System.out.println("Total items found: " + itemCount.getText());
		            
		             // Step 7: Get list of brands
		             List<WebElement> brands = driver.findElements(By.xpath("//div[contains(@class, 'brand')]"));

		             System.out.println("\nList of Brands:");
		             for (WebElement brand : brands) {
		                 System.out.println(brand.getText());
		             }

		             // Step 8: Get list of bag names
		             List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		             System.out.println("\nList of Bag Names:");
		             for (WebElement bag : bagNames) {
		                 System.out.println(bag.getText());
		             }

		         
		     }
		 

}
