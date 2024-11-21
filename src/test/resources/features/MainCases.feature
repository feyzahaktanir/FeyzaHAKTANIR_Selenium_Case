Feature: Main Case Insider

  @main
  Scenario: Verify that the Insider homepage is opened
    Given User visits "https://useinsider.com"
    * If a popup appears, close it
    * Verify that the Insider homepage is opened
    * Select the "Company" menu in the navigation bar and clicks "Careers"
    * Verify that the Careers page is opened
    * Verify that the "Locations" is displayed
    * Verify that the "Teams" is displayed
    * Verify that the "Life at Insider" is displayed
    * Close the browser

  @main
  Scenario: Verify that Quality Assurance job listings are displayed
    Given User visits "https://useinsider.com/careers/quality-assurance/"
    * Click the See all QA jobs button
    * Apply filters for Location: Istanbul, Turkey and Department: Quality Assurance
    * Verify that the job listings are displayed
    * Verify that all jobs' Position contains "Quality Assurance", Department contains "Quality Assurance", and Location contains "Istanbul, Turkey"
    * Click the View Role button on a job listing
    * Verify that the user is redirected to the Lever Application form page
    * Close the browser