package saveetha_HCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cssTest {
  @Test
  public void f() {


	          WebDriver driver = new ChromeDriver();
	          driver.manage().window().maximize();

	 
	          driver.get("https://www.wikipedia.org/");

	          // CSS SELECTOR USING ID (#id)
	          WebElement search =driver.findElement(By.cssSelector("#searchInput"));
	          search.sendKeys("Selenium WebDriver");

	          // CSS SELECTOR USING CLASS (.className)
	          WebElement click =driver.findElement(By.cssSelector(".pure-button"));
	          click.click();

	          System.out.println("Title: " + driver.getTitle());

	   
	

  }
}
