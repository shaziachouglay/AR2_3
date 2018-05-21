Feature: Testing the IFA Impairments page


  Scenario Outline: Testing the IFA Impairments page

    Given I am on Balance Sheet Asset Section
    And   I navigate to IFA Impairments page
    And   I enter in row Original prior year closing balance and columns "<software>" "<other>" and must see the total is "<total>"
    And   I enter in row Other adjustments made to opening balance and columns "<software>" "<other>" and must see the total is "<total>"
    And   I enter in row Charged in period and columns "<software>" "<other>" and must see the total is "<total>"
    And   I enter in row Released in period and columns "<software>" "<other>" and must see the total is "<total>"
    And   I enter in row Transferred in on existing academies joining the trust and columns "<software>" "<other>" and must see the total is "<total>"
    And   I enter in row Transferred out on existing academies leaving the trust and columns "<software>" "<other>" and must see the total is "<total>"
    And   I must see in row Closing Balance and columns to be  "<software1>" "<other1>" and must see the total is "<total1>"

    Examples:
      | software | other | total | software1 | other1 | total1 |


  @bsa_references
  Scenario: Testing References for IFA Impairments page

    Given I am on Balance Sheet Asset Section
    And   I navigate to IFA Impairments page
    Then I see the correct references are displayed for "bsa_ifa_Impairments" page of type "Table"