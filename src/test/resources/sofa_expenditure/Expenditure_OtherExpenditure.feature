@fullAndFinal @regression @sanity @smoke
Feature: Testing the Expenditure > Other Expenditure Page
  @sanity
  Scenario Outline: testing the Oher Expenditure page with valid credentials.
    Given I am on SoFA section
    And   I navigate to the Other Expenditure Page
    When  I enter value in field Other Expenditure not Attributable to a Specific Expenditure Heading with "<v1>"

    Examples:
      | v1      |
      | 1       |
      | 10      |
      | 100     |
      | 500     |
      | 1000    |
      | 999998  |
      | -1      |
      | -10     |
      | -100    |
      | -500    |
      | -1000   |
      | -999998 |

  @sanity
  Scenario Outline: testing the Oher Expenditure page for Error; All Financial Data Range
    Given I am on SoFA section
    And   I navigate to the Other Expenditure Page
    When  I enter value in field Other Expenditure not Attributable to a Specific Expenditure Heading with "<v1>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1       | error |
      | 9999999  | 1     |
      | -9999999 | 1     |
      | 1000000  | 1     |
      | -1000000 | 1     |


  @sanity
  Scenario Outline: testing the Oher Expenditure page for error: Invalid Data Format
    Given I am on SoFA section
    And   I navigate to the Other Expenditure Page
    When  I enter value in field Other Expenditure not Attributable to a Specific Expenditure Heading with "<v1>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1        | error |
      | a99999    | 1     |
      | -99999a99 | 1     |
      | £10000    | 1     |
      | -£1000    | 1     |
      | 8/676^&   | 1     |
      | sample    | 1     |
      | 1oo       | 1     |
#---------
  @smoke
  Scenario Outline: testing the Oher Expenditure page with valid credentials.
    Given I am on SoFA section
    And   I navigate to the Other Expenditure Page
    When  I enter value in field Other Expenditure not Attributable to a Specific Expenditure Heading with "<v1>"

    Examples:
      | v1      |
      | -999998 |

  @smoke
  Scenario Outline: testing the Oher Expenditure page for Error; All Financial Data Range
    Given I am on SoFA section
    And   I navigate to the Other Expenditure Page
    When  I enter value in field Other Expenditure not Attributable to a Specific Expenditure Heading with "<v1>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1       | error |
      | 9999999  | 1     |

  @smoke
  Scenario Outline: testing the Oher Expenditure page for error: Invalid Data Format
    Given I am on SoFA section
    And   I navigate to the Other Expenditure Page
    When  I enter value in field Other Expenditure not Attributable to a Specific Expenditure Heading with "<v1>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1        | error |
      | a99999    | 1     |
