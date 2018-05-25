package Common;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import static Common.WebDriverHolder.*;
import java.io.*;
import java.text.*;
import java.util.Date;


public class captureScreenshot {

    public static void clearJunkDirectory(){
        deleteFilesInScreenshotDirectory();
        deleteFilesInTestOutputDirectory();}

    public static void deleteFilesInScreenshotDirectory() {
        File file = new File("./ScreenshotsFailure");
        String[] myFiles;
        if(file.isDirectory()){
            myFiles = file.list();
            for (String myFile1 : myFiles) {
                File myFile = new File(file, myFile1);
                myFile.delete();
                log.info("Files in Screenshot Directory: have been deleted successfully");
            }
        }
    }

    public static void deleteFilesInTestOutputDirectory() {
        File file = new File("./test-output");
        String[] myFiles;
        if(file.isDirectory()){
            myFiles = file.list();
            for (String myFile1 : myFiles) {
                File myFile = new File(file, myFile1);
                myFile.delete();
            }
            log.info("Files in test-output Directory: have been deleted successfully");
        }
    }

    public static String captureScreenOnFailure(String testName) throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
        Date date = new Date();
        String time_stamp = dateFormat.format(date);
        String screenShotName = testName+"_"+time_stamp;
        TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
        File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./ScreenshotsFailure/" + screenShotName + ".png");
        FileHandler.copy(scrFile,destFile);
        log.info("Screen shot taken for className "+screenShotName);
        String fileName = "./ScreenshotsFailure/"+screenShotName+".png";
        return fileName;
    }
}
