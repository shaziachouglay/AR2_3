Feature: Testing the Amortisation periods page

  Scenario Outline: Testing the Amortisation periods page

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Intangible Fixed Assets Amortisation Periods page
    And   I enter in row Single period or minimum of range  and columns with  "<software>" and "<other>"
    And   I enter in row Maximum of range and columns with  "<software>" and "<other>"
    And   I enter in row Reducing balance rate and columns with  "<software>" and "<other>"

    Examples:
      | software | other |
      |1         |1      |



  @bsa_references
  Scenario: Testing References for IFA  Amortisation periods page

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Intangible Fixed Assets Amortisation Periods page
    Then  I see the correct references are displayed for "bsa_ifa_AmortisationPeriods" page of type "Table"