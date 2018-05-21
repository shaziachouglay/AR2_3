Feature: testing the AUC Donations Page

  @smoke
  Scenario Outline: testing the AUC Donations Page VALID entries

    Given I am on Asset Under Construction
    And   I have navigated to the Donations Section for AUC
    And   I enter value in field Donations Fixed Assets with "<v1>" in AUC
    And   I enter value in filed Fixed Assets Donated by the DFEESFA with "<v1>" in AUC
    And   I enter value in filed Donated Intangible Assets with "<v1>" in AUC
    And   I enter value in field Other Donations with "<v1>" in AUC
    Then  I must see the field Total is "<v2>" in AUC
    Examples:
      | v1 | v2 |
      |1   |4   |


  @smoke
  Scenario Outline: testing testing the AUC Donations Page INVALID entries

    Given I am on Asset Under Construction
    And   I have navigated to the Donations Section for AUC
    And   I enter value in field Donations Fixed Assets with "<v1>" in AUC
    And   I enter value in filed Fixed Assets Donated by the DFEESFA with "<v1>" in AUC
    And   I enter value in filed Donated Intangible Assets with "<v1>" in AUC
    And   I enter value in field Other Donations with "<v1>" in AUC
    Then  I must see the field Total is NOT "<v2>" in AUC
    Examples:
      | v1 | v2 |
      |1   |5   |


  @smoke
  Scenario Outline: testing testing the AUC Donations Page All Financial data error

    Given I am on Asset Under Construction
    And   I have navigated to the Donations Section for AUC
    And   I enter value in field Donations Fixed Assets with "<v1>" in AUC
    And   I enter value in filed Fixed Assets Donated by the DFEESFA with "<v1>" in AUC
    And   I enter value in filed Donated Intangible Assets with "<v1>" in AUC
    And   I enter value in field Other Donations with "<v1>" in AUC
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1        | error |
      |9999999    |4      |


  @smoke
  Scenario Outline: testing testing the AUC Donations Page Invalid Data Format

    Given I am on Asset Under Construction
    And   I have navigated to the Donations Section for AUC
    And   I enter value in field Donations Fixed Assets with "<v1>" in AUC
    And   I enter value in filed Fixed Assets Donated by the DFEESFA with "<v1>" in AUC
    And   I enter value in filed Donated Intangible Assets with "<v1>" in AUC
    And   I enter value in field Other Donations with "<v1>" in AUC
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1        | error |
      |********   |4      |


  @bsa_references
  Scenario: reference testing the AUC Donations Page

    Given I am on Asset Under Construction
    And   I have navigated to the Donations Section for AUC
    Then I see the correct references are displayed for "auc_Donations" page of type "Label"
