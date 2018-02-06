Feature: Testing the Loan Movement Table for BSL


  Scenario Outline:Testing the Loan Movement Table for BSL with Valid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Movement Table Section for BSL

    And   I enter value in row Original prior year closing balance and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Original prior year closing balance and Totals column is "<v2>" in BSL Loan Movement page

    And   I enter value in row Adjustments made in relation to the opening balance and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Adjustments made in relation to the opening balance and Totals column is "<v2>" in BSL Loan Movement page

    And   I enter value in row New borrowings and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row New Borrowings and Totals column is "<v2>" in BSL Loan Movement page

    And   I enter value in row Transferred in on existing academies joining the trust and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Transferred in on existing academies joining the trust and Totals column is "<v2>" in BSL Loan Movement page

    And   I enter value in row Transferred in on conversion and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Transferred in on conversion and Totals column is "<v2>" in BSL Loan Movement page

    And   I enter value in row Transferred out on existing academies leaving the trust and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Transferred out on existing academies leaving the trust and Totals column is "<v2>" in BSL Loan Movement page

    And   I enter value in row Repayment of borrowings and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Repayment of borrowings and Totals column is "<v2>" in BSL Loan Movement page

    And   I enter value in row Interest charged and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Interest charged and Totals column is "<v2>" in BSL Loan Movement page

    And   I see value in row Closing balance and all columns with "<v3>" in BSL Loan Movement page
    Then  I see value in row Closing balance and Totals column is "<v4>" in BSL Loan Movement page

    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |3   |8   |24  |



  Scenario Outline:Testing the Loan Movement Table for BSL with Invalid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Movement Table Section for BSL

    And   I enter value in row Original prior year closing balance and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Original prior year closing balance and Totals column is NOT"<v2>" in BSL Loan Movement page

    And   I enter value in row Adjustments made in relation to the opening balance and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Adjustments made in relation to the opening balance and Totals column is NOT"<v2>" in BSL Loan Movement page

    And   I enter value in row New borrowings and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row New Borrowings and Totals column is NOT"<v2>" in BSL Loan Movement page

    And   I enter value in row Transferred in on existing academies joining the trust and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Transferred in on existing academies joining the trust and Totals column is NOT"<v2>" in BSL Loan Movement page

    And   I enter value in row Transferred in on conversion and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Transferred in on conversion and Totals column is NOT"<v2>" in BSL Loan Movement page

    And   I enter value in row Transferred out on existing academies leaving the trust and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Transferred out on existing academies leaving the trust and Totals column is NOT "<v2>" in BSL Loan Movement page

    And   I enter value in row Repayment of borrowings and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Repayment of borrowings and Totals column is NOT"<v2>" in BSL Loan Movement page

    And   I enter value in row Interest charged and all columns with "<v1>" in BSL Loan Movement page
    Then  I see value in row Interest charged and Totals column is NOT"<v2>" in BSL Loan Movement page

    And   I see value in row Closing balance and all columns is NOT "<v3>" in BSL Loan Movement page
    Then  I see value in row Closing balance and Totals column is NOT "<v4>" in BSL Loan Movement page

    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |2   |7   |21  |


  Scenario Outline:Testing the Loan Movement Table for BSL for Errors All Financial Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Movement Table Section for BSL

    And   I enter value in row Original prior year closing balance and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Adjustments made in relation to the opening balance and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row New borrowings and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Transferred in on existing academies joining the trust and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Transferred in on conversion and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Transferred out on existing academies leaving the trust and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Repayment of borrowings and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Interest charged and all columns with "<v1>" in BSL Loan Movement page
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1      | error |
      | 9999999 | 24    |



  Scenario Outline:Testing the Loan Movement Table for BSL for Errors Invalid Data Format

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Loans Movement Table Section for BSL

    And   I enter value in row Original prior year closing balance and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Adjustments made in relation to the opening balance and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row New borrowings and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Transferred in on existing academies joining the trust and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Transferred in on conversion and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Transferred out on existing academies leaving the trust and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Repayment of borrowings and all columns with "<v1>" in BSL Loan Movement page
    And   I enter value in row Interest charged and all columns with "<v1>" in BSL Loan Movement page
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1      | error |
      | ******* | 24    |


