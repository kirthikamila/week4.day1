package week4.day1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindLowestPhonePrice {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver for Chrome
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        ChromeDriver driver = new ChromeDriver();
        
        // Navigate to Amazon
        driver.get("https://www.amazon.in/");
        
        // Search for phones
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //* byXpath // span [ @ class 'a - price whole']
        // list<String> list=new Arraylist<String>();
        //for (EwbElement each : phone) {
        // string text = each.getText();
        //text.replaceALL(",", "");
        
        
        // Integer.parseINT(replaceALL);
        // list.add(mob);
        // now the string is converted to integer
        // collection.sort(list);
        // 
        //system.outprintln(text);
        // list.add(text);
        // suppose list.add(replace ALL); will throw error
//}
        //sysout(list);
        // 
        // Capture all phone prices using common locator
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        
        // Store prices in a list
        List<Integer> prices = new ArrayList<>();
        for (WebElement price : priceElements) {
            String priceText = price.getText().replaceAll(",", ""); // Remove commas
            prices.add(Integer.parseInt(priceText)); // Convert to integer
        }
        
        // Sort the list in ascending order
        Collections.sort(prices);
        
        // Get the lowest price
        int lowestPrice = prices.get(0);
        
        // Print the lowest phone price
        System.out.println("The lowest mobile phone price on Amazon is: ₹" + lowestPrice);
        
     
    }
}

