Feature: testing the stock page in BSA

#  valid scenario
#  error triggering - financial data - misformat string.

  Scenario Outline: testing the stock page in BSA for valid inputs

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Stock page
    And   I enter value in field Stock with "<Stock>"
    And   I click on the Save And Next button in Stock Page

    Examples:
      | Stock |
      |1      |

  Scenario Outline: testing the stock page in BSA for All Financial Data Error inputs

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Stock page
    And   I enter value in field Stock with "<Stock>"
    And   I click on the Save And Next button in Stock Page
    And   I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples:
      | Stock |error|
      |9999999|1    |


  Scenario Outline: testing the stock page in BSA for Invalid Format Errors inputs

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Stock page
    And   I enter value in field Stock with "<Stock>"
    And   I click on the Save And Next button in Stock Page
    And   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples:
      | Stock |error|
      |*&*&*&*|1    |



  @bsa_references
  Scenario: reference testing the stock page in BSA

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Stock page
    Then I see the correct references are displayed for "bsa_Stock" page of type "Label"
