package Common;

import org.openqa.selenium.By;

import static Common.WebDriverHolder.*;

public class Helpers extends Waiters {

    public void clickElement_xpath(String locator){
        getDriver().findElement(By.xpath(locator)).click();
    }
}
