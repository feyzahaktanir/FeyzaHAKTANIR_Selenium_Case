Feature: Insider Quality Assurance Page Tests

  Scenario: Verify that Quality Assurance job listings are displayed
    Given The user navigates to "https://useinsider.com/careers/quality-assurance/"
    * The user clicks the "See all QA jobs" button
    * The user applies filters for Location: "Istanbul, Turkey" and Department: "Quality Assurance"
    * Verify that the job listings are displayed

  Scenario: Verify job details in the listings
    Given The user views the job listings
    * Verify that all job positions contain "Quality Assurance"
    * Verify that all job departments contain "Quality Assurance"
    * Verify that all job locations contain "Istanbul, Turkey"

  Scenario: Verify the job details page redirection
    Given The user clicks the "View Role" button on a job listing
    * Verify that the user is redirected to the Lever Application form page
