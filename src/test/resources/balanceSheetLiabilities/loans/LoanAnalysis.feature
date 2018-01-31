Feature: Testing the Loan Analysis Table for BSL


  Scenario Outline:Testing the Loan Analysis Table for BSL with Valid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Analysis Table Section for BSL

    And   I enter in row Withing One Year and all columns with "<v1>"
    Then  I must see the value in row Within One Year and column Total is "<v2>"

    And   I enter in row Between two and five years and all columns with "<v1>"
    Then  I must see the value in row Within One Year and column Total is "<v2>"

    And   I enter in row After more than five years and all columns with "<v1>"
    Then  I must see the value in row Within One Year and column Total is "<v2>"

    Then  I must see the row Total and all columns are "<v3>"
    Then  I must see the row Total and column Total is "<v4>"

    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |3   |3   |9   |


  Scenario Outline:Testing the Loan Analysis Table for BSL with Invalid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Analysis Table Section for BSL

    And   I enter in row Withing One Year and all columns with "<v1>"
    Then  I must see the value in row Within One Year and column Total is NOT "<v2>"

    And   I enter in row Between two and five years and all columns with "<v1>"
    Then  I must see the value in row Within One Year and column Total is NOT "<v2>"

    And   I enter in row After more than five years and all columns with "<v1>"
    Then  I must see the value in row Within One Year and column Total is NOT "<v2>"

    Then  I must see the row Total and all columns are NOT "<v3>"
    Then  I must see the row Total and column Total is NOT "<v4>"

    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |2   |4   |8   |


  Scenario Outline:Testing the Loan Analysis Table for BSL for Errors All Financial Data Error

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Analysis Table Section for BSL

    And   I enter in row Withing One Year and all columns with "<v1>"

    And   I enter in row Between two and five years and all columns with "<v1>"

    And   I enter in row After more than five years and all columns with "<v1>"

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1 | error |
      |1   |9      |



  Scenario Outline:Testing the Loan Analysis Table for BSL for Errors Invalid Number Format Error

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Analysis Table Section for BSL

    And   I enter in row Withing One Year and all columns with "<v1>"

    And   I enter in row Between two and five years and all columns with "<v1>"

    And   I enter in row After more than five years and all columns with "<v1>"

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples:
      | v1 | error |
      |1   |9      |



