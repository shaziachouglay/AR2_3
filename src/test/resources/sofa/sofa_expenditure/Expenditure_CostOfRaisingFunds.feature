@fullAndFinal
Feature: Testing Cost Of Raising Funds Page

  @sanity
  Scenario Outline: Checking Cost Of Raising Funds Section with Valid Credentials

    Given I am on SoFA section
    And   I have navigated to Cost Of Raising Funds section
    When  I enter value in Pay Cost with "<PayCosts>"
    When  I enter value in Premise Costs with "<PremiseCosts>"
    When  I enter value in Other "<Other>"
    Then  I see the value of Totals in Cost Of Raising Funds is "<Totals>"

    Examples: Checking Cost Of Raising Funds Page With valid Cedentials .

      | PayCosts | PremiseCosts | Other   | Totals     |
      | 10       | 10           | 10      | 30         |
      | 100      | 100          | 100     | 300        |
      | 1        | 1            | 1       | 3          |
      | 2        | 2            | 2       | 6          |
      | 50       | 50           | 50      | 150        |
      | 150      | 150          | 150     | 450        |
      | 500      | 500          | 500     | 1,500      |
      | -10      | -10          | -10     | -30        |
      | -100     | -100         | -100    | -300       |
      | -1       | -1           | -1      | -3         |
      | -2       | -2           | -2      | -6         |
      | -50      | -50          | -50     | -150       |
      | -150     | -150         | -150    | -450       |
      | -500     | -500         | -500    | -1,500     |
      | 999999   | 999999       | 999999  | 2,999,997  |
      | 999998   | 999998       | 999998  | 2,999,994  |
      | -999999  | -999999      | -999999 | -2,999,997 |
      | -999998  | -999998      | -999998 | -2,999,994 |



  @sanity
  Scenario Outline: Checking Cost Of Raising Funds Section with invalid Credentials

    Given I am on SoFA section
    And   I have navigated to Cost Of Raising Funds section
    When  I enter value in Pay Cost with "<PayCosts>"
    When  I enter value in Premise Costs with "<PremiseCosts>"
    When  I enter value in Other "<Other>"
    Then  I see the value of Totals in Cost Of Raising Funds is NOT "<Totals>" in Cost of Raising Funds


    Examples: Checking Cost Of Raising Funds Page With invalid Credentials .

      | PayCosts | PremiseCosts | Other   | Totals     |
      | 10       | 10           | 10      | 31         |
      | 100      | 100          | 100     | 301        |
      | 1        | 1            | 1       | 1          |
      | 2        | 2            | 2       | 5          |
      | 50       | 50           | 50      | 151        |
      | 150      | 150          | 150     | 451        |
      | 500      | 500          | 500     | 1,501      |
      | -10      | -10          | -10     | -31        |
      | -100     | -100         | -100    | -301       |
      | -1       | -1           | -1      | -2         |
      | -2       | -2           | -2      | -4         |
      | -50      | -50          | -50     | -151       |
      | -150     | -150         | -150    | -451       |
      | -500     | -500         | -500    | -1,501     |
      | 999999   | 999999       | 999999  | 2,999,996  |
      | 999998   | 999998       | 999998  | 2,999,992  |
      | -999999  | -999999      | -999999 | -2,998,997 |
      | -999998  | -999998      | -999998 | -2,998,994 |

  @sanity
  Scenario Outline: Checking Cost Of Raising Funds Section : Errors: All Financial Data Range

    Given I am on SoFA section
    And   I have navigated to Cost Of Raising Funds section
    When  I enter value in Pay Cost with "<PayCosts>"
    When  I enter value in Premise Costs with "<PremiseCosts>"
    When  I enter value in Other "<Other>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"

    Examples: DATA: Cost Of Raising Funds Section : Errors: All Financial Data Range

      | PayCosts | PremiseCosts | Other    | errors |
      | 1000000  | 1000000      | 1000000  | 3      |
      | 9999999  | 9999999      | 9999999  | 3      |
      | -1000000 | -1000000     | -1000000 | 3      |
      | -9999999 | -9999999     | -9999999 | 3      |

  @sanity
  Scenario Outline: Checking Cost Of Raising Funds Section : Errors: Invalid Data Format

    Given I am on SoFA section
    And   I have navigated to Cost Of Raising Funds section
    When  I enter value in Pay Cost with "<PayCosts>"
    When  I enter value in Premise Costs with "<PremiseCosts>"
    When  I enter value in Other "<Other>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"

    Examples: DATA: Cost Of Raising Funds Section : Errors: Invalid Data Format

      | PayCosts | PremiseCosts | Other      | errors |
      | 10000o0  | sample       | $%%$%      | 3      |
      | 99999*9  | sample       | &&&&       | 3      |
      | -1000&00 | -sample      | -****      | 3      |
      | -9999^99 | -sample      | -&*&^%^))( | 3      |


#----------------
  @smoke
  Scenario Outline: Checking Cost Of Raising Funds Section with Valid Credentials

    Given I am on SoFA section
    And   I have navigated to Cost Of Raising Funds section
    When  I enter value in Pay Cost with "<PayCosts>"
    When  I enter value in Premise Costs with "<PremiseCosts>"
    When  I enter value in Other "<Other>"
    Then  I see the value of Totals in Cost Of Raising Funds is "<Totals>"

    Examples: Checking Cost Of Raising Funds Page With valid Cedentials .

      | PayCosts | PremiseCosts | Other   | Totals     |
      | -999998  | -999998      | -999998 | -2,999,994 |

  @smoke
  Scenario Outline: Checking Cost Of Raising Funds Section with invalid Credentials

    Given I am on SoFA section
    And   I have navigated to Cost Of Raising Funds section
    When  I enter value in Pay Cost with "<PayCosts>"
    When  I enter value in Premise Costs with "<PremiseCosts>"
    When  I enter value in Other "<Other>"
    Then  I see the value of Totals in Cost Of Raising Funds is NOT "<Totals>" in Cost of Raising Funds

    Examples: Checking Cost Of Raising Funds Page With invalid Credentials .

      | PayCosts | PremiseCosts | Other   | Totals     |
      | -999998  | -999998      | -999998 | -2,998,994 |

  @smoke
  Scenario Outline: Checking Cost Of Raising Funds Section : Errors: All Financial Data Range

    Given I am on SoFA section
    And   I have navigated to Cost Of Raising Funds section
    When  I enter value in Pay Cost with "<PayCosts>"
    When  I enter value in Premise Costs with "<PremiseCosts>"
    When  I enter value in Other "<Other>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"

    Examples: DATA: Cost Of Raising Funds Section : Errors: All Financial Data Range

      | PayCosts | PremiseCosts | Other    | errors |
      | 1000000  | 1000000      | 1000000  | 3      |

  @smoke
  Scenario Outline: Checking Cost Of Raising Funds Section : Errors: Invalid Data Format

    Given I am on SoFA section
    And   I have navigated to Cost Of Raising Funds section
    When  I enter value in Pay Cost with "<PayCosts>"
    When  I enter value in Premise Costs with "<PremiseCosts>"
    When  I enter value in Other "<Other>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"

    Examples: DATA: Cost Of Raising Funds Section : Errors: Invalid Data Format

      | PayCosts | PremiseCosts | Other      | errors |
      | 10000o0  | sample       | $%%$%      | 3      |


  @sofa_references
  Scenario: testing References for SoFA Expenditure Cost of Raising Funds

      Given I am on SoFA section
      And   I have navigated to Cost Of Raising Funds section
      Then I see the correct references are displayed for "s_ex_CostOfRaisingFunds" page of type "Label"









