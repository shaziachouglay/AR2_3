Feature: Testing the Depreciation periods per accounting policies page

  Scenario Outline: Testing the Depreciation periods per accounting policies page

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Tangible Fixed Assets Depreciation periods per accounting policies page
    And   I enter in row Single period or minimum of range  and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" in BSA TFA Depriciation periods per accounting policies page
    And   I enter in row Maximum of range and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" in BSA TFA Depriciation periods per accounting policies page
    And   I enter in row Reducing balance rate and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" in BSA TFA Depriciation periods per accounting policies page
    Examples:
      | c1 | c2 | c3 | c4 | c5 | c6 | c7 |
      |1   |1   |1   |1   |1   |1   |1   |


  @bsa_references
  Scenario: reference Testing the Depreciation periods per accounting policies page

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Tangible Fixed Assets Depreciation periods per accounting policies page
    Then I see the correct references are displayed for "bsa_tfa_DepriciationPeriods" page of type "Table"
