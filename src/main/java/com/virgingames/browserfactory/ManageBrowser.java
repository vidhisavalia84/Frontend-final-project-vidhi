package com.virgingames.browserfactory;

import com.virgingames.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ManageBrowser {
    public static WebDriver driver;

    static String baseurl= PropertyReader.getInstance().getProperty("baseUrl");
    public ManageBrowser() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/resources/propertiesfile/log4j2.properties");
    }


    public void selectBrowser(String browser){
        /*************** code to open browser in incognito *********************/
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--incognito");
//        DesiredCapabilities capabilities=new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
//        options.merge(capabilities);
//        driver=new ChromeDriver(options);
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseurl);
    }
    public void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }

}
