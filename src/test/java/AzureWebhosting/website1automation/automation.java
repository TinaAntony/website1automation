package AzureWebhosting.website1automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class automation {
	public static WebDriver driver;
	
	@Test
	public void automation1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tinaantony.azurewebsites.net/website1/");
		String tagname = driver.findElement(By.tagName("h2")).getText();
		System.out.println("Hello, I am automating for azure hosted website");
		Assert.assertEquals("Hello Here I am", tagname);
		driver.quit();
	}

}
