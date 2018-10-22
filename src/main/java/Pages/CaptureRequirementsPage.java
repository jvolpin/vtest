package Pages;

import Utils.PageUtils.Purposes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaptureRequirementsPage extends BasePage{

    @FindBy(css = "#contentWrapper > p")
    private WebElement header;

    public CaptureRequirementsPage(WebDriver driver) {
        super(driver);
    }

    public String getAmount() {
        return header.getText().replaceAll("\\D+","");
    }

    public String getPurpose() {

        for (Purposes purpose : Purposes.values()) {
            if (header.getText().contains(purpose.getProperty())) {
                return purpose.getProperty();
            }
        }
        throw new RuntimeException("Purpose not found");
    }

}
