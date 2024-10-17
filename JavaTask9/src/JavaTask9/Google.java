package JavaTask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		
		Driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		System.out.println(Driver.getCurrentUrl());
		Driver.navigate().refresh();
		Driver.close();
		
		

	}

}
