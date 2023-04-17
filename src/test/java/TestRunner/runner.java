package TestRunner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class runner {
	
	@Test
	public void Test() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.airtel.in/recharge/prepaid/");
		//System.out.println("abc");
		driver.quit();
	}
}
