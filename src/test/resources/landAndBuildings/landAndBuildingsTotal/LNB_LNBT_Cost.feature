Feature: Testing the Land and Buildings Totals Cost Page


  Scenario Outline: Testing the Land and Buildings Cost Page

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

    And   I click on the Save And Next button in Cost page

    And   I have navigated to the Academies Cost Page

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

    And   I have navigated to the Academies Cost Page

    And   I have navigated to the Land and Buildings Total Cost Page

    Then  I see all the labels are populated with "<total>"

    Then  I see the filed At the Close of period is now "<AtCloseOfPeriod>"

    Examples:
      | v1 |total|AtCloseOfPeriod|
      |1   |8    |112            |