package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage_Xpaths;
import utilities.ConfigReader;
import utilities.Driver;

public class GeneralSteps {

    @Given("The user visits {string}")
    public void the_user_visits(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
        Actions actions = new Actions(Driver.driver);
        HomePage_Xpaths.wait(3);
    }
    @Given("Verify that the Insider homepage is opened")
    public void verify_that_the_insider_homepage_is_opened() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
