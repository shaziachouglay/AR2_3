Feature: Testing the IFA Asset Financing page

  Scenario Outline: Testing the IFA Asset Financing page

    Given I am on Balance Sheet Asset Section
    And   I navigate to IFA Asset Financing page

    And   I enter in row Owned and columns "<software>" "<other>"
    Then  I must see row Owned and columm Total is "<Total>"

    And   I enter in row Finance leased and columns "<software>" "<other>"
    Then  I must see row Finance leased and columm Total is "<Total>"

    And   I enter in row On balance sheet PFI contracts  and columns "<software>" "<other>"
    Then  I must see row On balance sheet PFI contracts  and columm Total is "<Total>"

    And   I must see in row Closing Net Book Value and columns are "<software1>" "<other1>"
    Then  I must see row Closing Net Book Value and columm Total is "<Total1>"


    Examples:
      | software | other | Total | software1 | other1 | Total1 |
      |1         |1      |2      |3          |3       |6       |