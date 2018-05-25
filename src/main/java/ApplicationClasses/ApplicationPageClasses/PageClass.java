package ApplicationClasses.ApplicationPageClasses;

import ApplicationClasses.ApplicationLocators.PageLocator;
import static Common.WebDriverHolder.*;

public class PageClass extends PageLocator {

    public int sampleSum(int a,int b){
        int Sum = a + b;
        log.info("Sum of 2 numbers is "+Sum);
        return Sum;
    }

}
