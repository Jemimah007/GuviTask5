package JavaTask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("STORE")) 
			System.out.println("Page landed on correct website");
		else
			System.out.println("Page not landed on correct website");
		

	}

}
