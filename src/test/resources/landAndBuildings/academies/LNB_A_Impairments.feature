Feature: Testing Land and Building Academies Impairments Page



  @LandAndBuilding_References
  Scenario: Reference Testing Land and Building Academies Impairments Page

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Impiarments Page
    Then I see the correct references are displayed for "lnb_a_Impairment" page of type "Table"


  @smoke
  Scenario Outline: Testing Land and Building Academies Impairments Page with valid data

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Impiarments Page

    And   I enter value in row Original prior year closing balance  and al columns with "<v1>" in Academies Impairments
    Then  I see the value in row Original prior year closing balance and column Total is "<v2>"in Academies Impairments

    And   I enter value in row Adjustments made to opening balance and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Adjustments made to opening balance and column Total is "<v2>"in Academies Impairments

    And   I enter value in row Charged in Period and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Charged in period and column Total is "<v2>"in Academies Impairments

    And   I enter value in row Released in period and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Released in Period and column Total is "<v2>"in Academies Impairments

    And   I enter value in row Transferred out on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Transferred out on existing Academies leaving the Trust and column Total is "<v2>"in Academies Impairments

    And   I enter value in row Transferred in on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Transferred in on existing Academies leaving the Trust and column Total is "<v2>"in Academies Impairments

    Then  I see the value in row At Close of period and all columns is "<v3>"in Academies Impairments
    Then  I see the value in row At Close of period and column Total is "<v4>"in Academies Impairments

    Examples: Valid Data
      | v1 | v2 | v3 | v4 |
      |1   |4   |6   |24  |


  @smoke
  Scenario Outline: Testing Land and Building Academies Impairments Page with invalid data

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Impiarments Page

    And   I enter value in row Original prior year closing balance  and al columns with "<v1>" in Academies Impairments
    Then  I see the value in row Original prior year closing balance and column Total is NOT "<v2>"in Academies Impairments

    And   I enter value in row Adjustments made to opening balance and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Adjustments made to opening balance and column Total is NOT "<v2>"in Academies Impairments

    And   I enter value in row Charged in Period and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Charged in period and column Total is NOT "<v2>"in Academies Impairments

    And   I enter value in row Released in period and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Released in Period and column Total is NOT "<v2>"in Academies Impairments

    And   I enter value in row Transferred in on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Transferred in on existing Academies leaving the Trust and column Total is NOT"<v2>"in Academies Impairments

    And   I enter value in row Transferred out on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    Then  I see the value in row Transferred out on existing Academies leaving the Trust and column Total is NOT "<v2>"in Academies Impairments

    Then  I see the value in row At Close of period and all columns is NOT "<v3>"in Academies Impairments
    Then  I see the value in row At Close of period and column Total is NOT "<v4>"in Academies Impairments

    Examples: Invalid Data
      | v1 | v2 | v3 | v4 |
      |1   |3   |4   |19  |


  @smoke
  Scenario Outline: Testing Land and Building Academies Impairments Page for errro triggering All Fininacial Data Error

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Impiarments Page
    And   I enter value in row Original prior year closing balance  and al columns with "<v1>" in Academies Impairments
    And   I enter value in row Adjustments made to opening balance and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Charged in Period and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Released in period and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Transferred in on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Transferred out on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1    | error |
      |9999999|24     |


  @smoke
  Scenario Outline: Testing Land and Building Academies Impairments Page for errro triggering Invalid Data Format Error

    Given I am on Land and Buildings Section
    And   I have navigated to the Academies Impiarments Page
    And   I enter value in row Original prior year closing balance  and al columns with "<v1>" in Academies Impairments
    And   I enter value in row Adjustments made to opening balance and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Charged in Period and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Released in period and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Transferred in on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    And   I enter value in row Transferred out on existing Academies leaving the Trust and al columns with "<v1>"in Academies Impairments
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | error |
      |*** |24     |

