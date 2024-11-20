package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Locators_CareerPage {

    public Locators_CareerPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[contains(@class, 'nav-link dropdown-toggle') and contains(text(), 'Company')]")
    public WebElement companySelect;
    @FindBy(xpath = "//a[contains(@class, 'dropdown-sub') and contains(text(), 'Careers')]")
    public WebElement careersSelect;
    @FindBy(xpath = "//h1[contains(text(), 'Ready to disrupt?')]")
    public WebElement careersHeader;

}
