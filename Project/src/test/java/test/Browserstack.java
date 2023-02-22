package test;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Browserstack 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{        
	        String	username="shubhamraut_JzYlbg";
	        String  accessKey="xeC2iMqey8eZgGfTF37u";
		     
            DesiredCapabilities cap = new DesiredCapabilities();
            
            cap.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
            cap.setCapability("os_version", "10.0");
            cap.setCapability("build","browserstack-build-1");
            cap.setCapability("project","First TestNg Android Project");
            cap.setCapability("name", "first_test");
            cap.setCapability("device", "OnePlus OnePlus 7T");
	
		

		try {
			URL url=new URL("http://"+username+":"+accessKey+"@hub-cloud.browserstack/wd/hub");

			driver=new RemoteWebDriver(url,cap);

		}

		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	@Test
	public void Firsttest() throws InterruptedException
	{
		
		
	}
	@AfterTest
	public void tearDown()
	{
      // driver.quit();
	}



}
