package com.cucumber.runner;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.relevantcodes.extentreports.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


@SuppressWarnings("ALL")
@RunWith(Cucumber.class)
@CucumberOptions(
        //features = {"src/test/resources/features/01_Search.feature"}, //Manual
        features = {"src/test/resources/features/"},                    //End2End
        glue = {"com.cucumber.stepdefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter"})

public class RunTest {

    WebDriver driver;

    @BeforeClass
    public static void setup() {
        ExtentCucumberFormatter.initiateExtentCucumberFormatter("output/Reports", Boolean.TRUE, DisplayOrder.NEWEST_FIRST, NetworkMode.OFFLINE, Locale.ENGLISH);
        //ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

        ExtentCucumberFormatter.addSystemInfo("Host Name", "Meu Host");
        ExtentCucumberFormatter.addSystemInfo("User Name", "Carlos Oliveira");
        ExtentCucumberFormatter.addSystemInfo("Environment", "QA");

        Map<String, String> systemInfo = new HashMap<>();
        systemInfo.put("Cucumber version", "v1.2.3");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);
    }



}
