package sampletest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver browserlaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\johns\\eclipse-workspace\\sampletest\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (name.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\johns\\eclipse-workspace\\sampletest\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void launchURL(String url) {
		driver.get(url);

	}

	public static void ClickonElement(WebElement element) {
		element.click();
	}

	public static void sleep(long sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public static void screenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(src,
				new File("C:\\Users\\johns\\eclipse-workspace\\Sample_Test\\Screenshot\\" + " " + timestamp + ".png"));
	}

	public static void navigate(String url) {
		driver.navigate().to(url);
	}
}
