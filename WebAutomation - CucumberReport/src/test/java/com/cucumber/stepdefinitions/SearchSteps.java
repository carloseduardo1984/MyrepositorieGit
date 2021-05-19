package com.cucumber.stepdefinitions;


import com.cucumber.listener.ExtentCucumberFormatter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.java.en.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;


/**
 * Created by Carlos on May-2021
 * @author CArlos Oliveira
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class SearchSteps {
    WebDriver driver;
    public ExtentReports extent;
    public ExtentTest extentTest;


    @Given("I am on edgewordstraining application")
    public void iAmOnHotstarApplication() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "D:\\chromewb\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot) driver;
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step1");
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshots/Image1.png"));
        System.out.println("Captura imagem");


    }

    @When("I search with searchKey")
    public void iSearchWithSearchKey() throws Throwable {
        driver.findElement(By.id("woocommerce-product-search-field-0")).click();
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("cap");
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys(Keys.ENTER);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step2");
        ExtentCucumberFormatter.setTestRunnerOutput("STEP2: I search with $searchKey - Success");
//        throw new PendingException();
    }

    @Then("I should see the searchKey in search result")
    public void iShouldSeeTheSearchKeyInSearchResult() throws Throwable {
        //driver.findElement(By.linkText("Add to cart")).click();
        driver.close();


        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step3");
        ExtentCucumberFormatter.setTestRunnerOutput("STEP3:I see show more results button in search results - Success");
//        throw new PendingException();
    }

    @And("error")
    public void error() throws Throwable {
        driver.findElement(By.linkText("Add to cart")).click();
        driver.close();


        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step3");
        ExtentCucumberFormatter.setTestRunnerOutput("STEP3:I see show more results button in search results - Success");
//        throw new PendingException();
    }


}
