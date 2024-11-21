package tests;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import locators.Locators_CareerPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US02_CareerPage {

    private Locators_CareerPage careerPage;
    @BeforeMethod
    public void setUp() {
        careerPage = new Locators_CareerPage(Driver.getDriver());
    }

    @Test
    public void verifyCareersPageSectionsDisplayed() {
        Driver.getDriver().get("https://useinsider.com");
        ReusableMethods.closePopup();
        ReusableMethods.wait(3);
        careerPage.companySelect.click();
        ReusableMethods.wait(3);
        careerPage.careersSelect.click();
        ReusableMethods.wait(5);

        Assert.assertTrue(careerPage.careersHeader.isDisplayed(), "Careers page is not opened.");

    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}

