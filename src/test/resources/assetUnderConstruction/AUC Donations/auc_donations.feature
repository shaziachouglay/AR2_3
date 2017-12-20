Feature: testing the AUC Donations Page


  Scenario Outline: testing testing the AUC Donations Page VALID entries

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

