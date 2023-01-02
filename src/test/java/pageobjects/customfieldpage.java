package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class customfieldpage {
	public WebDriver ldriver;

	public customfieldpage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
