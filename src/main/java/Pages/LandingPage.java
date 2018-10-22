package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LandingPage extends BasePage {

    @FindBy(id = "loanAmount")
    private WebElement loanAmountTextBox;


    @FindBy(id = "Homepage_duration")
    private WebElement purposeDropdown;

    @FindBy(id = "revenueMonths")
    private WebElement timeTradingDropdown;

    @FindBy(id = "Homepage_Company_type")
    private WebElement companyTypeDropdown;

    //Is this going to be only in English?
    @FindBy(css = "input[value*=\"Get Funded\"]")
    private WebElement getFundedButton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }


    public LandingPage enterLoanAmount(String amount) {
        loanAmountTextBox.sendKeys(amount);
        return this;
    }

    public LandingPage selectPurpose(String purpose) {
        new Select(purposeDropdown).selectByVisibleText(purpose);
        return this;
    }

    public LandingPage selectTimeTrading(String timeTrading) {
        new Select(timeTradingDropdown).selectByVisibleText(timeTrading);
        return this;
    }

    public LandingPage selectCompanyType(String companyType) {
        new Select(companyTypeDropdown).selectByVisibleText(companyType);
        return this;
    }

    public CaptureRequirementsPage clickGetFundedButton() {
        getFundedButton.click();
        return new CaptureRequirementsPage(driver);
    }

}
