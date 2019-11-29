

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Main;
import com.abc.magentoobjects.WelcomePage;*/

public class MagentoTest {
	
	@Test
	public void positiveCredential1() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		WelcomePage w = new WelcomePage(driver);
		w.ClickOnMyacc();
		
		Login l = new Login(driver);
		l.typeEmail("mzaidurrahman@gmail.com");
		l.typePass("Welcome123");
		l.clickOnLogin();
		
		Main m = new Main(driver);
		m.clickOnLogout();
		
		driver.quit();

	}

}
