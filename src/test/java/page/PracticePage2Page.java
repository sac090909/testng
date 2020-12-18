package page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PracticePage2Page {

	WebDriver driver;

	public PracticePage2Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@value='radio2']")
	WebElement btnRadio1;

	@FindBy(id = "dropdown-class-example")
	WebElement selectionBox;
	
	@FindBy(id="openwindow") WebElement btnOpenWidow;

	public void getRadioBtn() {

		btnRadio1.click();
	}

	public void getSelectionBox() {

		Select select = new Select(selectionBox);
		select.selectByVisibleText("Option2");
	}

	public void getOpenWindow() {
		
		btnOpenWidow.click();
		
	}
	
	public void getWindowHandle() {
		
		Set<String> handles = driver.getWindowHandles();
		for (String handle:handles) {
			
			System.out.println(driver.switchTo().window(handle).getTitle());
		}
	}
	
}
