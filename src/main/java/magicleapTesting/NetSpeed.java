package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NetSpeed {
    public void NetSpeed(RemoteWebDriver driver, String status, long Nettotalspeedtest) {
        try {
            System.out.println("--------------- NetSpeed - Test - Start ------------------");
            long NetSpeedteststart;
            long NetSpeedteststop;
            NetSpeedteststart = System.currentTimeMillis();


            driver.get("https://in.testmy.net/b/SmarTest/combined");


//            driver.manage().window().maximize();
//            WebElement NetSpeed = driver.findElement(By.id("testBtnMn"));
//            NetSpeed.click();
//            JavascriptExecutor scroll = (JavascriptExecutor) driver;
//            scroll.executeScript("window.scrollBy(0,200)");
//            WebElement StarTesting = driver.findElement(By.xpath("//*[@id=\"testBtn1\"]/div/div[2]/div[1]/a"));
//            StarTesting.click();
            Thread.sleep(50000);
            WebElement DownloadSPeed = driver.findElement(By.xpath("//*[@id=\"home\"]/table/tbody/tr/td/div[2]/div[2]/div/div[1]/h3"));
            DownloadSPeed.isDisplayed();
//            TakeScreenShot shot = new TakeScreenShot();
//            shot.Screenshot(driver, status);
            System.out.println("Download speed of machine" + "  " + DownloadSPeed.getAttribute("innerText") +"-------------"+driver.getSessionId());
            WebElement UploadSpeed = driver.findElement(By.xpath("//*[@id=\"home\"]/table/tbody/tr/td/div[2]/div[2]/div/div[2]/h3"));
            UploadSpeed.isDisplayed();
            System.out.println("Upload Speed of the machine" + "  " + UploadSpeed.getAttribute("innerText") +"-------------"+driver.getSessionId());

            status = "passed";

            NetSpeedteststop = System.currentTimeMillis();
            Nettotalspeedtest = NetSpeedteststop - NetSpeedteststart;
            System.out.println("Total time took to NetSpeed test" + "  " + Nettotalspeedtest / 1000f + "Sec.");

            //}
        } catch (Exception e) {

            status = "failed";
            System.out.println(e.getMessage() + "---------------------------" + driver.getSessionId());
        }
        //System.out.println(driver.getCapabilities());
        System.out.println("----------------------- NetSpeed - Test - End ------------------------");
    }
}
