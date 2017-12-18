Feature: Testing the IFA Amortisation Page


  Scenario Outline: Testing the IFA Amortisation Page

    Given I am on Balance Sheet Asset Section
    And   I navigate to IFA Amortisation page

    And   I enter in row Original prior year closing balance  and column "<software>" and "<other>" and the total should be "<total>"

    And   I enter in row Adjustments made to opening balance and column "<software>" and "<other>" and the total should be "<total>"

    And   I enter in row Charged in period and column "<software>" and "<other>" and the total should be "<total>"

    And   I enter in row Eliminated on disposal and column "<software>" and "<other>" and the total should be "<total>"

    And   I enter in row Transferred in on existing academies joining the trust and column "<software>" and "<other>" and the total should be "<total>"

    And   I enter in row Transferred out on existing academies leaving the trust and column "<software>" and "<other>" and the total should be "<total>"

    And   I enter in row Revaluations and column "<software>" and "<other>" and the total should be "<total>"

    And   I enter in row Reclassifications and column "<software>" and "<other>" and the total should be "<total>"

    And   I must see row At close of period and column "<software1>" and "<other1>" and the total should be "<total1>"


    Examples:
      | software | other | total | software1 | other1 | total1 |
      |1         |1      |2      |8          |8       |16      |
