package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {
    public static WebDriver generateDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        String driverURL = "http://localhost:4444/wd/hub";
        RemoteWebDriver driver = null;
        try {
            return driver = new RemoteWebDriver(new URL(driverURL), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Wrong URL");
        }
    }
}
