@fullAndFinal
Feature: Testing the provision of baording activites expenditure page
  @sanity
  Scenario Outline: Testing Provision Of Boarding Activities : Expenditure : valid entries

    Given I am on SoFA section
    And    I have navigates to the Provision Of Activities Expenditure page
    And    I enter value in field Direct Staff Pay with "<v1>"
    And    I enter value in field Direct Costs for Goods and Services  with "<v2>"
    And    I enter value in field Other Direct Costs with "<v3>"
    Then   I see the value in field Total Direct Cost is "<v4>"
    And    I enter value in field Indirect Costs for Staff Pay with "<v5>"
    And    I enter value in field Indirect Costs for Utilities with "<v6>"
    And    I enter value in field Indirect Costs for Maintenance of Premises with "<v7>"
    And    I enter value in field Indirect Costs for Depreciation with "<v8>"
    And    I enter value in field Indirect Costs for Amortisation with "<v9>"
    And    I enter value in field Indirect Costs for Impairment with "<v9>"
    And    I enter value in field Other Indirect Costs with "<v10>"
    Then   I see the value in field Total Indirect Costs is "<v11>"
    Examples:
      | v1      | v2      | v3      | v4         | v5      | v6      | v7      | v8      | v9      | v10     | v11        |
      | 1       | 1       | 1       | 3          | 1       | 1       | 1       | 1       | 1       | 1       | 7          |
      | 100     | 100     | 100     | 300        | 100     | 100     | 100     | 100     | 100     | 100     | 700        |
      | 1000    | 1000    | 1000    | 3,000      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 7,000      |
      | 10,000  | 10,000  | 10,000  | 30,000     | 10,000  | 10,000  | 10,000  | 10,000  | 10,000  | 10,000  | 70,000     |
      | 999998  | 999998  | 999998  | 2,999,994  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 6,999,986  |
      | 999999  | 999999  | 999999  | 2,999,997  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 6,999,993  |
      | -1      | -1      | -1      | -3         | -1      | -1      | -1      | -1      | -1      | -1      | -7         |
      | -100    | -100    | -100    | -300       | -100    | -100    | -100    | -100    | -100    | -100    | -700       |
      | -1000   | -1000   | -1000   | -3,000     | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -7,000     |
      | -10,000 | -10,000 | -10,000 | -30,000    | -10,000 | -10,000 | -10,000 | -10,000 | -10,000 | -10,000 | -70,000    |
      | -999998 | -999998 | -999998 | -2,999,994 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -6,999,986 |
      | -999999 | -999999 | -999999 | -2,999,997 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -6,999,993 |



  @sanity
  Scenario Outline: Testing Provision Of Boarding Activities : Expenditure : invalid entries


    Given I am on SoFA section
    And    I have navigates to the Provision Of Activities Expenditure page
    And    I enter value in field Direct Staff Pay with "<v1>"
    And    I enter value in field Direct Costs for Goods and Services  with "<v2>"
    And    I enter value in field Other Direct Costs with "<v3>"
    Then   I see the value in field Total Direct Cost is NOT "<v4>"
    And    I enter value in field Indirect Costs for Staff Pay with "<v5>"
    And    I enter value in field Indirect Costs for Utilities with "<v6>"
    And    I enter value in field Indirect Costs for Maintenance of Premises with "<v7>"
    And    I enter value in field Indirect Costs for Depreciation with "<v8>"
    And    I enter value in field Indirect Costs for Amortisation with "<v9>"
    And    I enter value in field Indirect Costs for Impairment with "<v9>"
    And    I enter value in field Other Indirect Costs with "<v10>"
    Then   I see the value in field Total Indirect Costs is NOT "<v11>"


    Examples: Invalid Entries
      | v1      | v2      | v3      | v4         | v5      | v6      | v7      | v8      | v9      | v10     | v11        |
      | 1       | 1       | 1       | 2          | 1       | 1       | 1       | 1       | 1       | 1       | 6          |
      | 100     | 100     | 100     | 200        | 100     | 100     | 100     | 100     | 100     | 100     | 600        |
      | 1000    | 1000    | 1000    | 2,000      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 6,000      |
      | 10,000  | 10,000  | 10,000  | 20,000     | 10,000  | 10,000  | 10,000  | 10,000  | 10,000  | 10,000  | 60,000     |
      | 999998  | 999998  | 999998  | 1,999,994  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 5,999,986  |
      | 999999  | 999999  | 999999  | 1,999,997  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 5,999,993  |
      | -1      | -1      | -1      | -2         | -1      | -1      | -1      | -1      | -1      | -1      | -6         |
      | -100    | -100    | -100    | -200       | -100    | -100    | -100    | -100    | -100    | -100    | -600       |
      | -1000   | -1000   | -1000   | -2,000     | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -5,000     |
      | -10,000 | -10,000 | -10,000 | -20,000    | -10,000 | -10,000 | -10,000 | -10,000 | -10,000 | -10,000 | -40,000    |
      | -999998 | -999998 | -999998 | -1,999,994 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -5,999,986 |
      | -999999 | -999999 | -999999 | -1,999,997 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -1,999,993 |


  @sanity
  Scenario Outline: Testing Provision Of Boarding Activities : Expenditure : Error Messages ; Financial Data Range


    Given I am on SoFA section
    And    I have navigates to the Provision Of Activities Expenditure page
    And    I enter value in field Direct Staff Pay with "<v1>"
    And    I enter value in field Direct Costs for Goods and Services  with "<v2>"
    And    I enter value in field Other Direct Costs with "<v3>"
    And    I enter value in field Indirect Costs for Staff Pay with "<v5>"
    And    I enter value in field Indirect Costs for Utilities with "<v6>"
    And    I enter value in field Indirect Costs for Maintenance of Premises with "<v7>"
    And    I enter value in field Indirect Costs for Depreciation with "<v8>"
    And    I enter value in field Indirect Costs for Amortisation with "<v9>"
    And    I enter value in field Indirect Costs for Impairment with "<v9>"
    And    I enter value in field Other Indirect Costs with "<v10>"
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"


    Examples: Error Messages ; Financial Data Range

      | v1       | v2       | v3       | v5       | v6       | v7       | v8       | v9       | v10      | error |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 10    |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 10    |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | 10    |
      | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | 10    |

  @sanity
  Scenario Outline: Testing Provision Of Boarding Activities : Expenditure : Error Messages ; Invalid data


    Given I am on SoFA section
    And    I have navigates to the Provision Of Activities Expenditure page
    And    I enter value in field Direct Staff Pay with "<v1>"
    And    I enter value in field Direct Costs for Goods and Services  with "<v2>"
    And    I enter value in field Other Direct Costs with "<v3>"
    And    I enter value in field Indirect Costs for Staff Pay with "<v5>"
    And    I enter value in field Indirect Costs for Utilities with "<v6>"
    And    I enter value in field Indirect Costs for Maintenance of Premises with "<v7>"
    And    I enter value in field Indirect Costs for Depreciation with "<v8>"
    And    I enter value in field Indirect Costs for Amortisation with "<v9>"
    And    I enter value in field Indirect Costs for Impairment with "<v9>"
    And    I enter value in field Other Indirect Costs with "<v10>"
    Then   I wait for page to load
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Error Messages ; Invalid Data Format

      | v1      | v2       | v3      | v5        | v6      | v7      | v8      | v9       | v10      | error |
      | sample  | @@@99999 | &&&9999 | %6799999  | 9£99999 | 3£99999 | £999999 | 999*()99 | 96^99999 | 10    |
      | ******  | ^^^^^^^^ | £££££££ | %%%%%%%%  | !!!!!!! | ()()()( | ~~~~~~~ | >>>>>>>> | <<<<<<<< | 10    |
      | -sample | -sample  | &&&9999 | %6799999  | 9£99999 | 3£99999 | £999999 | 999*()99 | 96^99999 | 10    |
      | 123.OO  | ^test ^  | 123£    | %%%    %% | !!  !!! | ()  ()( | ~  ~~~~ | OOOOOOOO | 123OO.OO | 10    |
#---------------

  @smoke
  Scenario Outline: Testing Provision Of Boarding Activities : Expenditure : valid entries

    Given I am on SoFA section
    And    I have navigates to the Provision Of Activities Expenditure page
    And    I enter value in field Direct Staff Pay with "<v1>"
    And    I enter value in field Direct Costs for Goods and Services  with "<v2>"
    And    I enter value in field Other Direct Costs with "<v3>"
    Then   I see the value in field Total Direct Cost is "<v4>"
    And    I enter value in field Indirect Costs for Staff Pay with "<v5>"
    And    I enter value in field Indirect Costs for Utilities with "<v6>"
    And    I enter value in field Indirect Costs for Maintenance of Premises with "<v7>"
    And    I enter value in field Indirect Costs for Depreciation with "<v8>"
    And    I enter value in field Indirect Costs for Amortisation with "<v9>"
    And    I enter value in field Indirect Costs for Impairment with "<v9>"
    And    I enter value in field Other Indirect Costs with "<v10>"
    Then   I see the value in field Total Indirect Costs is "<v11>"
    Examples:
      | v1      | v2      | v3      | v4         | v5      | v6      | v7      | v8      | v9      | v10     | v11        |
      | -999999 | -999999 | -999999 | -2,999,997 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -6,999,993 |



  @smoke
  Scenario Outline: Testing Provision Of Boarding Activities : Expenditure : invalid entries


    Given I am on SoFA section
    And    I have navigates to the Provision Of Activities Expenditure page
    And    I enter value in field Direct Staff Pay with "<v1>"
    And    I enter value in field Direct Costs for Goods and Services  with "<v2>"
    And    I enter value in field Other Direct Costs with "<v3>"
    Then   I see the value in field Total Direct Cost is NOT "<v4>"
    And    I enter value in field Indirect Costs for Staff Pay with "<v5>"
    And    I enter value in field Indirect Costs for Utilities with "<v6>"
    And    I enter value in field Indirect Costs for Maintenance of Premises with "<v7>"
    And    I enter value in field Indirect Costs for Depreciation with "<v8>"
    And    I enter value in field Indirect Costs for Amortisation with "<v9>"
    And    I enter value in field Indirect Costs for Impairment with "<v9>"
    And    I enter value in field Other Indirect Costs with "<v10>"
    Then   I see the value in field Total Indirect Costs is NOT "<v11>"


    Examples: Invalid Entries
      | v1      | v2      | v3      | v4         | v5      | v6      | v7      | v8      | v9      | v10     | v11        |
      | 999999  | 999999  | 999999  | 1,999,997  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 5,999,993  |

  @smoke
  Scenario Outline: Testing Provision Of Boarding Activities : Expenditure : Error Messages ; Financial Data Range


    Given I am on SoFA section
    And    I have navigates to the Provision Of Activities Expenditure page
    And    I enter value in field Direct Staff Pay with "<v1>"
    And    I enter value in field Direct Costs for Goods and Services  with "<v2>"
    And    I enter value in field Other Direct Costs with "<v3>"
    And    I enter value in field Indirect Costs for Staff Pay with "<v5>"
    And    I enter value in field Indirect Costs for Utilities with "<v6>"
    And    I enter value in field Indirect Costs for Maintenance of Premises with "<v7>"
    And    I enter value in field Indirect Costs for Depreciation with "<v8>"
    And    I enter value in field Indirect Costs for Amortisation with "<v9>"
    And    I enter value in field Indirect Costs for Impairment with "<v9>"
    And    I enter value in field Other Indirect Costs with "<v10>"
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"


    Examples: Error Messages ; Financial Data Range

      | v1       | v2       | v3       | v5       | v6       | v7       | v8       | v9       | v10      | error |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 10    |

  @smoke
  Scenario Outline: Testing Provision Of Boarding Activities : Expenditure : Error Messages ; Invalid data


    Given I am on SoFA section
    And    I have navigates to the Provision Of Activities Expenditure page
    And    I enter value in field Direct Staff Pay with "<v1>"
    And    I enter value in field Direct Costs for Goods and Services  with "<v2>"
    And    I enter value in field Other Direct Costs with "<v3>"
    And    I enter value in field Indirect Costs for Staff Pay with "<v5>"
    And    I enter value in field Indirect Costs for Utilities with "<v6>"
    And    I enter value in field Indirect Costs for Maintenance of Premises with "<v7>"
    And    I enter value in field Indirect Costs for Depreciation with "<v8>"
    And    I enter value in field Indirect Costs for Amortisation with "<v9>"
    And    I enter value in field Indirect Costs for Impairment with "<v9>"
    And    I enter value in field Other Indirect Costs with "<v10>"
    Then   I wait for page to load
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Error Messages ; Invalid Data Format

      | v1      | v2       | v3      | v5        | v6      | v7      | v8      | v9       | v10      | error |
      | sample  | @@@99999 | &&&9999 | %6799999  | 9£99999 | 3£99999 | £999999 | 999*()99 | 96^99999 | 10    |




  @sofa_references
  Scenario: Testing References for SOFA Provision Of Boarding Activities Expenditure Page

    Given I am on SoFA section
    And   I have navigates to the Provision Of Activities Expenditure page
    Then I see the correct references are displayed for "s_pba_Exp" page of type "Label"
