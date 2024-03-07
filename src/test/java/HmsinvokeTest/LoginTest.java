package HmsinvokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	

	@Test
	public void webInvoke() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.5.0.41:8080/Finsol/");
//		driver.findElement(By.xpath("//input[@id='frmLogin:txtUserName']")).sendKeys("sakella218");
//		driver.findElement(By.xpath("//input[@id='frmLogin:txtPassword']")).sendKeys("finsol");
//		driver.findElement(By.xpath("//input[@id='frmLogin:login']")).click();
	}

}
