package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait extends WebDriverWait {
    public CustomWait(WebDriver driver, long timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

}
