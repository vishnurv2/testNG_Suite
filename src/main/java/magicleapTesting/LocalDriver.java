package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocalDriver {

    public static void main(String[] args) {

        String status = null;
        System.setProperty("webdriver.chrome.driver", "E:\\localDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            WebDriverWait wait=new WebDriverWait(driver, 20);
            driver.get("https://www.nsw.gov.au/");
            driver.findElement(By.id("home-search-autosuggest-input")).sendKeys("Jobs");
            WebElement link;
            link= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id=\"home-search-autosuggest-list\"]/li[2]")));
            link.click();
         /*   driver.get("http://teachables-stage.scholastic.com/teachables/guesthomepage.html");
            driver.manage().window().maximize();

        WebElement search= driver.findElement(By.className("teachablesnav-search--field"));
            String val = "hello";

            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.className("teachablesnav-search--field")));
            actions.click();


            for (int i = 0; i < val.length(); i++) {

                char c = val.charAt(i);
                String s = new StringBuilder().append(c).toString();
                System.out.println(s);
                actions.sendKeys(s);

                actions.build().perform();
                Thread.sleep(5000);
            }
            search.sendKeys(Keys.ARROW_DOWN);*/
            Thread.sleep(20000);

            driver.quit();

        } catch (Exception e) {
            System.out.println(e);
            driver.quit();
        }
    }


}
