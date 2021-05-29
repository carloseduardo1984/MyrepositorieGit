package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Test01_TestNG_Simple_Annotation {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "D:\\firefoxWebDriver\\geckodriver.exe";
    public WebDriver driver ; 
	
	
    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        
    }
    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        System.out.println("Welcome: Mercury Tours");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
   }
    @AfterTest
    public void terminateBrowser(){
    	System.out.println("terminateBrowser");
    	
        driver.close();
    }
}


//Only TestNG lib and Selenium
//1st - launchBrowser()
//2nd - verifyHomepageTitle()
//3rd - terminateBrowser()