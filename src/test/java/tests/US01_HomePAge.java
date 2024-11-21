package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import locators.Locators_HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US01_HomePAge {

    private Locators_HomePage homePage;

    @BeforeMethod
    public void setUp() {
        homePage = new Locators_HomePage(Driver.getDriver());
    }

    @Test
    public void verifyHomePageOpened() {
        Driver.getDriver().get("https://useinsider.com");
        ReusableMethods.closePopup();
        // Verify that the homepage is opened
        Assert.assertTrue(homePage.homeLogo.isDisplayed(), "Insider homepage is not opened.");
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}

