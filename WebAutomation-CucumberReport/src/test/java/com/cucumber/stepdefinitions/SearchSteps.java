package com.cucumber.stepdefinitions;


import com.cucumber.listener.ExtentCucumberFormatter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.java.en.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


/**
 * Created by Carlos on May-2021
 * @author CArlos Oliveira
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class SearchSteps {
    WebDriver driver1;
    public ExtentReports extent;
    public ExtentTest extentTest;
    String screenshotdir = System.getProperty("user.dir") + "/output/Screenshots/";

    @Given("I am on edgewordstraining application")
    public void iAmOnHotstarApplication() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "D:\\chromewb\\chromedriver.exe");
        driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver1.get("https://www.edgewordstraining.co.uk/demo-site/");
        driver1.manage().window().maximize();


         File src = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
        // for saving screenshots in local - this is optional
        Date oDate = new Date();
        SimpleDateFormat oSDF = new SimpleDateFormat("ddMMYYYY_HHmmss");
        String sDate = oSDF.format(oDate);
        FileUtils.copyFile(src, new File(screenshotdir + "Screenshot_" + sDate + ".png"));

        System.out.println("Captura imagem");
        System.out.println("Step1");

    }

    @When("I search with searchKey")
    public void iSearchWithSearchKey() throws Throwable {
        driver1.findElement(By.id("woocommerce-product-search-field-0")).click();
        driver1.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("cap");
        driver1.findElement(By.id("woocommerce-product-search-field-0")).sendKeys(Keys.ENTER);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step2");
        ExtentCucumberFormatter.setTestRunnerOutput("STEP2: I search with $searchKey - Success");

        File src = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
        // for saving screenshots in local - this is optional
        Date oDate = new Date();
        SimpleDateFormat oSDF = new SimpleDateFormat("ddMMYYYY_HHmmss");
        String sDate = oSDF.format(oDate);
        FileUtils.copyFile(src, new File(screenshotdir + "Screenshot_" + sDate + ".png"));

        System.out.println("Captura imagem");
//        throw new PendingException();
    }

    @Then("I should see the searchKey in search result")
    public void iShouldSeeTheSearchKeyInSearchResult() throws Throwable {
        //driver.findElement(By.linkText("Add to cart")).click();

        File src = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
        // for saving screenshots in local - this is optional
        Date oDate = new Date();
        SimpleDateFormat oSDF = new SimpleDateFormat("ddMMYYYY_HHmmss");
        String sDate = oSDF.format(oDate);
        FileUtils.copyFile(src, new File(screenshotdir + "Screenshot_" + sDate + ".png"));

        System.out.println("Captura imagem");

         driver1.close();
         driver1.quit();


        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step3");
        ExtentCucumberFormatter.setTestRunnerOutput("STEP3:I see show more results button in search results - Success");
//        throw new PendingException();
    }

    @And("error")
    public void error() throws Throwable {
        driver1.findElement(By.linkText("Add to cart")).click();
        driver1.close();


        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step3");

//        throw new PendingException();
    }






}
