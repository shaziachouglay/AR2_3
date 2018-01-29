@fullAndFinal
Feature: Testing the Exit Package Non Civil Service Scheme section
  @sanity
  Scenario Outline: Checking Exit Package Non Civil Service Scheme Section with valid credentials.
    Given  I am on SoFA section
    And    I navigate to Exit Package Non Civil Service Scheme  section
    And    I select drop down band value with "<DD_BandValue>"
    And    I enter value in Row one and column name  Number of Compulsory Redundancies with "<R1_NCR>"
    And    I enter value in Row one and column name  value of Compulsory Redundancies Contractual wih "<R1_VCR_C>"
    And    I enter value in Row one and column name  value of Compulsory Redundancies Non Contractual with "<R1_VCR_NC>"
    And    I enter value in Row one and column name Number of Other Agreed Departures with "<R1_NOAD>"
    And    I enter value in row one and column name value of other Agreed Departures Contractual with "<R1_VOAD_C>"
    And    I enter value in row one and column name value of other Agreed Departures Non Contractual with "<R1_VOAD_NC>"
    Then   I can see the botton TOTAL row value for column name Number of Compulsory Redundancies is now "<T_NCR>"
    Then   I can see the botton TOTAL row value for column name value of Compulsory Redundancies Contractual is now "<T_VCR_C>"
    Then   I can see the botton TOTAL row value for column name value of Compulsory Redundancies Non Contractual is now "<T_VCR_NC>"
    Then   I can see the botton TOTAL row value for column name Other Agreed Departures is now "<T_OAD>"
    Then   I can see the botton TOTAL row value for column name value of other Agreed Departures Contractual is now "<T_OAD_C>"
    Then   I can see the botton TOTAL row valie for column name value of other Agreed Departures Non Contractual is now "<T_OAD_NC>"


    Examples: Valid Credentials for Exit Package Non Civil Service Section .
      | DD_BandValue    | R1_NCR  | R1_VCR_C | R1_VCR_NC | R1_NOAD | R1_VOAD_C | R1_VOAD_NC | T_NCR   | T_VCR_C | T_VCR_NC | T_OAD   | T_OAD_C | T_OAD_NC |
      | £10,001-£25,000 | 1       | 1        | 1         | 1       | 1         | 1          | 1       | 1       | 1        | 1       | 1       | 1        |
      | £10,001-£25,000 | 2       | 2        | 2         | 2       | 2         | 2          | 2       | 2       | 2        | 2       | 2       | 2        |
      | £10,001-£25,000 | 999999  | 999999   | 999999    | 999999  | 999999    | 999999     | 999,999 | 999,999 | 999,999  | 999,999 | 999,999 | 999,999  |
      | £10,001-£25,000 | 999,998 | 999,998  | 999,998   | 999,998 | 999,998   | 999,998    | 999,998 | 999,998 | 999,998  | 999,998 | 999,998 | 999,998  |
      | £10,001-£25,000 | 10      | 10       | 10        | 10      | 10        | 10         | 10      | 10      | 10       | 10      | 10      | 10       |
      | £10,001-£25,000 | 50      | 50       | 50        | 50      | 50        | 50         | 50      | 50      | 50       | 50      | 50      | 50       |
      | £10,001-£25,000 | 100     | 100      | 100       | 100     | 100       | 100        | 100     | 100     | 100      | 100     | 100     | 100      |
      | £10,001-£25,000 | 1,000   | 1,000    | 1,000     | 1,000   | 1,000     | 1,000      | 1,000   | 1,000   | 1,000    | 1,000   | 1,000   | 1,000    |


  @sanity
  Scenario Outline: Checking Exit Package Non Civil Service Scheme Section with number of instances.
    Given  I am on SoFA section
    And    I navigate to Exit Package Non Civil Service Scheme  section
    When   I click on add instance number of times "<numberOfTimes>"
    Then   I see the number of instances present are "<numberOfTimes>"
    And    I click the remove instance button "<numberOfTimes>"
    Then   I see the number of intsances are "<instance>"
    Examples:
      | numberOfTimes | instance |
      | 10            | 1        |

#    -------------

  @smoke
  Scenario Outline: Checking Exit Package Non Civil Service Scheme Section with valid credentials.
    Given  I am on SoFA section
    And    I navigate to Exit Package Non Civil Service Scheme  section
    And    I select drop down band value with "<DD_BandValue>"
    And    I enter value in Row one and column name  Number of Compulsory Redundancies with "<R1_NCR>"
    And    I enter value in Row one and column name  value of Compulsory Redundancies Contractual wih "<R1_VCR_C>"
    And    I enter value in Row one and column name  value of Compulsory Redundancies Non Contractual with "<R1_VCR_NC>"
    And    I enter value in Row one and column name Number of Other Agreed Departures with "<R1_NOAD>"
    And    I enter value in row one and column name value of other Agreed Departures Contractual with "<R1_VOAD_C>"
    And    I enter value in row one and column name value of other Agreed Departures Non Contractual with "<R1_VOAD_NC>"
    Then   I can see the botton TOTAL row value for column name Number of Compulsory Redundancies is now "<T_NCR>"
    Then   I can see the botton TOTAL row value for column name value of Compulsory Redundancies Contractual is now "<T_VCR_C>"
    Then   I can see the botton TOTAL row value for column name value of Compulsory Redundancies Non Contractual is now "<T_VCR_NC>"
    Then   I can see the botton TOTAL row value for column name Other Agreed Departures is now "<T_OAD>"
    Then   I can see the botton TOTAL row value for column name value of other Agreed Departures Contractual is now "<T_OAD_C>"
    Then   I can see the botton TOTAL row valie for column name value of other Agreed Departures Non Contractual is now "<T_OAD_NC>"

    Examples: Valid Credentials for Exit Package Non Civil Service Section .
      | DD_BandValue    | R1_NCR  | R1_VCR_C | R1_VCR_NC | R1_NOAD | R1_VOAD_C | R1_VOAD_NC | T_NCR   | T_VCR_C | T_VCR_NC | T_OAD   | T_OAD_C | T_OAD_NC |
      | £10,001-£25,000 | 1       | 1        | 1         | 1       | 1         | 1          | 1       | 1       | 1        | 1       | 1       | 1        |

  @smoke
  Scenario Outline: Checking Exit Package Non Civil Service Scheme Section with number of instances.
    Given  I am on SoFA section
    And    I navigate to Exit Package Non Civil Service Scheme  section
    When   I click on add instance number of times "<numberOfTimes>"
    Then   I see the number of instances present are "<numberOfTimes>"
    And    I click the remove instance button "<numberOfTimes>"
    Then   I see the number of intsances are "<instance>"
    Examples:
      | numberOfTimes | instance |
      | 5             | 1        |
