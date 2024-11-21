package stepdefinitions;

import io.cucumber.java.en.Given;
import locators.Locators_QA;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static utilities.Driver.driver;

public class StepDef_QA {

    Locators_QA qa = new Locators_QA();
    @Given("Click the See all QA jobs button")
    public void click_the_see_all_qa_jobs_button() {
        qa.seealljobsButton.click();
        ReusableMethods.wait(15);
    }
    @Given("Apply filters for Location: Istanbul, Turkey and Department: Quality Assurance")
    public void apply_filters_for_location_ıstanbul_turkey_and_department_quality_assurance() {
        qa.departmentSelect.click();
        ReusableMethods.wait(5);
        qa.qaSelect.click();
        ReusableMethods.wait(5);
        qa.locationSelect.click();
        ReusableMethods.wait(5);
        qa.istTurkeySelect.click();
        ReusableMethods.wait(5);
    }
    @Given("Verify that the job listings are displayed")
    public void verify_that_the_job_listings_are_displayed() {
        String xpath = "//div[@id='jobs-list']//div[contains(@class, 'position-list')]//span";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> jobList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
        if (jobList.size() > 0) {
            System.out.println("Found " + jobList.size() + " job entries.");
        } else {
            System.out.println("No job entries found.");
        }
    }
    @Given("Verify that all jobs' Position contains {string}, Department contains {string}, and Location contains {string}")
    public void verify_that_all_jobs_position_contains_department_contains_and_location_contains(String position, String department, String location) {
        List<WebElement> jobList = qa.jobList;
        for (WebElement job : jobList) {
            String jobPosition = job.findElement((By) qa.jobPosition).getText();
            String jobDepartment = job.findElement((By) qa.jobDepartment).getText();
            String jobLocation = job.findElement((By) qa.jobLocation).getText();
            Assert.assertTrue("Position does not contain expected text: " + position, jobPosition.contains(position));
            Assert.assertTrue("Department does not contain expected text: " + department, jobDepartment.contains(department));
            Assert.assertTrue("Location does not contain expected text: " + location, jobLocation.contains(location));
        }

    }
    @Given("Click the View Role button on a job listing")
    public void click_the_view_role_button_on_a_job_listing() {
        Actions actions = new Actions(driver);
        actions.moveToElement(qa.jobHold).clickAndHold().perform();
        ReusableMethods.wait(2);
        Assert.assertTrue(qa.viewRoleButton.isDisplayed());
        qa.viewRoleButton.click();
    }
    @Given("Verify that the user is redirected to the Lever Application form page")
    public void verify_that_the_user_is_redirected_to_the_lever_application_form_page() {
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
}
