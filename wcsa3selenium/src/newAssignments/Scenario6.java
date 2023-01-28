package newAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
	WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
	Actions act=new Actions(driver);
	act.moveToElement(target).perform();
	driver.findElement(By.xpath("//span[.='Kadas']")).click();
	driver.findElement(By.xpath("(//a[@id='pid_76911'])[2]")).click();
	driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	}

}
