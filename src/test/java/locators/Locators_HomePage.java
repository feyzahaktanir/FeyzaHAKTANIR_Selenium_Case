package locators;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Locators_HomePage {

    public Locators_HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class=\"btn btn-navy btn-teal rounded align-self-center mt-3\"][1]")
    public WebElement homeLogo;



    //Close Popups ---------------------------------------------------------
    @FindBy(id="ins-responsive-banner")
    public WebElement announcePopup;
    @FindBy(className = "ins-close-button")
    public WebElement announcePopupClose;

}
