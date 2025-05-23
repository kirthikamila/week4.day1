package week4.day1;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhones {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones",Keys.ENTER);
		
		List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<String> list = new ArrayList<String>();
		for (WebElement each:phones)
		{
			String text = each.getText();
			list.add(text);
			
		}
		
		
    System.out.println(list);
	}

}

