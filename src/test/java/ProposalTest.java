import Pages.CaptureRequirementsPage;
import Pages.LandingPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProposalTest extends BaseTest {

    private String baseURL = "https://www.fundingxchange.co.uk/";

    @Test
    public void callToActionShouldShowParameters(){
        String expectedAmount = "99009";
        String expectedPurpose = "Property purchase";
        driver.get(baseURL);
        String actualAmount = new LandingPage(driver)
                .enterLoanAmount(expectedAmount)
                .selectCompanyType("Sole Trader")
                .selectPurpose(expectedPurpose)
                .selectTimeTrading("Under 4 months")
                .clickGetFundedButton().getAmount();
        String actualPurpose = new CaptureRequirementsPage(driver).getPurpose();

        Assertions.assertEquals(expectedAmount,actualAmount);
        Assertions.assertEquals(expectedPurpose,actualPurpose);

    }
}
