Feature: Insider Careers Page Tests

  Scenario: Verify that the Careers page and its sections are displayed
    Given The user visits "https://useinsider.com"
    * The user selects the "Company" menu in the navigation bar and clicks "Careers"
    * Verify that the Careers page is opened
    * Verify that the "Locations", "Teams", and "Life at Insider" sections are displayed
