package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        driver.get("http://www.example.com/login");
        loginPage.enterUsername("user123");
        loginPage.enterPassword("pass123");
        loginPage.clickSubmit();
        
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
