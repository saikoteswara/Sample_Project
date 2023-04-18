package TestRunner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class runner {
	
	@Parameters({"browserurl","print"})
	@Test
	public void Test(String url,String path) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		//driver.get("https://www.airtel.in/recharge/prepaid/");
		System.out.println(path);
		driver.quit();
	}
}
