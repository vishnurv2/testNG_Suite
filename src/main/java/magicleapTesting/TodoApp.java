package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TodoApp {
    float ClickCommandTime;
    long CommandStart;
    long CommandStop;
    float SendKeyCommand;
    long SendKeysStart;
    long SendKeysStop;


    public void TodoAppTest(RemoteWebDriver driver, String status) {
        try {

            System.out.println("-----------TodoApp - Start--------------");
            Actions action = new Actions(driver);

            System.out.println(driver.getTitle());
            driver.get("https://lambdatest.github.io/sample-todo-app/");
            WebDriverWait wait = new WebDriverWait(driver, 30);
            WebElement firstItem = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(1) > input"));
            WebElement secondItem = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(2) > input"));
            WebElement thirdItem = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(4) > input"));
            WebElement fifthElement = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(5) > input"));

            CommandStart = System.currentTimeMillis();
            firstItem.isDisplayed();
            firstItem.click();
            secondItem.isDisplayed();
            secondItem.click();
            thirdItem.isDisplayed();
            thirdItem.click();
            fifthElement.isDisplayed();
            fifthElement.click();
            CommandStop = System.currentTimeMillis();
            ClickCommandTime = CommandStop - CommandStop/1000f;
            System.out.println("Time taken to perform 4 clicks" + "  " + "=" + ClickCommandTime);
           /* WebElement firstOption = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(3) > input"));
            action.moveToElement(firstOption).click().perform();*/
            SendKeysStart = System.currentTimeMillis();
            driver.findElement(By.xpath("//*[@id=\"sampletodotext\"]")).sendKeys("new item added");
            SendKeysStop = System.currentTimeMillis();
            SendKeyCommand = SendKeysStop - SendKeysStart/1000f;
            System.out.println("SendKeys 14 char value Command to execute" + "  " + "=" + SendKeyCommand);

            driver.findElement(By.xpath("//*[@id=\"addbutton\"]")).isDisplayed();
            driver.findElement(By.xpath("//*[@id=\"addbutton\"]")).click();
            status = "passed";
        } catch (Exception t) {
            System.out.println(t + "------------------------------" + driver.getSessionId());
            status = "failed";
        }
        System.out.println("-----------TodoApp - End--------------");
    }

}
