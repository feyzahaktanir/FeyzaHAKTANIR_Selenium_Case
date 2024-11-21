package tests;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import locators.Locators_QA;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static utilities.Driver.driver;

public class US03_QAPage {

    private Locators_QA qaPage;

    @BeforeMethod
    public void setUp() {
        qaPage = new Locators_QA(Driver.getDriver());
    }

    @Test
    public void verifyJobListingsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Driver.getDriver().get("https://useinsider.com/careers/quality-assurance/");
        ReusableMethods.closePopup();
        ReusableMethods.wait(2);


        qaPage.seealljobsButton.click();
        ReusableMethods.wait(5);

        //Apply filters for Location: Istanbul, Turkey and Department: Quality Assurance
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-filter-by-department-container' and @title='Quality Assurance']")
        ));
        qaPage.departmentSelect.click();
        ReusableMethods.wait(5);
        qaPage.qaSelect.click();
        ReusableMethods.wait(5);
        qaPage.locationSelect.click();
        ReusableMethods.wait(5);
        qaPage.istTurkeySelect.click();
        ReusableMethods.wait(5);

        //Verify that the job listings are displayed

        List<WebElement> jobList = wait.until(ExpectedConditions.visibilityOfAllElements(qaPage.jobAllList));
        if (jobList.size() > 0) {
            System.out.println("Found " + jobList.size() + " job entries.");
        } else {
            System.out.println("No job entries found.");
        }

        //Click the View Role button on a job listing
        Actions actions = new Actions(driver);
        actions.moveToElement(qaPage.jobHold).clickAndHold().perform();
        ReusableMethods.wait(2);
        Assert.assertTrue(qaPage.viewRoleButton.isDisplayed());
        qaPage.viewRoleButton.click();

        // Verify that the user is redirected to the Lever Application form page
        Set<String> allWindows = driver.getWindowHandles();
        String mainWindow = driver.getWindowHandle();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        ReusableMethods.wait(7);
        Assert.assertTrue(driver.getCurrentUrl().contains("jobs.lever.co/useinsider"));
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
