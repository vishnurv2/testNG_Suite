package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class ResolutionTest {

    public void Resolution(RemoteWebDriver driver, String ResolutionValue, String status, long ResolutionTotal, String ResolutionValueCap) {
        try {

            System.out.println("-----------------Resolution - Test - Start ----------------------");
            long ResolutionStart;
            long ResolutionStop;

            ResolutionStart = System.currentTimeMillis();

            driver.get("http://whatismyscreenresolution.net/");
            // for (int i = 0; i < 50; i++) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"resolution\"]")).isDisplayed();
            WebElement browserResolution = driver.findElement(By.xpath("//*[@id=\"resolution\"]"));
            browserResolution.isDisplayed();
            browserResolution.getAttribute("innerText");

            ResolutionValue = browserResolution.getAttribute("innerText");
            ResolutionValue.trim().replaceAll("\\s", "");
            System.out.println("Given resolution in capabilities" + "  " + ResolutionValueCap);

            System.out.println("Resolution value get from the Website " + " " + browserResolution.getAttribute("innerText"));
            if (ResolutionValueCap.equalsIgnoreCase(ResolutionValue)) {


                status = "passed";
                System.out.println("Resolution Matched");
            } else {

                System.out.println("Resolution does not Matched");
                status = "failed";

            }


            ResolutionStop = System.currentTimeMillis();
            ResolutionTotal = ResolutionStop - ResolutionStart;
            System.out.println("Total time took for resolution" + "  " + ResolutionTotal / 1000f + "Sec.");
//            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);


            //}
        } catch (Exception R) {
            System.out.println(R + "---------------------------" + driver.getSessionId());
        }
        System.out.println("-----------------Resolution - Test - End ----------------------");

    }
}
