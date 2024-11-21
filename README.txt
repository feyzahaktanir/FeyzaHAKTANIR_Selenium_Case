Insider Job Application Test Automation

This is a Selenium-based test automation framework designed for testing the Insider Careers Page.

Features
--------
Automated browser interactions using Selenium.
Integration with Cucumber for behavior-driven testing (BDD).
Element locators and actions are organized using the Page Object Model (POM).
Assertions for verifying UI elements, job listings, and page interactions.
Logging and debugging utilities for better test visibility.

Technologies Used and Dependency Versions
-----------------------------------------
Java: Version 17 (Project compatible with JDK 17).
Selenium WebDriver: 4.25.0 - For browser automation.
Cucumber: 7.11.1 - For writing feature files and step definitions.
JUnit: 4.13.2 - For running tests and assertions.
WebDriverManager: 5.9.2 - For managing browser driver binaries.
Cucumber Reporting: 5.7.5 - For generating enhanced test reports.
Maven: Build and dependency management.

Prerequisites
-------------
JDK: Version 17 or higher.
Maven: Installed and configured.
Google Chrome: Installed on the system.
Chromedriver: Compatible version matching the installed Chrome browser.
Setup Instructions
&&

Execution Instructions
----------------------
Using a Runner for Test Execution

Running maincases.feature:
--->The maincases.feature file contains scenarios tagged with @main.
    These scenarios are interdependent and have been included to simplify observing the workflow of connected cases.
--->To execute these cases, ensure the @main tag is added to the tags parameter in the test runner file.

Running Other Feature Files:
--->Other feature files contain independent test scenarios that are not interconnected.
--->These scenarios do not have any tags. To execute them, leave the tags parameter empty in the runner configuration.

Chromedriver Version Configuration
--->Due to issues with automatic version detection of Chromedriver for WebDriver, the version must be manually set in the configuration.properties file.
    Ensure the version matches your installed browser version for successful execution.
&&

Project Structure
-----------------
src/test/java/locators: Page Object Model (POM) classes with element locators.
src/test/java/stepdefinitions: Step definitions for feature files.
src/test/java/utilities: Utility classes for driver management, configurations, runner and custom methods.
src/test/resources/features: Cucumber feature files for test scenarios.
&&

Key Scenarios
-------------
Verify that all job listings for "Quality Assurance" are correctly displayed.
Validate the job department, location, and role-specific buttons.
Check page interactions, including scroll and element visibility.
Contributing
Contributions are welcome! Please fork the repository and submit a pull request with detailed comments.
&&


For questions, contact: feyza.haktanir@hotmail.com
Feyza HAKTANIR