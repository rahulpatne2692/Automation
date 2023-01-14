package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingsFrames2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/QSPIDER/Selenium/My%20Practice/page.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		//string means attribute of the frame
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement we = driver.findElement(By.xpath("//iframe"));
		//webElement means address of the frame
		driver.switchTo().frame(we);
		driver.findElement(By.id("t2")).sendKeys("d");
	}

}
