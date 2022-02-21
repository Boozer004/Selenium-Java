package week2.day5.handson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartRegistration {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("DharaniTamil");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dharani");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("T");
		driver.findElement(By.name("email")).sendKeys("dharanitamil87847@gmail.com");
		driver.findElement(By.name("password")).sendKeys("dharni@12345");

		driver.close();

	}
}
