package magicleapTesting;


import gherkin.lexer.Th;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.apache.bcel.classfile.SourceFile;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Random {
    public String username = System.getenv("LT_USERNAME");
    public String accesskey = System.getenv("LT_ACCESS_KEY");
    public RemoteWebDriver driver;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    String status;
    String ResolutionValue;
    long quitestoptime;
    long totaltime;
    long totaltimeforlocaltest;
    long Nettotalspeedtest;
    long GeolocationTotal;
    long ResolutionTotal;
    long totaltesttimeDuration;
    SessionId session;
    String browserNameValue;
    String platformVersionValue;
    String platformValueDevice;
    String fixedIpValue;
    String deviceNameValue;
    String geoLocationValue;
    String ResolutionValueCap;

    @org.testng.annotations.Parameters(value = {"browser", "platformVersion", "platform", "fixedIp", "deviceName", "geoLocation"})

    public Random(String browser, String platformVersion, String platform, String fixedIp, String deviceName, String geoLocation) {
        browserNameValue = browser;
        platformVersionValue = platformVersion;
        platformValueDevice = platform;
        fixedIpValue = fixedIp;
        deviceNameValue = deviceName;
        geoLocationValue = geoLocation;


    }


    @BeforeTest
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //  double version = 13.2;
//        ChromeOptions options = new ChromeOptions();

//        String[] command = {"setValues", "setCookies", "getCookies"};
//        capabilities.setCapability("lambdaMaskCommands", command);

//        ChromeOptions options = new ChromeOptions();
//        Map< String, Object > prefs = new HashMap< String, Object >();
//        Map < String, Object > profile = new HashMap < String, Object > ();
//        Map < String, Object > contentSettings = new HashMap < String, Object > ();

        // SET CHROME OPTIONS
        // 0 - Default, 1 - Allow, 2 - Block
//        contentSettings.put("geolocation", 1);
//        profile.put("managed_default_content_settings", contentSettings);
//        prefs.put("profile", profile);
//        options.setExperimentalOption("prefs", prefs);
//        capabilities.setCapability(ChromeOptions.CAPABILITY,options);

//        capabilities.setCapability("platformVersion", this.platformVersionValue);
//        capabilities.setCapability("platform", this.platformValueDevice); // If this cap isn't specified, it will just get the any available one
//        capabilities.setCapability("name", this.platformValueDevice + "   " + this.deviceNameValue + "  " + this.platformVersionValue);
        capabilities.setCapability("build", "Setup");
//        capabilities.setCapability("browser",this.browserNameValue);
//        capabilities.setCapability("os_version", "10.0");
//        capabilities.setCapability("device", "Samsung Galaxy S20");
//        capabilities.setCapability("real_mobile", "true");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Galaxy S10");
//        capabilities.setCapability("platformVersion","9");

//        capabilities.setCapability("browserName","Firefox");
//        capabilities.setCapability("version","89.0");
//        capabilities.setCapability("platform","Big sur");

//        capabilities.setCapability("pageLoadStrategy ","eager");

//        ChromeOptions options = new ChromeOptions();
//        String [] args = {"--disable-web-security"};
//        capabilities.setCapability("chromedriverArgs",args);
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Galaxy S10");
//        capabilities.setCapability("platformVersion","9");
//        capabilities.setCapability("w3c",true);
//    capabilities.setCapability("network",true);
        capabilities.setCapability("autoAcceptAlerts",true);
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 12");
        capabilities.setCapability("platformVersion","14.2");
//        capabilities.setCapability("safariAllowPopups",false);
//        capabilities.setCapability("safari.popups",false);


        //BS CAPS


//        capabilities.setCapability("os", "Windows");
//        capabilities.setCapability("os_version", "10");
//        capabilities.setCapability("browser", "Chrome");
//        capabilities.setCapability("browser_version", "latest");


        //        capabilities.setCapability("platformName","iOS");
//        capabilities.setCapability("browserName","chrome");
   //     capabilities.setCapability("isRealMobile",true);
        //capabilities.setCapability("nativeWebScreenshot",true);
//       capabilities.setCapability("fixedIP", this.fixedIpValue);
//        capabilities.setCapability("deviceName", this.deviceNameValue);
//        capabilities.setCapability("browser_version","62.0");
//        capabilities.setCapability("visual",true);
//        capabilities.setCapability("fixedIP","10.242.32.156");
//        capabilities.setCapability("fixedPort","8000");
//        capabilities.setCapability("safari.cookies",true);
//        capabilities.setCapability("safari.popups",true);
//        capabilities.setCapability("region","eu");
//        capabilities.setCapability("nativeWebTap",true);
//        capabilities.setCapability("geoLocation","UZ");
//
//          capabilities.setCapability("network", true);
//          capabilities.setCapability("console", true);
//        capabilities.setCapability("visual", true);
     //   capabilities.setCapability("language","fr");

//          capabilities.setCapability("isRealMobile", true);
//            capabilities.setCapability("w3c", true);
//        capabilities.setCapability("tunnel", false);

//        capabilities.setCapability("os_version", "14");
//        capabilities.setCapability("device", "iPhone 12");
//        capabilities.setCapability("real_mobile", "true");
//        capabilities.setCapability("browserstack.local", "false");

//        capabilities.setCapability("appiumVersion", "1.17.1");

        //  capabilities.setCapability("autoDismissAlerts", true);

//          capabilities.setCapability("tunnel", true);
      /*  capabilities.setCapability("unicodeKeyboard", false);
        capabilities.setCapability("resetKeyboard", true);*/
      //    capabilities.setCapability("deviceOrientation", "LANDSCAPE");
//        capabilities.setCapability("orientation","");
        //     capabilities.setCapability("appiumVersion", "1.17.1");

        //  capabilities.setCapability("console", true); // To capture console logs
//        capabilities.setCapability("geoLocation", "US");

      //  capabilities.setCapability("newCommandTimeout","");

        //capabilities.setCapability("tunnelName", "prateek");
       /* capabilities.setCapability("os_version", "14");
        capabilities.setCapability("device", "iPhone 11");
        capabilities.setCapability("real_mobile", "true");
        capabilities.setCapability("browserstack.local", "false");
        capabilities.setCapability("browserstack.appium_version", "1.18.0");
        capabilities.setCapability("browserstack.debug", "true");
        capabilities.setCapability("browserstack.networkLogs", "true");
*/


        try {
            StopWatch driverStart = new StopWatch();
            driverStart.start();
            String url = "http://" + username + ":" + accesskey + gridURL;
            System.out.println(url);
            System.out.println(capabilities);
            driver = new AppiumDriver(new URL(url),capabilities);
//            driver = new RemoteWebDriver(new URL(url), capabilities);
            //   session = driver.getSessionId();

            driverStart.stop();
            float timeElapsed = driverStart.getTime() / 1000f;
            System.out.println("Driver Setup time in Seconds " + "  " + timeElapsed + "Sec." + "  " + this.deviceNameValue + "  " + this.fixedIpValue);

        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
//            System.out.println("Test null pointer exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            System.out.println("Test null pointer exception");
        }

    }

    @Test(priority = 1)
    public void DesktopScript() throws IOException {

        try {

            long startTest;
            long stopTest;
            startTest = System.currentTimeMillis();
            StopWatch teststarted = new StopWatch();
            teststarted.start();
//          // -------------------------------------------------------------------------
//            public boolean jsClick(By elementLocator) throws Exception {
//                boolean flag = false;
//                try {
//                    if (driver.findElement(elementLocator).isEnabled()) {
//                        WebDriverWait el = new WebDriverWait(driver,90);
//                        WebElement element = driver.findElement(elementLocator);
//                        JavascriptExecutor executor = (JavascriptExecutor) driver;
//                        el.until(ExpectedConditions.elementToBeClickable(element));
//                        element.click();
////                  executor.executeScript("arguments[0].click();", element);
//                        flag = true;
//                        LOG.info("PASS::Element: " + elementLocator.toString() + " clicked successfully.");
//                    } else {
//                        flag = false;
//                    }
//                } catch (Exception exception) {
//                    flag = false;
//                    LOG.error("FAIL::Element: " + elementLocator.toString() + " could not be clicked due to error: "
//                            + exception.getMessage());
//                    throw new Exception(exception);
//                }
//                return flag;
//            }
//            --------------------------------------------------------------------------
//            driver.get("https://the-internet.herokuapp.com/geolocation");
//            driver.findElement(By.xpath("//*[@id='content']/div/button")).click();
//            Thread.sleep(5000);
//
//
//            driver.findElement(By.id("Allow")).click();
//            uploadTest UPFile = new uploadTest();
//            UPFile.upload(driver, status);

//            driver.get("https://staging.moteefe.com/store/visual_regression_default?locale=en&user_currency=GBP");
//           Thread.sleep(5000);
//           driver.findElementByXPath("//*[@id=\"__next\"]/div[2]/div/div/div[3]/div/div[2]/div[4]/a[1]/div[1]/div").click();
//
//            Thread.sleep(20000);
//
//            driver.quit();
//            NetSpeed NetSpeedTestObject = new NetSpeed();
//            NetSpeedTestObject.NetSpeed(driver, status, Nettotalspeedtest);

//            ChromeBrowserVersion ChromeVersionObject = new ChromeBrowserVersion();
//            ChromeVersionObject.BrowserVersion(driver);


//

//            driver.get("https://uat-app.uat.benefitscaldev.com/");
//            Thread.sleep(35000);
//            WebDriverWait el = new WebDriverWait(driver,40);
//
//            //Apply button
//            WebElement element = driver.findElementByName("applybtn");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("applybtn")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//            element.click();
//            System.out.println("✓ Apply now button clicked");
//            Thread.sleep(15000);
//
//            //Begin button
//            WebElement begin = driver.findElementByName("BeforeWeBegin_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("BeforeWeBegin_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", begin);
//            Thread.sleep(5000);
//            begin.click();
//            System.out.println("✓ Begin button clicked");
//            Thread.sleep(5000);
//
//            //common continue 1
//            WebElement cc1 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc1);
//            Thread.sleep(5000);
//            cc1.click();
//            System.out.println("✓ cc1 button clicked");
//            Thread.sleep(5000);
//
//            //common continue 2
//            WebElement cc2 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc2);
//            Thread.sleep(5000);
//            cc2.click();
//            System.out.println("✓ cc2 button clicked");
//            Thread.sleep(5000);
//
//            //common continue 3
//            WebElement cc3 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc3);
//            Thread.sleep(5000);
//            cc3.click();
//            System.out.println("✓ cc3 button clicked");
//            Thread.sleep(5000);
//
//            //start
//            WebElement start = driver.findElementByXPath("/html/body/div[1]/div/div/div/section/main/div/div[2]/section/section/div[2]/div/div/div[2]/div/div/div[3]/button");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/html/body/div[1]/div/div/div/section/main/div/div[2]/section/section/div[2]/div/div/div[2]/div/div/div[3]/button")));
//            start.click();
//            System.out.println("✓ Start button clicked");
//            Thread.sleep(5000);
//
//            //common continue 4
//            Thread.sleep(5000);
//            el.until(ExpectedConditions.presenceOfElementLocated(By.name("common_continue")));
//            WebElement cc4 = driver.findElementByName("common_continue");
//           ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc4);
//            Thread.sleep(5000);
//            cc4.click();
//            System.out.println("✓ cc4 button clicked");
//            Thread.sleep(5000);
//
//            //Enter Values YOUR INFORMATION
//            driver.findElementById("text1").sendKeys("Sample");
//            System.out.println("✓ Text entered 'Sample'");
//            driver.findElementById("text3").sendKeys("Text");
//            System.out.println("✓ Text entered 'Text'");
//            driver.findElementByXPath("//*[@id=\"suffix\"]/option[2]").click();
//            WebElement cc5 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc5);
//            cc5.click();
//            System.out.println("✓ cc5 button clicked");
//            Thread.sleep(5000);
//
//
//            //cc6
//            driver.findElementById("disability0").click();
//            System.out.println("✓ Disability selected 'Yes'");
//            WebElement cc6 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc6);
//            cc6.click();
//            System.out.println("✓ cc6 button clicked");
//            Thread.sleep(5000);
//
//            //homelessness
//            driver.findElementById("label_1").click();
//            System.out.println("✓ Selected 'No'");
//            Thread.sleep(2000);
//            WebElement cc7 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc7);
//            cc7.click();
//            System.out.println("✓ cc7 button clicked");
//            Thread.sleep(5000);
//
//            //Address
//
//            driver.findElementById("addressLine1").sendKeys("101 street 2B");
//            System.out.println("✓ Entered Address");
//            driver.findElementById("city").sendKeys("Houston");
//            System.out.println("✓ City");
//            driver.findElementByXPath("//*[@id=\"county\"]/option[39]").click();
//            System.out.println("✓ Selected county");
//            driver.findElementById("zip5").sendKeys("77001");
//            System.out.println("✓ Added Zip Code");
//            Thread.sleep(2000);
//            WebElement cc8 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc8);
//            Thread.sleep(2000);
//
//            cc8.click();
//            System.out.println("✓ cc8 button clicked");
//            Thread.sleep(5000);

//            //cc9
//            WebElement cc9 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc9);
//            cc9.click();
//            System.out.println("✓ cc9 button clicked");
//            Thread.sleep(5000);
//
//            //check box
//            driver.findElementById("medicaid").click();
//            System.out.println("✓ Health coverage checked");
//            WebElement cc10 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc10);
//            cc10.click();
//            System.out.println("✓ cc10 button clicked");
//            Thread.sleep(5000);
//
//            //cc11
//            WebElement cc11 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc11);
//            cc11.click();
//            System.out.println("✓ cc11 button clicked");
//            Thread.sleep(5000);
//
//
//            //cc12
//            WebElement cc12 = driver.findElementByName("common_continue");
//            el.until(ExpectedConditions.elementToBeClickable(driver.findElementByName("common_continue")));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cc12);
//            cc12.click();
//            System.out.println("✓ cc12 button clicked");
//            Thread.sleep(5000);







//            SessionTest2 SessionTestObject = new SessionTest2();
//            SessionTestObject.SessionLaunch(driver, status);
//            TodoApp TodoAppTestObject = new TodoApp();
//            TodoAppTestObject.TodoAppTest(driver);
//            StreamTest YouTubeStream = new StreamTest();
//            YouTubeStream.TestStream(driver, status);

          /*  for (int i = 0; i < 1; i++) {
                TodoApp TodoAppTestObject = new TodoApp();
                TodoAppTestObject.TodoAppTest(driver);
                StreamTest YouTubeStream = new StreamTest();
                YouTubeStream.TestStream(driver, status);

            }*/
         /*   ResolutionTest ResolutionTestObject = new ResolutionTest();
            ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap);*/
          /*  TunnelTest TunnelTestObject = new TunnelTest();
            TunnelTestObject.tunnelTest(driver, status, totaltimeforlocaltest); */
         //   driver.manage().deleteAllCookies();
//            driver.get("https://google.com");

//            driver.executeScript("window.open('https://google.com')");

//            driver.findElementByCssSelector("body > footer > div > div:nth-child(1) > div.col-12.col-sm-12.col-md-7.footerMainMenucol > div > div:nth-child(1) > ul > li:nth-child(3) > a").click();

//            Thread.sleep(5000);
//            driver.getTitle();
//            Thread.sleep(10000);

/*
                System.out.println(Tunnel);
                if (this.Tunnel.matches("true")) {

                }*/

               /* NetSpeed NetSpeedTestObject = new NetSpeed();
                NetSpeedTestObject.NetSpeed(driver, status, Nettotalspeedtest);
*/
          /*  UserTest UserTestObject = new UserTest();
            UserTestObject.TestCase(driver, status);*/

          /*  AnroidVersion AndVerObj = new AnroidVersion();
            AndVerObj.AndVersion(driver, deviceNameValue, platformVersionValue);
            ChromeBrowserVersion ChromeVersionObject = new ChromeBrowserVersion();
            ChromeVersionObject.BrowserVersion(driver, deviceNameValue, platformVersionValue);*/
          /*  GeolocationTest GeoObject = new GeolocationTest();
            GeoObject.Geolocation(driver, status, geoLocationValue, GeolocationTotal);*/
            stopTest = System.currentTimeMillis();
            totaltime = stopTest - startTest;

            System.out.println("Time taken by the test to execute" + "    " + totaltime / 1000f + "Sec.");
        } catch (Exception y) {
            status = "failed";
            System.out.println(y);
              /*  File filetwo = driver.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(filetwo, new File("myScreenshot.png"));*/
        }


    }

    @AfterTest
    @org.testng.annotations.Parameters(value = {"browser", "platformVersion", "platform", "fixedIp", "deviceName", "geoLocation"})

    public void tearDown(String browser, String platformVersion, String platform, String fixedIp, String deviceName, String geoLocation) throws Exception {
        try {
            long quitetimestart;
            long quitetimestop;

            quitetimestart = System.currentTimeMillis();

            if (driver != null) {

                // System.out.println(driver + "Session ID" + "  " + session.toString());
//                ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);

                driver.quit();

                status = "passed";
            } else {
                status = "failed";
            }
            quitestoptime = System.currentTimeMillis();
            quitetimestop = quitestoptime - quitetimestart;
//            System.out.println(deviceName + "  " + browser + "  " + platformVersion + "   " + fixedIp + "\n" + "Driver Quite time" + "   " + quitetimestop / 1000f + "Sec.");
        } catch (Exception T) {
            System.out.println(T);
        }

    }
}

