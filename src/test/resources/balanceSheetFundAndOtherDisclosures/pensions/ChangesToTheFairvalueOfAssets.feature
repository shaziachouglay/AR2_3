Feature: Testing the Changes to the fair value of assets page in Pensions

  Scenario Outline:Testing the Changes to the fair value of assets page in Pensions with Valid Data

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Changes to the fair value of assets page in Pensions
    When   I enter value in field Opening fair value of scheme assets with "<v1>" in Pensions_CTTFVOA
    When   I enter value in field Adjustments made to opening balance with "<v2>" in Pensions_CTTFVOA
    When   I enter value in field Conversion of academy trusts in prior year with "<v3>" in Pensions_CTTFVOA
    When   I enter value in field In-year conversion of academy trusts with "<v4>" in Pensions_CTTFVOA
    When   I enter value in field Interest income with "<v5>" in Pensions_CTTFVOA
    When   I enter value in field Actuarial with "<v6>" in Pensions_CTTFVOA
    When   I enter value in field Employer contributions with "<v7>" in Pensions_CTTFVOA
    When   I enter value in field Employee Contributions with "<v8>" in Pensions_CTTFVOA
    When   I enter value in field Benefits Paid with "<v9>" in Pensions_CTTFVOA
    When   I enter value in field Effect of non-routine settlements with "<v10>" in Pensions_CTTFVOA
    When   I enter value in field Transferred in on existing academies joining the trust with "<v11>" in Pensions_CTTFVOA
    When   I enter value in field Transferred out on existing academies leaving the trust with "<v12>" in Pensions_CTTFVOA
    Then   I see value in field Closing fair value of scheme assets with "<v13>" in Pensions_CTTFVOA
    And    I click on the next
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11 | v12 | v13 |
      | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1   | 1   | 1   | 12  |


  Scenario Outline:Testing the Changes to the fair value of assets page in Pensions with Invalid Data

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Changes to the fair value of assets page in Pensions
    When   I enter value in field Opening fair value of scheme assets with "<v1>" in Pensions_CTTFVOA
    When   I enter value in field Adjustments made to opening balance with "<v2>" in Pensions_CTTFVOA
    When   I enter value in field Conversion of academy trusts in prior year with "<v3>" in Pensions_CTTFVOA
    When   I enter value in field In-year conversion of academy trusts with "<v4>" in Pensions_CTTFVOA
    When   I enter value in field Interest income with "<v5>" in Pensions_CTTFVOA
    When   I enter value in field Actuarial with "<v6>" in Pensions_CTTFVOA
    When   I enter value in field Employer contributions with "<v7>" in Pensions_CTTFVOA
    When   I enter value in field Employee Contributions with "<v8>" in Pensions_CTTFVOA
    When   I enter value in field Benefits Paid with "<v9>" in Pensions_CTTFVOA
    When   I enter value in field Effect of non-routine settlements with "<v10>" in Pensions_CTTFVOA
    When   I enter value in field Transferred in on existing academies joining the trust with "<v11>" in Pensions_CTTFVOA
    When   I enter value in field Transferred out on existing academies leaving the trust with "<v12>" in Pensions_CTTFVOA
    Then   I see value in field Closing fair value of scheme assets is NOT "<v13>" in Pensions_CTTFVOA
    And    I click on the next
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11 | v12 | v13 |
      | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1   | 1   | 1   | 13  |

  Scenario Outline:Testing the Changes to the fair value of assets page in Pensions with Error All financial Data Error

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Changes to the fair value of assets page in Pensions
    When   I enter value in field Opening fair value of scheme assets with "<v1>" in Pensions_CTTFVOA
    When   I enter value in field Adjustments made to opening balance with "<v2>" in Pensions_CTTFVOA
    When   I enter value in field Conversion of academy trusts in prior year with "<v3>" in Pensions_CTTFVOA
    When   I enter value in field In-year conversion of academy trusts with "<v4>" in Pensions_CTTFVOA
    When   I enter value in field Interest income with "<v5>" in Pensions_CTTFVOA
    When   I enter value in field Actuarial with "<v6>" in Pensions_CTTFVOA
    When   I enter value in field Employer contributions with "<v7>" in Pensions_CTTFVOA
    When   I enter value in field Employee Contributions with "<v8>" in Pensions_CTTFVOA
    When   I enter value in field Benefits Paid with "<v9>" in Pensions_CTTFVOA
    When   I enter value in field Effect of non-routine settlements with "<v10>" in Pensions_CTTFVOA
    When   I enter value in field Transferred in on existing academies joining the trust with "<v11>" in Pensions_CTTFVOA
    When   I enter value in field Transferred out on existing academies leaving the trust with "<v12>" in Pensions_CTTFVOA
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11 | v12 | error |
      | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1   | 1   | 1   | 13    |


