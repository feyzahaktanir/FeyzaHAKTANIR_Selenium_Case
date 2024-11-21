Insider Job Application Test Automation

This is a Selenium-based test automation framework designed for testing the Insider Careers Page.

Features
--------
Automated browser interactions using Selenium.
TestNG integration for running and managing tests.
Element locators and actions are organized using the Page Object Model (POM).
Assertions for verifying UI elements, job listings, and page interactions.
Logging and debugging utilities for better test visibility.

Technologies Used and Dependency Versions
-----------------------------------------
Java: Version 17 (Project compatible with JDK 17).
Selenium WebDriver: 4.25.0 - For browser automation.
JUnit: 4.13.2 - For running tests and assertions.
WebDriverManager: 5.9.2 - For managing browser driver binaries.
TestNG: Version 7.8.0 - For running and managing tests.
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
Chromedriver Version Configuration
--->Due to issues with automatic version detection of Chromedriver for WebDriver, the version must be manually set in the configuration.properties file.
    Ensure the version matches your installed browser version for successful execution.
&&

Project Structure
-----------------
src/test/java/locators: Page Object Model (POM) classes with element locators.
src/test/java/test: Test cases.
src/test/java/utilities: Utility classes for driver management, configurations, and custom methods.
&&

Key Scenarios
-------------
Verify that all job listings for "Quality Assurance" are correctly displayed.
Validate the job department, location, and role-specific buttons.
Check page interactions, including scroll and element visibility.
&&


For questions, contact: feyza.haktanir@hotmail.com
Feyza HAKTANIR