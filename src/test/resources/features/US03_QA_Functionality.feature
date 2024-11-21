Feature: Insider Quality Assurance Page Tests

  Scenario: Verify that Quality Assurance job listings are displayed
    Given User visits "https://useinsider.com/careers/quality-assurance/"
    * Click the See all QA jobs button
    * Apply filters for Location: Istanbul, Turkey and Department: Quality Assurance
    * Verify that the job listings are displayed
    * Close the browser

  Scenario: Verify job details in the listings
    Given User visits "https://useinsider.com/careers/quality-assurance/"
    * Click the See all QA jobs button
    * Apply filters for Location: Istanbul, Turkey and Department: Quality Assurance
    * Verify that the job listings are displayed
    * Verify that all jobs' Position contains "Quality Assurance", Department contains "Quality Assurance", and Location contains "Istanbul, Turkey"
    * Close the browser

  Scenario: Verify the job details page redirection
    Given User visits "https://useinsider.com/careers/quality-assurance/"
    * Click the See all QA jobs button
    * Apply filters for Location: Istanbul, Turkey and Department: Quality Assurance
    * Verify that the job listings are displayed
    * Click the View Role button on a job listing
    * Verify that the user is redirected to the Lever Application form page
    * Close the browser
