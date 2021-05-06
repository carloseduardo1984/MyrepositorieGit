package TestScenarios;


import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

public class TC1 {


    WebDriver driver;


    @Given("that i am on the shopping website")
    public void that_i_am_on_the_shopping_website()  {
        System.setProperty("webdriver.chrome.driver", "D:\\chromewb\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        driver.manage().window().maximize();
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step1");
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


}