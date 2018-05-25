import com.relevantcodes.extentreports.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Common.WebDriverHolder.*;

//@Listeners(CustomListener2.class)  --> This can be done via xml file
public class sample_ITestResults_Tests extends BaseTest {

    ExtentTest test;

    @Test
    public void sampleTest_1() throws InterruptedException {
        getDriver().get("https://www.google.com");
        log.info("Username is entered");
        log.info("Password is entered");
        String exp = "abc";
        Thread.sleep(15000);
        Assert.assertEquals("abcd",exp);

    }

    @Test
    public void sampleTest_2(){
        log.info("Username is entered");
        log.info("Password is entered");
        String exp = "123";
        Assert.assertEquals("123",exp);
    }

}
