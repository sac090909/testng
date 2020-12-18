package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

    public class TestWithoutPageObject extends BaseTestSauceLab {

	public WebDriver driver;

	@Test
	public void buttonSelection() {

		driver = super.driver;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		WebElement selectBth = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(selectBth);
		select.selectByVisibleText("Option2");

	}

	
	public void openWindowAndSwitch() throws InterruptedException {
        /*
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();

		for (String handle : windowHandles) {

			// System.out.println(handle);
			String pageTitle = driver.switchTo().window(handle).getTitle();

			if (pageTitle.equalsIgnoreCase(
					"QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy")) {

				driver.switchTo().defaultContent();

			}

			Thread.sleep(2000);
			*/
			driver.findElement(By.cssSelector("input#alertbtn")).click();
			Thread.sleep(3000);
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		}
	
	
	
	public void webTableTest() throws InterruptedException {
		
		int rowNum = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		int colNum = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/td")).size();
		
		//System.out.println(rowNum + " " + colNum);
		
		ArrayList <String> list = new ArrayList <String>();
		
		for (int i =2; i <=5; i++) {

			for (int j=1; j<=3; j++) {
				
				 String cellData = driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td["+j+"]")).getText();
				 list.add(cellData);
			}
			
		}
		
		Thread.sleep(2000);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
			if ((it.next()).toString().equalsIgnoreCase("Selenium Webdrive")){
				
				System.out.println("Successful");
						
			}
			
			}
	}
	
	@Test
	public void scrollDown() throws InterruptedException {
		
		WebElement mh = driver.findElement(By.id("mousehover"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", mh);
		Thread.sleep(2000);
	}
	
		
		public void mouseHover() throws InterruptedException {
			
			
			WebElement mh = driver.findElement(By.id("mousehover"));
			
			Actions act = new Actions(driver);
			act.moveToElement(mh).build().perform();
			driver.findElement(By.linkText("Top")).click();
			Thread.sleep(3000);
			
			
		}
	
		@Test
		public void iframe() {
			
			//WebElement ifm = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
			
			//driver.switchTo().frame(ifm);
		    driver.findElement(By.linkText("Practice Projects")).click();
		}
	
		
}
