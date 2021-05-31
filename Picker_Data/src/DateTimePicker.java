
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DateTimePicker {
	
	WebDriver driver;
    String driverPath = "D:\\firefoxWebDriver\\geckodriver.exe";

    @Test

    public void dateTimePicker(){

    	 System.setProperty("webdriver.gecko.driver", driverPath);
         driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/");

        //Find the date time picker control

        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("09/25/2013 ");

        //Press tab to shift focus to time field

        //dateBox.sendKeys(Keys.SPACE);

        //Fill time as 02:45 PM

        dateBox.sendKeys("02:45 PM");

    }

    }