package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseExceptParent {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		String pwh = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			if(wh.equals(pwh)) {
			}
			else
				driver.close();
		}
		

	}

}
