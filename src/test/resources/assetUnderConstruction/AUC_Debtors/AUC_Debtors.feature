@auc_debtors
Feature: Testing the Debtors Page in AUC

  @bsa_references
  Scenario: reference Testing the Debtors Page

    Given I am on Asset Under Construction
    And   I have navigated to the Debtors Section for AUC
    Then I see the correct references are displayed for "auc_Debtors" page of type "Table"



  Scenario Outline: Testing the Debtors Page in AUC VALID scenario

    Given I am on Asset Under Construction
    And   I have navigated to the Debtors Section for AUC

    And   I enter value in row Accrued Capital Grant DfEESFA and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Accrued capital grant other and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Accrued Income column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Other Debtors and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    Then  I must see value in row Totals and column Amounts due within one year with "<v2>" and column Amount due after more than one year with "<v2>"
    Examples:
      | v1 | v2 |
      |1   |4   |


  Scenario Outline: Testing the Debtors Page in AUC InVALID scenario

    Given I am on Asset Under Construction
    And   I have navigated to the Debtors Section for AUC

    And   I enter value in row Accrued Capital Grant DfEESFA and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Accrued capital grant other and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Accrued Income column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Other Debtors and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    Then  I must not see value in row Totals and column Amounts due within one year with "<v2>" and column Amount due after more than one year with "<v2>"
    Examples:
      | v1 | v2 |
      |1   |5   |

  Scenario Outline: Testing the Debtors Page in AUC All Financial Data Error

    Given I am on Asset Under Construction
    And   I have navigated to the Debtors Section for AUC

    And   I enter value in row Accrued Capital Grant DfEESFA and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Accrued capital grant other and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Accrued Income column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Other Debtors and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: All Financial Data Error
      | v1        | error |
      |9999999    |8      |

  Scenario Outline: Testing the Debtors Page in AUC Invalid Data Format

    Given I am on Asset Under Construction
    And   I have navigated to the Debtors Section for AUC

    And   I enter value in row Accrued Capital Grant DfEESFA and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Accrued capital grant other and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Accrued Income column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    And   I enter value in row Other Debtors and column Amounts due within one year with "<v1>" and column Amount due after more than one year with "<v1>"
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Invalid Data Fomrat Error
      | v1        | error |
      |*******    |8      |