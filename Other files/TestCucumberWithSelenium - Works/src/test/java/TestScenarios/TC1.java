package TestScenarios;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.en.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;




public class TC1 {


    WebDriver driver;
    public ExtentReports extent;
    public ExtentTest extentTest;

    @BeforeTest
    public void setExtent(){
        extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html", true);
        extent.addSystemInfo("Host Name", "Meu Host");
        extent.addSystemInfo("User Name", "Carlos Oliveira");
        extent.addSystemInfo("Environment", "QA");

    }

    @AfterTest
    public void endReport(){
        extent.flush();
        extent.close();
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        // after execution, you could see a folder "FailedTestsScreenshots"
        // under src folder
        String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
                + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }

     @Test
    public void TitleTest(){
        extentTest = extent.startTest("My report");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"#1 Customer Relationship");
    }


    @Given("that i am on the shopping website")
    public void that_i_am_on_the_shopping_website() throws IOException {

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

    @When("i add an item to the basket")
    public void i_add_an_item_to_the_basket()  {

        driver.findElement(By.id("woocommerce-product-search-field-0")).click();
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("cap");
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys(Keys.ENTER);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step2");

    }

    @Then("i can view the item in my basket")
    public void i_can_view_the_item_in_my_basket()  {

        //driver.findElement(By.linkText("Add to cart")).click();
        driver.close();


        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step3");
    }


    @AfterMethod
    public void tearDown(ITestResult result) throws IOException{

        if(result.getStatus()==ITestResult.FAILURE){
            extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
            extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report

            String screenshotPath = TC1.getScreenshot(driver, result.getName());
            extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
            //extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
        }
        else if(result.getStatus()==ITestResult.SKIP){
            extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
        }
        else if(result.getStatus()==ITestResult.SUCCESS){
            extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

        }


        extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
        driver.quit();
    }


}