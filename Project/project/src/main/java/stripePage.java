import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class stripePage {
       WebDriver driver;
        public stripePage (WebDriver driver) {this.driver=driver;}
        public void  stripeStep() throws AWTException, InterruptedException{
            Thread.sleep(5000);
            String windowHandle = driver.getWindowHandle();
            driver.findElement(By.xpath("(//div[@class='flex-center-between'])[last()]/div[last()]")).click();
            Thread.sleep(10000);
            Robot robot = new Robot();
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
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_0);
            robot.keyRelease(KeyEvent.VK_0);
            Thread.sleep(5000);
            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            System.out.println(tabs.size());
            driver.switchTo().window((String) tabs.get(0));
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='checkbox-toggle peer']")).click();
            Thread.sleep(2000);
            driver.quit();
        }
}
