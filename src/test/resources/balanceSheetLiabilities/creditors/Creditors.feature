Feature: Testing the BSL Creditors page


  Scenario Outline: Testing the BSL Creditors page Valid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Creditors Section for BSL

    And   I enter value in row Bank Overdraft and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Loans and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Loans and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Trade Creditor and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row VAT payable and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other taxation and social security and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other creditors and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Other creditors and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Corporation tax and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Unused holiday accrual and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other accruals and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Other accruals and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income capital grants DFE and ESFA and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income capital grants DFE and ESFA and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other Capital Grants and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other Capital Grants and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other Revenue Grants and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other Revenue Grants and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Finance leases and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Finance leases and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Imputed finance lease of on balance sheet PFI contracts and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Imputed finance lease of on-balance sheet PFI contracts and column Creditors more than one year with "<v1>" in creditors Page

    Then  I see value in row Total and column Creditors less then one year with "<v2>" in creditors Page
    Then  I see value in row Total and column Creditors more than one year with "<v3>" in creditors Page

    Examples:
      | v1 | v2 | v3 |
      |1   |16  |10  |


  Scenario Outline: Testing the BSL Creditors page Invalid Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Creditors Section for BSL

    And   I enter value in row Bank Overdraft and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Loans and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Loans and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Trade Creditor and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row VAT payable and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other taxation and social security and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other creditors and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Other creditors and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Corporation tax and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Unused holiday accrual and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other accruals and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Other accruals and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income capital grants DFE and ESFA and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income capital grants DFE and ESFA and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other Capital Grants and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other Capital Grants and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other Revenue Grants and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other Revenue Grants and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Finance leases and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Finance leases and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Imputed finance lease of on balance sheet PFI contracts and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Imputed finance lease of on-balance sheet PFI contracts and column Creditors more than one year with "<v1>" in creditors Page

    Then  I see value in row Total and column Creditors less then one year is not  "<v2>" in creditors Page
    Then  I see value in row Total and column Creditors more than one year is not  "<v3>" in creditors Page

    Examples:
      | v1 | v2 | v3 |
      |1   |15  |11  |

  Scenario Outline: Testing the BSL Creditors page Errors All Financial Data

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Creditors Section for BSL

    And   I enter value in row Bank Overdraft and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Loans and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Loans and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Trade Creditor and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row VAT payable and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other taxation and social security and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other creditors and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Other creditors and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Corporation tax and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Unused holiday accrual and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other accruals and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Other accruals and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income capital grants DFE and ESFA and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income capital grants DFE and ESFA and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other Capital Grants and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other Capital Grants and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other Revenue Grants and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other Revenue Grants and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Finance leases and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Finance leases and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Imputed finance lease of on balance sheet PFI contracts and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Imputed finance lease of on-balance sheet PFI contracts and column Creditors more than one year with "<v1>" in creditors Page

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1 | error |
      |9999999|26  |


  Scenario Outline: Testing the BSL Creditors page Errors Invalid Data Format

    Given I am on Balance Sheet Liabilities
    And   I have navigated to the Creditors Section for BSL

    And   I enter value in row Bank Overdraft and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Loans and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Loans and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Trade Creditor and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row VAT payable and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other taxation and social security and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other creditors and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Other creditors and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Corporation tax and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Unused holiday accrual and column Creditors less than one year with "<v1>" in creditors Page

    And   I enter value in row Other accruals and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Other accruals and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income capital grants DFE and ESFA and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income capital grants DFE and ESFA and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other Capital Grants and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other Capital Grants and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Deferred income Other Revenue Grants and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Deferred income Other Revenue Grants and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Finance leases and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Finance leases and column Creditors more than one year with "<v1>" in creditors Page

    And   I enter value in row Imputed finance lease of on balance sheet PFI contracts and column Creditors less then one year with "<v1>" in creditors Page
    And   I enter value in row Imputed finance lease of on-balance sheet PFI contracts and column Creditors more than one year with "<v1>" in creditors Page

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | error |
      |*******|26  |