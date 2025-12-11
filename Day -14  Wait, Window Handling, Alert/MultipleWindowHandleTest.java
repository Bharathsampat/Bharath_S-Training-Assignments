package AlertHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandleTest {
	@Test
	public void f() {
		WebDriver driver = new ChromeDriver();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");

		String parent = driver.getWindowHandle();
		System.out.println("This is the title of this site:" + driver.getCurrentUrl());

		driver.findElement(By.id("openwindow")).click();

		Set<String> window = driver.getWindowHandles();

		for (String win : window) {
			if (!win.equals(parent)) {
				driver.switchTo().window(win);
				System.out.println("This is the url for the new window: " + driver.getCurrentUrl());
				driver.close();
			}
		}

		driver.switchTo().window(parent);
		System.out.println("Came back to parent window " + driver.getCurrentUrl());

		driver.findElement(By.xpath("//a[@id='opentab']")).click();

		Set<String> childtab = driver.getWindowHandles();

		for (String tab : childtab) {

			if (!tab.equals(parent)) {
				driver.switchTo().window(tab);
				System.out.println("This is the url for the child tab :" + driver.getCurrentUrl());
				driver.close();
			}
		}

	}
}
