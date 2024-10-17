package JavaTask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.demoblaze.com/");
		Driver.manage().window().maximize();
		System.out.println(Driver.getTitle());
		if(Driver.equals(Driver))
			System.out.println("Page landed on correct website");
		else
			System.out.println("Page not landed on correct website");
		

	}

}
