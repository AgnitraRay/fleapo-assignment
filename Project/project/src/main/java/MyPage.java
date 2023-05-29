import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyPage {
    WebDriver driver;
    public MyPage (WebDriver driver) {this.driver=driver;}
    public void enterPageNameAndUserMassage() throws InterruptedException{
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='form-group mb-5 full']/input")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='form-group mb-5 full']/input")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='form-group mb-5 full']/input")).sendKeys("Welcome My page");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='IntroMessage']")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='IntroMessage']")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='IntroMessage']")).sendKeys("Automation");
        Thread.sleep(3000);
    }
    public void addSocialLink() throws InterruptedException{
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
        Thread.sleep(2000);
    }
    public void clickOnEnableMassaging() throws InterruptedException{
        driver.findElement(By.xpath("(//button[contains(@class,'black')])[1]")).sendKeys(Keys.PAGE_UP);
        driver.findElement(By.xpath("(//button[contains(@class,'black')])[1]")).click();
        // completed second page
        Thread.sleep(2000);
    }
}
