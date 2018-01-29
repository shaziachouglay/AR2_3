Feature: testing the BSA TFA depreciation page

  Scenario Outline: testing the BSA TFA depreciation page with valid credentials

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Tangible Fixed Assets Depreciation page
    And   I enter value in row Original prior year closing balance  and column "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" and I see total column as "<c8>" in TFA depriciation page
    And   I enter value in row Adjustments made to opening balance and column "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" and I see total column as "<c8>" in TFA depriciation page
    And   I enter value in row Charged in period and column "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" and I see total column as "<c8>" in TFA depriciation page
    And   I enter value in row Eliminated on disposal and column "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" and I see total column as "<c8>" in TFA depriciation page
    And   I enter value in row Transferred in on existing academies joining the trust and column "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" and I see total column as "<c8>" in TFA depriciation page
    And   I enter value in row Transferred out on existing academies leaving the trust and column "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" and I see total column as "<c8>" in TFA depriciation page
    And   I enter value in row Revaluations and column "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" and I see total column as "<c8>" in TFA depriciation page
    And   I enter value in row Reclassifications and column "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" and I see total column as "<c8>" in TFA depriciation page
    And   I see value in row At close of period and column "<c9>" "<c10>" "<c11>" "<c12>" "<c13>" "<c14>" "<c15>" and I see total column as "<c15>" in TFA depriciation page

    Examples:
      | c1 | c2 | c3 | c4 | c5 | c6 | c7 | c8 | c9 | c10 | c11 | c12 | c13 | c14 | c15 |
      |1   |1   |1   |1   |1   |1   |1   |7   |8   |8    |8    |8    |8    |8    |56   |


