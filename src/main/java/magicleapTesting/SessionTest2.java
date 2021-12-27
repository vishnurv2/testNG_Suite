package magicleapTesting;

import com.sun.net.httpserver.BasicAuthenticator;
import gherkin.lexer.Th;
import org.apache.http.impl.client.BasicAuthCache;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SessionTest2 {
    public void SessionLaunch(RemoteWebDriver driver, String status) throws InterruptedException {
        try {
//
//            driver.get("https://business.twitter.com/start-advertising");
//
//            driver.findElementByXPath("//*[@id=\"u12b\"]/div/div/div[2]/ul/li[1]/button").click();
//            // considering that there is only one tab opened in that point.
//            String oldTab = driver.getWindowHandle();
//            WebElement about = driver.findElement(By.xpath("/html/body/div/div[6]/footer/div/div/div[1]/div/div[2]/ul/li[1]/a"));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", about);
//            about.click();
//
//            ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
//            newTab.remove(oldTab);
//
//            // change focus to new tab
//            driver.switchTo().window(newTab.get(0));
//            System.out.println("NewTab Title : " +driver.getTitle());
//
//          //   Do what you want here, you are in the new tab
//            driver.close();
//            // change focus back to old tab
//            driver.switchTo().window(oldTab);
//            System.out.println("Old Tab title : "+ driver.getTitle());

//            BASIC AUTH -----------------------------------------------------------------
//            driver.executeScript("lambda-set-clipboard:lambda");
//            driver.get("https://ww.lambdatest.com");
//            Thread.sleep(2000);
//            driver.executeScript("lambda-perform-keyboard-events:^v");
//            Thread.sleep(2000);
//            driver.executeScript("lambda-perform-keyboard-events:{TAB}");
//            Thread.sleep(2000);
//            driver.executeScript("lambda-set-clipboard:lambdatest123");
//            Thread.sleep(2000);
//            driver.executeScript("lambda-perform-keyboard-events:^v");
//            Thread.sleep(2000);
//            driver.executeScript("lambda-perform-keyboard-events:{ENTER}");
//            status = "passed";


            System.out.println("-----------Session - Test - Start ---------------");

//            driver.get("https://atb.com/");
//
//            WebDriverWait el = new WebDriverWait(driver,40);
//
//            WebElement element1 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[2]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[2]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element1);
//            element1.isDisplayed();
//            element1.click();
//            System.out.println("✓ Click");
//
//            WebElement element2 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[3]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[3]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element2);
//            element2.isDisplayed();
//            element2.click();
//            System.out.println("✓ Click");
//
//
//            WebElement element4 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[5]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[5]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element4);
//            element4.isDisplayed();
//            element4.click();
//            System.out.println("✓ Click");
//
//            WebElement element5 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[6]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[6]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element5);
//            element5.isDisplayed();
//            element5.click();
//            System.out.println("✓ Click");
//
//            WebElement element6 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[7]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[7]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element6);
//            element6.isDisplayed();
//            element6.click();
//            System.out.println("✓ Click");
//
//            WebElement element7 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[9]/a/span/i");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[9]/a/span/i")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element7);
//            element7.isDisplayed();
//            element7.click();
//            System.out.println("✓ Click");
//
//            WebElement element8 = driver.findElementByXPath("//*[@id=\"content\"]/section[1]/div/div/div/div/div[2]/input");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"content\"]/section[1]/div/div/div/div/div[2]/input")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element8);
//            element8.isDisplayed();
//            element8.sendKeys("Mary Ellen Neilson");
//            System.out.println("✓ Enter Text 'Mary Ellen Neilson'");
//
//            WebElement element9 = driver.findElementByXPath("//*[@id=\"content\"]/section[1]/div/div/div/div/div[3]/span/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"content\"]/section[1]/div/div/div/div/div[3]/span/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element9);
//            element9.isDisplayed();
//            element9.click();
//            System.out.println("✓ Click");
//
//            WebElement element10 = driver.findElementByXPath("//*[@id=\"header-nav-primary\"]/div/div/nav/ul/li[2]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-primary\"]/div/div/nav/ul/li[2]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element10);
//            element10.isDisplayed();
//            element10.click();
//            System.out.println("✓ Click");
//
//            WebElement element11 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[2]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[2]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element11);
//            element11.isDisplayed();
//            element11.click();
//            System.out.println("✓ Click");
//
//            WebElement element12 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[3]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[3]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element12);
//            element12.isDisplayed();
//            element12.click();
//            System.out.println("✓ Click");
//
//            WebElement element13 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[4]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[4]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element13);
//            element13.isDisplayed();
//            element13.click();
//            System.out.println("✓ Click");
//
//
//            WebElement element14 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[5]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[5]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element14);
//            element14.isDisplayed();
//            element14.click();
//            System.out.println("✓ Click");
//
//            WebElement element15 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[6]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[6]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element15);
//            element15.isDisplayed();
//            element15.click();
//            System.out.println("✓ Click");
//
//            WebElement element16 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[7]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[7]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element16);
//            element16.isDisplayed();
//            element16.click();
//            System.out.println("✓ Click");
//
//            WebElement element17 = driver.findElementByXPath("//*[@id=\"footer\"]/nav/div[1]/section[1]/ul/li[3]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"footer\"]/nav/div[1]/section[1]/ul/li[3]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element17);
//            element17.click();
//            System.out.println("✓ Click");
//
//            WebElement element18 = driver.findElementByXPath("//*[@id=\"find-a-branch-search-bar\"]");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"find-a-branch-search-bar\"]")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element18);
//            element18.sendKeys("43001");
//            System.out.println("✓ Enter value '43001'");
//
//
//
//            WebElement element19 = driver.findElementByXPath("//*[@id=\"footer\"]/nav/div[1]/section[1]/ul/li[3]/a/span");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"footer\"]/nav/div[1]/section[1]/ul/li[3]/a/span")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element19);
//            element19.click();
//            System.out.println("✓ Click");
//
//
//            WebElement element20 = driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[1]/a");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[1]/a")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element20);
//            element20.click();
//            System.out.println("✓ Click");





            driver.get("https://www.seleniumeasy.com/test/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[2]/a")).click();
            driver.findElement(By.id("btn_basic_example")).click();

            Thread.sleep(5000);
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,300)");
            driver.findElement(By.linkText("Simple Form Demo")).click();
            driver.findElement(By.id("user-message")).sendKeys("This is me noob doing practice to being expert");
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")).click();
            driver.findElement(By.id("sum1")).sendKeys("9582");
            driver.findElement(By.id("sum2")).sendKeys("9582");
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
            System.out.println(driver.findElement(By.id("displayvalue")).getAttribute("innterText"));
            driver.findElement(By.linkText("Input Forms")).click();
            driver.findElement(By.linkText("Checkbox Demo")).click();
            driver.findElement(By.id("isAgeSelected")).click();
            scroll.executeScript("window.scrollBy(0,300)");
            driver.findElement(By.id("check1")).click();
            driver.findElement(By.linkText("Date pickers")).click();
            driver.findElement(By.linkText("Bootstrap Date Picker")).click();
            driver.findElement(By.className("input-group-addon")).click();
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tfoot/tr[1]/th")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div/div/input[1]")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div/div/input[1]")).sendKeys("01/02/2021");
            driver.findElement(By.linkText("Date pickers")).click();
            driver.findElement(By.linkText("JQuery Date Picker")).click();
            driver.findElement(By.name("from")).click();
            driver.findElement(By.linkText("15")).click();
            driver.findElement(By.name("to")).click();
            driver.findElement(By.linkText("25")).click();





//

//            Thread.sleep(3000);
         //   driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[2]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[3]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[4]/a/span")).click();
//            Thread.sleep(3000);
            //driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[5]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[6]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[7]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[9]/a/span/i")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div/div/div[2]/input")).sendKeys("Mary Ellen Neilson");
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div/div/div[3]/span/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-primary\"]/div/div/nav/ul/li[2]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[2]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[3]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[4]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[5]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[6]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[7]/a/span")).click();
//            Thread.sleep(3000);
//            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//            driver.findElement(By.xpath("//*[@id=\"footer\"]/nav/div[1]/section[1]/ul/li[3]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"find-a-branch-search-bar\"]")).sendKeys("43001");
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"footer\"]/nav/div[1]/section[1]/ul/li[3]/a/span")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"header-nav-secondary\"]/div/div/nav/ul/li[1]/a")).click();
//            Thread.sleep(3000);

            status = "passed";
        } catch (Exception b) {
            status = "failed";
            System.out.println(b + "---------------------------" + driver.getSessionId());
        }
        System.out.println("-----------Session - Test - End ---------------");
//        driver.quit();
    }


}


//            driver.get("https://www.peacocktv.com/signin");
//
//            Thread.sleep(2000);
//            driver.findElementByName("userIdentifier").sendKeys("testing");
//            driver.findElementByName("password").sendKeys("test");
//
//            driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/div/div/form/div[5]/button")).click();
//
//            Thread.sleep(5000);

//            driver.get("chrome://settings/clearBrowserData");
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            WebElement ele = (WebElement) js.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(8) > settings-privacy-page\").shadowRoot.querySelector(\"settings-clear-browsing-data-dialog\").shadowRoot.querySelector(\"* /deep/ #clearBrowsingDataConfirm\")");
//            js.executeScript("arguments[0].click();", ele);
//

//                driver.get("https://staging.secure-payment.moona.com/checkout");
//                driver.manage().window().maximize();
//                driver.findElementByName("simulate").click();
////                Thread.sleep(5000);
//                driver.findElementByName("go-to-pay-button").click();
//                Thread.sleep(5000);
//
//                driver.getSessionId();

//            driver.switchTo().frame("__privateStripeFrame3695");
//            driver.findElementByName("cardnumber").sendKeys("1234098712340987");
//                Thread.sleep(5000);
//            driver.quit();
