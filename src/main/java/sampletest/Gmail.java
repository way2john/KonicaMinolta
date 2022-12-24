package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='email']"));
	}

	public static WebElement next(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password']"));
	}

	public static WebElement signin(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
	}

	public static WebElement accountverify(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='gb_b gb_ld gb_qg gb_l gb_Ff']"));
	}

}
