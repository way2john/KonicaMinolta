package sampletest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Negative1 extends Baseclass {
	public static void main(String[] args) throws InterruptedException, IOException {
		Negative1 scenario = new Negative1();
		scenario.gmailLogin();
	}
	public String getPropertyFileValue(String value) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(Appconstant.NEGATIVEFILEPATH);
		prop.load(file);
		return prop.getProperty(value);
	}

	public void gmailLogin() throws InterruptedException, IOException {
		browserlaunch(Appconstant.CHROME);
		driver.get(getPropertyFileValue(Appconstant.URL1));
		Gmail.username(driver).sendKeys(getPropertyFileValue(Appconstant.USERNAME));
		Gmail.next(driver).click();
		sleep(3000);
		screenshot();
		System.out.println("invalid User");
		

}
}
