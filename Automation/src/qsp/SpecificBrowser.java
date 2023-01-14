package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificBrowser {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title which has to be closed");
		String expectedTitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(expectedTitle)) {
				driver.close();
				sc.close();
			}
			
		}
		
		
	}

}
