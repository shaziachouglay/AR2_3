@fullAndFinal
Feature: Testing the DfE and ESFA Page in Capital Grants

  @sanity
  Scenario Outline: testing the Capital grants DfE and ESFA page with valid credentials

    Given I am on SoFA section
    When  I have navigated to the Capital Grants Section
    When  I have navigated to the DfE and ESFA section

    And   I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column  Cash received in period per DFE and ESFA record with "<v21>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash received in period per DFE and ESFA record with "<v51>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Priority School Building Programme and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash received in period per DFE and ESFA record with "<v81>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page


    And   I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash received in period per DFE and ESFA record with "<v111>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash received in period per DFE and ESFA record with "<v141>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash received in period per DFE and ESFA record with "<v171>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash received in period per DFE and ESFA record with "<v201>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v231>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v261>"in DFEESFA page
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    Then  I see value in row  and Totals Granst Value in Accounts with "<v28>" in DFEESFA page
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record with "<v291>"in DFEESFA page
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    Examples: Sanity Checking Capital grants DfE ESFA page with Valid entries (Boundary Values and EPC).
      | v1      | v2      | v21     | v3      | v4      | v5      | v51     | v6      | v7      | v8      | v81     | v9      | v10     | v11     | v111    | v12     | v13     | v14     | v141    | v15     | v16     | v17     | v171    | v18     | v19     | v20     | v201    | v21     | v22     | v23     | v231    | v24     | v25     | v26     | v261    | v27     | v28        | v29        | v291       | v30        |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 9          | 9          | 9          | 9          |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 90         | 90         | 90         | 90         |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 900        | 900        | 900        | 900        |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 4,500      | 4,500      | 4,500      | 4,500      |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 9,000      | 9,000      | 9,000      | 9,000      |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 8,999,991  | 8,999,991  | 8,999,991  | 8,999,991  |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 8,999,982  | 8,999,982  | 8,999,982  | 8,999,982  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -9      | -9         | -9         | -9         | -9         |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -90        | -90        | -90        | -90        |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -900       | -900       | -900       | -900       |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -4,500     | -4,500     | -4,500     | -4,500     |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -9,000     | -9,000     | -9,000     | -9,000     |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -8,999,991 | -8,999,991 | -8,999,991 | -8,999,991 |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -8,999,982 | -8,999,982 | -8,999,982 | -8,999,982 |



  @sanity
  Scenario Outline: testing the Capital grants DfE and ESFA page with INVALID entries
    Given I am on SoFA section
    When  I have navigated to the Capital Grants Section
    When  I have navigated to the DfE and ESFA section

    And   I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column  Cash received in period per DFE and ESFA record with "<v2.1>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash received in period per DFE and ESFA record with "<v5.1>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Priority School Building Programme and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash received in period per DFE and ESFA record with "<v8.1>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page


    And   I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash received in period per DFE and ESFA record with "<v11.1>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash received in period per DFE and ESFA record with "<v14.1>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash received in period per DFE and ESFA record with "<v17.1>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash received in period per DFE and ESFA record with "<v20.1>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v23.1>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v26.1>"in DFEESFA page
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    Then  I see value in row  and Totals Granst Value in Accounts is NOT  "<v28>" in DFEESFA page
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record is NOT "<v29>"in DFEESFA page
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record is NOT "<v29.1>"in DFEESFA page
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant is NOT "<v30>" in DFEESFA page

    Examples:
      | v1      | v2      | v2.1    | v3      | v4      | v5      | v5.1    | v6      | v7      | v8      | v8.1    | v9      | v10     | v11     | v11.1   | v12     | v13     | v14     | v14.1   | v15     | v16     | v17     | v17.1   | v18     | v19     | v20     | v20.1   | v21     | v22     | v23     | v23.1   | v24     | v25     | v26     | v26.1   | v27     | v28        | v29        | v29.1      | v30        |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 8          | 8          | 8          | 8          |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 80         | 80         | 80         | 80         |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 800        | 800        | 800        | 800        |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 8,500      | 8,500      | 8,500      | 7,500      |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 8,000      | 8,000      | 8,000      | 8,000      |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 7,999,991  | 7,999,991  | 7,999,991  | 7,999,991  |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 7,999,982  | 7,999,982  | 7,999,982  | 7,999,982  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -9      | -7         | -8         | -8         | -8         |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -70        | -80        | -80        | -80        |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -700       | -800       | -800       | -800       |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -7,500     | -8,500     | -8,500     | -8,500     |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -7,000     | -8,000     | -8,000     | -8,000     |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -7,999,991 | -7,999,991 | -7,999,991 | -7,999,991 |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -7,999,982 | -7,999,982 | -7,999,982 | -7,999,982 |

  @sanity
  Scenario Outline: testing the Capital grants DfE and ESFA page for ERRORS : Financial data Range

    Given I am on SoFA section
    When  I have navigated to the Capital Grants Section
    When  I have navigated to the DfE and ESFA section

    And   I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Priority School Building Programme and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Checking with ERRORS : Financial data Range
      | v1       | v2       | v3       | v4       | v5       | v6       | v7       | v8       | v9       | v10      | v11      | v12      | v13      | v14      | v15      | v16      | v17      | v18      | v19      | v20      | v21      | v22      | v23      | v24      | v25      | v26      | v27      | error |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 27    |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 27    |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | 27    |
      | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | 27    |

  @sanity
  Scenario Outline: testing the Capital grants DfE and ESFA page for ERRORS : Invalid data format

    Given I am on SoFA section
    When  I have navigated to the Capital Grants Section
    When  I have navigated to the DfE and ESFA section

    And   I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Priority School Building Programme and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Checking with ERRORS : Invalid Data Format
      | v1        | v2        | v3         | v4       | v5       | v6       | v7       | v8       | v9       | v10      | v11      | v12      | v13       | v14      | v15        | v16      | v17        | v18        | v19       | v20      | v21      | v22      | v23      | v24      | v25      | v26      | v27      | error |
      | sample    | 9999er999 | 9999()99   | £999999  | q999999  | 9y99999  | 99a9999  | 99@9999  | 99@9999  | 99@9999  | AND      | ACADEMY  | 100a000   | 100a000  | 100a000    | 100a000  | 100**000   | test1234   | 9999r99   | 999999%  | 9&99o99  | 99999o9  | 9999O99  | 99O9999  | 10O0000  | 10O0000  | 10O0000  | 27    |
      | 1oo0000   | 1000re00  | 100**000   | 1@00000  | 1s00000  | 10i0000  | 100a000  | 99@9999  | 99@9999  | 99@9999  | OR       | ACADEMY  | ACADEMY   | 100a000  | 100a000    | 100a000  | 100**000   | sampletest | 1we00000  | 100000^  | 10*0000  | 10O0000  | 10O0000  | 10O0000  | 10O0000  | 10O0000  | 10O0000  | 27    |
      | -9&&9999  | -9999t99  | -99%%999   | -99$9999 | -99@9999 | -999j999 | -9999a99 | -99@9999 | -99@9999 | -ACADEMY | -test    | -ACADEMY | -acade,y  | -9999999 | -100a000   | -100a000 | -100**000  | -samp      | -99er9999 | -999999% | -999899o | -9999999 | -9999O99 | -99999O9 | -10O0000 | -10O0000 | -10O0000 | 27    |
      | -10!!0000 | -1&00000  | -10&&00000 | -^000000 | -£000000 | -b000000 | -100a000 | -99@9999 | -99@9999 | -99@9999 | -99@9999 | -1t00000 | -10sd0000 | -1df0000 | -1000fgf00 | -100erw0 | -10004*&00 | -10002@300 | -@£@      | -100*000 | -100000o | -10000O0 | -100O000 | -1000O00 | -10O0000 | -10O0000 | -10O0000 | 27    |

  @smoke
  Scenario Outline: testing the Capital grants DfE and ESFA page with valid credentials

    Given I am on SoFA section
    When  I have navigated to the Capital Grants Section
    When  I have navigated to the DfE and ESFA section

    And   I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column  Cash received in period per DFE and ESFA record with "<v21>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash received in period per DFE and ESFA record with "<v51>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Priority School Building Programme and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash received in period per DFE and ESFA record with "<v81>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page


    And   I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash received in period per DFE and ESFA record with "<v111>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash received in period per DFE and ESFA record with "<v141>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash received in period per DFE and ESFA record with "<v171>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash received in period per DFE and ESFA record with "<v201>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v231>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v261>"in DFEESFA page
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    Then  I see value in row  and Totals Granst Value in Accounts with "<v28>" in DFEESFA page
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record with "<v291>"in DFEESFA page
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    Examples: Sanity Checking Capital grants DfE ESFA page with Valid entries (Boundary Values and EPC).
      | v1      | v2      | v21     | v3      | v4      | v5      | v51     | v6      | v7      | v8      | v81     | v9      | v10     | v11     | v111    | v12     | v13     | v14     | v141    | v15     | v16     | v17     | v171    | v18     | v19     | v20     | v201    | v21     | v22     | v23     | v231    | v24     | v25     | v26     | v261    | v27     | v28        | v29        | v291       | v30        |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -8,999,991 | -8,999,991 | -8,999,991 | -8,999,991 |

  @smoke
  Scenario Outline: testing the Capital grants DfE and ESFA page with INVALID entries
    Given I am on SoFA section
    When  I have navigated to the Capital Grants Section
    When  I have navigated to the DfE and ESFA section

    And   I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column  Cash received in period per DFE and ESFA record with "<v2.1>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash received in period per DFE and ESFA record with "<v5.1>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Priority School Building Programme and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash received in period per DFE and ESFA record with "<v8.1>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page


    And   I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash received in period per DFE and ESFA record with "<v11.1>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash received in period per DFE and ESFA record with "<v14.1>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash received in period per DFE and ESFA record with "<v17.1>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash received in period per DFE and ESFA record with "<v20.1>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v23.1>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v26.1>"in DFEESFA page
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    Then  I see value in row  and Totals Granst Value in Accounts is NOT  "<v28>" in DFEESFA page
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record is NOT "<v29>"in DFEESFA page
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record is NOT "<v29.1>"in DFEESFA page
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant is NOT "<v30>" in DFEESFA page

    Examples:
      | v1      | v2      | v2.1    | v3      | v4      | v5      | v5.1    | v6      | v7      | v8      | v8.1    | v9      | v10     | v11     | v11.1   | v12     | v13     | v14     | v14.1   | v15     | v16     | v17     | v17.1   | v18     | v19     | v20     | v20.1   | v21     | v22     | v23     | v23.1   | v24     | v25     | v26     | v26.1   | v27     | v28        | v29        | v29.1      | v30        |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -7,999,982 | -7,999,982 | -7,999,982 | -7,999,982 |

  @smoke
  Scenario Outline: testing the Capital grants DfE and ESFA page for ERRORS : Financial data Range

    Given I am on SoFA section
    When  I have navigated to the Capital Grants Section
    When  I have navigated to the DfE and ESFA section

    And   I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Priority School Building Programme and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Checking with ERRORS : Financial data Range
      | v1       | v2       | v3       | v4       | v5       | v6       | v7       | v8       | v9       | v10      | v11      | v12      | v13      | v14      | v15      | v16      | v17      | v18      | v19      | v20      | v21      | v22      | v23      | v24      | v25      | v26      | v27      | error |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 27    |

  @smoke
  Scenario Outline: testing the Capital grants DfE and ESFA page for ERRORS : Invalid data format

    Given I am on SoFA section
    When  I have navigated to the Capital Grants Section
    When  I have navigated to the DfE and ESFA section

    And   I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Priority School Building Programme and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Checking with ERRORS : Invalid Data Format
      | v1        | v2        | v3         | v4       | v5       | v6       | v7       | v8       | v9       | v10      | v11      | v12      | v13       | v14      | v15        | v16      | v17        | v18        | v19       | v20      | v21      | v22      | v23      | v24      | v25      | v26      | v27      | error |
      | sample    | 9999er999 | 9999()99   | £999999  | q999999  | 9y99999  | 99a9999  | 99@9999  | 99@9999  | 99@9999  | AND      | ACADEMY  | 100a000   | 100a000  | 100a000    | 100a000  | 100**000   | test1234   | 9999r99   | 999999%  | 9&99o99  | 99999o9  | 9999O99  | 99O9999  | 10O0000  | 10O0000  | 10O0000  | 27    |


