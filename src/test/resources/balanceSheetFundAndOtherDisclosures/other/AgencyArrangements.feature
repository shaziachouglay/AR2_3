Feature: Testing the Agency Agreement in Balance Sheet Funds and Other Disclosures

  Scenario Outline:Testing the Agency Agreement in Balance Sheet Funds and Other Disclosures with valid credentials

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I have navigated to Other Agency Arrangement page

    And   I enter value in field Opening Balance with "<v1>" in OAA
    And   I enter value in field Adjustments made to opening balance with "<v2>" in OAA
    And   I enter value in field Income with "<v3>" in OAA
    And   I enter value in field Expenditure with "<v4>" in OAA
    Then  I see the total is now "<total>" in OAA
    And   I click on the next
    Examples:
      | v1 | total |
# data to be  provided


  Scenario Outline:Testing the Agency Agreement in Balance Sheet Funds and Other Disclosures with invalid credentials

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I have navigated to Other Agency Arrangement page

    And   I enter value in field Opening Balance with "<v1>" in OAA
    And   I enter value in field Adjustments made to opening balance with "<v2>" in OAA
    And   I enter value in field Income with "<v3>" in OAA
    And   I enter value in field Expenditure with "<v4>" in OAA
    Then  I see the total is NOT "<total>" in OAA

    Examples:
      | v1 | total |
# data to be  provided


  Scenario Outline:Testing the Agency Agreement in Balance Sheet Funds and Other Disclosures with All Financial Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I have navigated to Other Agency Arrangement page

    And   I enter value in field Opening Balance with "<v1>" in OAA
    And   I enter value in field Adjustments made to opening balance with "<v2>" in OAA
    And   I enter value in field Income with "<v3>" in OAA
    And   I enter value in field Expenditure with "<v4>" in OAA
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1 | error |
# data to be  provided


  Scenario Outline:Testing the Agency Agreement in Balance Sheet Funds and Other Disclosures with Invalid Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I have navigated to Other Agency Arrangement page

    And   I enter value in field Opening Balance with "<v1>" in OAA
    And   I enter value in field Adjustments made to opening balance with "<v2>" in OAA
    And   I enter value in field Income with "<v3>" in OAA
    And   I enter value in field Expenditure with "<v4>" in OAA
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | error |
# data to be  provided