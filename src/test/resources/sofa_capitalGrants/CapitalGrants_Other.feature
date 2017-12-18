@fullAndFinal
Feature: Testing the Capital Grants Others Page

  @sanity
  Scenario Outline: Checking Other Capital Grants with Valid Credentials

    Given I am on SoFA section
    When  I navigate to Other Capital Grants page
    And   I have navigated to the Other page
    And   I enter value in Local Authority Capital Grant with "<Local Authority Capital Grants>"
    And   I enter value in Other Government Capital Grants with "<Other Government Capital Grants>"
    And   I enter value in Non-Government Capital Grants with "<Non-Government Capital Grants>"
    Then  I can see the value populated in the Total field to be "<Total>"

    Examples: Data for Happy Paths

      | Local Authority Capital Grants | Other Government Capital Grants | Non-Government Capital Grants | Total      |
      | 10                             | 10                              | 10                            | 30         |
      | 1                              | 1                               | 1                             | 3          |
      | 100                            | 100                             | 100                           | 300        |
      | 200                            | 200                             | 200                           | 600        |
      | 300                            | 300                             | 300                           | 900        |
      | 1000                           | 1000                            | 1000                          | 3,000      |
      | 999998                         | 999998                          | 999998                        | 2,999,994  |
      | 999999                         | 999999                          | 999999                        | 2,999,997  |
      | 500                            | 500                             | 500                           | 1,500      |
      | -10                            | -10                             | -10                           | -30        |
      | -1                             | -1                              | -1                            | -3         |
      | -100                           | -100                            | -100                          | -300       |
      | -200                           | -200                            | -200                          | -600       |
      | -300                           | -300                            | -300                          | -900       |
      | -500                           | -500                            | -500                          | -1,500     |
      | -1000                          | -1000                           | -1000                         | -3,000     |
      | -999998                        | -999998                         | -999998                       | -2,999,994 |
      | -999999                        | -999999                         | -999999                       | -2,999,997 |



  @sanity
  Scenario Outline: Checking Other Capital Grants with Invalid Credentials

    Given I am on SoFA section
    When  I navigate to Other Capital Grants page
    And   I enter value in Local Authority Capital Grant with "<Local Authority Capital Grants>"
    And   I enter value in Other Government Capital Grants with "<Other Government Capital Grants>"
    And   I enter value in Non-Government Capital Grants with "<Non-Government Capital Grants>"
    Then  I can see the value populated in the Total field is NOT "<Total>"

    Examples: Data for Happy Path

      | Local Authority Capital Grants | Other Government Capital Grants | Non-Government Capital Grants | Total      |
      | 10                             | 10                              | 10                            | 20         |
      | 1                              | 1                               | 1                             | 2          |
      | 100                            | 100                             | 100                           | 200        |
      | 200                            | 200                             | 200                           | 200        |
      | 300                            | 300                             | 300                           | 200        |
      | 1000                           | 1000                            | 1000                          | 2,000      |
      | 999998                         | 999998                          | 999998                        | 1,999,994  |
      | 999999                         | 999999                          | 999999                        | 1,999,997  |
      | 500                            | 500                             | 500                           | 2,500      |
      | -10                            | -10                             | -10                           | -20        |
      | -1                             | -1                              | -1                            | -1         |
      | -100                           | -100                            | -100                          | -200       |
      | -200                           | -200                            | -200                          | -500       |
      | -300                           | -300                            | -300                          | -500       |
      | -500                           | -500                            | -500                          | -5,500     |
      | -1000                          | -1000                           | -1000                         | -5,000     |
      | -999998                        | -999998                         | -999998                       | -5,999,994 |
      | -999999                        | -999999                         | -999999                       | -5,999,997 |


  @sanity
  Scenario Outline: Checking Other Capital Grants Input Field Error  All Financial Data Range
    Given I am on SoFA section
    When  I navigate to Other Capital Grants page
    And   I enter value in Local Authority Capital Grant with "<Local Authority Capital Grants>"
    And   I enter value in Other Government Capital Grants with "<Other Government Capital Grants>"
    And   I enter value in Non-Government Capital Grants with "<Non-Government Capital Grants>"
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: ERRORS : Financial Data Error

      | Local Authority Capital Grants | Other Government Capital Grants | Non-Government Capital Grants | error |
      | 99999999                       | 99999999                        | 99999999                      | 3     |
      | -99999999                      | -99999999                       | -99999999                     | 3     |
      | 1000000                        | 1000000                         | 1000000                       | 3     |
      | -1000000                       | -1000000                        | -1000000                      | 3     |


  @sanity
  Scenario Outline: Checking Other Capital Grants Input Field Error : Invalid Number Format
    Given I am on SoFA section
    When  I navigate to Other Capital Grants page
    And   I enter value in Local Authority Capital Grant with "<Local Authority Capital Grants>"
    And   I enter value in Other Government Capital Grants with "<Other Government Capital Grants>"
    And   I enter value in Non-Government Capital Grants with "<Non-Government Capital Grants>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: ERRORS : Invalid Number Format Error
      | Local Authority Capital Grants | Other Government Capital Grants | Non-Government Capital Grants | error |
      | sample                         | sample 1223                     | £1000                         | 3     |
      | *test                          | 1 223                           | £/&&1000                      | 3     |
      | @@@@@                          | @@@@@                           | @@@@@                         | 3     |
      | *****                          | *****                           | *****                         | 3     |
      | ^^^^^^                         | ^^^^^^                          | ^^^^^^^^                      | 3     |
      | %%%%%%%                        | %%%%%%%%                        | %%%%%%%%%                     | 3     |
      | &&&&&&&&                       | &&&&&&&&                        | &&&&&&&&&                     | 3     |

#-----------------

  @smoke
  Scenario Outline: Checking Other Capital Grants with Valid Credentials

    Given I am on SoFA section
    When  I navigate to Other Capital Grants page
    And   I have navigated to the Other page
    And   I enter value in Local Authority Capital Grant with "<Local Authority Capital Grants>"
    And   I enter value in Other Government Capital Grants with "<Other Government Capital Grants>"
    And   I enter value in Non-Government Capital Grants with "<Non-Government Capital Grants>"
    Then  I can see the value populated in the Total field to be "<Total>"

    Examples: Data for Happy Paths

      | Local Authority Capital Grants | Other Government Capital Grants | Non-Government Capital Grants | Total      |
      | -999999                        | -999999                         | -999999                       | -2,999,997 |



  @smoke
  Scenario Outline: Checking Other Capital Grants with Invalid Credentials

    Given I am on SoFA section
    When  I navigate to Other Capital Grants page
    And   I enter value in Local Authority Capital Grant with "<Local Authority Capital Grants>"
    And   I enter value in Other Government Capital Grants with "<Other Government Capital Grants>"
    And   I enter value in Non-Government Capital Grants with "<Non-Government Capital Grants>"
    Then  I can see the value populated in the Total field is NOT "<Total>"

    Examples: Data for Happy Path

      | Local Authority Capital Grants | Other Government Capital Grants | Non-Government Capital Grants | Total      |
      | -999999                        | -999999                         | -999999                       | -5,999,997 |


  @smoke
  Scenario Outline: Checking Other Capital Grants Input Field Error  All Financial Data Range
    Given I am on SoFA section
    When  I navigate to Other Capital Grants page
    And   I enter value in Local Authority Capital Grant with "<Local Authority Capital Grants>"
    And   I enter value in Other Government Capital Grants with "<Other Government Capital Grants>"
    And   I enter value in Non-Government Capital Grants with "<Non-Government Capital Grants>"
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: ERRORS : Financial Data Error

      | Local Authority Capital Grants | Other Government Capital Grants | Non-Government Capital Grants | error |
      | 99999999                       | 99999999                        | 99999999                      | 3     |

  @smoke
  Scenario Outline: Checking Other Capital Grants Input Field Error : Invalid Number Format
    Given I am on SoFA section
    When  I navigate to Other Capital Grants page
    And   I enter value in Local Authority Capital Grant with "<Local Authority Capital Grants>"
    And   I enter value in Other Government Capital Grants with "<Other Government Capital Grants>"
    And   I enter value in Non-Government Capital Grants with "<Non-Government Capital Grants>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: ERRORS : Invalid Number Format Error
      | Local Authority Capital Grants | Other Government Capital Grants | Non-Government Capital Grants | error |
      | &&&&&&&&                       | &&&&&&&&                        | &&&&&&&&&                     | 3     |







