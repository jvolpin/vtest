import Utils.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = WebDriverFactory.generateDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }

}
