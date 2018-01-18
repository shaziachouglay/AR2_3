Feature: Testing the Land and Buildings Trust Owned Cost Page

  @smoke @LNBTOCost
  Scenario Outline: Testing the Land and Buildings Trust Owned Cost Page with Valid Credentials

    Given I am on Land and Buildings Section
    And   I have navigated to the Trust Owned Cost Page

    And   I enter value in row Original prior year closing balance  and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Original prior year closing balance  and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Adjustments made to opening balance and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Adjustments made to opening balance and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Additions funded from Free Schools Priority Schools Building programme and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Additions funded from Free Schools Priority Schools Building programme  and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Additions funded from other DFE and ESFA capital grant and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Additions funded from other DFE and ESFA capital grant and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Additions and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Additions and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Transferred in on conversion local authority and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Transferred in on conversion local authority and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Transferred in on conversion elsewhere and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Transferred in on conversion elsewhere and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Transferred in on existing Academies joining the Trust and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Transferred in on existing Academies joining the Trust and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Transferred out on existing Academies leaving the Trust and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Donations DFE and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Donations DFE and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Donations non DFEand all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Donations non DFE and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Disposals and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Disposals and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Revaluations and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Revaluations and column Totals is "<v2>" in LNB_TO_C

    And   I enter value in row Reclassifications and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Reclassifications and column Totals is "<v2>" in LNB_TO_C

    And   I see value in row At close of period and all column with "<v3>" in LNB_TO_C
    Then  I see the value in row At close of period and column Totals is "<v4>" in LNB_TO_C

    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |4   |14  |56  |

  @smoke @LNBTOCost
  Scenario Outline: Testing the Land and Buildings Trust Owned Cost Page with INVALID Credentials

    Given I am on Land and Buildings Section
    And   I have navigated to the Trust Owned Cost Page

    And   I enter value in row Original prior year closing balance  and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Original prior year closing balance  and column Totals is NOT"<v2>" in LNB_TO_C

    And   I enter value in row Adjustments made to opening balance and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Adjustments made to opening balance and column Totals is NOT"<v2>" in LNB_TO_C

    And   I enter value in row Additions funded from Free Schools Priority Schools Building programme and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Additions funded from Free Schools Priority Schools Building programme  and column Totals is NOT"<v2>" in LNB_TO_C

    And   I enter value in row Additions funded from other DFE and ESFA capital grant and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Additions funded from other DFE and ESFA capital grant and column Totals is NOT"<v2>" in LNB_TO_C

    And   I enter value in row Additions and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Additions and column Totals is NOT"<v2>" in LNB_TO_C

    And   I enter value in row Transferred in on conversion local authority and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Transferred in on conversion local authority and column Totals is NOT "<v2>" in LNB_TO_C

    And   I enter value in row Transferred in on conversion elsewhere and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Transferred in on conversion elsewhere and column Totals is NOT "<v2>" in LNB_TO_C

    And   I enter value in row Transferred in on existing Academies joining the Trust and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Transferred in on existing Academies joining the Trust and column Totals is NOT "<v2>" in LNB_TO_C

    And   I enter value in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Transferred out on existing Academies leaving the Trust and column Totals is NOT "<v2>" in LNB_TO_C

    And   I enter value in row Donations DFE and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Donations DFE and column Totals is NOT "<v2>" in LNB_TO_C

    And   I enter value in row Donations non DFEand all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Donations non DFE and column Totals is NOT "<v2>" in LNB_TO_C

    And   I enter value in row Disposals and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Disposals and column Totals is NOT "<v2>" in LNB_TO_C

    And   I enter value in row Revaluations and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Revaluations and column Totals is NOT "<v2>" in LNB_TO_C

    And   I enter value in row Reclassifications and all column with "<v1>" in LNB_TO_C
    Then  I see the value in row Reclassifications and column Totals is NOT "<v2>" in LNB_TO_C

    And   I see value in row At close of period and all column is NOT "<v3>" in LNB_TO_C
    Then  I see the value in row At close of period and column Totals is NOT"<v4>" in LNB_TO_C

    Examples:INVALID entries
      | v1 | v2 | v3 | v4 |
      |1   |5   |15  |55  |


  @smoke @LNBTOCost
  Scenario Outline: Testing the Land and Buildings Trust Owned Cost Page for Errors All Financial Data

    Given I am on Land and Buildings Section
    And   I have navigated to the Trust Owned Cost Page

    And   I enter value in row Original prior year closing balance  and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Adjustments made to opening balance and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Additions funded from Free Schools Priority Schools Building programme and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Additions funded from other DFE and ESFA capital grant and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Additions and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Transferred in on conversion local authority and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Transferred in on conversion elsewhere and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Transferred in on existing Academies joining the Trust and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Donations DFE and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Donations non DFEand all column with "<v1>" in LNB_TO_C

    And   I enter value in row Disposals and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Revaluations and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Reclassifications and all column with "<v1>" in LNB_TO_C

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: All Financial Data Errro
      | v1      | error |
      | 9999999 | 56    |


  @smoke @LNBTOCost
  Scenario Outline: Testing the Land and Buildings Trust Owned Cost Page for Errors Invalid Number Format

    Given I am on Land and Buildings Section
    And   I have navigated to the Trust Owned Cost Page

    And   I enter value in row Original prior year closing balance  and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Adjustments made to opening balance and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Additions funded from Free Schools Priority Schools Building programme and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Additions funded from other DFE and ESFA capital grant and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Additions and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Transferred in on conversion local authority and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Transferred in on conversion elsewhere and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Transferred in on existing Academies joining the Trust and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Transferred out on existing Academies leaving the Trust and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Donations DFE and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Donations non DFEand all column with "<v1>" in LNB_TO_C

    And   I enter value in row Disposals and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Revaluations and all column with "<v1>" in LNB_TO_C

    And   I enter value in row Reclassifications and all column with "<v1>" in LNB_TO_C

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Invalid Number Format
      | v1      | error |
      | ******* | 56    |


