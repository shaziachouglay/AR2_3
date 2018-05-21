Feature: testing the Cash page in BSA


  Scenario Outline: Testing the cash page in BSA

    Given I am on Balance Sheet Asset Section
    When  I navigate to BSA Cash page
    And   I enter value in field Cash Balance "<cashBalance>"
    And   I click on the Save And Next button in Cash Page

    Examples:
      | cashBalance  |
      |1             |
      |50            |
      |1500          |
      |999999        |


  Scenario Outline: Testing All Financial Errors on Cash page in BSA

    Given I am on Balance Sheet Asset Section
    When  I navigate to BSA Cash page
    And   I enter value in field Cash Balance "<cashBalance>"
    And   I click on the Save And Next button in Cash Page
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: All Financial Error
      | cashBalance  |error|
      |9999999       |1    |


  Scenario Outline: Testing All Financial Errors on Cash page in BSA

    Given I am on Balance Sheet Asset Section
    When  I navigate to BSA Cash page
    And   I enter value in field Cash Balance "<cashBalance>"
    And   I click on the Save And Next button in Cash Page
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: All Financial Error
      | cashBalance  |error|
      |@£$%$%*       |1    |


  @bsa_references
  Scenario: reference testing the Cash page in BSA

    Given I am on Balance Sheet Asset Section
    When  I navigate to BSA Cash page
    Then I see the correct references are displayed for "bsa_Cash" page of type "Label"
