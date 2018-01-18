Feature: Testing the Land and Buildings Trust Owned Depreciation Page


  Scenario Outline: Testing the Land and Buildings Trust Owned Depreciation Page with Valid Credentials

    Given I am on Land and Buildings Section
    And   I have navigated to the Trust Owned Depreciation Page

    And   I enter in row ROWNAME and all column with "<v1>" in TO_Cost page
    Then  I see value in row ROWNAME and column Total is "<v2>" in TO_Cost page

    And   I enter in row Original prior year closing balance  and all column with "<v1>" in TO_Cost page
    Then  I see value in row Original prior year closing balance  and column Total is "<v2>" in TO_Cost page

    And   I enter in row Adjustments made to opening balance and all column with "<v1>" in TO_Cost page
    Then  I see value in row Adjustments made to opening balance and column Total is "<v2>" in TO_Cost page

    And   I enter in row Charged in period and all column with "<v1>" in TO_Cost page
    Then  I see value in row Charged in period and column Total is "<v2>" in TO_Cost page

    And   I enter in row Eliminated on disposal and all column with "<v1>" in TO_Cost page
    Then  I see value in row Eliminated on disposal and column Total is "<v2>" in TO_Cost page

    And   I enter in row Transferred in on existing Academies joining the Trust and all column with "<v1>" in TO_Cost page
    Then  I see value in row Transferred in on existing Academies joining the Trust and column Total is "<v2>" in TO_Cost page

    And   I enter in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in TO_Cost page
    Then  I see value in row Transferred out on existing Academies leaving the Trust and column Total is "<v2>" in TO_Cost page

    And   I enter in row Revaluations and all column with "<v1>" in TO_Cost page
    Then  I see value in row Revaluations and column Total is "<v2>" in TO_Cost page

    And   I enter in row Reclassifications and all column with "<v1>" in TO_Cost page
    Then  I see value in row Reclassifications and column Total is "<v2>" in TO_Cost page

    And   I enter in row At close of period and all column with "<v3>" in TO_Cost page
    Then  I see value in row At close of period and column Total is "<v4>" in TO_Cost page
    Examples:
      | v1 | v2 | v3 | v4 |


