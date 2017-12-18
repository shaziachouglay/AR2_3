Feature: Testing the BSA TFA Impairments page


  Scenario Outline: testing the BSA TFA impairments page

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Tangible Fixed Assets Impairments page

    And   I enter value in row Original prior year closing balance  and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" "<c8>" in BSA TFA Impairments page
    Then  I see value in row Original prior year closing balance  and column total as "<c9>" in BSA TFA Impairments page

    And   I enter value in row Adjustments made to opening balance and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" "<c8>" in BSA TFA Impairments page
    Then  I see value in row Adjustments made to opening balance and column total as "<c9>" in BSA TFA Impairments page

    And   I enter value in row Charged in period and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" "<c8>" in BSA TFA Impairments page
    Then  I see value in row Charged in period and column total as "<c9>" in BSA TFA Impairments page

    And   I enter value in row Released in period and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" "<c8>" in BSA TFA Impairments page
    Then  I see value in row Released in period and column total as "<c9>" in BSA TFA Impairments page

    And   I enter value in row Transferred in on existing Academies joining the Trust and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" "<c8>" in BSA TFA Impairments page
    Then  I see value in row Transferred in on existing Academies joining the Trust and column total as "<c9>" in BSA TFA Impairments page

    And   I enter value in row Transferred out on existing academies leaving the trust and columns "<c1>" "<c2>" "<c3>" "<c4>" "<c5>" "<c6>" "<c7>" "<c8>" in BSA TFA Impairments page
    Then  I see value in row Transferred out on existing academies leaving the trust and column total as "<c9>" in BSA TFA Impairments page

    And   I see value in row Closing Balance and columns "<c10>" "<c11>" "<c12>" "<c13>" "<c14>" "<c15>" "<c16>" "<c17>" in BSA TFA Impairments page
    Then  I see value in row Closing Balance and column total as "<c18>" in BSA TFA Impairments page


    Examples:
      | c1 | c2 | c3 | c4 | c5 | c6 | c7 | c8 | c9 | c10 | c11 | c12 | c13 | c14 | c15 | c16 | c17 | c18 |
      |1   |1   |1   |1   |1   |1   |1   |1   |8   |6    |6    |6    |6    |6    |6    |6    |6    |48   |
