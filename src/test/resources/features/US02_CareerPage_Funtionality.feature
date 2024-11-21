Feature: Insider Careers Page Tests

  Scenario: Verify that the Careers page and its sections are displayed
    Given User visits "https://useinsider.com"
    * If a popup appears, close it
    * Verify that the Insider homepage is opened
    * Select the "Company" menu in the navigation bar and clicks "Careers"
    * Verify that the Careers page is opened
    * Verify that the "Locations" is displayed
    * Verify that the "Teams" is displayed
    * Verify that the "Life at Insider" is displayed
    * Close the browser

