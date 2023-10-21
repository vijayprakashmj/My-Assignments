package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	String Title= driver.getTitle();
	System.out.println(Title);
	driver.findElement(By.id("email")).sendKeys("vijayprakashmj@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("123@Gmailcom");
	Thread.sleep(5000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Forgotten account?")).click();
	String TitleLink= driver.getTitle();
	System.out.println(TitleLink);
}
}
