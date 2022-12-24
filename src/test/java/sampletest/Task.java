package sampletest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Task extends Baseclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		Task scenario = new Task();
		scenario.gmailLogin();
		scenario.ebay();
	}
	public String getPropertyFileValue(String value) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(Appconstant.FILEPATH);
		prop.load(file);
		return prop.getProperty(value);
	}

	public void gmailLogin() throws InterruptedException, IOException {
		browserlaunch(Appconstant.CHROME);
		driver.get(getPropertyFileValue(Appconstant.URL1));
		Gmail.username(driver).sendKeys(getPropertyFileValue(Appconstant.USERNAME));
		Gmail.next(driver).click();
		sleep(5000);
		Gmail.password(driver).sendKeys(getPropertyFileValue(Appconstant.PASSWORD));
		Gmail.signin(driver).click();
		sleep(5000);
		Gmail.accountverify(driver).click();
		sleep(7000);
		screenshot();
		driver.manage().deleteAllCookies();
	}
	public void ebay() throws InterruptedException, IOException {
		driver.get(getPropertyFileValue(Appconstant.URL2));
		Ebay.search(driver).sendKeys(getPropertyFileValue(Appconstant.SEARCHITEAM));
		Ebay.searchbutton(driver).click();
		sleep(2000);
		Ebay.firstresult(driver).click();
		sleep(3000);
		String pr=Ebay.getprice(driver).getText();
		System.out.println(pr);
	}
}