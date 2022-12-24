package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ebay {

	public static WebElement search(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text']"));
	}

	public static WebElement searchbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='submit']"));
	}

	public static WebElement firstresult(WebDriver driver) {
		return driver.findElement(By.xpath("(//span[@role='heading'])[2]"));
	}

	public static WebElement getprice(WebDriver driver) {
		return driver.findElement(By.xpath("(//span[@class='ux-textspans'])[14]"));
	}

}
