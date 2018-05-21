Feature: Testing the IFA Cost Page

  Scenario Outline: Testing the IFA Cost Page

    Given I am on Balance Sheet Asset Section
    And   I navigate to IFA Cost page
    And   I enter in row Original prior year closing balance  and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Adjustments made to opening balance and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Additions and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Transferred in on conversion local authority and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Transferred in on conversion elsewhere and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Transferred in on existing academies joining the trust and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Transferred out on existing academies leaving the trust and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Donations and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Disposals and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Revaluations and column "<software>" "<other>" and must see the total is "<total>"

    And   I enter in row Reclassifications and column "<software>" "<other>" and must see the total is "<total>"

    And   I must see row At close of period and column to be  "<software1>" "<other1>" and must see the total is "<total1>"

    Examples: Happy path
      | software | other | total | software1 | other1 | total1 |
      |1         |1      |2      |11         |11      |22      |


  @bsa_references
  Scenario: Testing References IFA Cost Page

    Given I am on Balance Sheet Asset Section
    And   I navigate to IFA Cost page
    Then I see the correct references are displayed for "bsa_ifa_Cost" page of type "Table"