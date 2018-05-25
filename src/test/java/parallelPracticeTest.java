import ApplicationClasses.ApplicationPageClasses.PageClass;
import Common.Helpers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static Common.WebDriverHolder.*;

public class parallelPracticeTest extends BaseTest{
    PageClass pageClass;
    String baseurl;

    Helpers helpers;

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        pageClass = new PageClass();
        helpers = new Helpers();
        log.info("test case execution started");
    }


    @Test(groups = {"Test 1"})
    public void practiceParallel() throws Exception{
       baseurl = "https://letskodeit.teachable.com/";
       getDriver().get(baseurl);
       Thread.sleep(5000);
       helpers.clickElement_xpath(".//a[contains(text(),'Login')]");
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp(){
        log.info("Execution Completed");
    }
}
