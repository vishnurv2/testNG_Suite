package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class GeolocationTest {
    public void Geolocation(RemoteWebDriver driver, String status, String geoLocation, long GeolocationTotal) {

        try {

//            long Geolocationstart;
//            long GeolocationStop;
//            Geolocationstart = System.currentTimeMillis();
//            driver.get("https://www.iplocation.net/find-ip-address");
//            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//            Thread.sleep(10000);
//            WebElement ipLocation = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div[5]/div[3]/div/table/tbody/tr[2]/td"));
//            ipLocation.getAttribute("innerText");
//            System.out.println("Location of the machine" + "  " + ipLocation.getAttribute("innerText"));
//            System.out.println("Given Geolocation in the TestSuite " + "    " + geoLocation);
//            status = "passed";
//            GeolocationStop = System.currentTimeMillis();
//            GeolocationTotal = GeolocationStop - Geolocationstart;
//            System.out.println("Total time took for geolocation test" + " " + GeolocationTotal / 1000f + "Sec.");
        } catch (Exception t) {
            System.out.println(t);
        }
        try {
            driver.get("http://ip-api.com/json");
            if (driver.findElement(By.id("rawdata-tab")).isDisplayed()) {
                driver.findElement(By.id("rawdata-tab")).click();
                WebElement location = driver.findElement(By.xpath("/html/body/pre"));
                location.getAttribute("innerText");
                System.out.println("Location of the machine" + "  " + location.getAttribute("innerText"));
                status = "passed";
            } else {
                status = "passed";
                WebElement location = driver.findElement(By.xpath("/html/body/pre"));
                location.getAttribute("innerText");
                System.out.println("Location of the machine" + "  " + location.getAttribute("innerText"));
            }

        } catch (Exception g) {
            System.out.println(g);
            status = "failed";
            WebElement location = driver.findElement(By.xpath("/html/body/pre"));
            location.getAttribute("innerText");
            System.out.println("Location of the machine" + "  " + location.getAttribute("innerText"));


        }

    }

}
