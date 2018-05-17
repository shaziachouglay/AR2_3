@fullAndFinal
Feature: testing SoFA>> Revenue Grants>> Other page

  @sanity
  Scenario Outline: testing the happy path for SoFA>> Revenue Grants>> Other page

    Given I am on SoFA section
    When  I navigate to the Other Revenue Grants page
    And   I enter the value in Local Authority- Special Educational Needs with "<LA_SpecialEducationalNeeds>"
    And   I enter the value in Local Authority-Early Years with "<LA_EarlyYears>"
    And   I enter the value in Other Local Authority Revenue Grants with "<OtherLARevenueGrants>"
    And   I enter the value in Other Government Revenue Grants with "<OtherGovernmentRevenueGrants>"
    And   I enter the value in Non-Government-Revenue Grants with "<NonGovernment_RevenueGrants>"
    And   I see the totals field is now populated with "<Total>"

    Examples: testing Happy Path

      | LA_SpecialEducationalNeeds | LA_EarlyYears | OtherLARevenueGrants | OtherGovernmentRevenueGrants | NonGovernment_RevenueGrants | Total      |
      | 10                         | 10            | 10                   | 10                           | 10                          | 50         |
      | 1                          | 1             | 1                    | 1                            | 1                           | 5          |
      | 100                        | 100           | 100                  | 100                          | 100                         | 500        |
      | 200                        | 200           | 200                  | 200                          | 200                         | 1,000      |
      | 50                         | 50            | 50                   | 50                           | 50                          | 250        |
      | 500                        | 500           | 500                  | 500                          | 500                         | 2,500      |
      | 123                        | 234           | 50                   | 156                          | 75                          | 638        |
      | 999998                     | 999998        | 999998               | 999998                       | 999998                      | 4,999,990  |
      | 999999                     | 999999        | 999999               | 999999                       | 999999                      | 4,999,995  |
      | -10                        | -10           | -10                  | -10                          | -10                         | -50        |
      | -1                         | -1            | -1                   | -1                           | -1                          | -5         |
      | -100                       | -100          | -100                 | -100                         | -100                        | -500       |
      | -200                       | -200          | -200                 | -200                         | -200                        | -1,000     |
      | -50                        | -50           | -50                  | -50                          | -50                         | -250       |
      | -500                       | -500          | -500                 | -500                         | -500                        | -2,500     |
      | -123                       | -234          | -50                  | -156                         | -75                         | -638       |
      | -999998                    | -999998       | -999998              | -999998                      | -999998                     | -4,999,990 |
      | -999999                    | -999999       | -999999              | -999999                      | -999999                     | -4,999,995 |

  @sanity
  Scenario Outline: testing the unhappy path or invalid entries for SoFA>> Revenue Grants>> Other page

    Given I am on SoFA section
    When  I navigate to the Other Revenue Grants page
    And   I enter the value in Local Authority- Special Educational Needs with "<LA_SpecialEducationalNeeds>"
    And   I enter the value in Local Authority-Early Years with "<LA_EarlyYears>"
    And   I enter the value in Other Local Authority Revenue Grants with "<OtherLARevenueGrants>"
    And   I enter the value in Other Government Revenue Grants with "<OtherGovernmentRevenueGrants>"
    And   I enter the value in Non-Government-Revenue Grants with "<NonGovernment_RevenueGrants>"
    And   I see the totals field is NOT populated with "<Total>"

    Examples: testing Happy Path

      | LA_SpecialEducationalNeeds | LA_EarlyYears | OtherLARevenueGrants | OtherGovernmentRevenueGrants | NonGovernment_RevenueGrants | Total      |
      | 10                         | 10            | 10                   | 10                           | 10                          | 51         |
      | 1                          | 1             | 1                    | 1                            | 1                           | 51         |
      | 100                        | 100           | 100                  | 100                          | 100                         | 501        |
      | 200                        | 200           | 200                  | 200                          | 200                         | 1,001      |
      | 50                         | 50            | 50                   | 50                           | 50                          | 251        |
      | 500                        | 500           | 500                  | 500                          | 500                         | 2,501      |
      | 123                        | 234           | 50                   | 156                          | 75                          | 639        |
      | -10                        | -10           | -10                  | -10                          | -10                         | -51        |
      | -1                         | -1            | -1                   | -1                           | -1                          | -50        |
      | -100                       | -100          | -100                 | -100                         | -100                        | -501       |
      | -200                       | -200          | -200                 | -200                         | -200                        | -1,001     |
      | -50                        | -50           | -50                  | -50                          | -50                         | -251       |
      | -500                       | -500          | -500                 | -500                         | -500                        | -2,501     |
      | -123                       | -234          | -50                  | -156                         | -75                         | -639       |
      | 999998                     | 999998        | 999998               | 999998                       | 999998                      | 4,999,991  |
      | 999999                     | 999999        | 999999               | 999999                       | 999999                      | 4,999,994  |
      | -999998                    | -999998       | -999998              | -999998                      | -999998                     | -4,999,991 |
      | -999999                    | -999999       | -999999              | -999999                      | -999999                     | -4,999,994 |



  @sanity
  Scenario Outline: SoFA > Revenue Grants > Other page : Error Checking : Financial Data Range

    Given I am on SoFA section
    When  I navigate to the Other Revenue Grants page
    And   I enter the value in Local Authority- Special Educational Needs with "<LA_SpecialEducationalNeeds>"
    And   I enter the value in Local Authority-Early Years with "<LA_EarlyYears>"
    And   I enter the value in Other Local Authority Revenue Grants with "<OtherLARevenueGrants>"
    And   I enter the value in Other Government Revenue Grants with "<OtherGovernmentRevenueGrants>"
    And   I enter the value in Non-Government-Revenue Grants with "<NonGovernment_RevenueGrants>"
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: testing Happy Path

      | LA_SpecialEducationalNeeds | LA_EarlyYears | OtherLARevenueGrants | OtherGovernmentRevenueGrants | NonGovernment_RevenueGrants | error |
      | 9999999                    | 9999999       | 9999999              | 9999999                      | 9999999                     | 5     |
      | -1000000                   | -1000000      | -1000000             | -1000000                     | -1000000                    | 5     |
      | -9999999                   | -9999999      | -9999999             | -9999999                     | -9999999                    | 5     |
      | 1000000                    | 1000000       | 1000000              | 1000000                      | 1000000                     | 5     |


  @sanity
  Scenario Outline: SoFA > Revenue Grants > Other page : Error Checking : Invalid Data Format

    Given I am on SoFA section
    When  I navigate to the Other Revenue Grants page
    And   I enter the value in Local Authority- Special Educational Needs with "<LA_SpecialEducationalNeeds>"
    And   I enter the value in Local Authority-Early Years with "<LA_EarlyYears>"
    And   I enter the value in Other Local Authority Revenue Grants with "<OtherLARevenueGrants>"
    And   I enter the value in Other Government Revenue Grants with "<OtherGovernmentRevenueGrants>"
    And   I enter the value in Non-Government-Revenue Grants with "<NonGovernment_RevenueGrants>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: testing errors : invalid data format

      | LA_SpecialEducationalNeeds | LA_EarlyYears | OtherLARevenueGrants | OtherGovernmentRevenueGrants | NonGovernment_RevenueGrants | error |
      | sample                     | test@1        | 123&&123             | £12345                       | £1.00                       | 5     |
      | $23.52                     | £23.56        | -1254£               | 1a00000                      | 100&000                     | 5     |
      | test                       | @test         | alpha123456          | 123&&001                     | ^&*(                        | 5     |
      |@@@@@@                      |@@@@@@         |@@@@@@                |@@@@@@                        |@@@@@@                       |5      |
      |******                      |******         |******                |******                        |******                       |5      |
      |^^^^^^^                     |^^^^^^^        |^^^^^^^               |^^^^^^^                       |^^^^^^^                      |5      |
      |((((((((                    |((((((((       |((((((((              |((((((((                      |((((((((                     |5      |
      |&&&&&&&                     |&&&&&&&        |&&&&&&&               |&&&&&&&                       |&&&&&&&                      |5      |
      |$$$$$$$                     |$$$$$$$        |$$$$$$$               |$$$$$$$                       |$$$$$$$                      |5      |


#    ------------

  @smoke
  Scenario Outline: testing the happy path for SoFA>> Revenue Grants>> Other page

    Given I am on SoFA section
    When  I navigate to the Other Revenue Grants page
    And   I enter the value in Local Authority- Special Educational Needs with "<LA_SpecialEducationalNeeds>"
    And   I enter the value in Local Authority-Early Years with "<LA_EarlyYears>"
    And   I enter the value in Other Local Authority Revenue Grants with "<OtherLARevenueGrants>"
    And   I enter the value in Other Government Revenue Grants with "<OtherGovernmentRevenueGrants>"
    And   I enter the value in Non-Government-Revenue Grants with "<NonGovernment_RevenueGrants>"
    And   I see the totals field is now populated with "<Total>"

    Examples: testing Happy Path

      | LA_SpecialEducationalNeeds | LA_EarlyYears | OtherLARevenueGrants | OtherGovernmentRevenueGrants | NonGovernment_RevenueGrants | Total      |
      | -999999                    | -999999       | -999999              | -999999                      | -999999                     | -4,999,995 |

  @smoke
  Scenario Outline: testing the unhappy path or invalid entries for SoFA>> Revenue Grants>> Other page

    Given I am on SoFA section
    When  I navigate to the Other Revenue Grants page
    And   I enter the value in Local Authority- Special Educational Needs with "<LA_SpecialEducationalNeeds>"
    And   I enter the value in Local Authority-Early Years with "<LA_EarlyYears>"
    And   I enter the value in Other Local Authority Revenue Grants with "<OtherLARevenueGrants>"
    And   I enter the value in Other Government Revenue Grants with "<OtherGovernmentRevenueGrants>"
    And   I enter the value in Non-Government-Revenue Grants with "<NonGovernment_RevenueGrants>"
    And   I see the totals field is NOT populated with "<Total>"

    Examples: testing Happy Path

      | LA_SpecialEducationalNeeds | LA_EarlyYears | OtherLARevenueGrants | OtherGovernmentRevenueGrants | NonGovernment_RevenueGrants | Total      |
      | -999999                    | -999999       | -999999              | -999999                      | -999999                     | -4,999,994 |

  @smoke
  Scenario Outline: SoFA > Revenue Grants > Other page : Error Checking : Financial Data Range

    Given I am on SoFA section
    When  I navigate to the Other Revenue Grants page
    And   I enter the value in Local Authority- Special Educational Needs with "<LA_SpecialEducationalNeeds>"
    And   I enter the value in Local Authority-Early Years with "<LA_EarlyYears>"
    And   I enter the value in Other Local Authority Revenue Grants with "<OtherLARevenueGrants>"
    And   I enter the value in Other Government Revenue Grants with "<OtherGovernmentRevenueGrants>"
    And   I enter the value in Non-Government-Revenue Grants with "<NonGovernment_RevenueGrants>"
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: testing Happy Path

      | LA_SpecialEducationalNeeds | LA_EarlyYears | OtherLARevenueGrants | OtherGovernmentRevenueGrants | NonGovernment_RevenueGrants | error |
      | 9999999                    | 9999999       | 9999999              | 9999999                      | 9999999                     | 5     |


  @smoke
  Scenario Outline: SoFA > Revenue Grants > Other page : Error Checking : Invalid Data Format

    Given I am on SoFA section
    When  I navigate to the Other Revenue Grants page
    And   I enter the value in Local Authority- Special Educational Needs with "<LA_SpecialEducationalNeeds>"
    And   I enter the value in Local Authority-Early Years with "<LA_EarlyYears>"
    And   I enter the value in Other Local Authority Revenue Grants with "<OtherLARevenueGrants>"
    And   I enter the value in Other Government Revenue Grants with "<OtherGovernmentRevenueGrants>"
    And   I enter the value in Non-Government-Revenue Grants with "<NonGovernment_RevenueGrants>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: testing errors : invalid data format
      | LA_SpecialEducationalNeeds | LA_EarlyYears | OtherLARevenueGrants | OtherGovernmentRevenueGrants | NonGovernment_RevenueGrants | error |
      | sample                     | test@1        | 123&&123             | £12345                       | £1.00                       | 5     |



  @sofa_references
    Scenario: Testing the reference for SoFA Revenue Grants Others Page
      Given I am on SoFA section
      When  I navigate to the Other Revenue Grants page
      Then I see the correct references are displayed for "s_rg_Other" page of type "Table"
