package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.PracticePage2Page;

public class PracticePage2Test extends BaseTest {

	public WebDriver driver;
	PracticePage2Page practice2page;
	
	
	//@Test
	public void selectionButton() {

		driver = super.driver;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		practice2page = new PracticePage2Page(driver);
		practice2page.getRadioBtn();
		practice2page.getSelectionBox();
	}

	//@Test 
	public void switchWindow() {
		
		practice2page.getOpenWindow();	
		
		
	}
	
}
