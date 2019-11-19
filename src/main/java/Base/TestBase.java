package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase
{
    public static WebDriver driver;
    public static Properties prop;

    public TestBase()
    {
        try
        {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\GitHub Automation\\GameTest\\src\\main\\java\\config\\config.properties");
            prop.load(fis);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void initialization()
    {
        System.out.println("In Initialization method");
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        if(browserName.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        if(browserName.equals("safari"))
        {
            driver = new SafariDriver();
        }

        if(browserName.equals("IE"))
        {

        }
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
}
