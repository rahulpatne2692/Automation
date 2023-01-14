package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/QSPIDER/Selenium/My%20Practice/Hotel.html");
		WebElement CheckPost = driver.findElement(By.id("cp"));
		Select s=new Select(CheckPost);
		WebElement fsOption = s.getFirstSelectedOption();
		String text = fsOption.getText();
		System.out.println(text);
		driver.close();


	}

}
