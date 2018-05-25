import ApplicationClasses.ApplicationPageClasses.PageClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static Common.WebDriverHolder.*;



public class TestClass extends BaseTest {
    PageClass pageClass;

    @BeforeMethod
    public void setup(){
        pageClass = new PageClass();
        log.info("test case execution started");
    }


    @Test(priority = 2)
    public void sampleTest1(){
        int sampleInt = 5;
        System.out.println("test sample 1");
        //sampleInt ++;
        Assert.assertEquals(sampleInt,5);
    }

    @Test(priority = 0)
    public void sampleTest2(){
        pageClass.sampleSum(5,2);
    }

    @Test(priority = 1)
    public void sampleTest3(){
        System.out.println("test sample 3");
    }

    @AfterMethod
    public void tearDown(){
        log.info("test case executed");
    }
}
