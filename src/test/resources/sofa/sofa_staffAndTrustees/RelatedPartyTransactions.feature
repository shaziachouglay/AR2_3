@fullAndFinal
Feature: testing Related Party Transactions Page
  @sanity
  Scenario Outline: SoFA> Staff and Trustees > Related Party Transactions > VALID Entries

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i1>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i1>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i1>"

    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i2>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i2>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i2>"

    And   I select a value "<value1>" from the drop down menu for row number "<i3>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i3>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i3>"

    Then  I can see the Row named Total value for Paid as Trustees is "<Total_Trustees>"
    Then  I can see the Row named Total value for Paid as Staff is "<Total_Staff>"

    Examples: testing with valid data
      | value1          | i1 | Num_Paid_Trustees1 | Num_Paid_Staff1 | i2 | Total_Trustees | Total_Staff | i3 |
      | £60,001-£70,000 | 1  | 10                 | 10              | 2  | 30             | 30          | 3  |
      | £60,001-£70,000 | 1  | 20                 | 20              | 2  | 60             | 60          | 3  |
      | £60,001-£70,000 | 1  | 999999             | 999999          | 2  | 2,999,997      | 2,999,997   | 3  |
      | £60,001-£70,000 | 1  | 999998             | 999998          | 2  | 2,999,994      | 2,999,994   | 3  |
  @sanity
  Scenario Outline: SoFA> Staff and Trustees > Related Party Transactions > INVALID Entries

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i1>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i1>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i1>"

    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i2>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i2>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i2>"

    And   I select a value "<value1>" from the drop down menu for row number "<i3>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i3>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i3>"

    Then  I can see the Row named Total value for Paid as Trustees is not "<Total_Trustees>"
    Then  I can see the Row named Total value for Paid as Staff is not "<Total_Staff>"

    Examples: Testing with Invalid Data
      | value1          | i1 | Num_Paid_Trustees1 | Num_Paid_Staff1 | i2 | Total_Trustees | Total_Staff | i3 |
      | £60,001-£70,000 | 1  | 10                 | 10              | 2  | 20             | 20          | 3  |
      | £60,001-£70,000 | 1  | 20                 | 20              | 2  | 20             | 20          | 3  |
      | £60,001-£70,000 | 1  | 999999             | 999999          | 2  | 1,999,997      | 1,999,997   | 3  |
      | £60,001-£70,000 | 1  | 999998             | 999998          | 2  | 1,999,995      | 1,999,994   | 3  |
      | £60,001-£70,000 | 1  | -10                | -10             | 2  | -20            | -20         | 3  |
      | £60,001-£70,000 | 1  | -20                | -20             | 2  | -20            | -20         | 3  |
      | £60,001-£70,000 | 1  | -999999            | -999999         | 2  | -1,999,997     | -1,999,997  | 3  |
      | £60,001-£70,000 | 1  | -999998            | -999998         | 2  | -1,999,995     | -1,999,994  | 3  |
  @sanity
  Scenario Outline: SoFA> Staff and Trustees > Related Party Transactions > Errros : All Financial Data Range

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i1>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i1>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i1>"

    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i2>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i2>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i2>"

    And   I select a value "<value1>" from the drop down menu for row number "<i3>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i3>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i3>"

    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"

    Examples: Testing for Errors , All Financial Data Range
      | value1          | i1 | Num_Paid_Trustees1 | Num_Paid_Staff1 | i2 | i3 | errors |
      | £60,001-£70,000 | 1  | 99999999           | 99999999        | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | 10000000           | 10000000        | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | -99999999          | -99999999       | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | -10000000          | -10000000       | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | -99999998          | -99999998       | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | 99999998           | 99999998        | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | -99999998          | -99999998       | 2  | 3  | 6      |

  @sanity
  Scenario Outline: SoFA> Staff and Trustees > Related Party Transactions > Errros : Invalid Data Format

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i1>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i1>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i1>"

    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i2>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i2>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i2>"

    And   I select a value "<value1>" from the drop down menu for row number "<i3>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i3>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i3>"

    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"

    Examples: Testing for Errors , Invalid Data Format
      | value1          | i1 | Num_Paid_Trustees1 | Num_Paid_Staff1 | i2 | i3 | errors |
      | £60,001-£70,000 | 1  | -sampletest        | -£££21213.000   | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | £££££££££          | *********       | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | &&&&&&&&&          | &&&&&&&&&       | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | !@£$^%%$£          | !@£$^%%$£       | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | &*&*&*&*&          | &*&*&*&*&       | 2  | 3  | 6      |
      | £60,001-£70,000 | 1  | ^%^&&^%^^          | @£$$£$£@£       | 2  | 3  | 6      |

  @sanity
  Scenario Outline: testing related Party Transaction adding multiple instances

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on add instance number of times "<numberOfInstancesToBeAdded>" Related Party Transactions Page
    Then  I see the number of instances present are "<numberOfInstancesToBeAdded>" in Related Party Transactions Page
    And   I click on remove link for instance "<numberOfInstancesToBeAdded>" in Related Party Transactions Page
    Then  I see the number of instances present are "<oneInstance>" in numberOfInstancesToBeAdded
    Examples:
      | numberOfInstancesToBeAdded | oneInstance |
      | 10                         | 1           |
      | 20                         | 1           |
#--------------------

  @smoke
  Scenario Outline: SoFA> Staff and Trustees > Related Party Transactions > VALID Entries

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on Add instance button
    And   I select a value "<value1>" from the drop down menu for row number "<i1>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i1>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i1>"
    And   I click on Add instance button
    And   I select a value "<value1>" from the drop down menu for row number "<i2>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i2>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i2>"
    And   I select a value "<value1>" from the drop down menu for row number "<i3>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i3>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i3>"
    Then  I can see the Row named Total value for Paid as Trustees is "<Total_Trustees>"
    Then  I can see the Row named Total value for Paid as Staff is "<Total_Staff>"

    Examples: testing with valid data
      | value1          | i1 | Num_Paid_Trustees1 | Num_Paid_Staff1 | i2 | Total_Trustees | Total_Staff | i3 |
      | £60,001-£70,000 | 1  | 10                 | 10              | 2  | 30             | 30          | 3  |

  @smoke
  Scenario Outline: SoFA> Staff and Trustees > Related Party Transactions > INVALID Entries

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on Add instance button
    And   I select a value "<value1>" from the drop down menu for row number "<i1>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i1>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i1>"
    And   I click on Add instance button
    And   I select a value "<value1>" from the drop down menu for row number "<i2>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i2>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i2>"
    And   I select a value "<value1>" from the drop down menu for row number "<i3>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i3>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i3>"
    Then  I can see the Row named Total value for Paid as Trustees is not "<Total_Trustees>"
    Then  I can see the Row named Total value for Paid as Staff is not "<Total_Staff>"
    Examples: Testing with Invalid Data
      | value1          | i1 | Num_Paid_Trustees1 | Num_Paid_Staff1 | i2 | Total_Trustees | Total_Staff | i3 |
      | £60,001-£70,000 | 1  | 10                 | 10              | 2  | 20             | 20          | 3  |


  @smoke
  Scenario Outline: SoFA> Staff and Trustees > Related Party Transactions > Errros : All Financial Data Range

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i1>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i1>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i1>"

    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i2>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i2>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i2>"

    And   I select a value "<value1>" from the drop down menu for row number "<i3>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i3>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i3>"

    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"

    Examples: Testing for Errors , All Financial Data Range
      | value1          | i1 | Num_Paid_Trustees1 | Num_Paid_Staff1 | i2 | i3 | errors |
      | £60,001-£70,000 | 1  | 99999999           | 99999999        | 2  | 3  | 6      |


  @smoke
  Scenario Outline: SoFA> Staff and Trustees > Related Party Transactions > Errros : Invalid Data Format

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i1>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i1>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i1>"

    And   I click on Add instance button

    And   I select a value "<value1>" from the drop down menu for row number "<i2>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i2>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i2>"

    And   I select a value "<value1>" from the drop down menu for row number "<i3>"
    And   I enter value in Number paid as Trustees with "<Num_Paid_Trustees1>" for row number "<i3>"
    And   I enter value in Number paid as Staff with "<Num_Paid_Staff1>" for row number "<i3>"

    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"

    Examples: Testing for Errors , Invalid Data Format
      | value1          | i1 | Num_Paid_Trustees1 | Num_Paid_Staff1 | i2 | i3 | errors |
      | £60,001-£70,000 | 1  | -sampletest        | -£££21213.000   | 2  | 3  | 6      |


  @smoke
  Scenario Outline: testing related Party Transaction adding multiple instances

    Given I am on SoFA section
    Then  I navigate to Related Party Transactions section
    And   I click on add instance number of times "<numberOfInstancesToBeAdded>" Related Party Transactions Page
    Then  I see the number of instances present are "<numberOfInstancesToBeAdded>" in Related Party Transactions Page
    And   I click on remove link for instance "<numberOfInstancesToBeAdded>" in Related Party Transactions Page
    Then  I see the number of instances present are "<oneInstance>" in numberOfInstancesToBeAdded
    Examples:
      | numberOfInstancesToBeAdded | oneInstance |
      | 2                          | 1           |


  @sofa_references
    Scenario: testing references for SOFA Staff and Trustees Related Party Transactions
      Given I am on SoFA section
      Then  I navigate to Related Party Transactions section
      Then I see the correct references are displayed for "s_st_RelatedPartyTransc" page of type "Table"

