Feature: Testing the Capital Commitment Contracted in Balance Sheet Funds and Other Disclosures

   Scenario Outline: Testing the Capital Commitment Contracted in Balance Sheet Funds and Other Disclosures with valid Data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    When  I navigate to Others Capital Commitment Contracted page
    And   I enter value in Property Plant Equipment with "<v1>"in CCC
    And   I enter value in field Intangible Assets with "<v12>"in CCC
    Then  I see value in field Total is "<total>" in CCC
     And  I click on the next
    Examples:
      | v1 | v12 | total |
#     data to be provided


  Scenario Outline: Testing the Capital Commitment Contracted in Balance Sheet Funds and Other Disclosures with invalid Data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    When  I navigate to Others Capital Commitment Contracted page
    And   I enter value in Property Plant Equipment with "<v1>"in CCC
    And   I enter value in field Intangible Assets with "<v12>"in CCC
    Then  I see value in field Total is not "<total>" in CCC
    Examples:
      | v1 | v12 | total |
#     data to be provided


  Scenario Outline: Testing the Capital Commitment Contracted in Balance Sheet Funds and Other Disclosures with valid Data for All Financial Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    When  I navigate to Others Capital Commitment Contracted page
    And   I enter value in Property Plant Equipment with "<v1>"in CCC
    And   I enter value in field Intangible Assets with "<v12>"in CCC
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1 | v12 | error |


  Scenario Outline: Testing the Capital Commitment Contracted in Balance Sheet Funds and Other Disclosures with valid Data for Invalid Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    When  I navigate to Others Capital Commitment Contracted page
    And   I enter value in Property Plant Equipment with "<v1>"in CCC
    And   I enter value in field Intangible Assets with "<v12>"in CCC
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | v12 | error |
# data to be provided.
