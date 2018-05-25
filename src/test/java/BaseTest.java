import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static Common.WebDriverHolder.*;


public class BaseTest {

    @Parameters("browserName")
    @BeforeMethod(alwaysRun = true)
    static void setUpBrowser(@Optional("chrome") String browserName) { setDriver(browserName); }

    @AfterMethod(alwaysRun = true)
    void tearDown(ITestResult testResult){
        tearDownBrowser();
    }
}
