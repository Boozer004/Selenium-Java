package Week3Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDroppable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);
		WebElement object = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(object, target).perform();
		driver.switchTo().defaultContent();
	}
}
