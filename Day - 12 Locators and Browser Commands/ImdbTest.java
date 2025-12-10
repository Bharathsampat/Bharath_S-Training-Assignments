package saveetha_HCL;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImdbTest {

  @Test
  public void mainTest() {
	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//IMDB Website
		driver.get("https://www.imdb.com/");
		
		List<WebElement> totalanchottags = driver.findElements(By.tagName("a"));
		System.out.println("These are the total anchor-tags in this website.........");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		System.out.println("Total number of anchor tags are : "+totalanchottags.size());
		
		for(WebElement element : totalanchottags) {
			System.out.println("The anchor tags are "+element.getDomAttribute("href"));
		}
		driver.quit();
  }
}
