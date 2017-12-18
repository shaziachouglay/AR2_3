@fullAndFinal
Feature: testing the Revenue Grants DfEESFA page
  @sanity
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : VALID Entries

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see value in row  and Totals Granst Value in Accounts with "<v40>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record with "<v40.1>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v41>"in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant with "<v42>" in DFEESFA page in revenue grants

    Examples: testing with positive data set for boundary value analysis.
      | v1      | v1.1    | v2      | v3      | v4      | v4.1    | v5      | v6      | v7      | v7.1    | v8      | v9      | v10     | v10.1   | v11     | v12     | v13     | v13.1   | v14     | v15     | v16     | v16.1   | v17     | v18     | v19     | v19.1   | v20     | v21     | v22     | v22.1   | v23     | v24     | v25     | v25.1   | v26     | v27     | v28     | v28.1   | v29     | v30     | v31     | v31.1   | v32     | v33     | v34     | v34.1   | v35     | v36     | v37     | v37.1   | v38     | v39     | v40         | v40.1       | v41         | v42         |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 13          | 13          | 13          | 13          |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 130         | 130         | 130         | 130         |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 1,300       | 1,300       | 1,300       | 1,300       |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 6,500       | 6,500       | 6,500       | 6,500       |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 13,000      | 13,000      | 13,000      | 13,000      |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 12,999,974  | 12,999,974  | 12,999,974  | 12,999,974  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 12,999,987  | 12,999,987  | 12,999,987  | 12,999,987  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -13         | -13         | -13         | -13         |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -130        | -130        | -130        | -130        |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -1,300      | -1,300      | -1,300      | -1,300      |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -6,500      | -6,500      | -6,500      | -6,500      |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -13,000     | -13,000     | -13,000     | -13,000     |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -12,999,974 | -12,999,974 | -12,999,974 | -12,999,974 |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -12,999,987 | -12,999,987 | -12,999,987 | -12,999,987 |


  @sanity
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : INVALID Entries

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants


    Then  I see value in row  and Totals Granst Value in Accounts is NOT  "<v40>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record is NOT  "<v40.1>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record is NOT "<v41>"in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant is NOT "<v42>" in DFEESFA page in revenue grants

    Examples: testing with negative data set for boundary value analysis.
      | v1      | v1.1    | v2      | v3      | v4      | v4.1    | v5      | v6      | v7      | v7.1    | v8      | v9      | v10     | v10.1   | v11     | v12     | v13     | v13.1   | v14     | v15     | v16     | v16.1   | v17     | v18     | v19     | v19.1   | v20     | v21     | v22     | v22.1   | v23     | v24     | v25     | v25.1   | v26     | v27     | v28     | v28.1   | v29     | v30     | v31     | v31.1   | v32     | v33     | v34     | v34.1   | v35     | v36     | v37     | v37.1   | v38     | v39     | v40     | v40.1   | v41     | v42     |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 2       | 1       | 1       | 1       |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 20      | 10      | 10      | 10      |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 200     | 100     | 100     | 100     |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 200     | 500     | 500     | 500     |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 2000    | 1000    | 1000    | 1000    |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 299998  | 999998  | 999998  | 999998  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 299999  | 999999  | 999999  | 999999  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -2      | -1      | -1      | -1      |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -20     | -10     | -10     | -10     |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -200    | -100    | -100    | -100    |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -200    | -500    | -500    | -500    |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -2000   | -1000   | -1000   | -1000   |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -299998 | -999998 | -999998 | -999998 |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -299999 | -999999 | -999999 | -999999 |

  @sanity
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : Financial Data Errors

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Test Data for Financial Data Errors
      | v1       | v1.1     | v2       | v3       | v4       | v4.1     | v5       | v6       | v7       | v7.1     | v8       | v9       | v10      | v10.1    | v11      | v12      | v13      | v13.1    | v14      | v15      | v16      | v16.1    | v17      | v18      | v19      | v19.1    | v20      | v21      | v22      | v22.1    | v23      | v24      | v25      | v25.1    | v26      | v27      | v28      | v28.1    | v29      | v30      | v31      | v31.1    | v32      | v33      | v34      | v34.1    | v35      | v36      | v37      | v37.1    | v38      | v39      |error|
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  |39   |
      | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  |39   |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 |39   |
      | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 |39   |

  @sanity
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : Invalid Data Format Errors
    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1        | v1.1     | v2       | v3        | v4       | v4.1     | v5        | v6       | v7       | v7.1      | v8       | v9       | v10       | v10.1    | v11      | v12       | v13      | v13.1    | v14       | v15      | v16      | v16.1     | v17      | v18      | v19       | v19.1    | v20      | v21       | v22      | v22.1    | v23       | v24      | v25      | v25.1     | v26      | v27      | v28       | v28.1    | v29      | v30      | v31      | v31.1    | v32      | v33      | v34      | v34.1    | v35      | v36      | v37      | v37.1    | v38      | v39      | error |
      | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | 52    |
      | -999w999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | 52    |
      | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 52    |
      | -1000&00  | -1£00000 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | 52    |


#------------------------first

  @sanity
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : VALID Entries

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see value in row  and Totals Granst Value in Accounts with "<v40>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record with "<v40.1>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v41>"in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant with "<v42>" in DFEESFA page in revenue grants

    Examples: testing with positive data set for boundary value analysis.
      | v1      | v1.1    | v2      | v3      | v4      | v4.1    | v5      | v6      | v7      | v7.1    | v8      | v9      | v10     | v10.1   | v11     | v12     | v13     | v13.1   | v14     | v15     | v16     | v16.1   | v17     | v18     | v19     | v19.1   | v20     | v21     | v22     | v22.1   | v23     | v24     | v25     | v25.1   | v26     | v27     | v28     | v28.1   | v29     | v30     | v31     | v31.1   | v32     | v33     | v34     | v34.1   | v35     | v36     | v37     | v37.1   | v38     | v39     | v40         | v40.1       | v41         | v42         |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 13          | 13          | 13          | 13          |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 130         | 130         | 130         | 130         |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 1,300       | 1,300       | 1,300       | 1,300       |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 6,500       | 6,500       | 6,500       | 6,500       |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 13,000      | 13,000      | 13,000      | 13,000      |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 12,999,974  | 12,999,974  | 12,999,974  | 12,999,974  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 12,999,987  | 12,999,987  | 12,999,987  | 12,999,987  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -13         | -13         | -13         | -13         |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -130        | -130        | -130        | -130        |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -1,300      | -1,300      | -1,300      | -1,300      |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -6,500      | -6,500      | -6,500      | -6,500      |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -13,000     | -13,000     | -13,000     | -13,000     |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -12,999,974 | -12,999,974 | -12,999,974 | -12,999,974 |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -12,999,987 | -12,999,987 | -12,999,987 | -12,999,987 |


  @sanity
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : INVALID Entries

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants


    Then  I see value in row  and Totals Granst Value in Accounts is NOT  "<v40>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record is NOT  "<v40.1>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record is NOT "<v41>"in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant is NOT "<v42>" in DFEESFA page in revenue grants

    Examples: testing with negative data set for boundary value analysis.
      | v1      | v1.1    | v2      | v3      | v4      | v4.1    | v5      | v6      | v7      | v7.1    | v8      | v9      | v10     | v10.1   | v11     | v12     | v13     | v13.1   | v14     | v15     | v16     | v16.1   | v17     | v18     | v19     | v19.1   | v20     | v21     | v22     | v22.1   | v23     | v24     | v25     | v25.1   | v26     | v27     | v28     | v28.1   | v29     | v30     | v31     | v31.1   | v32     | v33     | v34     | v34.1   | v35     | v36     | v37     | v37.1   | v38     | v39     | v40     | v40.1   | v41     | v42     |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 2       | 1       | 1       | 1       |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 20      | 10      | 10      | 10      |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 200     | 100     | 100     | 100     |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 200     | 500     | 500     | 500     |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 2000    | 1000    | 1000    | 1000    |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 299998  | 999998  | 999998  | 999998  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 299999  | 999999  | 999999  | 999999  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -2      | -1      | -1      | -1      |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -20     | -10     | -10     | -10     |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -200    | -100    | -100    | -100    |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -200    | -500    | -500    | -500    |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -2000   | -1000   | -1000   | -1000   |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -299998 | -999998 | -999998 | -999998 |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -299999 | -999999 | -999999 | -999999 |

  @sanity
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : Financial Data Errors

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Test Data for Financial Data Errors
      | v1       | v1.1     | v2       | v3       | v4       | v4.1     | v5       | v6       | v7       | v7.1     | v8       | v9       | v10      | v10.1    | v11      | v12      | v13      | v13.1    | v14      | v15      | v16      | v16.1    | v17      | v18      | v19      | v19.1    | v20      | v21      | v22      | v22.1    | v23      | v24      | v25      | v25.1    | v26      | v27      | v28      | v28.1    | v29      | v30      | v31      | v31.1    | v32      | v33      | v34      | v34.1    | v35      | v36      | v37      | v37.1    | v38      | v39      |error|
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  |39   |
      | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  |39   |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 |39   |
      | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 |39   |

  @sanity
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : Invalid Data Format Errors
    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1        | v1.1     | v2       | v3        | v4       | v4.1     | v5        | v6       | v7       | v7.1      | v8       | v9       | v10       | v10.1    | v11      | v12       | v13      | v13.1    | v14       | v15      | v16      | v16.1     | v17      | v18      | v19       | v19.1    | v20      | v21       | v22      | v22.1    | v23       | v24      | v25      | v25.1     | v26      | v27      | v28       | v28.1    | v29      | v30      | v31      | v31.1    | v32      | v33      | v34      | v34.1    | v35      | v36      | v37      | v37.1    | v38      | v39      | error |
      | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | 52    |
      | -999w999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999  | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | -9£99999 | 52    |
      | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&   | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 100^%$&  | 52    |
      | -1000&00  | -1£00000 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00  | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | -1000O00 | 52    |


#------------------------smoke suite below

  @smoke
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : VALID Entries

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see value in row  and Totals Granst Value in Accounts with "<v40>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record with "<v40.1>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v41>"in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant with "<v42>" in DFEESFA page in revenue grants

    Examples: testing with positive data set for boundary value analysis.
      | v1      | v1.1    | v2      | v3      | v4      | v4.1    | v5      | v6      | v7      | v7.1    | v8      | v9      | v10     | v10.1   | v11     | v12     | v13     | v13.1   | v14     | v15     | v16     | v16.1   | v17     | v18     | v19     | v19.1   | v20     | v21     | v22     | v22.1   | v23     | v24     | v25     | v25.1   | v26     | v27     | v28     | v28.1   | v29     | v30     | v31     | v31.1   | v32     | v33     | v34     | v34.1   | v35     | v36     | v37     | v37.1   | v38     | v39     | v40         | v40.1       | v41         | v42         |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -13,000     | -13,000     | -13,000     | -13,000     |


  @smoke
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : INVALID Entries

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants


    Then  I see value in row  and Totals Granst Value in Accounts is NOT  "<v40>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record is NOT  "<v40.1>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record is NOT "<v41>"in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant is NOT "<v42>" in DFEESFA page in revenue grants

    Examples: testing with negative data set for boundary value analysis.
      | v1      | v1.1    | v2      | v3      | v4      | v4.1    | v5      | v6      | v7      | v7.1    | v8      | v9      | v10     | v10.1   | v11     | v12     | v13     | v13.1   | v14     | v15     | v16     | v16.1   | v17     | v18     | v19     | v19.1   | v20     | v21     | v22     | v22.1   | v23     | v24     | v25     | v25.1   | v26     | v27     | v28     | v28.1   | v29     | v30     | v31     | v31.1   | v32     | v33     | v34     | v34.1   | v35     | v36     | v37     | v37.1   | v38     | v39     | v40     | v40.1   | v41     | v42     |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -299998 | -999998 | -999998 | -999998 |


  @smoke
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : Financial Data Errors

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Test Data for Financial Data Errors
      | v1       | v1.1     | v2       | v3       | v4       | v4.1     | v5       | v6       | v7       | v7.1     | v8       | v9       | v10      | v10.1    | v11      | v12      | v13      | v13.1    | v14      | v15      | v16      | v16.1    | v17      | v18      | v19      | v19.1    | v20      | v21      | v22      | v22.1    | v23      | v24      | v25      | v25.1    | v26      | v27      | v28      | v28.1    | v29      | v30      | v31      | v31.1    | v32      | v33      | v34      | v34.1    | v35      | v36      | v37      | v37.1    | v38      | v39      |error|
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  |39   |

  @smoke
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : Invalid Data Format Errors
    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1        | v1.1     | v2       | v3        | v4       | v4.1     | v5        | v6       | v7       | v7.1      | v8       | v9       | v10       | v10.1    | v11      | v12       | v13      | v13.1    | v14       | v15      | v16      | v16.1     | v17      | v18      | v19       | v19.1    | v20      | v21       | v22      | v22.1    | v23       | v24      | v25      | v25.1     | v26      | v27      | v28       | v28.1    | v29      | v30      | v31      | v31.1    | v32      | v33      | v34      | v34.1    | v35      | v36      | v37      | v37.1    | v38      | v39      | error |
      | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | 52    |

  @smoke
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : VALID Entries

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see value in row  and Totals Granst Value in Accounts with "<v40>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record with "<v40.1>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v41>"in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant with "<v42>" in DFEESFA page in revenue grants

    Examples: testing with positive data set for boundary value analysis.
      | v1      | v1.1    | v2      | v3      | v4      | v4.1    | v5      | v6      | v7      | v7.1    | v8      | v9      | v10     | v10.1   | v11     | v12     | v13     | v13.1   | v14     | v15     | v16     | v16.1   | v17     | v18     | v19     | v19.1   | v20     | v21     | v22     | v22.1   | v23     | v24     | v25     | v25.1   | v26     | v27     | v28     | v28.1   | v29     | v30     | v31     | v31.1   | v32     | v33     | v34     | v34.1   | v35     | v36     | v37     | v37.1   | v38     | v39     | v40         | v40.1       | v41         | v42         |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -13,000     | -13,000     | -13,000     | -13,000     |

  @smoke
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : INVALID Entries

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants


    Then  I see value in row  and Totals Granst Value in Accounts is NOT  "<v40>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash received in period per DFE and ESFA record is NOT  "<v40.1>" in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record is NOT "<v41>"in DFEESFA page in revenue grants
    Then  I see value in row  and Totals Expenditure recorded in the accounts from this grant is NOT "<v42>" in DFEESFA page in revenue grants

    Examples: testing with negative data set for boundary value analysis.
      | v1      | v1.1    | v2      | v3      | v4      | v4.1    | v5      | v6      | v7      | v7.1    | v8      | v9      | v10     | v10.1   | v11     | v12     | v13     | v13.1   | v14     | v15     | v16     | v16.1   | v17     | v18     | v19     | v19.1   | v20     | v21     | v22     | v22.1   | v23     | v24     | v25     | v25.1   | v26     | v27     | v28     | v28.1   | v29     | v30     | v31     | v31.1   | v32     | v33     | v34     | v34.1   | v35     | v36     | v37     | v37.1   | v38     | v39     | v40     | v40.1   | v41     | v42     |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -299998 | -999998 | -999998 | -999998 |


  @smoke
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : Financial Data Errors

    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Test Data for Financial Data Errors
      | v1       | v1.1     | v2       | v3       | v4       | v4.1     | v5       | v6       | v7       | v7.1     | v8       | v9       | v10      | v10.1    | v11      | v12      | v13      | v13.1    | v14      | v15      | v16      | v16.1    | v17      | v18      | v19      | v19.1    | v20      | v21      | v22      | v22.1    | v23      | v24      | v25      | v25.1    | v26      | v27      | v28      | v28.1    | v29      | v30      | v31      | v31.1    | v32      | v33      | v34      | v34.1    | v35      | v36      | v37      | v37.1    | v38      | v39      |error|
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  |39   |

  @smoke
  Scenario Outline: Testing : SoFA > Revenue Grants > DfE and ESFA Page : Invalid Data Format Errors
    Given I am on SoFA section
    When  I have navigated to the Revenue Grants DfE and ESFA page

    And   I enter value in row General Annual Grant and Column Granst Value in Accounts with "<v1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with "<v1.1>" in DFEESFA page
    And   I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v2>"in DFEESFA page
    And   I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with "<v3>" in DFEESFA page

    And   I enter value in row Rates reclaim and Column Granst Value in Accounts with "<v4>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with "<v4.1>" in DFEESFA page
    And   I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v5>"in DFEESFA page
    And   I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with "<v6>" in DFEESFA page

    And   I enter value in row Student Support Services and Column Granst Value in Accounts with "<v7>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with "<v7.1>" in DFEESFA page
    And   I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v8>"in DFEESFA page
    And   I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with "<v9>" in DFEESFA page

    And   I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with "<v10>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with "<v10.1>" in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v11>"in DFEESFA page
    And   I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with "<v12>" in DFEESFA page

    And   I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with "<v13>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with "<v13.1>" in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v14>"in DFEESFA page
    And   I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with "<v15>" in DFEESFA page

    And   I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with "<v16>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with "<v16.1>" in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v17>"in DFEESFA page
    And   I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with "<v18>" in DFEESFA page

    And   I enter value in row Insurance and Column Granst Value in Accounts with "<v19>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with "<v19.1>" in DFEESFA page
    And   I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v20>"in DFEESFA page
    And   I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with "<v21>" in DFEESFA page

    And   I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with "<v22>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with "<v22.1>" in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v23>"in DFEESFA page
    And   I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with "<v24>" in DFEESFA page

    And   I enter value in row Start Up Grants and Column Granst Value in Accounts with "<v25>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with "<v25.1>" in DFEESFA page
    And   I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v26>"in DFEESFA page
    And   I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with "<v27>" in DFEESFA page

    And   I enter value in row PE and Sports Grant and Column Granst Value in Accounts with "<v28>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with "<v28.1>" in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v29>"in DFEESFA page
    And   I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with "<v30>" in DFEESFA page

    And   I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with "<v31>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with "<v31.1>" in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v32>"in DFEESFA page
    And   I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with "<v33>" in DFEESFA page

    And   I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with "<v34>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with "<v34.1>" in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v35>"in revenue grants DFEESFA page
    And   I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with "<v36>" in revenue grants DFEESFA page

    And   I enter value in row Other and Column Granst Value in Accounts with "<v37>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash received in period per DFE and ESFA record with "<v37.1>" in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with "<v38>"in DFEESFA page in revenue grants
    And   I enter value in row Other and Column Expenditure recorded in the accounts from this grant with "<v39>" in DFEESFA page in revenue grants

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1        | v1.1     | v2       | v3        | v4       | v4.1     | v5        | v6       | v7       | v7.1      | v8       | v9       | v10       | v10.1    | v11      | v12       | v13      | v13.1    | v14       | v15      | v16      | v16.1     | v17      | v18      | v19       | v19.1    | v20      | v21       | v22      | v22.1    | v23       | v24      | v25      | v25.1     | v26      | v27      | v28       | v28.1    | v29      | v30      | v31      | v31.1    | v32      | v33      | v34      | v34.1    | v35      | v36      | v37      | v37.1    | v38      | v39      | error |
      | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | 999samp99 | 9test99  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | spec111  | 52    |



