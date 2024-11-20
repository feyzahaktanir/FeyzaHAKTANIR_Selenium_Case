package stepdefinitions;

import io.cucumber.java.en.Given;
import locators.Locators_HomePage;
import org.junit.Assert;

public class StepDef_HomePage {

    Locators_HomePage homePage = new Locators_HomePage();

    @Given("Verify that the Insider homepage is opened")
    public void verify_that_the_insider_homepage_is_opened() {
        Assert.assertTrue("HomePage logo did not display.",homePage.homeLogo.isDisplayed());
        System.out.println("HomePage logo is displayed.");
    }
}
