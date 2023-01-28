package demoPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://laptop-kdq8gi2c/login.do");
		driver.findElement(By.cssSelector("//input[placeholder='username']")).sendKeys(" Admin");
	
		driver.findElement(By.cssSelector("//input[name='pwd']")).sendKeys("admin124");
		driver.findElement(By.id("loginButton")).click();
	}

}
