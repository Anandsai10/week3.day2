package week3.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Loads a new web page in the current browser window
		
		// Maximise the screen
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/"); // Launch the URL https://www.ajio.com/

		driver.findElement(By.xpath("//input[@name=\"searchVal\"]")).sendKeys("Bags", Keys.ENTER); // In the search box,
																									// type as "bags"
																									// and press enter
		// To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for ='Men - Fashion Bags']")).click();
		Thread.sleep(3000);

		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);

		// Get the list of brand of the products displayed in the page and print the
		// list.
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}

		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
