package JavaTask9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.wikipedia.org/");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		Driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		Driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		Driver.findElement(By.xpath("//span[text()='History']")).click();
		String SectionTitle = Driver.findElement(By.id("History")).getText();
		System.out.println(SectionTitle);
		
		
		

	}

}
