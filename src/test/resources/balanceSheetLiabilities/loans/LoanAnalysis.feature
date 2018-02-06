Feature: Testing the Loan Analysis Table for BSL


  Scenario Outline:Testing the Loan Analysis Table for BSL with Valid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Analysis Table Section for BSL

    And   I enter in row Withing One Year and all columns with "<v1>" in BSL Loan Analysis
    Then  I must see the value in row Within One Year and column Total is "<v2>"in BSL Loan Analysis

    And   I enter in row Between two and five years and all columns with "<v1>"in BSL Loan Analysis
    Then  I must see the value in row Between two and five years and column Total is "<v2>"in BSL Loan Analysis

    And   I enter in row After more than five years and all columns with "<v1>"in BSL Loan Analysis
    Then  I must see the value in row After more than five years and column Total is "<v2>"in BSL Loan Analysis

    Then  I must see the row Total and all columns are "<v3>"in BSL Loan Analysis
    Then  I must see the row Total and column Total is "<v4>"in BSL Loan Analysis

    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |3   |3   |9   |


  Scenario Outline:Testing the Loan Analysis Table for BSL with Invalid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Analysis Table Section for BSL

    And   I enter in row Withing One Year and all columns with "<v1>" in BSL Loan Analysis
    Then  I must see the value in row Within One Year and column Total is NOT "<v2>"in BSL Loan Analysis

    And   I enter in row Between two and five years and all columns with "<v1>"in BSL Loan Analysis
    Then  I must see the value in row Between two and five years and column Total is NOT "<v2>"in BSL Loan Analysis

    And   I enter in row After more than five years and all columns with "<v1>"in BSL Loan Analysis
    Then  I must see the value in row After more than five years and column Total is NOT "<v2>"in BSL Loan Analysis

    Then  I must see the row Total and all columns are NOT "<v3>"in BSL Loan Analysis
    Then  I must see the row Total and column Total is NOT "<v4>"in BSL Loan Analysis

    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |2   |2   |8   |



  Scenario Outline:Testing the Loan Analysis Table for BSL Errors All Financial Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Analysis Table Section for BSL

    And   I enter in row Withing One Year and all columns with "<v1>" in BSL Loan Analysis

    And   I enter in row Between two and five years and all columns with "<v1>"in BSL Loan Analysis

    And   I enter in row After more than five years and all columns with "<v1>"in BSL Loan Analysis
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"





