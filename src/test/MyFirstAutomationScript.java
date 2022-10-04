package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://adactinhotelapp.com");
		driver.findElement(By.id("username")).sendKeys("Mukadam23");
		driver.findElement(By.id("password")).sendKeys("9987050342");
		driver.findElement(By.id("login")).click();
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase("Adactin.com - Search Hotel"))
		{
			System.out.println("Testcase Passed");
		}
		else
		{
			System.out.println("Testcase Failed");
		}
	}

}
