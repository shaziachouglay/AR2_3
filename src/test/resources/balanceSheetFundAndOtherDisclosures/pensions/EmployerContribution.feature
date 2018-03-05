Feature: testing the employer contribution page in Pensions


  Scenario Outline: Testing the employer contribution page with Valid Credentilas

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Employer Contribution
    And    I enter value in field Estimated expected regular employer with "<v1>"
    And    I click on the next
    Examples:
      | v1 |
      |1   |

  Scenario Outline: Testing the employer contribution page Error All Financial Data Error

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Employer Contribution
    And    I enter value in field Estimated expected regular employer with "<v1>"
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1       |error|
      |9999999   |1    |


  Scenario Outline: Testing the employer contribution page Error Invalid Data Format

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Employer Contribution
    And    I enter value in field Estimated expected regular employer with "<v1>"
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1       |error|
      |9999999   |1    |

