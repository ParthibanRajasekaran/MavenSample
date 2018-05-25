package Common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class WebDriverHolder {

    public static final Logger log = LogManager.getLogger(WebDriverHolder.class);

    //private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    private static String path = "src/main/java/Common/driver/";

    private static WebDriver driver;

    public static void setDriver(String browserName) {
        getBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        log.info("Starting browser '{}'", browserName);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private static void getChromeBrowser(){ driver = new ChromeDriver();}

    private static void getFirefoxBrowser(){ driver = new FirefoxDriver(); }

    private static void getBrowser(String browserName) {
        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", path + "chromedriver");
                getChromeBrowser();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", path + "geckodriver");
                getFirefoxBrowser();
                break;
            default: getFirefoxBrowser();
        }
    }

    public static void tearDownBrowser() {
        log.info("Closing Browser..");
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
