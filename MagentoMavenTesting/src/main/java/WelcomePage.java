

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	
	WebDriver driver;
	
	By myacc = By.linkText("My Account");
	
	public WelcomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void ClickOnMyacc() {
		
		driver.findElement(myacc).click();
		
	}
	
	

}
