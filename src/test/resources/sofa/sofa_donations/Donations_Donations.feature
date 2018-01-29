@fullAndFinal
Feature: Testing Donations Page

  @sanity  @evert
  Scenario Outline: Checking Donations Page with Valid Credentials
    Given I am in Pre Production Environment as Test User
    Given I am on SoFA section
    When I navigate to Donations section
    Then I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Then I enter value in Fixed Assets Donated with "<Fixed Assets Donated>"
    Then I enter value in Donated Intangible Assets with "<Donated Intangible Assets>"
    Then I enter value in Other Donations Capital with "<Other Donations Capital>"
    Then I enter value in Other Donations Revenue "<Other Donations Revenue>"
    Then I see the Total Capital field is populated with "<Total Capital>"
    And I see the Total Revenue field is populated with "<Total Revenue>"
    And I see the Total field is populated with "<Total>"

    Examples: Sanity testing with Boundary Value Analysis and Equivalence Class Partitioning Data Set (valid entries).

      | Donated Fixed Assets | Fixed Assets Donated | Donated Intangible Assets | Other Donations Capital | Other Donations Revenue | Total Capital | Total Revenue | Total      |
      | 10                   | 10                   | 10                        | 10                      | 10                      | 40            | 10            | 50         |
      | 100                  | 100                  | 100                       | 100                     | 100                     | 400           | 100           | 500        |
      | 1                    | 1                    | 1                         | 1                       | 1                       | 4             | 1             | 5          |
      | 50                   | 50                   | 50                        | 50                      | 50                      | 200           | 50            | 250        |
      | 500                  | 500                  | 500                       | 500                     | 500                     | 2,000         | 500           | 2,500      |
      | 150                  | 150                  | 150                       | 150                     | 150                     | 600           | 150           | 750        |
      | -10                  | -10                  | -10                       | -10                     | -10                     | -40           | -10           | -50        |
      | -100                 | -100                 | -100                      | -100                    | -100                    | -400          | -100          | -500       |
      | -1                   | -1                   | -1                        | -1                      | -1                      | -4            | -1            | -5         |
      | -50                  | -50                  | -50                       | -50                     | -50                     | -200          | -50           | -250       |
      | -500                 | -500                 | -500                      | -500                    | -500                    | -2,000        | -500          | -2,500     |
      | -150                 | -150                 | -150                      | -150                    | -150                    | -600          | -150          | -750       |
      | 999999               | 999999               | 999999                    | 999999                  | 999999                  | 3,999,996     | 999,999       | 4,999,995  |
      | 999998               | 999998               | 999998                    | 999998                  | 999998                  | 3,999,992     | 999,998       | 4,999,990  |
      | -999999              | -999999              | -999999                   | -999999                 | -999999                 | -3,999,996    | -999,999      | -4,999,995 |
      | -999998              | -999998              | -999998                   | -999998                 | -999998                 | -3,999,992    | -999,998      | -4,999,990 |


  @sanity
  Scenario Outline: Checking Invalid Entries
    Given I am on SoFA section
    When  I navigate to Donations section
    Then  I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Then  I enter value in Fixed Assets Donated with "<Fixed Assets Donated>"
    Then  I enter value in Donated Intangible Assets with "<Donated Intangible Assets>"
    Then  I enter value in Other Donations Capital with "<Other Donations Capital>"
    Then  I enter value in Other Donations Revenue "<Other Donations Revenue>"
    Then  I see the Total Capital field is not populated with "<Total Capital>"
    And   I see the Total Revenue field is not populated with "<Total Revenue>"
    And   I see the Total field is not populated with "<Total>"

    Examples: Sanity testing with Boundary Value Analysis and Equivalence Class Partitioning Data Set (invalid entries).
      | Donated Fixed Assets | Fixed Assets Donated | Donated Intangible Assets | Other Donations Capital | Other Donations Revenue | Total Capital | Total Revenue | Total    |
      | 10                   | 10                   | 10                        | 10                      | 10                      | 41            | 11            | 51       |
      | 100                  | 100                  | 100                       | 100                     | 100                     | 401           | 110           | 510      |
      | 1                    | 1                    | 1                         | 1                       | 1                       | 3             | 11            | 51       |
      | 50                   | 50                   | 50                        | 50                      | 50                      | 100           | 51            | 251      |
      | 500                  | 500                  | 500                       | 500                     | 500                     | 1,000         | 510           | 2,100    |
      | 150                  | 150                  | 150                       | 150                     | 150                     | 200           | 110           | 751      |
      | -10                  | -10                  | -10                       | -10                     | -10                     | -41           | -20           | -51      |
      | -100                 | -100                 | -100                      | -100                    | -100                    | -410          | -200          | -510     |
      | -1                   | -1                   | -1                        | -1                      | -1                      | -3            | -2            | -4       |
      | -50                  | -50                  | -50                       | -50                     | -50                     | -100          | -40           | -150     |
      | -500                 | -500                 | -500                      | -500                    | -500                    | -1,000        | -400          | -1,500   |
      | -150                 | -150                 | -150                      | -150                    | -150                    | -100          | -450          | -150     |
      | 999999               | 999999               | 999999                    | 999999                  | 999999                  | 3199996       | 949999        | 4199995  |
      | 999998               | 999998               | 999998                    | 999998                  | 999998                  | 3199992       | 949998        | 4199990  |
      | -999999              | -999999              | -999999                   | -999999                 | -999999                 | -1999996      | -499999       | -1999995 |
      | -999998              | -999998              | -999998                   | -999998                 | -999998                 | -1999992      | -499998       | -1999990 |


  @sanity
  Scenario Outline: Checking Number Range Errors and Help Links in donations page.
    Given I am on SoFA section
    When I navigate to Donations section
    Then I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Then I wait for page to load
    Then I enter value in Fixed Assets Donated with "<Fixed Assets Donated>"
    Then I wait for page to load
    Then I enter value in Donated Intangible Assets with "<Donated Intangible Assets>"
    Then I wait for page to load
    Then I enter value in Other Donations Capital with "<Other Donations Capital>"
    Then I wait for page to load
    Then I enter value in Other Donations Revenue "<Other Donations Revenue>"
    Then I wait for page to load
    Then I see the number of errors starting with  All financial data must be entered are "<error1>"
    Then I wait for page to load
    Then I see see the number of help link present on the page are "<helpLinkCount>"
    Then I wait for page to load
    And  I click on the Save And Next button in Donations page
    Then I wait for page to load
    Then I see the number of errors starting with  All financial data must be entered are "<error1>"
    Then I see see the number of help link present on the page are "<helpLinkCount>"
    Then I see I have not navigated from Donations page
    Examples: Error Triggering Data for All Financial Data
      | Donated Fixed Assets | Fixed Assets Donated | Donated Intangible Assets | Other Donations Capital | Other Donations Revenue | error1 | helpLinkCount |
      | 99999999999999       | 99999999999999       | 99999999999999            | 99999999999999          | 99999999999999          | 5      | 5             |
      | 1000000              | 1000000              | 1000000                   | 1000000                 | 1000000                 | 5      | 5             |
      | -99999999999999      | -99999999999999      | -99999999999999           | -99999999999999         | -99999999999999         | 5      | 5             |
      | -1000000             | -1000000             | -1000000                  | -1000000                | -1000000                | 5      | 5             |


  @sanity
  Scenario Outline: Checking Field Formatting Errors and Help Links in donations page.
    Given I am on SoFA section
    When I navigate to Donations section
    Then I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Then I wait for page to load
    Then I enter value in Fixed Assets Donated with "<Fixed Assets Donated>"
    Then I wait for page to load
    Then I enter value in Donated Intangible Assets with "<Donated Intangible Assets>"
    Then I wait for page to load
    Then I enter value in Other Donations Capital with "<Other Donations Capital>"
    Then I wait for page to load
    Then I enter value in Other Donations Revenue "<Other Donations Revenue>"
    Then I wait for page to load
    Then I see the number of errors starting with  Invalid Number Format are "<error1>"
    Then I wait for page to load
    Then I see see the number of help link present on the page are "<helpLinkCount>"
    Then I wait for page to load
    And  I click on the Save And Next button in Donations page
    Then I wait for page to load
    Then I see the number of errors starting with  Invalid Number Format are "<error1>"
    Then I see see the number of help link present on the page are "<helpLinkCount>"
    Then I see I have not navigated from Donations page

    Examples: Error Triggering Invalid Format Data
      | Donated Fixed Assets | Fixed Assets Donated | Donated Intangible Assets | Other Donations Capital | Other Donations Revenue | error1 | helpLinkCount |
      | SAMPLE               | sample               | 1sample                   | SAMPLE1                 | @*<>*                   | 5      | 5             |
      | £123                 | £12345               | £232                      | £5656                   | £454                    | 5      | 5             |
      | 123sample            | sampl*               | 4$232                     | ^5656                   | 7&&454                  | 5      | 5             |
      | !123                 | £2@2345              | %4232                     | £(656                   | &454                    | 5      | 5             |

#  --------------------

  @smoke
  Scenario Outline: Checking Donations Page with Valid Credentials
    Given I am in Pre Production Environment as Test User
    Given I am on SoFA section
    When I navigate to Donations section
    Then I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Then I enter value in Fixed Assets Donated with "<Fixed Assets Donated>"
    Then I enter value in Donated Intangible Assets with "<Donated Intangible Assets>"
    Then I enter value in Other Donations Capital with "<Other Donations Capital>"
    Then I enter value in Other Donations Revenue "<Other Donations Revenue>"
    Then I see the Total Capital field is populated with "<Total Capital>"
    And I see the Total Revenue field is populated with "<Total Revenue>"
    And I see the Total field is populated with "<Total>"

    Examples: Sanity testing with Boundary Value Analysis and Equivalence Class Partitioning Data Set (valid entries).

      | Donated Fixed Assets | Fixed Assets Donated | Donated Intangible Assets | Other Donations Capital | Other Donations Revenue | Total Capital | Total Revenue | Total      |
      | -999998              | -999998              | -999998                   | -999998                 | -999998                 | -3,999,992    | -999,998      | -4,999,990 |


  @smoke
  Scenario Outline: Checking Invalid Entries
    Given I am on SoFA section
    When  I navigate to Donations section
    Then  I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Then  I enter value in Fixed Assets Donated with "<Fixed Assets Donated>"
    Then  I enter value in Donated Intangible Assets with "<Donated Intangible Assets>"
    Then  I enter value in Other Donations Capital with "<Other Donations Capital>"
    Then  I enter value in Other Donations Revenue "<Other Donations Revenue>"
    Then  I see the Total Capital field is not populated with "<Total Capital>"
    And   I see the Total Revenue field is not populated with "<Total Revenue>"
    And   I see the Total field is not populated with "<Total>"
       #And I click on Next Button I can see warning message under field names

    Examples: Sanity testing with Boundary Value Analysis and Equivalence Class Partitioning Data Set (invalid entries).
      | Donated Fixed Assets | Fixed Assets Donated | Donated Intangible Assets | Other Donations Capital | Other Donations Revenue | Total Capital | Total Revenue | Total    |
      | -999998              | -999998              | -999998                   | -999998                 | -999998                 | -1999992      | -499998       | -1999990 |

  @smoke
  Scenario Outline: Checking Number Range Errors and Help Links in donations page.
    Given I am on SoFA section
    When I navigate to Donations section
    Then I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Then I wait for page to load
    Then I enter value in Fixed Assets Donated with "<Fixed Assets Donated>"
    Then I wait for page to load
    Then I enter value in Donated Intangible Assets with "<Donated Intangible Assets>"
    Then I wait for page to load
    Then I enter value in Other Donations Capital with "<Other Donations Capital>"
    Then I wait for page to load
    Then I enter value in Other Donations Revenue "<Other Donations Revenue>"
    Then I wait for page to load
    Then I see the number of errors starting with  All financial data must be entered are "<error1>"
    Then I wait for page to load
    Then I see see the number of help link present on the page are "<helpLinkCount>"
    Then I wait for page to load
    And  I click on the Save And Next button in Donations page
    Then I wait for page to load
    Then I see the number of errors starting with  All financial data must be entered are "<error1>"
    Then I see see the number of help link present on the page are "<helpLinkCount>"
    Then I see I have not navigated from Donations page
    Examples: Error Triggering Data for All Financial Data
      | Donated Fixed Assets | Fixed Assets Donated | Donated Intangible Assets | Other Donations Capital | Other Donations Revenue | error1 | helpLinkCount |
      | 99999999999999       | 99999999999999       | 99999999999999            | 99999999999999          | 99999999999999          | 5      | 5             |

  @smoke
  Scenario Outline: Checking Field Formatting Errors and Help Links in donations page.
    Given I am on SoFA section
    When I navigate to Donations section
    Then I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Then I wait for page to load
    Then I enter value in Fixed Assets Donated with "<Fixed Assets Donated>"
    Then I wait for page to load
    Then I enter value in Donated Intangible Assets with "<Donated Intangible Assets>"
    Then I wait for page to load
    Then I enter value in Other Donations Capital with "<Other Donations Capital>"
    Then I wait for page to load
    Then I enter value in Other Donations Revenue "<Other Donations Revenue>"
    Then I wait for page to load
    Then I see the number of errors starting with  Invalid Number Format are "<error1>"
    Then I wait for page to load
    Then I see see the number of help link present on the page are "<helpLinkCount>"
    Then I wait for page to load
    And  I click on the Save And Next button in Donations page
    Then I wait for page to load
    Then I see the number of errors starting with  Invalid Number Format are "<error1>"
    Then I see see the number of help link present on the page are "<helpLinkCount>"
    Then I see I have not navigated from Donations page

    Examples: Error Triggering Invalid Format Data
      | Donated Fixed Assets | Fixed Assets Donated | Donated Intangible Assets | Other Donations Capital | Other Donations Revenue | error1 | helpLinkCount |
      | SAMPLE               | sample               | 1sample                   | SAMPLE1                 | @*<>*                   | 5      | 5             |

