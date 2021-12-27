package magicleapTesting;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.BeforeTest;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

//import com.lambdatest.tunnel.Tunnel;

public class magicLeap {
    // stage = mSAoW7DC449kuIz9mk0uYRpS6hgxpHqlgc1eRzXXPFNUChd0nZ

    public String username = System.getenv("LT_USERNAME"); 
    public String accesskey = System.getenv("LT_ACCESS_KEY");
    public RemoteWebDriver driver;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    String status;
    String ResolutionValue;
//    Tunnel t;


    long quitestoptime;
    long totaltime;
    long totaltimeforlocaltest;
    long Nettotalspeedtest;
    long GeolocationTotal;
    long ResolutionTotal;
    long totaltesttimeDuration;
    SessionId session;
    String BrowserValue;
    String versionValue;
    String PlatformValue;
    String FixedIpValue;
    String ResolutionValueCap;
    String TimeZoneValue;
    String GeoLocationValue;
    String hub;
    String TestName;
    String Space = "  ";
    String Tunnel;
    String AllVersions = null;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();


    @org.testng.annotations.Parameters(value = {"browser", "version", "platform", "fixedIp", "resolution", "timezone", "geoLocation", "tunnel"})
    public magicLeap(String browser, String version, String platform, String fixedIp, String resolution, String timezone, String geoLocation, String tunnel) {
        try {

//            create tunnel instance
//            t = new Tunnel();
//            HashMap<String, String> options = new HashMap<String, String>();
//            options.put("user", username);
//            options.put("key", accesskey);
//            //start tunnel
//            t.start(options);


            BrowserValue = browser;
            versionValue = version;
            PlatformValue = platform;
            FixedIpValue = fixedIp;
            ResolutionValueCap = resolution;
            TimeZoneValue = timezone;
            GeoLocationValue = geoLocation;
            Tunnel = tunnel;
            if (BrowserValue != null) {
                TestName = BrowserValue;
                if (PlatformValue != null) {
                    TestName = BrowserValue + Space + PlatformValue;
                    if (versionValue != null) {
                        TestName = BrowserValue + Space + PlatformValue + Space + versionValue;
                        if (FixedIpValue != null)
                            TestName = BrowserValue + Space + PlatformValue + Space + versionValue;

                    }
                }
            }

        } catch (Exception t) {
        }
    }

    @BeforeTest
    public void setUp() throws Exception {
//        System.out.println(this.versionValue);
        for (int i = 1; i < 240; i++) {
            for (int j = 0; j < 1; j++) {
//        for (int i = 0; i < 1; i++) {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        try {
//            String[] firefoxextention = {"https://automation-prod-user-files.s3.amazonaws.com/extensions/orgId-32518/firefox.zip"};
//            String[] chromeextention = {"https://automation-prod-user-files.s3.amazonaws.com/extensions/orgId-32518/surfmeter_lab-1.6.2.zip"};
//
//            if (this.BrowserValue.matches("Chrome") || this.BrowserValue.matches("chrome"))
//            {
//                capabilities.setCapability("lambda:loadExtension", chromeextention);
//
//            }else if (this.BrowserValue.matches("Firefox") || this.BrowserValue.matches("firefox"))
//            {
//                FirefoxProfile profile = new FirefoxProfile();
//                profile.setPreference("browser.download.manager.showWhenStarting", false);
//                profile.setPreference("browser.download.dir", "C:\\Users\\ltuser\\Downloads");
//                profile.setPreference("browser.download.downloadDir", "C:\\Users\\ltuser\\Downloads");
//                profile.setPreference("browser.download.defaultFolder", "C:\\Users\\ltuser\\Downloads");
//                profile.setPreference("browser.download.manager.closeWhenDone", true);
//                profile.setPreference("pdfjs.disabled", true);
//                profile.setPreference("browser.helperApps.alwaysAsk.force", false);
//                profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/xls, application/zip,text/csv,application/msword,application/excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/pdf," +
//                        "application/vnd.ms-excel,application/msword,application/unknown,application/vnd.openxmlformats-officedocument.wordprocessingml.document");
//                capabilities.setCapability(FirefoxDriver.PROFILE,profile);
//
//                capabilities.setCapability("lambda:loadExtension", firefoxextention);
//            }


//            String networkconfig[] = {"bypassWebsocket:true"};

//            HashMap<String, Boolean> options = new HashMap<>();
//            options.put("bypassWebsocket",true);
//            capabilities.setCapability("networkConfig",options);



//            ChromeOptions options = new ChromeOptions();
//            options.setExperimentalOption("w3c",true);
//            options.addArguments("--start-incognito");


//            if (this.BrowserValue.matches("Safari") && this.PlatformValue.matches("Big Sur"))
//            {
//                capabilities.setCapability("version","14.0");
//            } else if (this.BrowserValue.matches("Safari") && this.PlatformValue.matches("Catalina"))
//            {
//                capabilities.setCapability("version","13.0");
//            } else if (this.BrowserValue.matches("Internet Explorer"))
//            {
//                capabilities.setCapability("version","11.0");
//            }
//            else
//            {
//                capabilities.setCapability("version", "latest" + "-" + j);
//            }
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//
//            capabilities.setCapability("version", "latest" + "-" + j);

//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("deviceName", "Google Pixel 2");
//            capabilities.setCapability("platformVersion","9");


//                MutableCapabilities sauceOptions = new MutableCapabilities();
//                sauceOptions.setCapability("extendedDebugging",true);
//                sauceOptions.setCapability("tunnelIdentifier","asad360logica_tunnel_id");
//                ChromeOptions browserOptions = new ChromeOptions();
////                browserOptions.setExperimentalOption("w3c", true);
//            capabilities.setCapability("fixedIP","10.244.32.133");
//                browserOptions.setCapability("platformName", "Windows 10");
//                browserOptions.setCapability("browserVersion", "latest");
//                browserOptions.setCapability("sauce:options", sauceOptions);
//                DesiredCapabilities caps = new DesiredCapabilities();
//                caps.setCapability("os", "Windows");
//                caps.setCapability("os_version", "10");
//                caps.setCapability("browser", "Chrome");
//                caps.setCapability("browser_version", "latest");
////                caps.setCapability("browserstack.local", "false");
//                caps.setCapability("browserstack.networkLogs", "true");
//                capabilities.setCapability("enableNetworkThrottling", true);

            capabilities.setCapability("browserName", "Chrome");
            capabilities.setCapability("version","latest");
//                    capabilities.setCapability("version", "latest" + "-" + j);
//            capabilities.setCapability("platform", "");
            capabilities.setCapability("platformName","Windows 10");
//            capabilities.setCapability("selenium_version","3.141.59");
//            String[] file = {"2.jpg"};
//            capabilities.setCapability("lambda:userFiles", file);
//                capabilities.setCapability("tunnel",true);
//                capabilities.setCapability("tunnelName","Vishnu");
//                capabilities.setCapability("build","Start_MAP FIP - 2");
//                capabilities.setCapability("fixedIP","10.242.32.153");
//                capabilities.setCapability("tunnel",true);
//                capabilities.setCapability("network",true);
//                 capabilities.setCapability("fixedIP",this.FixedIpValue);
//                capabilities.setCapability("build","Tab");
//                capabilities.setCapability("queueTimeout", 300);
////                capabilities.setCapability("os_version","10");
//                capabilities.setCapability("resolution", "2560x1440");
//                capabilities.setCapability("unboundRegion", "ProductionEU2-PUSE2");

//                String[] Tags = {this.PlatformValue, this.versionValue};
//                capabilities.setCapability("tags", Tags);
//
//                String[] buildTagList = {"Dark Hub","2"};
//                capabilities.setCapability("buildTags", buildTagList);

//            capabilities.setCapability("unexpectedAlertBehaviour","ignore");
//
//            String[] command = {"setValues", "setCookies", "getCookies"};
//            capabilities.setCapability("lambdaMaskCommands", command);
//
//                InternetExplorerOptions options = new InternetExplorerOptions();
//                options.useCreateProcessApiToLaunchIe();
//                options.addCommandSwitches("-private");
//                options.destructivelyEnsureCleanSession();

//                capabilities.merge(options);
//            capabilities.setCapability("geoLocation","US");
//            capabilities.setCapability("tunnel",true);
//            capabilities.setCapability("console", true);
//            capabilities.setCapability("network", true);
//            capabilities.setCapability("video", true);
//            capabilities.setCapability("visual", true);
//            capabilities.setCapability("idleTimeout","600");
//            capabilities.setCapability("tunnel", true);
//            capabilities.setCapability("tunnelName","Vishnu");
//            capabilities.setCapability("headless", true);
            capabilities.setCapability("name","Windows 10 - " + ":  Count : " + i);
//            capabilities.setCapability("build","Loc");
//            capabilities.setCapability("region","us");
//            capabilities.setCapability("dedicatedProxy", true);
//                capabilities.setCapability("build","Download H");
             capabilities.setCapability("build", "IS"); //+" ("+ dtf.format(now) +")"
//            capabilities.setCapability("ie.compatibility",11001);

//          capabilities.setCapability("performance",true);
//          capabilities.setCapability("fixedIP", "10.242.32.71");
//          capabilities.setCapability("region","us");


//            options.addArguments("ignore-certificate-errors");
//            options.addArguments("enable-automation");

//            FirefoxOptions options = new FirefoxOptions();
//            options.setCapability("platform","Windows 7");
//            FirefoxProfile profile = new FirefoxProfile();
//
//            profile.addExtension(new File("D:\\Test Suites\\magicleapTesting V\\magicleapTesting\\magicleapTesting\\firefox.zip"));
//
//            options.setProfile(profile);
            //BS caps

//           capabilities.setCapability("os", "OS X");
//           capabilities.setCapability("os_version", "Big Sur");
//           capabilities.setCapability("browserstack.networkLogsOptions",networkLogsOptions);
//           capabilities.setCapability("browserstack.autoWait",35);
//           capabilities.setCapability("browserstack.console","verbose");
//           capabilities.setCapability("browserstack.debug","true");
//           capabilities.setCapability("browserstack.local","true");


//            options.setCapability("nativeEvents",true);
//            capabilities.setCapability("lambda:loadExtension", firefoxextention);


//            capabilities.setCapability("acceptInsecureCerts","true");
//            capabilities.setCapability("chrome.driver","2.34");
//            capabilities.setCapability("selenium_version","3.141.59");
//              capabilities.setCapability("version","latest");
//            capabilities.setCapability("network",true);
//            capabilities.setCapability("project","P1");
//            options.setExperimentalOption("mobileEmulation","iPhone X");
//            capabilities.setCapability("ie.driver", "2.53.1");


//            {Mobile Emulation}
//            Map<String, String> mobileEmulation = new HashMap<>();
//            mobileEmulation.put("deviceName", "iPhone X");
//            options.setExperimentalOption("mobileEmulation", mobileEmulation);
//


////            Auth Token for video Sharing
//            MessageDigest m= MessageDigest.getInstance("MD5");
//            String s = "vishnukdas:D3tRgjqJOrG7GKCmdIkafAP7uUbPfiK3SaWXTWdjX3vhglk2yd";
//            m.update(s.getBytes(),0,s.length());
//            System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16));


//            capabilities.setCapability("network.har", true);
//            capabilities.setCapability("idleTimeout","180");
//            capabilities.setCapability("ie.compatibility","");
//            capabilities.setCapability("unexpectedAlertBehaviour","accept");
//            capabilities.setCapability("safari.cookies", true);
//            capabilities.setCapability("w3c",true);
//            capabilities.setCapability("seleniumVersion", "3.0.1");


        /*  System.out.println(Tunnel);
            if (this.Tunnel.matches("true")) {

               RunTunnelListener TunnelInitateObjectToStart= new RunTunnelListener();
               TunnelInitateObjectToStart.onExecutionStart();
               Thread.sleep(20000);
               capabilities.setCapability("tunnel", "true");
            }*/

//                 capabilities.setCapability("unboundRegion", "PUSE-EU");
//                 capabilities.setCapability("timezone", this.TimeZoneValue);
//                 capabilities.setCapability("geoLocation", this.GeoLocationValue);
//                 capabilities.setCapability("headless", true);
//                 capabilities.setCapability("networkThrottling", "Regular 4G");
//                 capabilities.setCapability("prerun", "lambda:BasicAuthChrome/pre/httpdialog.au3");
//                 String[] Tags = new String[]{"myproject", "myproject2","myproject3"};
//                 capabilities.setCapability("tags", Tags);


            StopWatch driverStart = new StopWatch();
            driverStart.start();

            hub = "https://" + username + ":" + accesskey + gridURL;
//            hub="http://localhost:4444/wd/hub";


           driver = new RemoteWebDriver(new URL(hub), capabilities);

            System.out.println(capabilities);

//            driver.manage().window().maximize();

            magicLeap test = null;

            session = driver.getSessionId();
            System.out.println("------------------" + session + "--------------------");
//                DesktopScript();

//                tearDown(test.versionValue,this.PlatformValue,this.versionValue,status);
            // session = driver.getSessionId();

//            System.out.println(driver + "Session ID" + "  " + session.toString() + "\n" + browser + version + "\n" + fixedIp);
            driverStart.stop();

            float timeElapsed = driverStart.getTime() / 1000f;
            System.out.println("Driver initiate time" + "   " + timeElapsed);
            DesktopScript();
            tearDown();

        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception f) {
            status = "failed";
            System.out.println(f);
            // System.out.println(f.getMessage() + browser + version + fixedIp);
        }
            }
        }

    }

//    @Test
    public void DesktopScript() {
        try {

            SessionTest SessionTestObject = new SessionTest();
            SessionTestObject.SessionLaunch(driver, status);

//            SessionTest2 SessionTest2Object = new SessionTest2();
//            SessionTest2Object.SessionLaunch(driver, status);

//            DownloadTest DownloadTestObject = new DownloadTest();
//            DownloadTestObject.FileDownload(driver, status);
//

//            uploadTest UPFile = new uploadTest();
//            UPFile.upload(driver, status);

//
//            TodoApp TodoAppTestObject = new TodoApp();
//            TodoAppTestObject.TodoAppTest(driver, status);
//
//            NetSpeed NetSpeedTestObject = new NetSpeed();
//            NetSpeedTestObject.NetSpeed(driver, status, Nettotalspeedtest);

//            UserTest UserTestObject= new UserTest();
//            UserTestObject.TestCase(driver,status);

//            GeolocationTest Geolocationobject = new GeolocationTest();
//            Geolocationobject.Geolocation(driver, status, GeoLocationValue, GeolocationTotal);

//            ResolutionTest ResolutionTestObject = new ResolutionTest();
//            ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap);
//
//            StreamTest StreamTestObject = new StreamTest();
//            StreamTestObject.TestStream(driver, status);


//            TunnelTest TunnelTestObject = new TunnelTest();
//            TunnelTestObject.tunnelTest(driver, status, totaltimeforlocaltest);
//            System.out.println(Tunnel);

          /*  for (int i = 0; i < 15; i++) {
                TodoApp TodoAppTestObject = new TodoApp();
                TodoAppTestObject.TodoAppTest(driver);
                ResolutionTest ResolutionTestObject = new ResolutionTest();
                ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap);

            }
            */

            /*if (this.Tunnel.matches("true")) {
                TunnelTest TunnelTestObject = new TunnelTest();
                TunnelTestObject.tunnelTest(driver, status, totaltimeforlocaltest);
            }*/

//            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e + "------------------" + driver.getSessionId() + "------------------");
        }
    }


    //    @AfterTest
//    @org.testng.annotations.Parameters(value = {"browser", "version", "platform"})
    public void tearDown() throws Exception {
        long quitetimestart;
        long quitetimestop;

        quitetimestart = System.currentTimeMillis();

        if (driver != null) {
            System.out.println(driver + "Session ID" + " ------- " + session.toString());
//            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            driver.quit();
//            RunTunnelListener TunnelInitateObjectToStop = new RunTunnelListener();
//            TunnelInitateObjectToStop.onExecutionFinish();
//            t.stop();

        }
        quitestoptime = System.currentTimeMillis();
        quitetimestop = quitestoptime - quitetimestart;
//        System.out.println(platform + "  " + browser + "  " + version + "\n" + "Driver Quit time" + "   " + quitetimestop / 1000f + "Sec.");

    }


}

