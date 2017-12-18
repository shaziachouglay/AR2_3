Feature: testing the debtors page in BSA

  Scenario Outline: testing the BSA debtors for valid credentials

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Debtors page
    And   I enter value for row Trade debtors before bad debt and cloumn Amt due within one year with "<v1>" and column Amt due after one year with "<v2>"
    And   I enter value for row BAd Debt and cloumn Amt due within one year with "<v3>" and column Amt due after one year with "<v4>"
    And   I enter value for row Accrued capital grant DfE_ESFA and cloumn Amt due within one year with "<v5>" and column Amt due after one year with "<v6>"
    And   I enter value for row Accrued capital grant other and cloumn Amt due within one year with "<v7>" and column Amt due after one year with "<v8>"
    And   I enter value for row Accrued revenue grants DFE_ESFA and cloumn Amt due within one year with "<v9>" and column Amt due after one year with "<v10>"
    And   I enter value for row Accrued revenue grants other and cloumn Amt due within one year with "<v11>" and column Amt due after one year with "<v12>"
    And   I enter value for row Prepayments and cloumn Amt due within one year with "<v13>" and column Amt due after one year with "<v14>"
    And   I enter value for row Accrued income and cloumn Amt due within one year with "<v15>" and column Amt due after one year with "<v16>"
    And   I enter value for row VAT recoverable and cloumn Amt due within one year with "<v17>" and column Amt due after one year with "<v18>"
    And   I enter value for row PFI payment  and cloumn Amt due within one year with "<v19>" and column Amt due after one year with "<v20>"
    And   I enter value for row Other debtors and cloumn Amt due within one year with "<v21>" and column Amt due after one year with "<v22>"
    Then  I musts see the row Total and column Amt due within one year is "<v23>" and column Amt due after one year is "<v24>"

    Examples:valid credentials

      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11 | v12 | v13 | v14 | v15 | v16 | v17 | v18 | v19 | v20 | v21 | v22 | v23 | v24 |
      | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 11  | 11  |

  Scenario Outline: testing the BSA debtors for All Financial Data Errors credentials

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Debtors page
    And   I enter value for row Trade debtors before bad debt and cloumn Amt due within one year with "<v1>" and column Amt due after one year with "<v2>"
    And   I enter value for row BAd Debt and cloumn Amt due within one year with "<v3>" and column Amt due after one year with "<v4>"
    And   I enter value for row Accrued capital grant DfE_ESFA and cloumn Amt due within one year with "<v5>" and column Amt due after one year with "<v6>"
    And   I enter value for row Accrued capital grant other and cloumn Amt due within one year with "<v7>" and column Amt due after one year with "<v8>"
    And   I enter value for row Accrued revenue grants DFE_ESFA and cloumn Amt due within one year with "<v9>" and column Amt due after one year with "<v10>"
    And   I enter value for row Accrued revenue grants other and cloumn Amt due within one year with "<v11>" and column Amt due after one year with "<v12>"
    And   I enter value for row Prepayments and cloumn Amt due within one year with "<v13>" and column Amt due after one year with "<v14>"
    And   I enter value for row Accrued income and cloumn Amt due within one year with "<v15>" and column Amt due after one year with "<v16>"
    And   I enter value for row VAT recoverable and cloumn Amt due within one year with "<v17>" and column Amt due after one year with "<v18>"
    And   I enter value for row PFI payment  and cloumn Amt due within one year with "<v19>" and column Amt due after one year with "<v20>"
    And   I enter value for row Other debtors and cloumn Amt due within one year with "<v21>" and column Amt due after one year with "<v22>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples:valid credentials

      | v1      | v2      | v3      | v4      | v5      | v6      | v7      | v8      | v9      | v10     | v11     | v12     | v13     | v14     | v15     | v16     | v17     | v18     | v19     | v20     | v21     | v22     |error|
      | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 |22   |



  Scenario Outline: testing the BSA debtors for Invalid format Errors credentials

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Debtors page
    And   I enter value for row Trade debtors before bad debt and cloumn Amt due within one year with "<v1>" and column Amt due after one year with "<v2>"
    And   I enter value for row BAd Debt and cloumn Amt due within one year with "<v3>" and column Amt due after one year with "<v4>"
    And   I enter value for row Accrued capital grant DfE_ESFA and cloumn Amt due within one year with "<v5>" and column Amt due after one year with "<v6>"
    And   I enter value for row Accrued capital grant other and cloumn Amt due within one year with "<v7>" and column Amt due after one year with "<v8>"
    And   I enter value for row Accrued revenue grants DFE_ESFA and cloumn Amt due within one year with "<v9>" and column Amt due after one year with "<v10>"
    And   I enter value for row Accrued revenue grants other and cloumn Amt due within one year with "<v11>" and column Amt due after one year with "<v12>"
    And   I enter value for row Prepayments and cloumn Amt due within one year with "<v13>" and column Amt due after one year with "<v14>"
    And   I enter value for row Accrued income and cloumn Amt due within one year with "<v15>" and column Amt due after one year with "<v16>"
    And   I enter value for row VAT recoverable and cloumn Amt due within one year with "<v17>" and column Amt due after one year with "<v18>"
    And   I enter value for row PFI payment  and cloumn Amt due within one year with "<v19>" and column Amt due after one year with "<v20>"
    And   I enter value for row Other debtors and cloumn Amt due within one year with "<v21>" and column Amt due after one year with "<v22>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples:valid credentials

      | v1      | v2      | v3      | v4      | v5      | v6      | v7      | v8      | v9      | v10     | v11     | v12     | v13     | v14     | v15     | v16     | v17     | v18     | v19     | v20     | v21     | v22     |error|
      | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 |22   |