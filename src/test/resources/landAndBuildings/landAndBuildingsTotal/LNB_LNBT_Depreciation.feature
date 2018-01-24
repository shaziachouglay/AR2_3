Feature: Testing the Land And Building depreciation page.

  Scenario Outline: Testing the Land and Buildings Trust Owned Depreciation Page with Errors All Financial Data


    Given I am on Land and Buildings Section

    And   I have navigated to the Trust Owned Depreciation Page

    And   I enter in row Original prior year closing balance  and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Adjustments made to opening balance and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Charged in period and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Eliminated on disposal and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Revaluations and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Reclassifications and all column with "<v1>" in TO_Depreciation page

    And   I click on the Save And Next button in Cost page

    And   I have navigated to the Academies Depreciation Page

    And   I enter in row Original prior year closing balance  and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Adjustments made to opening balance and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Charged in period and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Eliminated on disposal and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Transferred out on existing Academies joining the Trust and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Revaluations and all column with "<v1>" in TO_Depreciation page

    And   I enter in row Reclassifications and all column with "<v1>" in TO_Depreciation page

    And   I click on the Save And Next button in Cost page

    And   I have navigated to the Land and Buildings Total Depreciation Page

    Then  I see all the fields are populated with "<total>" in LNBT Depreciation Page

    Then  I must see the value for field TransferredInOnExistingAcademiesJoiningTheTrust is "<value>"

    Then  I see the filed At the Close of period is now "<AtCloseOfPeriod>"
    Examples:
      | v1 | total | AtCloseOfPeriod |value|
      |1   |6      |45               |3    |
