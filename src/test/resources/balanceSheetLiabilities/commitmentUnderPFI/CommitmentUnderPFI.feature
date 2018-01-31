Feature: Testing the Commitment  Under PFI BSL page


  Scenario Outline:Testing the Commitment Under PFI BSL with Valid Data

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Commitment Under PFI BSL

    And   I enter value in row Not later than one year and all columns with "<v1>"
    Then  I see value in row Not later than one year and column Total is "<v2>"

    And   I enter value in row Later than one year but not later than five years  and all columns with "<v1>"
    Then  I see value in row Later than one year but not later than five years  and column Total is "<v2>"

    And   I enter value in row Later than five years and all columns with "<v1>"
    Then  I see value in row Later than five years and column Total is "<v2>"

    Then  I see value in row Total and all columns with "<v3>"
    Then  I see value in row Total and column Total is "<v4>"
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |2   |3   |6   |


  Scenario Outline:Testing the Commitment Under PFI BSL with Invalid Data

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Commitment Under PFI BSL

    And   I enter value in row Not later than one year and all columns with "<v1>"
    Then  I see value in row Not later than one year and column Total is NOT "<v2>"

    And   I enter value in row Later than one year but not later than five years  and all columns with "<v1>"
    Then  I see value in row Later than one year but not later than five years  and column Total is NOT "<v2>"

    And   I enter value in row Later than five years and all columns with "<v1>"
    Then  I see value in row Later than five years and column Total is NOT "<v2>"

    Then  I see value in row Total and all columns is NOT "<v3>"
    Then  I see value in row Total and column Total is NOT "<v4>"
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |1   |2   |5   |



  Scenario Outline:Testing the Commitment Under PFI BSL for ALl Financial Data Error

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Commitment Under PFI BSL

    And   I enter value in row Not later than one year and all columns with "<v1>"

    And   I enter value in row Later than one year but not later than five years  and all columns with "<v1>"

    And   I enter value in row Later than five years and all columns with "<v1>"

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1 | error|
      |1   |6     |




  Scenario Outline:Testing the Commitment Under PFI BSL for Invalid Number Format Error

    Given I am on Balance Sheet Liabilities

    And   I have navigated to the Commitment Under PFI BSL

    And   I enter value in row Not later than one year and all columns with "<v1>"

    And   I enter value in row Later than one year but not later than five years  and all columns with "<v1>"

    And   I enter value in row Later than five years and all columns with "<v1>"

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples:
      | v1 | error|
      |1   |6     |