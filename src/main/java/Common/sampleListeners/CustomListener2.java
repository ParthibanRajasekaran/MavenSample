package Common.sampleListeners;

import Common.ExtentFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static Common.WebDriverHolder.log;
import static Common.captureScreenshot.captureScreenOnFailure;
import static Common.captureScreenshot.clearJunkDirectory;

public class CustomListener2 implements ITestListener {

    private long startTime;
    private String testCaseName;

    ExtentReports report;
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        report = ExtentFactory.getInstance();
        testCaseName = result.getName();
        test = report.startTest("Test Case Name :"+testCaseName, testCaseName+" is being executed now");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(LogStatus.PASS,result.getName());
        //Reporter.log("Test Case :"+result.getName()+" has PASSED successfully",true);
        report.endTest(test);
        report.flush();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String screenshotPath = null;
        try {
            screenshotPath = captureScreenOnFailure(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String imagePath = test.addScreenCapture(screenshotPath);
        test.log(LogStatus.FAIL,result.getName(), imagePath);
        System.out.println("Image path is : "+imagePath);
        //Reporter.log("Test Case :"+result.getName()+" has FAILED ",true);
        report.endTest(test);
        report.flush();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        report.endTest(test);
        report.flush();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        clearJunkDirectory();
        startTime = System.currentTimeMillis();
    }

    @Override
    public void onFinish(ITestContext context) {
        log.info("Test suite: " +context.getName()+ " execution has been completed and took around " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

