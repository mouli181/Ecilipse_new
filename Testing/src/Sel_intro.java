import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_intro {

	public static void main(String[] args) {
		
		//Invoking Browser
		
		System.setProperty("webDriver.chrome.driver","Users\\dell\\Downloads\\chromedriver-win64.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://mouli181.github.io/_Portfolio_/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	}

}
