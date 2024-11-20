package stepdefinitions;

import io.cucumber.java.en.Given;
import locators.Locators_CareerPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.Driver.driver;

public class StepDef_CareerPage {

    Locators_CareerPage careerPage = new Locators_CareerPage();

    @Given("Select the {string} menu in the navigation bar and clicks {string}")
    public void select_the_menu_in_the_navigation_bar_and_clicks(String string, String string2) {
        careerPage.companySelect.click();
        ReusableMethods.wait(7);
        careerPage.careersSelect.click();
        ReusableMethods.wait(7);
    }
    @Given("Verify that the Careers page is opened")
    public void verify_that_the_careers_page_is_opened() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(careerPage.careersHeader));
    }
    @Given("Verify that the {string} is displayed")
    public void verify_that_the_is_displayed(String searchTerm) {
        //Terimi sayfada bulursa, bulduğu text'i basar.
        String xpath = "//*[contains(text(), '" + searchTerm + "')]";
        try {
            WebElement element = driver.findElement(By.xpath(xpath));
            System.out.println(searchTerm + " found on page: " + element.getText());
        } catch (NoSuchElementException e) {
            System.out.println(searchTerm + " did not found on page");
        }
    }

}
