package Common;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
    public static ExtentReports getInstance() {
        ExtentReports extent;
        String reportPath = "./ExtentReport/execution-status.html";
        extent = new ExtentReports(reportPath, false);
        extent
                .addSystemInfo("Selenium Version", "2.52")
                .addSystemInfo("Platform", "Mac");

        return extent;
    }
}
