package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabeticalOrder {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/QSPIDER/Selenium/My%20Practice/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0; i<allOptions.size(); i++) {
			String text = allOptions.get(i).getText();
			al.add(text);
		}
Collections.sort(al);
for(int i=0; i<al.size();i++) {
	String e = al.get(i);
	System.out.println(e);
}
driver.close();
	}

}
