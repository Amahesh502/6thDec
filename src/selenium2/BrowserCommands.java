package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * get(String url);
	getTitle();
	getCurrentUrl();
	getPageSource();
	close();
	quit();
 */

public class BrowserCommands {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println("Get Title : "+title);
		String currentURL = driver.getCurrentUrl();
		System.out.println("Get CurrentURL : "+currentURL);
		String source = driver.getPageSource();
		System.out.println("Page source :"+source);
		driver.close();
		
		
		
	}
}
