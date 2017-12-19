Feature: testing the BSA Tangible Fixed Assets Cost page

  Scenario Outline: testing the BSA TFA Cost page with valid credentials

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Tangible Fixed Assets Cost page

    And   I enter in row Original prior year closing balance  and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Original prior year closing balance is "<c9>" in Cost page

    And   I enter in row Adjustments made to opening balance and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Adjustments made to opening balance is "<c9>" in Cost page

    And   I enter in row Additions funded from Free Schools Priority Schools Building programme and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Additions funded from Free Schools Priority Schools Building programme is "<c9>" in Cost page

    And   I enter in row Additions funded from other DFE and ESFA EFA capital grant and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Additions funded from other DFE and ESFA EFA capital grant is "<c9>" in Cost page

    And   I enter in row Additions Other and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Additions Other is "<c9>" in Cost page

    And   I enter in row Transferred in on conversion local authority and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Transferred in on conversion local authority is "<c9>" in Cost page

    And   I enter in row Transferred in on conversion elsewhere and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Transferred in on conversion elsewhere is "<c9>" in Cost page

    And   I enter in row Transferred in on existing academies joining the trust and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Transferred in on existing academies joining the trust is "<c9>" in Cost page

    And   I enter in row Transferred out on existing academies leaving the trust and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Transferred out on existing academies leaving the trust is "<c9>" in Cost page

    And   I enter in row Donations DFEESFA and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Donations DFEESFA is "<c9>" in Cost page

    And   I enter in row Donations non DFEESFA and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Donations non DFEESFA is "<c9>" in Cost page

    And   I enter in row Disposals and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Disposals is "<c9>" in Cost page

    And   I enter in row Revaluations and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Revaluations is "<c9>" in Cost page

    And   I enter in row Reclassifications and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Reclassifications is "<c9>" in Cost page

    And   I see  row At Close of Period and column values  "<c10>" "<c11>" "<c12>" "<c13>""<c14>""<c15>""<c16>""<c17>" in Cost page
    Then  I see the total for row At Close of Period is "<c18>" in Cost page

    Examples:
      | c1 | c2 | c3 | c4 | c5 | c6 | c7 | c8 | c9 | c10 | c11 | c12 | c13 | c14 | c15 | c16 | c17 | c18 |
      |1   |1   |1   |1   |1   |1   |1   |1   |8   |14   |14   |14   |14   |14   |14   |14   |14   |112  |



  Scenario Outline: testing the BSA TFA Cost page with INVALID credentials

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Tangible Fixed Assets Cost page

    And   I enter in row Original prior year closing balance  and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Original prior year closing balance is NOT"<c9>" in Cost page

    And   I enter in row Adjustments made to opening balance and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Adjustments made to opening balance is NOT"<c9>" in Cost page

    And   I enter in row Additions funded from Free Schools Priority Schools Building programme and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Additions funded from Free Schools Priority Schools Building programme is NOT"<c9>" in Cost page

    And   I enter in row Additions funded from other DFE and ESFA EFA capital grant and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Additions funded from other DFE and ESFA EFA capital grant is NOT"<c9>" in Cost page

    And   I enter in row Additions Other and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Additions Other is NOT"<c9>" in Cost page

    And   I enter in row Transferred in on conversion local authority and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Transferred in on conversion local authority is NOT"<c9>" in Cost page

    And   I enter in row Transferred in on conversion elsewhere and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Transferred in on conversion elsewhere is NOT"<c9>" in Cost page

    And   I enter in row Transferred in on existing academies joining the trust and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Transferred in on existing academies joining the trust is NOT"<c9>" in Cost page

    And   I enter in row Transferred out on existing academies leaving the trust and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Transferred out on existing academies leaving the trust is NOT"<c9>" in Cost page

    And   I enter in row Donations DFEESFA and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Donations DFEESFA is NOT"<c9>" in Cost page

    And   I enter in row Donations non DFEESFA and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Donations non DFEESFA is NOT"<c9>" in Cost page

    And   I enter in row Disposals and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Disposals is NOT"<c9>" in Cost page

    And   I enter in row Revaluations and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Revaluations is NOT"<c9>" in Cost page

    And   I enter in row Reclassifications and column values  "<c1>" "<c2>" "<c3>" "<c4>""<c5>""<c6>""<c7>""<c8>" in Cost page
    Then  I must see the total for row Reclassifications is NOT"<c9>" in Cost page

    And   I see  row At Close of Period and column values  are NOT"<c10>" "<c11>" "<c12>" "<c13>""<c14>""<c15>""<c16>""<c17>" in Cost page
    Then  I see the total for row At Close of Period is NOT"<c18>" in Cost page

    Examples: INVALID entries
      | c1 | c2 | c3 | c4 | c5 | c6 | c7 | c8 | c9 | c10 | c11 | c12 | c13 | c14 | c15 | c16 | c17 | c18 |
      |1   |1   |1   |1   |1   |1   |1   |1   |8   |14   |14   |14   |14   |14   |14   |14   |14   |112  |

