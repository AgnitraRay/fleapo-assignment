import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MonetizationSetting {
    WebDriver driver;
    By xpathMonetizationKey=By.xpath("//*[@id='__next']/div[3]/div[3]/div[2]/div[2]/div/div/ul/li[2]/a/div/h5");
    public MonetizationSetting (WebDriver driver) {this.driver=driver;}
public void MonetizationStep() throws InterruptedException{
    driver.findElement(xpathMonetizationKey).click();
    Thread.sleep(2000);

}
}
