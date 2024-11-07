package priyanka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.id("userEmail")).sendKeys("pdc12345@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Pdc12345");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		System.out.println("successfuly pulled!!");

	}

}				
