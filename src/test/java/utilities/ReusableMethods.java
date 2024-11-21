package utilities;

import locators.Locators_HomePage;

public class ReusableMethods {

    public static Locators_HomePage homePage;

    //Wait Class ------------------------------------------------------------------
    public static void wait(int seconds){
        try { Thread.sleep(seconds*1000);;}
        catch (InterruptedException e) { e.printStackTrace(); }
    }
    //-----------------------------------------------------------------------------
    public static void initializeHomePage() {
        if (homePage == null) {
            homePage = new Locators_HomePage(Driver.getDriver());
        }
    }

    public static void closePopup(){
        initializeHomePage();
        // If a popup appears, close it
        try {
            if (homePage.announcePopup.isDisplayed()) {
                homePage.announcePopupClose.click();
            }
        } catch (Exception e) {
            System.out.println("No popup found.");
        }
        homePage.cookiesAcceptAll.click();
    }
}
