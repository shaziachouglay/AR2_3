Feature: Testing the Major Assumptions for pension in Pensions Section

  Scenario Outline:Testing the Major Assumptions for pension in Pensions Section with Valid Credentials

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Major Assumption for Pension page
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v2>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v3>" and "<v4>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v5>" and "<v6>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v7>" and "<v8>" in MAFP
    And    I click on the next
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 |
      |1   |1   |1   |1   |1   |1   |1   |1   |


  Scenario Outline:Testing the Major Assumptions for pension in Pensions Section with Errors All Financial Data

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Major Assumption for Pension page
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v1>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v1>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v1>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v1>" in MAFP
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1    | error |
      |9999999|10     |


  Scenario Outline:Testing the Major Assumptions for pension in Pensions Section with Errors Invalid Data Format

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Major Assumption for Pension page
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v1>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v1>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v1>" in MAFP
    And    I enter value in row Rate of Inflation and columns with "<v1>" and "<v1>" in MAFP
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1    | error |
      |*******|10     |


#test lines commiting change