package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hmsinvoke {
	
	

	public void websiteInvoke() {
		
		WebDriverManager.chromedriver().setup();
		
	

		WebDriver driver=new ChromeDriver();
		driver.get("http://10.5.0.41:8080/Finsol/");
		driver.getTitle();
		driver.findElement(By.xpath("//input[@id='frmLogin:txtUserName']")).sendKeys("sakella218");
		driver.findElement(By.xpath("//input[@id='frmLogin:txtPassword']")).sendKeys("finsol");
		driver.findElement(By.xpath("//input[@id='frmLogin:login']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
