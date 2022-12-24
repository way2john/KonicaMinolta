package sampletest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Negative2 extends Baseclass {
	public static void main(String[] args) throws InterruptedException, IOException {
		
			Negative2 scenario = new Negative2();
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
			Gmail.username(driver).sendKeys(getPropertyFileValue(Appconstant.AUSERNAME));
			Gmail.next(driver).click();
			sleep(5000);
			Gmail.password(driver).sendKeys(getPropertyFileValue(Appconstant.PASSWORD));
			Gmail.signin(driver).click();
			sleep(3000);
			screenshot();
			System.out.println("invalid Password");
			

	}
	}
