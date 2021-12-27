package magicleapTesting;

import gherkin.lexer.Th;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

public class SessionTest {
    public void SessionLaunch(RemoteWebDriver driver, String status) throws InterruptedException {
        try {


            driver.manage().window().maximize();
            //INTERNET STORES
            driver.get("https://www.addnature.fi/");
            Thread.sleep(2000);
            driver.findElementById("onetrust-accept-btn-handler").click();
            driver.findElementByXPath("//*[@id=\"fb750e7f60cceaca83f0d3c1b0\"]/div/div/a").click();
            driver.findElementById("add-to-cart").click();
            driver.findElementByXPath("//*[@id=\"va-49\"]/div[3]").click();
            Thread.sleep(10000);

            WebDriverWait es = new WebDriverWait(driver,30);
            es.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/html/body/header/div/div[1]/div[3]/ul/li[4]/div[3]/div[2]/div[5]/a")));
            driver.findElementByXPath("/html/body/header/div/div[1]/div[3]/ul/li[4]/div[3]/div[2]/div[5]/a").click();
            Thread.sleep(2000);

            es.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/html/body/div[2]/div/main/div/div/div[5]/div[1]/div[2]/div[2]/div/a")));
            driver.findElementByXPath("/html/body/div[2]/div/main/div/div/div[5]/div[1]/div[2]/div[2]/div/a").click();
            Thread.sleep(6000);

            driver.switchTo().frame(driver.findElementById("klarna-checkout-iframe"));
            Thread.sleep(3000) ;
            WebElement billing = driver.findElementById("billing-email");
            WebDriverWait t = new WebDriverWait(driver, 60);
            //t.until(ExpectedConditions.visibilityOf(billing));
            t.until(ExpectedConditions.elementToBeClickable(billing));
            billing.sendKeys("neerajn@lambdatest.com");
//            JavascriptExecutor Js1 = (JavascriptExecutor) driver;
//            Js1.executeScript("window.scrollBy(0,100)");


            driver.findElementById("billing-postal_code").sendKeys("122001");
//    driver.get("https://hertz.com");
//            driver.get("https://qa.boomi.com/");
//
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//            WebDriverWait el = new WebDriverWait(driver,30);
//
//            el.until(ExpectedConditions.visibilityOf(driver.findElementByCssSelector("#gwt-uid-25")));
//
//            driver.findElementByCssSelector("#gwt-uid-25").sendKeys("abc");


//            driver.executeScript("sauce:log", { type: "sauce:network" });

//            driver.get("https://websocket.org/echo.html");
//            driver.findElementById("connect").click();
//            driver.findElementById("send").click();
//            Thread.sleep(5000);
//
//            driver.findElementById("sendMessage").clear();
//            driver.findElementById("sendMessage").sendKeys("This is the 2nd text");
//            driver.findElementById("send").click();
//
//            driver.findElementById("sendMessage").clear();
//            driver.findElementById("sendMessage").sendKeys("This is the 3rd text");
//            driver.findElementById("send").click();


//            driver.get("https://fast.com");
//            Thread.sleep(30000);
//            driver.get("https://platform.boomi.com");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            WebDriverWait el = new WebDriverWait(driver,10);
//            el.until(ExpectedConditions.visibilityOf(driver.findElementById("gwt-uid-25")));
//            driver.findElementById("gwt-uid-25").sendKeys("abc");
//            //

//
//            JavascriptExecutor jse = (JavascriptExecutor)driver;
//            Path path = Paths.get("D:\\Test Suites\\magicleapTesting V\\magicleapTesting\\magicleapTesting\\axe.min.js");
//
//            String content = new String(Files.readAllBytes(path));
//            jse.executeScript(content);
//
//            File output = new File("D:\\Test Suites\\magicleapTesting V\\magicleapTesting\\magicleapTesting\\report.json");
//            FileWriter writer = new FileWriter(output);
//            String result = String.valueOf(jse.executeAsyncScript("var callback = arguments[arguments.length - 1]; axe.run().then(results => callback(results));"));
//            writer.write(result);
//            writer.flush();
//            writer.close();
//            driver.get("https://www.mba.com/");

//            Thread.sleep(5000);
//            driver.findElement(new By.ByXPath("/html/body/header/nav[1]/a[1]")).click();
//            Thread.sleep(5000);
//            driver.findElement(By.id("aLogin")).click();
//            Thread.sleep(5000);

//            driver.get("https://app.lambdatest.com/");
//            Thread.sleep(5000);
//            driver.findElement(By.name("email")).sendKeys("vishnukdas@lambdatest.com");
//
//            driver.findElement(By.name("password")).sendKeys("lambdatest@vkdas");
//            driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
//
//
//            driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
//
////
//            // Input Email id and Password If you are already Register
//            Thread.sleep(5000);
//            driver.findElement(By.name("username")).sendKeys("abc123");
//            driver.findElement(By.name("password")).sendKeys("123xyz");
//            driver.findElement(By.name("submit")).click();
//
//            // create file named Cookies to store Login Information
//            File file = new File("Cookies.data");
//            try
//            {
//                // Delete old file if exists
//                file.delete();
//                file.createNewFile();
//                FileWriter fileWrite = new FileWriter(file);
//                BufferedWriter Bwrite = new BufferedWriter(fileWrite);
//                // loop for getting the cookie information
//
//                // loop for getting the cookie information
//                for(Cookie ck : driver.manage().getCookies())
//                {
//                    Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
//                    Bwrite.newLine();
//                }
//                Bwrite.close();
//                fileWrite.close();
//            }
//            catch(Exception ex)
//            {
//                ex.printStackTrace();
//            }

            System.out.println(driver.getTitle());
            status = "passed";

        } catch (Exception b) {
            status = "failed";
            System.out.println(b+ "-----Test------------"+driver.getSessionId()+"-----------");
        }
//        ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
//        driver.quit();
    }


}

