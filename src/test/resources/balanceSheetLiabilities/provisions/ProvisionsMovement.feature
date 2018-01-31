Feature: Testing the Provisions Movement Table for BSL


  Scenario Outline:Testing the Provisions Movement Table for BSL with Valid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Provisions Movement Section for BSL

    And   I enter value in field Original prior year closing balance with "<v1>" in BSL Provisions Movement
    And   I enter value in field Adjustments made to opening balance with "<v1>" in BSL Provisions Movement
    And   I enter value in field Charged in the period with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred in on existing academies joining the trust with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred in on conversion with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred out on existing academies leaving the trust with "<v1>" in BSL Provisions Movement
    And   I enter value in field Utilised in the period with "<v1>" in BSL Provisions Movement
    And   I enter value in field Released in the period with "<v1>" in BSL Provisions Movement
    Then  I must see the field total is now "<v2>" in BSL Provisions Movement
    Examples:
      | v1 | v2 |
      |1   |8   |


  Scenario Outline:Testing the Provisions Movement Table for BSL with Invalid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Provisions Movement Section for BSL

    And   I enter value in field Original prior year closing balance with "<v1>" in BSL Provisions Movement
    And   I enter value in field Adjustments made to opening balance with "<v1>" in BSL Provisions Movement
    And   I enter value in field Charged in the period with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred in on existing academies joining the trust with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred in on conversion with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred out on existing academies leaving the trust with "<v1>" in BSL Provisions Movement
    And   I enter value in field Utilised in the period with "<v1>" in BSL Provisions Movement
    And   I enter value in field Released in the period with "<v1>" in BSL Provisions Movement
    Then  I must see the field total is NOT "<v2>" in BSL Provisions Movement
    Examples:
      | v1 | v2 |
      |1   |9   |


  Scenario Outline:Testing the Provisions Movement Table for BSL for error All Financial Data Error

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Provisions Movement Section for BSL

    And   I enter value in field Original prior year closing balance with "<v1>" in BSL Provisions Movement
    And   I enter value in field Adjustments made to opening balance with "<v1>" in BSL Provisions Movement
    And   I enter value in field Charged in the period with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred in on existing academies joining the trust with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred in on conversion with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred out on existing academies leaving the trust with "<v1>" in BSL Provisions Movement
    And   I enter value in field Utilised in the period with "<v1>" in BSL Provisions Movement
    And   I enter value in field Released in the period with "<v1>" in BSL Provisions Movement
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1      | error |
      | 9999999 | 8     |



  Scenario Outline:Testing the Provisions Movement Table for BSL for error Invalid Data Format

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Provisions Movement Section for BSL

    And   I enter value in field Original prior year closing balance with "<v1>" in BSL Provisions Movement
    And   I enter value in field Adjustments made to opening balance with "<v1>" in BSL Provisions Movement
    And   I enter value in field Charged in the period with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred in on existing academies joining the trust with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred in on conversion with "<v1>" in BSL Provisions Movement
    And   I enter value in field Transferred out on existing academies leaving the trust with "<v1>" in BSL Provisions Movement
    And   I enter value in field Utilised in the period with "<v1>" in BSL Provisions Movement
    And   I enter value in field Released in the period with "<v1>" in BSL Provisions Movement
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1      | error |
      | ******* | 8     |