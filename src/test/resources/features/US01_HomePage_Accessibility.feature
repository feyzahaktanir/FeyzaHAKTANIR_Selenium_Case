Feature: Insider Homepage Tests

  @test
  Scenario: Verify that the Insider homepage is opened
    Given User visits "homepage"
    * If a popup appears, close it
    * Verify that the Insider homepage is opened
    * User closes the browser
