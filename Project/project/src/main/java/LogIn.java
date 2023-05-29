import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LogIn {
    WebDriver driver;
    By xpathLetsGo=By.xpath("//*[@id='container']/div[3]/div/button");
    By clickIndiaCode=By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/div/div");
    By passIndiaCode= By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/ul/li[1]/input");
    By contactNo= By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/ul/li[4]/span[2]");
    By xpath=By.xpath("//*[@id='container']/div/div/div/form/div[2]/button");

    public LogIn (WebDriver driver) {this.driver=driver;}


    public void clickOnLetsStarted(){
        driver.findElement(xpathLetsGo).click();
    }
    public void enterMobileAndContinue() throws InterruptedException
     {
         driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/div/div")).click();
         driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/ul/li[1]/input")).sendKeys("+91");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/div/ul/li[4]/span[2]")).click();
         driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/div/input")).sendKeys("4444444444");
         driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[2]/button")).click();
     }
    public void otpAndSuccessLogin() throws InterruptedException, AWTException{
        driver.findElement(xpath).click();
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

    }

}
