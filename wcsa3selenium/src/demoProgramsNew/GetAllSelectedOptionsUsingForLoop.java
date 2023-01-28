package demoProgramsNew;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsUsingForLoop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/almas/Desktop/html/multiselectdropdown.html");
		WebElement s = driver.findElement(By.name("menu"));
		Select sel=new Select(s);
		
		for(int i=0; i<6; i++) {
			sel.selectByIndex(i);
		}
		List<WebElement> allOptions = sel.getAllSelectedOptions();

		for(WebElement opt:allOptions) {
			//WebElement opt = allOptions.get(i);
			String values = opt.getText();
			System.out.println(values);
		}

	}

}
