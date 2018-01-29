@fullAndFinal
Feature: testing the Average Staff Numbers (Full time Equivalent)section in SoFA
  @sanity
  Scenario Outline: Verify Average Staff Numbers with valid credentials

    Given I am on SoFA section
    When  I navigate to Average Staff Numbers

    And   I enter value in row Teachers and column PE with "<TE_PE>" and column TIS with "<TE_TIS>"
    Then  I must see the Total Value for row  Teachers to be "<TE_T>"

    And   I enter value in row Management and column PE with "<MA_PE>" and column TIS with "<MA_TIS>"
    Then  I must see the Total Value for row Management to be "<MA_T>"

    And   I enter value in row Administration and support and column PE with "<AS_PE>" and column TE with "<AS_TE>"
    Then  I must see the Total Value for row Administration and Support to be "<AS_T>"

    And   I must see the Total value for column PE with "<PE_T>" and TIS with "<TIS_T>" and Total with "<TO_T>"

    And   I enter value in row PEGA Accounting office and column Male with "<v1>" and femalae with "<v2>"
    Then  I see the value in row PEGA Accounting Officer and column Total is "<v3>"

    And   I enter value in row PEGA Staff who Serve as Trustees and column Male with "<Staff_MA>" and column Female  with "<Staff_FE>"
    Then  I must see the Total value for row PEGA Staff who serve as Trustees to be "<Staff_Tot>"

    And   I enter value in row PEGA Teachers and column Male with "<v4>" and femalae with "<v5>"
    Then  I see the value in row PEGA Teachers and column Total is "<v6>"

    And   I enter value in row PEGA Management and column Male with "<v7>" and femalae with "<v8>"
    Then  I see the value in row PEGA Management and column Total is "<v9>"

    And   I enter value in row PEGA Administration and support  and column Male with "<v10>" and femalae with "<v11>"
    Then  I see the value in row PEGA Administration and support  and column Total is "<v12>"

    Then  I see the value in row PEGA Total and column male wit "<v13>" and female with "<v14>" and total with "<v15>"

    And   I enter  value in row Days lost to Sickness with "<Stf_Sick>"


    Examples:
      | TE_PE  | TE_TIS | TE_T      | MA_PE  | MA_TIS | MA_T      | AS_PE  | AS_TE  | AS_T      | PE_T      | TIS_T     | TO_T      | v1     | v2     | v3        | Staff_MA | Staff_FE | Staff_Tot | v4     | v5     | v6        | v7     | v8     | v9        | v10    | v11    | v12       | v13       | v14       | v15       | Stf_Sick   |
      | 1      | 1      | 2         | 1      | 1      | 2         | 1      | 1      | 2         | 3         | 3         | 6         | 1      | 1      | 2         | 1        | 1        | 2         | 1      | 1      | 2         | 1      | 1      | 2         | 1      | 1      | 2         | 5         | 5         | 10        | 11         |
      | 10     | 10     | 20        | 10     | 10     | 20        | 10     | 10     | 20        | 30        | 30        | 60        | 10     | 10     | 20        | 10       | 10       | 20        | 10     | 10     | 20        | 10     | 10     | 20        | 10     | 10     | 20        | 50        | 50        | 100       | 110        |
      | 100    | 100    | 200       | 100    | 100    | 200       | 100    | 100    | 200       | 300       | 300       | 600       | 100    | 100    | 200       | 100      | 100      | 200       | 100    | 100    | 200       | 100    | 100    | 200       | 100    | 100    | 200       | 500       | 500       | 1,000     | 1,100      |
      | 1000   | 1000   | 2,000     | 1000   | 1000   | 2,000     | 1000   | 1000   | 2,000     | 3,000     | 3,000     | 6,000     | 1000   | 1000   | 2,000     | 1,000    | 1,000    | 2,000     | 1,000  | 1,000  | 2,000     | 1,000  | 1,000  | 2,000     | 1,000  | 1,000  | 2,000     | 5,000     | 5,000     | 10,000    | 11,000     |
      | 999999 | 999999 | 1,999,998 | 999999 | 999999 | 1,999,998 | 999999 | 999999 | 1,999,998 | 2,999,997 | 2,999,997 | 5,999,994 | 999999 | 999999 | 1,999,998 | 999999   | 999999   | 1,999,998 | 999999 | 999999 | 1,999,998 | 999999 | 999999 | 1,999,998 | 999999 | 999999 | 1,999,998 | 4,999,995 | 4,999,995 | 9,999,990 | 10,999,989 |
      | 999998 | 999998 | 1,999,996 | 999998 | 999998 | 1,999,996 | 999998 | 999998 | 1,999,996 | 2,999,994 | 2,999,994 | 5,999,988 | 999998 | 999998 | 1,999,996 | 999998   | 999998   | 1,999,996 | 999998 | 999998 | 1,999,996 | 999998 | 999998 | 1,999,996 | 999998 | 999998 | 1,999,996 | 4,999,990 | 4,999,990 | 9,999,980 | 10,999,978 |

  @sanity
  Scenario Outline: Verify Average Staff Numbers with INVALID credentials

    Given I am on SoFA section
    When  I navigate to Average Staff Numbers

    And   I enter value in row Teachers and column PE with "<TE_PE>" and column TIS with "<TE_TIS>"
    Then  I must see the Total Value for row  Teachers NOT to be "<TE_T>"

    And   I enter value in row Management and column PE with "<MA_PE>" and column TIS with "<MA_TIS>"
    Then  I must see the Total Value for row Management NOT to be "<MA_T>"

    And   I enter value in row Administration and support and column PE with "<AS_PE>" and column TE with "<AS_TE>"
    Then  I must see the Total Value for row Administration and Support NOT to be "<AS_T>"

    And   I must see the Total value for column PE is NOT "<PE_T>" and TIS is NOT "<TIS_T>" and Total with "<TO_T>"

    And   I enter value in row PEGA Accounting office and column Male with "<v1>" and femalae with "<v2>"
    Then  I see the value in row PEGA Accounting Officer and column Total is NOT "<v3>"

    And   I enter value in row PEGA Staff who Serve as Trustees and column Male with "<Staff_MA>" and column Female  with "<Staff_FE>"
    Then  I must see the Total value for row PEGA Staff who serve as Trustees is NOT "<Staff_Tot>"

    And   I enter value in row PEGA Teachers and column Male with "<v4>" and femalae with "<v5>"
    Then  I see the value in row PEGA Teachers and column Total is NOT "<v6>"

    And   I enter value in row PEGA Management and column Male with "<v7>" and femalae with "<v8>"
    Then  I see the value in row PEGA Management and column Total is NOT "<v9>"

    And   I enter value in row PEGA Administration and support  and column Male with "<v10>" and femalae with "<v11>"
    Then  I see the value in row PEGA Administration and support  and column Total is NOT "<v12>"

    Then  I see the value in row PEGA Total and column male is NOT "<v13>" and female is NOT "<v14>" and total with "<v15>"

    And   I enter  value in row Days lost to Sickness with "<Stf_Sick>"


    Examples:Data: INVALID
      | TE_PE  | TE_TIS | TE_T      | MA_PE  | MA_TIS | MA_T      | AS_PE  | AS_TE  | AS_T      | PE_T      | TIS_T     | TO_T      | v1     | v2     | v3        | Staff_MA | Staff_FE | Staff_Tot | v4     | v5     | v6        | v7     | v8     | v9        | v10    | v11    | v12       | v13       | v14       | v15       | Stf_Sick   |
      | 1      | 1      | 1         | 1      | 1      | 1         | 1      | 1      | 12        | 13        | 31        | 3         | 1      | 1      | 21        | 1        | 1        | 11        | 1      | 1      | 3         | 1      | 1      | 3         | 1      | 1      | 3         | 3         | 3         | 11        | 12         |
      | 10     | 10     | 10        | 10     | 10     | 10        | 10     | 10     | 120       | 130       | 31        | 61        | 10     | 10     | 201       | 10       | 10       | 21        | 10     | 10     | 30        | 10     | 10     | 30        | 10     | 10     | 30        | 30        | 30        | 110       | 120        |
      | 100    | 100    | 100       | 100    | 100    | 100       | 100    | 100    | 100       | 100       | 310       | 610       | 100    | 100    | 201       | 100      | 100      | 210       | 100    | 100    | 300       | 100    | 100    | 300       | 100    | 100    | 300       | 300       | 300       | 1,100     | 1,200      |
      | 1000   | 1000   | 1,000     | 1000   | 1000   | 1,000     | 1000   | 1000   | 1,000     | 1,000     | 3,100     | 6,100     | 1000   | 1000   | 2,100     | 1,000    | 1,000    | 2,100     | 1,000  | 1,000  | 3,000     | 1,000  | 1,000  | 3,000     | 1,000  | 1,000  | 3,000     | 3,000     | 4,000     | 10,100    | 11,200     |
      | 999999 | 999999 | 2,999,998 | 999999 | 999999 | 2,999,998 | 999999 | 999999 | 2,999,998 | 2,199,997 | 2,199,997 | 5,199,994 | 999999 | 999999 | 1,199,998 | 999999   | 999999   | 1,199,998 | 999999 | 999999 | 3,999,998 | 999999 | 999999 | 3,999,998 | 999999 | 999999 | 3,999,998 | 3,999,995 | 3,999,995 | 9,919,990 | 10,299,989 |
      | 999998 | 999998 | 2,999,996 | 999998 | 999998 | 2,999,996 | 999998 | 999998 | 2,999,996 | 2,299,994 | 2,199,994 | 5,199,988 | 999998 | 999998 | 1,199,996 | 999998   | 999998   | 1,199,996 | 999998 | 999998 | 2,999,996 | 999998 | 999998 | 3,999,996 | 999998 | 999998 | 2,999,996 | 3,999,990 | 3,999,990 | 9,919,980 | 10,299,978 |


  @sanity
  Scenario Outline: Verify Average Staff Numbers with ERROR : Invalid data Format error

    Given I am on SoFA section
    When  I navigate to Average Staff Numbers
    And   I enter value in row Teachers and column PE with "<TE_PE>" and column TIS with "<TE_TIS>"
    And   I enter value in row Management and column PE with "<MA_PE>" and column TIS with "<MA_TIS>"
    And   I enter value in row Administration and support and column PE with "<AS_PE>" and column TE with "<AS_TE>"
    And   I must see the Total value for column PE is NOT "<PE_T>" and TIS is NOT "<TIS_T>" and Total with "<TO_T>"
    And   I enter value in row PEGA Accounting office and column Male with "<v1>" and femalae with "<v2>"
    And   I enter value in row PEGA Staff who Serve as Trustees and column Male with "<Staff_MA>" and column Female  with "<Staff_FE>"
    And   I enter value in row PEGA Teachers and column Male with "<v4>" and femalae with "<v5>"
    And   I enter value in row PEGA Management and column Male with "<v7>" and femalae with "<v8>"
    And   I enter value in row PEGA Administration and support  and column Male with "<v10>" and femalae with "<v11>"
    And   I enter  value in row Days lost to Sickness with "<Stf_Sick>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | TE_PE    | TE_TIS   | MA_PE    | MA_TIS   | AS_PE    | AS_TE    | PE_T     | TIS_T    | TO_T     | v1       | v2       | Staff_MA | Staff_FE | v4       | v5       | v7       | v8       | v10      | v11      | Stf_Sick | error |
      | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | 17    |
      | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | £££££££  | 17    |
      | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | $$$$$$$  | 17    |
      | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | @@@@@@   | 17    |
      | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | *******  | 17    |
      | sample*& | 12345O   | sample*& | 12345O   | sample*& | 12345O   | sample*& | 12345O   | sample*& | 12345O   | sample*& | 12345O   | sample*& | 12345O   | sample*& | 12345O   | sample*& | 12345O   | sample*& | 12345O   | 17    |
      | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | testdata | 17    |


  @sanity
  Scenario Outline: Verify Average Staff Numbers with ERROR : Input Value Must be a positive number error

    Given I am on SoFA section
    When  I navigate to Average Staff Numbers
    And   I enter value in row Teachers and column PE with "<TE_PE>" and column TIS with "<TE_TIS>"
    And   I enter value in row Management and column PE with "<MA_PE>" and column TIS with "<MA_TIS>"
    And   I enter value in row Administration and support and column PE with "<AS_PE>" and column TE with "<AS_TE>"
    And   I must see the Total value for column PE is NOT "<PE_T>" and TIS is NOT "<TIS_T>" and Total with "<TO_T>"
    And   I enter value in row PEGA Accounting office and column Male with "<v1>" and femalae with "<v2>"
    And   I enter value in row PEGA Staff who Serve as Trustees and column Male with "<Staff_MA>" and column Female  with "<Staff_FE>"
    And   I enter value in row PEGA Teachers and column Male with "<v4>" and femalae with "<v5>"
    And   I enter value in row PEGA Management and column Male with "<v7>" and femalae with "<v8>"
    And   I enter value in row PEGA Administration and support  and column Male with "<v10>" and femalae with "<v11>"
    And   I enter  value in row Days lost to Sickness with "<Stf_Sick>"
    And   I wait for page to load
    Then  I see the number of errors starting stating The input value must be a positive number are "<error>"
    Examples:
      | TE_PE    | TE_TIS   | MA_PE    | MA_TIS   | AS_PE    | AS_TE    | PE_T     | TIS_T    | TO_T     | v1       | v2       | Staff_MA | Staff_FE | v4       | v5       | v7       | v8       | v10      | v11      | Stf_Sick | error |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 17    |
      | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 17    |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | 17    |
      | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | 17    |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 17    |
      | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | 17    |


#    ---------------

  @smoke
  Scenario Outline: Verify Average Staff Numbers with valid credentials

    Given I am on SoFA section
    When  I navigate to Average Staff Numbers

    And   I enter value in row Teachers and column PE with "<TE_PE>" and column TIS with "<TE_TIS>"
    Then  I must see the Total Value for row  Teachers to be "<TE_T>"

    And   I enter value in row Management and column PE with "<MA_PE>" and column TIS with "<MA_TIS>"
    Then  I must see the Total Value for row Management to be "<MA_T>"

    And   I enter value in row Administration and support and column PE with "<AS_PE>" and column TE with "<AS_TE>"
    Then  I must see the Total Value for row Administration and Support to be "<AS_T>"

    And   I must see the Total value for column PE with "<PE_T>" and TIS with "<TIS_T>" and Total with "<TO_T>"

    And   I enter value in row PEGA Accounting office and column Male with "<v1>" and femalae with "<v2>"
    Then  I see the value in row PEGA Accounting Officer and column Total is "<v3>"

    And   I enter value in row PEGA Staff who Serve as Trustees and column Male with "<Staff_MA>" and column Female  with "<Staff_FE>"
    Then  I must see the Total value for row PEGA Staff who serve as Trustees to be "<Staff_Tot>"

    And   I enter value in row PEGA Teachers and column Male with "<v4>" and femalae with "<v5>"
    Then  I see the value in row PEGA Teachers and column Total is "<v6>"

    And   I enter value in row PEGA Management and column Male with "<v7>" and femalae with "<v8>"
    Then  I see the value in row PEGA Management and column Total is "<v9>"

    And   I enter value in row PEGA Administration and support  and column Male with "<v10>" and femalae with "<v11>"
    Then  I see the value in row PEGA Administration and support  and column Total is "<v12>"

    Then  I see the value in row PEGA Total and column male wit "<v13>" and female with "<v14>" and total with "<v15>"

    And   I enter  value in row Days lost to Sickness with "<Stf_Sick>"


    Examples:
      | TE_PE  | TE_TIS | TE_T      | MA_PE  | MA_TIS | MA_T      | AS_PE  | AS_TE  | AS_T      | PE_T      | TIS_T     | TO_T      | v1     | v2     | v3        | Staff_MA | Staff_FE | Staff_Tot | v4     | v5     | v6        | v7     | v8     | v9        | v10    | v11    | v12       | v13       | v14       | v15       | Stf_Sick   |
      | 1      | 1      | 2         | 1      | 1      | 2         | 1      | 1      | 2         | 3         | 3         | 6         | 1      | 1      | 2         | 1        | 1        | 2         | 1      | 1      | 2         | 1      | 1      | 2         | 1      | 1      | 2         | 5         | 5         | 10        | 11         |


  @smoke
  Scenario Outline: Verify Average Staff Numbers with INVALID credentials

    Given I am on SoFA section
    When  I navigate to Average Staff Numbers

    And   I enter value in row Teachers and column PE with "<TE_PE>" and column TIS with "<TE_TIS>"
    Then  I must see the Total Value for row  Teachers NOT to be "<TE_T>"

    And   I enter value in row Management and column PE with "<MA_PE>" and column TIS with "<MA_TIS>"
    Then  I must see the Total Value for row Management NOT to be "<MA_T>"

    And   I enter value in row Administration and support and column PE with "<AS_PE>" and column TE with "<AS_TE>"
    Then  I must see the Total Value for row Administration and Support NOT to be "<AS_T>"

    And   I must see the Total value for column PE is NOT "<PE_T>" and TIS is NOT "<TIS_T>" and Total with "<TO_T>"

    And   I enter value in row PEGA Accounting office and column Male with "<v1>" and femalae with "<v2>"
    Then  I see the value in row PEGA Accounting Officer and column Total is NOT "<v3>"

    And   I enter value in row PEGA Staff who Serve as Trustees and column Male with "<Staff_MA>" and column Female  with "<Staff_FE>"
    Then  I must see the Total value for row PEGA Staff who serve as Trustees is NOT "<Staff_Tot>"

    And   I enter value in row PEGA Teachers and column Male with "<v4>" and femalae with "<v5>"
    Then  I see the value in row PEGA Teachers and column Total is NOT "<v6>"

    And   I enter value in row PEGA Management and column Male with "<v7>" and femalae with "<v8>"
    Then  I see the value in row PEGA Management and column Total is NOT "<v9>"

    And   I enter value in row PEGA Administration and support  and column Male with "<v10>" and femalae with "<v11>"
    Then  I see the value in row PEGA Administration and support  and column Total is NOT "<v12>"

    Then  I see the value in row PEGA Total and column male is NOT "<v13>" and female is NOT "<v14>" and total with "<v15>"

    And   I enter  value in row Days lost to Sickness with "<Stf_Sick>"


    Examples:Data: INVALID
      | TE_PE  | TE_TIS | TE_T      | MA_PE  | MA_TIS | MA_T      | AS_PE  | AS_TE  | AS_T      | PE_T      | TIS_T     | TO_T      | v1     | v2     | v3        | Staff_MA | Staff_FE | Staff_Tot | v4     | v5     | v6        | v7     | v8     | v9        | v10    | v11    | v12       | v13       | v14       | v15       | Stf_Sick   |
      | 999999 | 999999 | 2,999,998 | 999999 | 999999 | 2,999,998 | 999999 | 999999 | 2,999,998 | 2,199,997 | 2,199,997 | 5,199,994 | 999999 | 999999 | 1,199,998 | 999999   | 999999   | 1,199,998 | 999999 | 999999 | 3,999,998 | 999999 | 999999 | 3,999,998 | 999999 | 999999 | 3,999,998 | 3,999,995 | 3,999,995 | 9,919,990 | 10,299,989 |



  @smoke
  Scenario Outline: Verify Average Staff Numbers with ERROR : Invalid data Format error

    Given I am on SoFA section
    When  I navigate to Average Staff Numbers
    And   I enter value in row Teachers and column PE with "<TE_PE>" and column TIS with "<TE_TIS>"
    And   I enter value in row Management and column PE with "<MA_PE>" and column TIS with "<MA_TIS>"
    And   I enter value in row Administration and support and column PE with "<AS_PE>" and column TE with "<AS_TE>"
    And   I must see the Total value for column PE is NOT "<PE_T>" and TIS is NOT "<TIS_T>" and Total with "<TO_T>"
    And   I enter value in row PEGA Accounting office and column Male with "<v1>" and femalae with "<v2>"
    And   I enter value in row PEGA Staff who Serve as Trustees and column Male with "<Staff_MA>" and column Female  with "<Staff_FE>"
    And   I enter value in row PEGA Teachers and column Male with "<v4>" and femalae with "<v5>"
    And   I enter value in row PEGA Management and column Male with "<v7>" and femalae with "<v8>"
    And   I enter value in row PEGA Administration and support  and column Male with "<v10>" and femalae with "<v11>"
    And   I enter  value in row Days lost to Sickness with "<Stf_Sick>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | TE_PE    | TE_TIS   | MA_PE    | MA_TIS   | AS_PE    | AS_TE    | PE_T     | TIS_T    | TO_T     | v1       | v2       | Staff_MA | Staff_FE | v4       | v5       | v7       | v8       | v10      | v11      | Stf_Sick | error |
      | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | &&&&&&   | 17    |



  @smoke
  Scenario Outline: Verify Average Staff Numbers with ERROR : Input Value Must be a positive number error

    Given I am on SoFA section
    When  I navigate to Average Staff Numbers
    And   I enter value in row Teachers and column PE with "<TE_PE>" and column TIS with "<TE_TIS>"
    And   I enter value in row Management and column PE with "<MA_PE>" and column TIS with "<MA_TIS>"
    And   I enter value in row Administration and support and column PE with "<AS_PE>" and column TE with "<AS_TE>"
    And   I must see the Total value for column PE is NOT "<PE_T>" and TIS is NOT "<TIS_T>" and Total with "<TO_T>"
    And   I enter value in row PEGA Accounting office and column Male with "<v1>" and femalae with "<v2>"
    And   I enter value in row PEGA Staff who Serve as Trustees and column Male with "<Staff_MA>" and column Female  with "<Staff_FE>"
    And   I enter value in row PEGA Teachers and column Male with "<v4>" and femalae with "<v5>"
    And   I enter value in row PEGA Management and column Male with "<v7>" and femalae with "<v8>"
    And   I enter value in row PEGA Administration and support  and column Male with "<v10>" and femalae with "<v11>"
    And   I enter  value in row Days lost to Sickness with "<Stf_Sick>"
    And   I wait for page to load
    Then  I see the number of errors starting stating The input value must be a positive number are "<error>"
    Examples:
      | TE_PE    | TE_TIS   | MA_PE    | MA_TIS   | AS_PE    | AS_TE    | PE_T     | TIS_T    | TO_T     | v1       | v2       | Staff_MA | Staff_FE | v4       | v5       | v7       | v8       | v10      | v11      | Stf_Sick | error |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 17    |