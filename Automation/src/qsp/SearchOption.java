package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SearchOption {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the option");
		String option = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/QSPIDER/Selenium/My%20Practice/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int Counter=0;
		for(int i=0;i<allOptions.size();i++) {
			String text = allOptions.get(i).getText();
			if(option.equals(text)) {
				Counter++;
			}
		}
if(Counter==0) {
	System.out.println(option+ "is not present");
}
else if (Counter==1) {
	System.out.println(option+" is present without duplicate");
}
else if(Counter>1) {
	System.out.println(option+" is present with duplicates" );
}
driver.close();


	}

}
