package Common;

public class Waiters {
//    WebDriver driver;
//
//
//    public Waiters(WebDriver driver){
//        this.driver = driver;
//    }
//
//    public WebElement waitForElement(String locator){
//        WebElement element = null;
//        try{
//            System.out.println("Waiting for the element to appear on the screen");
//            WebDriverWait wait = new WebDriverWait(driver,3);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
//        }catch(Exception e){
//            System.out.println("Element not displayed on webpage");
//        }
//        return element;
//    }
//
//    public void clickIfElementClickable(String locator){
//        try{
//            WebElement element = null;
//            System.out.println("Waiting for the element to be clickable on the screen");
//            WebDriverWait wait = new WebDriverWait(driver,3);
//            element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
//            element.click();
//            System.out.println("Element clicked");
//        }catch(Exception e){
//            System.out.println("Element not clickable on webpage");
//        }
//
//    }
//
//    public void waitUntilElementDisplayed_xpath(String locator){
//        WebDriverWait wait = new WebDriverWait(driver,3);
//        WebElement element = getDriver().findElement(By.xpath(locator));
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
}
