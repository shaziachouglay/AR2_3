Feature: testing the Land and Building Totals Impairments page

  Scenario Outline: testing the Land and Building Totals Impairments page


    Given I am on Land and Buildings Section
    And   I have navigated to the Trust Owned Impiarments Page
    And   I enter value in row Original prior year closing balance  and al columns with "<v1>" in Trust Owned Impairments Page
    And   I enter value in row Adjustments made to opening balance and al columns with "<v1>"in Trust Owned Impairments Page
    And   I enter value in row Charged in Period and al columns with "<v1>"in Trust Owned Impairments Page
    And   I enter value in row Released in period and al columns with "<v1>"in Trust Owned Impairments Page
    And   I enter value in row Transferred out on existing Academies leaving the Trust and al columns with "<v1>"in Trust Owned Impairments Page
    And   I click on the Save And Next button in Cost page
    And   I have navigated to the Academies Impiarments Page
    And   I enter value in row Original prior year closing balance  and al columns with "<v1>" in Academies Impairments
    And   I enter value in row Adjustments made to opening balance and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Charged in Period and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Released in period and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Transferred in on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Transferred out on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    And   I click on the Save And Next button in Cost page
    Then  I see I have navigated to the land and Buildings Total Impairments page
    Then  I see all the fields in LNBT Impairments page are populated with "<total>"
    Then  I see the filed Transferred in on existing Academies leaving the Trust and al columns with "<value>"in Academies Impairments
    Then  I see the filed At the Close of period is now "<AtCloseOfPeriod>"
    Examples:
      | v1 | total | AtCloseOfPeriod |value|
      |1   |8      |44               |4    |
