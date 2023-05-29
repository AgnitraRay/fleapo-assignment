import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.ThreadTimeoutException;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import static java.awt.SystemColor.menu;

public class assignment {
    public static void main(String arg[]) throws AWTException, InterruptedException {
        String path="G:\\abcd\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver= new ChromeDriver();
        driver.get("https://develop-v2.superlink.io/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='container']/div[3]/div/button")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/div/div")).click();
        driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/ul/li[1]/input")).sendKeys("+91");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/ul/li[4]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/input")).sendKeys("4444444444");
        driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[2]/button")).click();
        Robot robot=new Robot();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_3);
        robot.keyRelease(KeyEvent.VK_3);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_4);
        robot.keyRelease(KeyEvent.VK_4);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_5);
        robot.keyRelease(KeyEvent.VK_5);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_6);
        robot.keyRelease(KeyEvent.VK_6);
        // Log in completed
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='__next']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='__next']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='__next']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("Welcome My page");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='IntroMessage']")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='IntroMessage']")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='IntroMessage']")).sendKeys("Automation");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[contains(@class,'blue')])[1]")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("(//button[contains(@class,'blue')])[1]")).click();
        Thread.sleep(3000);
        WebElement element=driver.findElement(By.xpath("//*[@id='platform']"));
        element.click();
        Thread.sleep(2000);
        Select select = new Select(element);
        select.selectByVisibleText("Email");
        driver.findElement(By.xpath("//*[@id='__next']/div[3]/div[3]/div[2]/div[2]/div/div/form/div[2]/div/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='__next']/div[3]/div[3]/div[2]/div[2]/div/div/form/div[2]/div/input")).sendKeys("a@gmail.com");
        driver.findElement(By.xpath("//*[@id='__next']/div[3]/div[3]/div[2]/div[2]/div/div/form/button")).click();
        // added Link
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[contains(@class,'black')])[1]")).sendKeys(Keys.PAGE_UP);
        driver.findElement(By.xpath("(//button[contains(@class,'black')])[1]")).click();
        // completed second page
        Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id='__next']/div[3]/div[3]/div[2]/div[2]/div/div/ul/li[2]/a/div/h5")).click();
       Thread.sleep(2000);
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
        Thread.sleep(10000);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(5000);
       // String windowHandle = driver.getWindowHandle();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        System.out.println(tabs.size());
//Use the list of window handles to switch between windows
        driver.switchTo().window((String) tabs.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='checkbox-toggle peer']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
