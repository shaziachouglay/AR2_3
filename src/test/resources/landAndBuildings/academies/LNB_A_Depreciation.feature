Feature: Testing the Land and Buildings Academies Depreciation Page



  @LandAndBuilding_References
  Scenario: Reference Testing the Land and Buildings Academies Depreciation Page

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Depreciation Page
    Then I see the correct references are displayed for "lnb_a_Depriciation" page of type "Table"


  @smoke
  Scenario Outline: Testing the Land and Buildings Academies Depreciation Page with Valid Credentials

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Depreciation Page

    And   I enter in row Original prior year closing balance  and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Original prior year closing balance  and column Total is "<v2>" in TO_Depreciation page

    And   I enter in row Adjustments made to opening balance and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Adjustments made to opening balance and column Total is "<v2>" in TO_Depreciation page

    And   I enter in row Charged in period and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Charged in period and column Total is "<v2>" in TO_Depreciation page

    And   I enter in row Eliminated on disposal and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Eliminated on disposal and column Total is "<v2>" in TO_Depreciation page

    And   I enter in row Transferred out on existing Academies joining the Trust and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Transferred out on existing Academies joining the Trust and column Total is "<v2>" in TO_Depreciation page

    And   I enter in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Transferred out on existing Academies leaving the Trust and column Total is "<v2>" in TO_Depreciation page

    And   I enter in row Revaluations and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Revaluations and column Total is "<v2>" in TO_Depreciation page

    And   I enter in row Reclassifications and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Reclassifications and column Total is "<v2>" in TO_Depreciation page

    Then  I see in row At close of period and all column with "<v3>" in TO_Depreciation page
    Then  I see value in row At close of period and column Total is "<v4>" in TO_Depreciation page
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |3   |8   |24  |

  @smoke
  Scenario Outline: Testing the Land and Buildings Academies Depreciation Page with Invalid Credentials

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Depreciation Page

    And   I enter in row Original prior year closing balance  and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Original prior year closing balance  and column Total is NOT "<v2>" in TO_Depreciation page

    And   I enter in row Adjustments made to opening balance and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Adjustments made to opening balance and column Total is NOT "<v2>" in TO_Depreciation page

    And   I enter in row Charged in period and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Charged in period and column Total is NOT "<v2>" in TO_Depreciation page

    And   I enter in row Eliminated on disposal and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Eliminated on disposal and column Total is NOT"<v2>" in TO_Depreciation page

    And   I enter in row Transferred out on existing Academies joining the Trust and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Transferred out on existing Academies joining the Trust and column Total is NOT "<v2>" in TO_Depreciation page

    And   I enter in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Transferred out on existing Academies leaving the Trust and column Total is NOT"<v2>" in TO_Depreciation page

    And   I enter in row Revaluations and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Revaluations and column Total is NOT"<v2>" in TO_Depreciation page

    And   I enter in row Reclassifications and all column with "<v1>" in TO_Depreciation page
    Then  I see value in row Reclassifications and column Total is NOT"<v2>" in TO_Depreciation page

    Then  I see in row At close of period and all column are NOT "<v3>" in TO_Depreciation page
    Then  I see value in row At close of period and column Total is NOT "<v4>" in TO_Depreciation page

    Examples:Invalid Entries
      | v1 | v2 | v3 | v4 |
      |1   |4   |7   |22  |


  @smoke
  Scenario Outline: Testing the Land and Buildings Academies Depreciation Page with Errors All Financial Data

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Depreciation Page
    And   I enter in row Original prior year closing balance  and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Adjustments made to opening balance and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Charged in period and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Eliminated on disposal and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Transferred out on existing Academies joining the Trust and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Revaluations and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Reclassifications and all column with "<v1>" in TO_Depreciation page
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1    | error |
      |9999999|24     |

  @smoke
  Scenario Outline: Testing the Land and Buildings Academies Depreciation Page with Errors Invalid Data Format

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Depreciation Page
    And   I enter in row Original prior year closing balance  and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Adjustments made to opening balance and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Charged in period and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Eliminated on disposal and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Transferred out on existing Academies joining the Trust and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Revaluations and all column with "<v1>" in TO_Depreciation page
    And   I enter in row Reclassifications and all column with "<v1>" in TO_Depreciation page
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples:
      | v1    | error |
      |*******|24     |
