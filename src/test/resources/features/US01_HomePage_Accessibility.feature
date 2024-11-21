Feature: Insider Homepage Tests

  Scenario: Verify that the Insider homepage is opened
    Given User visits "https://useinsider.com"
    * If a popup appears, close it
    * Verify that the Insider homepage is opened
    * Close the browser
