Feature: Testing the Changes to the present value of the defined benefit obligation page


  Scenario Outline:Testing the Changes to the present value of the defined benefit obligation page with Valid entries

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Changes to the present value of the defined benefit obligation page
    When   I enter value in field Opening present value of scheme obligation with "<v1>" in CTTPVOTDBO
    When   I enter value in field Adjustments made to opening balance with "<v2>" in CTTPVOTDBO
    When   I enter value in field Conversion of academy in prior year with "<v3>" in CTTPVOTDBO
    When   I enter value in field In-year conversion of academy with "<v4>" in CTTPVOTDBO
    When   I enter value in field Current Sevice Cost with "<v5>" in CTTPVOTDBO
    When   I enter value in field Interest cost with "<v6>" in CTTPVOTDBO
    When   I enter value in field Actuarial with "<v7>" in CTTPVOTDBO
    When   I enter value in field Employee Contributions with "<v8>" in CTTPVOTDBO
    When   I enter value in field Benefits Paid with "<v9>" in CTTPVOTDBO
    When   I enter value in field Losses or Gains on curtailments with "<v10>" in CTTPVOTDBO
    When   I enter value in field Past service cost with "<v11>" in CTTPVOTDBO
    When   I enter value in field Unfunded pension payments with "<v12>" in CTTPVOTDBO
    When   I enter value in field Effect of non-routine settlements with "<v13>" in CTTPVOTDBO
    When   I enter value in field Transferred in on existing academies joining the trust with "<v14>" in CTTPVOTDBO
    When   I enter value in field Transferred out on existing academies leaving the trust with "<v15>" in CTTPVOTDBO
    Then   I see value in field Closing defined benefit obligation with "<v16>" in CTTPVOTDBO
    And    I click on the next

    Examples: Valid Data
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11 | v12 | v13 | v14 | v15 | v16 |
      | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1   | 1   | 1   | 1   | 1   | 1   | 15  |


  Scenario Outline:Testing the Changes to the present value of the defined benefit obligation page with Invalid entries

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Changes to the present value of the defined benefit obligation page
    When   I enter value in field Opening present value of scheme obligation with "<v1>" in CTTPVOTDBO
    When   I enter value in field Adjustments made to opening balance with "<v2>" in CTTPVOTDBO
    When   I enter value in field Conversion of academy in prior year with "<v3>" in CTTPVOTDBO
    When   I enter value in field In-year conversion of academy with "<v4>" in CTTPVOTDBO
    When   I enter value in field Current Sevice Cost with "<v5>" in CTTPVOTDBO
    When   I enter value in field Interest cost with "<v6>" in CTTPVOTDBO
    When   I enter value in field Actuarial with "<v7>" in CTTPVOTDBO
    When   I enter value in field Employee Contributions with "<v8>" in CTTPVOTDBO
    When   I enter value in field Benefits Paid with "<v9>" in CTTPVOTDBO
    When   I enter value in field Losses or Gains on curtailments with "<v10>" in CTTPVOTDBO
    When   I enter value in field Past service cost with "<v11>" in CTTPVOTDBO
    When   I enter value in field Unfunded pension payments with "<v12>" in CTTPVOTDBO
    When   I enter value in field Effect of non-routine settlements with "<v13>" in CTTPVOTDBO
    When   I enter value in field Transferred in on existing academies joining the trust with "<v14>" in CTTPVOTDBO
    When   I enter value in field Transferred out on existing academies leaving the trust with "<v15>" in CTTPVOTDBO
    Then   I see value in field Closing defined benefit obligation is NOT "<v16>" in CTTPVOTDBO
    And    I click on the next

    Examples: Invalid Data
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11 | v12 | v13 | v14 | v15 | v16 |
      | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1   | 1   | 1   | 1   | 1   | 1   | 14  |


  Scenario Outline:Testing the Changes to the present value of the defined benefit obligation page with Error All Financial Data Error

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Changes to the present value of the defined benefit obligation page
    When   I enter value in field Opening present value of scheme obligation with "<v1>" in CTTPVOTDBO
    When   I enter value in field Adjustments made to opening balance with "<v2>" in CTTPVOTDBO
    When   I enter value in field Conversion of academy in prior year with "<v3>" in CTTPVOTDBO
    When   I enter value in field In-year conversion of academy with "<v4>" in CTTPVOTDBO
    When   I enter value in field Current Sevice Cost with "<v5>" in CTTPVOTDBO
    When   I enter value in field Interest cost with "<v6>" in CTTPVOTDBO
    When   I enter value in field Actuarial with "<v7>" in CTTPVOTDBO
    When   I enter value in field Employee Contributions with "<v8>" in CTTPVOTDBO
    When   I enter value in field Benefits Paid with "<v9>" in CTTPVOTDBO
    When   I enter value in field Losses or Gains on curtailments with "<v10>" in CTTPVOTDBO
    When   I enter value in field Past service cost with "<v11>" in CTTPVOTDBO
    When   I enter value in field Unfunded pension payments with "<v12>" in CTTPVOTDBO
    When   I enter value in field Effect of non-routine settlements with "<v13>" in CTTPVOTDBO
    When   I enter value in field Transferred in on existing academies joining the trust with "<v14>" in CTTPVOTDBO
    When   I enter value in field Transferred out on existing academies leaving the trust with "<v15>" in CTTPVOTDBO
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: All Financial Data Error
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11 | v12 | v13 | v14 | v15 | error |
      | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1   | 1   | 1   | 1   | 1   | 1   | 14    |


  Scenario Outline:Testing the Changes to the present value of the defined benefit obligation page with Error Invalid Data Format

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Changes to the present value of the defined benefit obligation page
    When   I enter value in field Opening present value of scheme obligation with "<v1>" in CTTPVOTDBO
    When   I enter value in field Adjustments made to opening balance with "<v2>" in CTTPVOTDBO
    When   I enter value in field Conversion of academy in prior year with "<v3>" in CTTPVOTDBO
    When   I enter value in field In-year conversion of academy with "<v4>" in CTTPVOTDBO
    When   I enter value in field Current Sevice Cost with "<v5>" in CTTPVOTDBO
    When   I enter value in field Interest cost with "<v6>" in CTTPVOTDBO
    When   I enter value in field Actuarial with "<v7>" in CTTPVOTDBO
    When   I enter value in field Employee Contributions with "<v8>" in CTTPVOTDBO
    When   I enter value in field Benefits Paid with "<v9>" in CTTPVOTDBO
    When   I enter value in field Losses or Gains on curtailments with "<v10>" in CTTPVOTDBO
    When   I enter value in field Past service cost with "<v11>" in CTTPVOTDBO
    When   I enter value in field Unfunded pension payments with "<v12>" in CTTPVOTDBO
    When   I enter value in field Effect of non-routine settlements with "<v13>" in CTTPVOTDBO
    When   I enter value in field Transferred in on existing academies joining the trust with "<v14>" in CTTPVOTDBO
    When   I enter value in field Transferred out on existing academies leaving the trust with "<v15>" in CTTPVOTDBO
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: All Financial Data Error
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11 | v12 | v13 | v14 | v15 | error |
      | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1   | 1   | 1   | 1   | 1   | 1   | 14    |



