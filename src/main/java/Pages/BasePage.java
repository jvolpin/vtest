package Pages;

import Utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    protected WebDriver driver;
    private CustomWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new CustomWait(driver, 30);
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
