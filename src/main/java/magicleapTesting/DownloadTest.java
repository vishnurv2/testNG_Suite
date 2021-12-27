package magicleapTesting;

//import netscape.security.UserTarget;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.apache.commons.codec.binary.Base64;

import java.util.Arrays;

public class DownloadTest {

    public void FileDownload(RemoteWebDriver driver, String status) {

        try {

            System.out.println("-----------Download - Test - Start---------------");

            driver.get("https://chromedriver.storage.googleapis.com/index.html?path=2.0/");

            WebElement element = driver.findElement(By.xpath("/html/body/table/tbody/tr[7]/td[2]/a"));
            element.isDisplayed();
            element.click();

            Thread.sleep(10000);
//            Assert.assertEquals(((JavascriptExecutor) driver).executeScript("lambda-file-exists=chromedriver_win32.zip"), true); //file exist check
//            System.out.println("✓ File exists");
            System.out.println("✓ Retriving File Stats : ");
            System.out.print(((JavascriptExecutor) driver).executeScript("lambda-file-stats=chromedriver_win32.zip")); //retrieve file stats

            System.out.println("✓ Base 64 Encoded File content");
            String base64EncodedFile = ((JavascriptExecutor) driver).executeScript("lambda-file-content=chromedriver_win32.zip").toString(); // file content download
            byte[] byteArray = Base64.decodeBase64(base64EncodedFile.getBytes());
            String decodedString = new String(byteArray);
//            System.out.println(base64EncodedFile + " == " + decodedString);
            System.out.println("✓ File content encoded");
            status = "passed";
        } catch (Exception e) {
            System.out.println(e + "---------------------------" + driver.getSessionId());
            status = "failed";
        }
        System.out.println("-----------Download - Test - End ---------------");


    }
}
