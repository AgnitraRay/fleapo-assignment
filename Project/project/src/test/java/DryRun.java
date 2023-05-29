import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;


public class DryRun {

    String path = "G:\\project\\project\\chromedriver_win32\\chromedriver.exe";
    WebDriver driver;


    @BeforeTest
    public void first() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.get("https://develop-v2.superlink.io/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 0)
    public void Login() throws InterruptedException, AWTException {
        LogIn login = new LogIn(driver);
        login.clickOnLetsStarted();
        login.enterMobileAndContinue();
        login.otpAndSuccessLogin();
    }

    @Test(priority = 1)
    public void MypageTesting() throws InterruptedException {
        MyPage myPage = new MyPage(driver);
        myPage.enterPageNameAndUserMassage();
        myPage.addSocialLink();
        myPage.clickOnEnableMassaging();
    }
    @Test(priority = 2)
    public void MonetizationSettingTesting() throws InterruptedException{
        MonetizationSetting m = new MonetizationSetting(driver);
        m.MonetizationStep();
    }
    @Test(priority = 3)
    public void stripePageTesting() throws InterruptedException,AWTException{
        stripePage s = new stripePage(driver);
        s.stripeStep();
    }
}



