package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;

public class BaseClass
{
	public class BaseTest {
		  
		  protected WebDriver driver;
		  protected Properties prop;
		  
		  @BeforeTest
		  public void setup() throws IOException {
		    prop = new Properties();
		    FileInputStream fis = new FileInputStream("config.properties");
		    prop.load(fis);
		    
		    // setup Appium driver
		    DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability("platformName", prop.getProperty("platformName"));
		    capabilities.setCapability("deviceName", prop.getProperty("deviceName"));
		    capabilities.setCapability("app", prop.getProperty("app"));
		    driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		  }
		  
		  @AfterTest
		  public void teardown() {
		    // close Appium driver
		    driver.quit();
		  }
		}

}
