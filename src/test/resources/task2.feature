@Account
Feature: Create New Account

Scenario:
  Given the user navigates to the "https://demo.espocrm.com/?lang=en_US"
  When the user opens the home page
  And the user opens the Accounts
  Then the user clicks the Create Account button

  Scenario Outline: Validation of new account

    And the user create 4 new account "<Name>", "<Website>", "<Type>", "<Country>"
    And the user validate the new users is created
    Examples:
      | Name    | Website    | Type     | Country    |
      | George  | google.com | investor | USA        |
      | Naza    | google.com | customer | Kyrgyzstan |
      | Chopita | google.com | reseller | Kyrgyzstan |
      | Hocine  | google.com | investor | USA        |



