Feature: Testing the Contingent Liabilities BSL


  Scenario Outline:Testing the Contingent Liabilities BSL with Valid Data

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Contingent Liabilities BSL

    And   I enter value in row At Start of Period and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row At Start of period and column total is "<v2>" in BSL Contingent Liabilities

    And   I enter value in row Adjustments made to opening balance and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row Adjustments made to opening balance and column total is "<v2>" in BSL Contingent Liabilities

    And   I enter value in row Liabilities crystallised in year and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row Liabilities crystallised in year and column total is "<v2>" in BSL Contingent Liabilities

    And   I enter value in row Increase in period and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row Increase in period and column total is "<v2>" in BSL Contingent Liabilities

    And   I enter value in row Obligations expired in period and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row Obligations expired in period and column total is "<v2>" in BSL Contingent Liabilities

    Then  I see value in row At end of period and all columns with "<v3>" in BSL Contingent Liabilities
    Then  I see the value in row At end of period and column total is "<v4>" in BSL Contingent Liabilities
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |6   |5   |30  |


  Scenario Outline:Testing the Contingent Liabilities BSL with Invalid Data

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Contingent Liabilities BSL

    And   I enter value in row At Start of Period and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row At Start of period and column total is NOT"<v2>" in BSL Contingent Liabilities


    And   I enter value in row Adjustments made to opening balance and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row Adjustments made to opening balance and column total is NOT"<v2>" in BSL Contingent Liabilities

    And   I enter value in row Liabilities crystallised in year and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row Liabilities crystallised in year and column total is NOT"<v2>" in BSL Contingent Liabilities

    And   I enter value in row Increase in period and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row Increase in period and column total is NOT"<v2>" in BSL Contingent Liabilities

    And   I enter value in row Obligations expired in period and all columns with "<v1>" in BSL Contingent Liabilities
    Then  I see the value in row Obligations expired in period and column total is NOT"<v2>" in BSL Contingent Liabilities

    Then  I see value in row At end of period and all columns with NOTs"<v3>" in BSL Contingent Liabilities
    Then  I see the value in row At end of period and column total is NOT"<v4>" in BSL Contingent Liabilities
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |5   |4   |31  |


  Scenario Outline:Testing the Contingent Liabilities BSL for All Financial data error

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Contingent Liabilities BSL

    And   I enter value in row At Start of Period and all columns with "<v1>" in BSL Contingent Liabilities

    And   I enter value in row Adjustments made to opening balance and all columns with "<v1>" in BSL Contingent Liabilities

    And   I enter value in row Liabilities crystallised in year and all columns with "<v1>" in BSL Contingent Liabilities

    And   I enter value in row Increase in period and all columns with "<v1>" in BSL Contingent Liabilities

    And   I enter value in row Obligations expired in period and all columns with "<v1>" in BSL Contingent Liabilities

    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1      | error |
      | 9999999 | 30    |


  Scenario Outline:Testing the Contingent Liabilities BSL for Invalid Data Format

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Contingent Liabilities BSL

    And   I enter value in row At Start of Period and all columns with "<v1>" in BSL Contingent Liabilities

    And   I enter value in row Adjustments made to opening balance and all columns with "<v1>" in BSL Contingent Liabilities

    And   I enter value in row Liabilities crystallised in year and all columns with "<v1>" in BSL Contingent Liabilities

    And   I enter value in row Increase in period and all columns with "<v1>" in BSL Contingent Liabilities

    And   I enter value in row Obligations expired in period and all columns with "<v1>" in BSL Contingent Liabilities

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1      | error |
      | ******* | 30    |