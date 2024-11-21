package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Locators_QA {
    public Locators_QA(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[contains(text(), 'See all QA jobs')]")
    public WebElement seealljobsButton;
    @FindBy(id = "select2-filter-by-location-container")
    public WebElement locationSelect;
    @FindBy(id = "select2-filter-by-department-container")
    public WebElement departmentSelect;
    @FindBy(xpath = "//li[contains(@id,'Istanbul, Turkey')]")
    public WebElement istTurkeySelect;
    @FindBy(xpath = "//li[contains(@id,'Quality Assurance')]")
    public WebElement qaSelect;
    @FindBy(xpath = "//div[@class='position-list-item']")
    public static List<WebElement> jobList;
    @FindBy(xpath = ".//p[@class='position-title font-weight-bold']")
    public static WebElement jobPosition;
    @FindBy(xpath = ".//span[@class='position-department text-large font-weight-600 text-primary']")
    public static WebElement jobDepartment;
    @FindBy(xpath = ".//div[@class='position-location text-large']")
    public static WebElement jobLocation;
    @FindBy(xpath = "//div[@class='position-list-item-wrapper bg-light'][1]")
    public static WebElement jobHold;
    @FindBy(xpath = "(//a[text()='View Role'])[1]")
    public static WebElement viewRoleButton ;

}
