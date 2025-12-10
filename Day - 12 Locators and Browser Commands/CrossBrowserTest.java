package saveetha_HCL;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	@Test
	public void f() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Browser Name: ");
		String Browser = sc.nextLine();

		WebDriver driver = null;

		if (Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}

		else if (Browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Invalid Browser:");
			return;
		}

		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/");
		System.out.println("The website is : " + driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		

	}
}
