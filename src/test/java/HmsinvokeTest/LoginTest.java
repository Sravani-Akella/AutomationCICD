package HmsinvokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demo.Hmsinvoke;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	Hmsinvoke login;
	
	@Test
	public void webInvoke() {
		
		login=new Hmsinvoke();
		login.websiteInvoke();
	}

}
