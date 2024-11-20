package stepdefinitions;

import io.cucumber.java.en.Given;
import locators.Locators_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.Driver.driver;

public class GeneralSteps {

    Locators_HomePage homePage = new Locators_HomePage();

    public GeneralSteps() {}
    @Given("User visits {string}")
    public void user_visits(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
        ReusableMethods.wait(5);
    }

    @Given("If a popup appears, close it")
    public void close_popup() {
        //duyuru popup'ının görünme süresi belirsiz olduğu için gözükürse kapat yaptım.
        try {
            WebElement element = driver.findElement((By) homePage.announcePopup);
            if (element != null && element.isDisplayed()) {
                homePage.announcePopupClose.click();
                System.out.println("Announce Popup closed.");
            }
        } catch (Exception e) {
            System.out.println("Announce Popup not found.");
        }
    }

    @Given("Close the browser")
    public void close_the_browser() {
        Driver.quitDriver();
    }


}
