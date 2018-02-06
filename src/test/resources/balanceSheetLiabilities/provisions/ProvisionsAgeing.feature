Feature: Testing the Provisions Ageing BSL


   Scenario Outline:Testing the Provisions Ageing Table for BSL with Valid Data

    Given I am on Balance Sheet Liabilities

     And   I have navigated to the Provisions Ageing Section for BSL
     And   I enter value in field Within one year with "<v1>" in BSL Provisions Ageing
     And   I enter value in field Between two and five years with "<v1>" in BSL Provisions Ageing
     And   I enter value in field MOre than five years with "<v1>" in BSL Provisions Ageing
     Then  I see the field total is "<v2>" in BSL Provisions Ageing
     Examples:
       | v1 | v2 |
       |1   |3   |


  Scenario Outline:Testing the Provisions Ageing Table for BSL with Invalid Data

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Provisions Ageing Section for BSL
    And   I enter value in field Within one year with "<v1>" in BSL Provisions Ageing
    And   I enter value in field Between two and five years with "<v1>" in BSL Provisions Ageing
    And   I enter value in field MOre than five years with "<v1>" in BSL Provisions Ageing
    Then  I see the field total is NOT "<v2>" in BSL Provisions Ageing
    Examples:
      | v1 | v2 |
      |1   |4   |


  Scenario Outline:Testing the Provisions Ageing Table for BSL for All Financial Data Error 

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Provisions Ageing Section for BSL
    And   I enter value in field Within one year with "<v1>" in BSL Provisions Ageing
    And   I enter value in field Between two and five years with "<v1>" in BSL Provisions Ageing
    And   I enter value in field MOre than five years with "<v1>" in BSL Provisions Ageing
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1      | error |
      | 9999999 | 3     |



  Scenario Outline:Testing the Provisions Ageing Table for BSL for Invalid Data Format Error

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Provisions Ageing Section for BSL
    And   I enter value in field Within one year with "<v1>" in BSL Provisions Ageing
    And   I enter value in field Between two and five years with "<v1>" in BSL Provisions Ageing
    And   I enter value in field MOre than five years with "<v1>" in BSL Provisions Ageing
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | error |
      | *  | 3     |
