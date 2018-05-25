import ApplicationClasses.ApplicationPageClasses.PageClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static Common.WebDriverHolder.*;

public class VehiclesTest extends BaseTest{
    PageClass pageClass;

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        pageClass = new PageClass();
        log.info("test case execution started");
    }

    @Test(groups = {"Light","Heavy"})
    public void sampleCar(){ log.info("This is a Car");}

    @Test(groups = {"Light"},enabled = false)
    public void sampleBike(){ log.info("This is a Bike");}

    @Test(groups = {"Light","Very Light"})
    public void sampleMotorCylcle(){ log.info("This is a Motor Cycle");}

    @Test(groups = {"Heavy"})
    public void sampleBus(){ log.info("This is a Bus");}

    @Test//(groups = {"Heavy"})
    public void sampleTruck(){ log.info("This is a Truck");}

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        log.info("Execution Completed");
    }
}
