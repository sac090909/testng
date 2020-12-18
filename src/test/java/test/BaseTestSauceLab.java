package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestSauceLab {
	
	
	public String URL = "https://sac909090:669442ce-97aa-4e07-ad18-35802dc9eff1@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	public WebDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability("platform", "WIN10");
		cap.setCapability("version", "83.0");
		
		driver = new RemoteWebDriver(new URL(URL), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();		
		
	}

}
