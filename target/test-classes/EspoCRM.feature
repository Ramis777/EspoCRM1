Feature: EspoCRM

  Background: Navigate to EspoCRM
    Given the user navigates to the "https://demo.espocrm.com/?lang=en_US"

  Scenario: Validation the function names
    When the user opens the home page
    Then the user should see the function names
    | Home |
    | Accounts |
    | Contacts |
    | Leads |
    | Opportunities |
    | Reports |
    | Quotes |
    | Sales Orders |
    | Invoices |
    | Products |
    | Emails |
    | Cases |
    | Calendar |
    | Tasks |