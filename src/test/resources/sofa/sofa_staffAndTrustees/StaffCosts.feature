@fullAndFinal
Feature: testing the Staff Costs section in SoFA

  @sanity
  Scenario Outline: testing Staff Costs section with valid credentials
    Given I am on SoFA section
    When  I navigate to Staff Costs section

    And   I enter value in row wages and salaries WS and column PE with "<WS_PE>" and column TE with "<WS_TE>"
    Then  I can see the Total Value for row  wages and salaries WS to be "<WS_T>"

    And   I enter value in row Social Security Costs SSC  and column PE with "<SSC_PE>" and column TE with "<SSC_TE>"
    Then  I can see the Total Value for row SSC to be "<SSC_T>"

    And   I enter value in row Apprenticeship Levey and column Permenantly Employed with "<v1>"
    Then  I see the value in row Apprenticeship Levey and column  Total is "<v2>"

    And   I enter value in row Pension Costs PC  and column PE with "<PC_PE>" and column TE with "<PC_TE>"
    Then  I can see the Total Value for row PC to be "<PC_T>"

    And   I enter value in row Agency Staff Costs ASC  and TE with "<ASC_TE>"
    Then  I can see the Total Value for row ASC to be "<ASC_T>"

    And   I enter value in row Redundancy payment RP  and column PE with "<RP_PE>" and column TE with "<RP_TE>"
    Then  I can see the Total Value for row RP to be "<RP_T>"

    And   I enter value in row Severance Payments SP  and column PE with "<SP_PE>" and column TE with "<SP_TE>"
    Then  I can see the Total Value for row SP to be "<SP_T>"

    And   I enter value in row Other Restructuring Costs ORC  and column PE with "<ORC_PE>" and column TE with "<ORC_TE>"
    Then  I can see the Total Value for row ORC to be "<ORC_T>"

    And   I enter value in row Less Recoveries of Staff Costs LR  and column PE with "<LR_PE>" and column TE with "<LR_TE>"
    Then  I can see the Total Value for row LR to be "<LR_T>"

    Then  I can see the Final Total Column for Column PE to be "<T_PE>"  Column TE to be "<T_TE>" and column total to be "<T_T>"
    Examples: Data Set For Valid Entries or Positive entries

      | WS_PE   | WS_TE   | WS_T       | SSC_PE  | SSC_TE  | SSC_T      | PC_PE   | PC_TE   | PC_T       | ASC_TE  | ASC_T    | RP_PE   | RP_TE   | RP_T       | SP_PE   | SP_TE   | SP_T       | ORC_PE  | ORC_TE  | ORC_T      | LR_PE   | LR_TE   | LR_T       | T_PE       | T_TE       | T_T         | v1       | v2       |
      | 1       | 1       | 2          | 1       | 1       | 2          | 1       | 1       | 2          | 1       | 1        | 1       | 1       | 2          | 1       | 1       | 2          | 1       | 1       | 2          | 1       | 1       | 2          | 8          | 8          | 16          | 1        | 1        |
      | 2       | 2       | 4          | 2       | 2       | 4          | 2       | 2       | 4          | 2       | 2        | 2       | 2       | 4          | 2       | 2       | 4          | 2       | 2       | 4          | 2       | 2       | 4          | 16         | 16         | 32          | 2        | 2        |
      | 10      | 10      | 20         | 10      | 10      | 20         | 10      | 10      | 20         | 10      | 10       | 10      | 10      | 20         | 10      | 10      | 20         | 10      | 10      | 20         | 10      | 10      | 20         | 80         | 80         | 160         | 10       | 10       |
      | 100     | 100     | 200        | 100     | 100     | 200        | 100     | 100     | 200        | 100     | 100      | 100     | 100     | 200        | 100     | 100     | 200        | 100     | 100     | 200        | 100     | 100     | 200        | 800        | 800        | 1,600       | 100      | 100      |
      | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 1000    | 1,000    | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 8,000      | 8,000      | 16,000      | 1,000    | 1,000    |
      | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 1000    | 1,000    | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 1000    | 1000    | 2,000      | 8,000      | 8,000      | 16,000      | 1,000    | 1,000    |
      | 999999  | 999999  | 1,999,998  | 999999  | 999999  | 1,999,998  | 999999  | 999999  | 1,999,998  | 999999  | 999,999  | 999999  | 999999  | 1,999,998  | 999999  | 999999  | 1,999,998  | 999999  | 999999  | 1,999,998  | 999999  | 999999  | 1,999,998  | 7,999,992  | 7,999,992  | 15,999,984  | 999,999  | 999,999  |
      | -1      | -1      | -2         | -1      | -1      | -2         | -1      | -1      | -2         | -1      | -1       | -1      | -1      | -2         | -1      | -1      | -2         | -1      | -1      | -2         | -1      | -1      | -2         | -8         | -8         | -16         | -1       | -1       |
      | -2      | -2      | -4         | -2      | -2      | -4         | -2      | -2      | -4         | -2      | -2       | -2      | -2      | -4         | -2      | -2      | -4         | -2      | -2      | -4         | -2      | -2      | -4         | -16        | -16        | -32         | -2       | -2       |
      | -10     | -10     | -20        | -10     | -10     | -20        | -10     | -10     | -20        | -10     | -10      | -10     | -10     | -20        | -10     | -10     | -20        | -10     | -10     | -20        | -10     | -10     | -20        | -80        | -80        | -160        | -10      | -10      |
      | -100    | -100    | -200       | -100    | -100    | -200       | -100    | -100    | -200       | -100    | -100     | -100    | -100    | -200       | -100    | -100    | -200       | -100    | -100    | -200       | -100    | -100    | -200       | -800       | -800       | -1,600      | -100     | -100     |
      | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1,000   | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -8,000     | -8,000     | -16,000     | -1,000   | -1,000   |
      | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1,000   | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -8,000     | -8,000     | -16,000     | -1,000   | -1,000   |
      | -999999 | -999999 | -1,999,998 | -999999 | -999999 | -1,999,998 | -999999 | -999999 | -1,999,998 | -999999 | -999,999 | -999999 | -999999 | -1,999,998 | -999999 | -999999 | -1,999,998 | -999999 | -999999 | -1,999,998 | -999999 | -999999 | -1,999,998 | -7,999,992 | -7,999,992 | -15,999,984 | -999,999 | -999,999 |

  @sanity
  Scenario Outline: testing Staff Costs section with Invalid credentials

    Given I am on SoFA section
    When  I navigate to Staff Costs section

    And   I enter value in row wages and salaries WS and column PE with "<WS_PE>" and column TE with "<WS_TE>"
    Then  I can see the Total Value for row  wages and salaries WS to be not "<WS_T>"

    And   I enter value in row Social Security Costs SSC  and column PE with "<SSC_PE>" and column TE with "<SSC_TE>"
    Then  I can see the Total Value for row SSC to be  not "<SSC_T>"

    And   I enter value in row Apprenticeship Levey and column Permenantly Employed with "<v1>"
    Then  I see the value in row Apprenticeship Levey and column  Total is not "<v2>"

    And   I enter value in row Pension Costs PC  and column PE with "<PC_PE>" and column TE with "<PC_TE>"
    Then  I can see the Total Value for row PC to be not "<PC_T>"

    And   I enter value in row Agency Staff Costs ASC  and TE with "<ASC_TE>"
    Then  I can see the Total Value for row ASC to be not "<ASC_T>"

    And   I enter value in row Redundancy payment RP  and column PE with "<RP_PE>" and column TE with "<RP_TE>"
    Then  I can see the Total Value for row RP to be not "<RP_T>"

    And   I enter value in row Severance Payments SP  and column PE with "<SP_PE>" and column TE with "<SP_TE>"
    Then  I can see the Total Value for row SP to be not "<SP_T>"

    And   I enter value in row Other Restructuring Costs ORC  and column PE with "<ORC_PE>" and column TE with "<ORC_TE>"
    Then  I can see the Total Value for row ORC to be not "<ORC_T>"

    And   I enter value in row Less Recoveries of Staff Costs LR  and column PE with "<LR_PE>" and column TE with "<LR_TE>"
    Then  I can see the Total Value for row LR to be not "<LR_T>"

    Then  I can see the Final Total Column for Column PE to be not "<T_PE>"  Column TE to be not "<T_TE>" and column total to be not "<T_T>"
    Examples:Data Set For Invalid Entries or Negative entries.

      | WS_PE   | WS_TE   | WS_T       | SSC_PE  | SSC_TE  | SSC_T      | PC_PE   | PC_TE   | PC_T       | ASC_TE  | ASC_T   | RP_PE   | RP_TE   | RP_T       | SP_PE   | SP_TE   | SP_T       | ORC_PE  | ORC_TE  | ORC_T      | LR_PE   | LR_TE   | LR_T       | T_PE       | T_TE       | T_T         | v1      | v2      |
      | 1       | 1       | 1          | 1       | 1       | 3          | 1       | 1       | 1          | 1       | 2       | 1       | 1       | 1          | 1       | 1       | 3          | 1       | 1       | 1          | 1       | 1       | 1          | 5          | 5          | 15          | 1       | 2       |
      | 2       | 2       | 1          | 2       | 2       | 3          | 2       | 2       | 2          | 2       | 4       | 2       | 2       | 2          | 2       | 2       | 3          | 2       | 2       | 1          | 2       | 2       | 2          | 15         | 56         | 30          | 2       | 1       |
      | 10      | 10      | 10         | 10      | 10      | 30         | 10      | 10      | 10         | 10      | 20      | 10      | 10      | 10         | 10      | 10      | 30         | 10      | 10      | 10         | 10      | 10      | 10         | 85         | 50         | 100         | 10      | 20      |
      | 100     | 100     | 100        | 100     | 100     | 300        | 100     | 100     | 100        | 100     | 200     | 100     | 100     | 100        | 100     | 100     | 300        | 100     | 100     | 100        | 100     | 100     | 100        | 850        | 500        | 1000        | 100     | 200     |
      | 1000    | 1000    | 1,000      | 1000    | 1000    | 3,000      | 1000    | 1000    | 1,000      | 1000    | 2000    | 1000    | 1000    | 1,000      | 1000    | 1000    | 31000      | 1000    | 1000    | 1,000      | 1000    | 1000    | 1,000      | 8,500      | 5,000      | 10,000      | 1000    | 2000    |
      | 1000    | 1000    | 1,000      | 1000    | 1000    | 3,000      | 1000    | 1000    | 1,000      | 1000    | 2000    | 1000    | 1000    | 1,000      | 1000    | 1000    | 3,000      | 1000    | 1000    | 1,000      | 1000    | 1000    | 1,000      | 8,050      | 5,000      | 10,000      | 1000    | 2000    |
      | 999999  | 999999  | 2,999,998  | 999999  | 999999  | 2,999,998  | 999999  | 999999  | 2,999,998  | 999999  | 299999  | 999999  | 999999  | 2,999,998  | 999999  | 999999  | 3,999,998  | 999999  | 999999  | 2,999,998  | 999999  | 999999  | 2,999,998  | 7,995,992  | 5,999,992  | 10,999,984  | 999999  | 299999  |
      | -1      | -1      | -1         | -1      | -1      | -1         | -1      | -1      | -1         | -1      | -2      | -1      | -1      | -1         | -1      | -1      | -3         | -1      | -1      | -1         | -1      | -1      | -1         | -5         | -5         | -10         | -1      | -2      |
      | -2      | -2      | -1         | -2      | -2      | -3         | -2      | -2      | -2         | -2      | -1      | -2      | -2      | -2         | -2      | -2      | -3         | -2      | -2      | -1         | -2      | -2      | -1         | -15        | -56        | -30         | -2      | -1      |
      | -10     | -10     | -10        | -10     | -10     | -30        | -10     | -10     | -10        | -10     | -20     | -10     | -10     | -30        | -10     | -10     | -10        | -10     | -10     | -10        | -10     | -10     | -30        | -85        | -50        | -100        | -10     | -20     |
      | -100    | -100    | -100       | -100    | -100    | -300       | -100    | -100    | -100       | -100    | -200    | -100    | -100    | -300       | -100    | -100    | -300       | -100    | -100    | -100       | -100    | -100    | -300       | -850       | -500       | -1000       | -100    | -200    |
      | -1000   | -1000   | -1,000     | -1000   | -1000   | -3,000     | -1000   | -1000   | -1,000     | -1000   | -2000   | -1000   | -1000   | -3,000     | -1000   | -1000   | -3,000     | -1000   | -1000   | -1,000     | -1000   | -1000   | -3,000     | -8,500     | -5,000     | -10,000     | -1000   | -2000   |
      | -1000   | -1000   | -1,000     | -1000   | -1000   | -3,000     | -1000   | -1000   | -1,000     | -1000   | -2000   | -1000   | -1000   | -3,000     | -1000   | -1000   | -3,000     | -1000   | -1000   | -1,000     | -1000   | -1000   | -3,000     | -8,500     | -5,000     | -10,000     | -1000   | -2000   |
      | -999999 | -999999 | -8,999,998 | -999999 | -999999 | -2,999,998 | -999999 | -999999 | -2,999,998 | -999999 | -299999 | -999999 | -999999 | -3,999,998 | -999999 | -999999 | -2,999,998 | -999999 | -999999 | -2,999,998 | -999999 | -999999 | -2,999,998 | -7,599,992 | -5,999,992 | -10,999,984 | -999999 | -299999 |


  @smoke
  Scenario Outline: testing Staff Costs section with valid credentials
    Given I am on SoFA section
    When  I navigate to Staff Costs section

    And   I enter value in row wages and salaries WS and column PE with "<WS_PE>" and column TE with "<WS_TE>"
    Then  I can see the Total Value for row  wages and salaries WS to be "<WS_T>"

    And   I enter value in row Social Security Costs SSC  and column PE with "<SSC_PE>" and column TE with "<SSC_TE>"
    Then  I can see the Total Value for row SSC to be "<SSC_T>"

    And   I enter value in row Apprenticeship Levey and column Permenantly Employed with "<v1>"
    Then  I see the value in row Apprenticeship Levey and column  Total is "<v2>"

    And   I enter value in row Pension Costs PC  and column PE with "<PC_PE>" and column TE with "<PC_TE>"
    Then  I can see the Total Value for row PC to be "<PC_T>"

    And   I enter value in row Agency Staff Costs ASC  and TE with "<ASC_TE>"
    Then  I can see the Total Value for row ASC to be "<ASC_T>"

    And   I enter value in row Redundancy payment RP  and column PE with "<RP_PE>" and column TE with "<RP_TE>"
    Then  I can see the Total Value for row RP to be "<RP_T>"

    And   I enter value in row Severance Payments SP  and column PE with "<SP_PE>" and column TE with "<SP_TE>"
    Then  I can see the Total Value for row SP to be "<SP_T>"

    And   I enter value in row Other Restructuring Costs ORC  and column PE with "<ORC_PE>" and column TE with "<ORC_TE>"
    Then  I can see the Total Value for row ORC to be "<ORC_T>"

    And   I enter value in row Less Recoveries of Staff Costs LR  and column PE with "<LR_PE>" and column TE with "<LR_TE>"
    Then  I can see the Total Value for row LR to be "<LR_T>"

    Then  I can see the Final Total Column for Column PE to be "<T_PE>"  Column TE to be "<T_TE>" and column total to be "<T_T>"
    Examples: Data Set For Valid Entries or Positive entries

      | WS_PE   | WS_TE   | WS_T       | SSC_PE  | SSC_TE  | SSC_T      | PC_PE   | PC_TE   | PC_T       | ASC_TE  | ASC_T    | RP_PE   | RP_TE   | RP_T       | SP_PE   | SP_TE   | SP_T       | ORC_PE  | ORC_TE  | ORC_T      | LR_PE   | LR_TE   | LR_T       | T_PE       | T_TE       | T_T         | v1       | v2       |
      | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1,000   | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -1000   | -1000   | -2,000     | -8,000     | -8,000     | -16,000     | -1,000   | -1,000   |


  @smoke
  Scenario Outline: testing Staff Costs section with Invalid credentials

    Given I am on SoFA section
    When  I navigate to Staff Costs section

    And   I enter value in row wages and salaries WS and column PE with "<WS_PE>" and column TE with "<WS_TE>"
    Then  I can see the Total Value for row  wages and salaries WS to be not "<WS_T>"

    And   I enter value in row Social Security Costs SSC  and column PE with "<SSC_PE>" and column TE with "<SSC_TE>"
    Then  I can see the Total Value for row SSC to be  not "<SSC_T>"

    And   I enter value in row Apprenticeship Levey and column Permenantly Employed with "<v1>"
    Then  I see the value in row Apprenticeship Levey and column  Total is not "<v2>"

    And   I enter value in row Pension Costs PC  and column PE with "<PC_PE>" and column TE with "<PC_TE>"
    Then  I can see the Total Value for row PC to be not "<PC_T>"

    And   I enter value in row Agency Staff Costs ASC  and TE with "<ASC_TE>"
    Then  I can see the Total Value for row ASC to be not "<ASC_T>"

    And   I enter value in row Redundancy payment RP  and column PE with "<RP_PE>" and column TE with "<RP_TE>"
    Then  I can see the Total Value for row RP to be not "<RP_T>"

    And   I enter value in row Severance Payments SP  and column PE with "<SP_PE>" and column TE with "<SP_TE>"
    Then  I can see the Total Value for row SP to be not "<SP_T>"

    And   I enter value in row Other Restructuring Costs ORC  and column PE with "<ORC_PE>" and column TE with "<ORC_TE>"
    Then  I can see the Total Value for row ORC to be not "<ORC_T>"

    And   I enter value in row Less Recoveries of Staff Costs LR  and column PE with "<LR_PE>" and column TE with "<LR_TE>"
    Then  I can see the Total Value for row LR to be not "<LR_T>"

    Then  I can see the Final Total Column for Column PE to be not "<T_PE>"  Column TE to be not "<T_TE>" and column total to be not "<T_T>"
    Examples:Data Set For Invalid Entries or Negative entries.

      | WS_PE   | WS_TE   | WS_T       | SSC_PE  | SSC_TE  | SSC_T      | PC_PE   | PC_TE   | PC_T       | ASC_TE  | ASC_T   | RP_PE   | RP_TE   | RP_T       | SP_PE   | SP_TE   | SP_T       | ORC_PE  | ORC_TE  | ORC_T      | LR_PE   | LR_TE   | LR_T       | T_PE       | T_TE       | T_T         | v1      | v2      |
      | 1       | 1       | 1          | 1       | 1       | 3          | 1       | 1       | 1          | 1       | 2       | 1       | 1       | 1          | 1       | 1       | 3          | 1       | 1       | 1          | 1       | 1       | 1          | 5          | 5          | 15          | 1       | 2       |



  Scenario: testing references for SOFA Staff and Trustees Staff Costs
    Given I am on SoFA section
    When  I navigate to Staff Costs section
    Then I see the correct references are displayed for "s_st_StaffCost" page of type "Table"

