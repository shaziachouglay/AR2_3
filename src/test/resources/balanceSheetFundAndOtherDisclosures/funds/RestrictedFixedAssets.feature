Feature: Testing the Funds Restricted Fixed Assets Page


  Scenario Outline: Testing the RestrictedFixed Assets page with valid credentials

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Restricted Fixed Assets page

    And   I enter value in row Original prior year closing balance  and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Original prior year closing balance  and column Total is "<v2>" in bsfod_rfa

    And   I enter value in row Adjustments made in to the opening balance and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Adjustments made in to the opening balance and column Total is "<v2>" in bsfod_rfa

    And   I enter value in row Incoming Resources and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Incoming Resources and column Total is "<v2>" in bsfod_rfa

    And   I enter value in row Resources Expended and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Resources Expended and column Total is "<v2>" in bsfod_rfa

    And   I enter value in row Transfers on conversion and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Transfers on conversion and column Total is "<v2>" in bsfod_rfa

    And   I enter value in row Transfers in or out of existing academies and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Transfers in or out of existing academies and column Total is "<v2>" in bsfod_rfa

    And   I enter value in row Gross transfer between funds and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Gross transfer between funds and column Total is "<v2>" in bsfod_rfa

    And   I enter value in row Other gains losses and transfers  and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Other gains losses and transfers  and column Total is "<v2>" in bsfod_rfa

    Then  I see value in row Balance at period end and all columns with "<v3>" in bsfod_rfa
    Then  I must see value in row Balance at period end and column Total is "<v4>" in bsfod_rfa
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |3   |8   |18  |




  Scenario Outline: Testing the RestrictedFixed Assets page with invalid credentials

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Restricted Fixed Assets page

    And   I enter value in row Original prior year closing balance  and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Original prior year closing balance  and column Total is NOT "<v2>" in bsfod_rfa

    And   I enter value in row Adjustments made in to the opening balance and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Adjustments made in to the opening balance and column Total is NOT "<v2>" in bsfod_rfa

    And   I enter value in row Incoming Resources and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Incoming Resources and column Total is NOT "<v2>" in bsfod_rfa

    And   I enter value in row Resources Expended and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Resources Expended and column Total is NOT "<v2>" in bsfod_rfa

    And   I enter value in row Transfers on conversion and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Transfers on conversion and column Total is NOT "<v2>" in bsfod_rfa

    And   I enter value in row Transfers in or out of existing academies and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Transfers in or out of existing academies and column Total is NOT "<v2>" in bsfod_rfa

    And   I enter value in row Gross transfer between funds and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Gross transfer between funds and column Total is NOT "<v2>" in bsfod_rfa

    And   I enter value in row Other gains losses and transfers  and all columns with "<v1>" in bsfod_rfa
    Then  I must see value in row Other gains losses and transfers  and column Total is NOT "<v2>" in bsfod_rfa

    Then  I see value in row Balance at period end and all columns with NOT "<v3>" in bsfod_rfa
    Then  I must see value in row Balance at period end and column Total is NOT "<v4>" in bsfod_rfa
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |2   |7   |17  |


  Scenario Outline: Testing the RestrictedFixed Assets page for All Financial Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Restricted Fixed Assets page

    And   I enter value in row Original prior year closing balance  and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Adjustments made in to the opening balance and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Incoming Resources and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Resources Expended and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Transfers on conversion and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Transfers in or out of existing academies and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Gross transfer between funds and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Other gains losses and transfers  and all columns with "<v1>" in bsfod_rfa
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1    | error |
      |9999999|18     |




  Scenario Outline: Testing the RestrictedFixed Assets page for Invalid Data Format

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Restricted Fixed Assets page

    And   I enter value in row Original prior year closing balance  and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Adjustments made in to the opening balance and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Incoming Resources and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Resources Expended and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Transfers on conversion and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Transfers in or out of existing academies and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Gross transfer between funds and all columns with "<v1>" in bsfod_rfa

    And   I enter value in row Other gains losses and transfers  and all columns with "<v1>" in bsfod_rfa
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1    | error |
      |9999999|18     |