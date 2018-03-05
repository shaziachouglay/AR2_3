Feature: Testing the Reconciliation of Deficit in Pensions Page


  Scenario Outline: Testing the Reconciliation of Deficit in Pensions Page

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Reconciliation of Deficit in Pensions Page
    Then   I see value in field Opening balance as "<v1>" in Pensions ROD
    Then   I see value in field Adjustments made to opening balance as "<v2>" in Pensions ROD
    Then   I see value in field Conversion of academy trusts in prior year as "<v3>" in Pensions ROD
    Then   I see value in field In year conversion of academy trusts as "<v4>" in Pensions ROD
    Then   I see value in field Current service cost as "<v5>" in Pensions ROD
    Then   I see value in field Employer contributions as "<v6>" in Pensions ROD
    Then   I see value in field Unfunded pension payments as "<v7>" in Pensions ROD
    Then   I see value in field Past service cost as "<v8>" in Pensions ROD
    Then   I see value in field Net interest expense as "<v9>" in Pensions ROD
    Then   I see value in field Losses or Gains on curtailments as "<v10>" in Pensions ROD
    Then   I see value in field Actuarial as "<v11>" in Pensions ROD
    Then   I see value in field Effect of non-routine settlements as "<v12>" in Pensions ROD
    Then   I see value in field Transferred in on existing academies joining the trust as "<v13>" in Pensions ROD
    Then   I see value in field Transferred out on existing academies leaving the trust as "<v14>" in Pensions ROD
    Then   I see value in field Closing balance as "<v15>" in Pensions ROD
    Then   I click on the next