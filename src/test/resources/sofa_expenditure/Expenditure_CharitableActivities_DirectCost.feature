@fullAndFinal
Feature: Testing the Charitable Activities Direct Cost Page

@sanity
  Scenario Outline: Testing Happy path for Charitable Activities Direct Cost Page : Valid entries

    Given I am on SoFA section
    When  I navigate to Charitable Activities Direct Cost Page
    Then  I enter value in Teaching and Educational Support Staff with "<TEducSupportStaff>"
    And   I enter value in Staff Expenses with "<StaffExp>"
    And   I enter value in field National Apprenticehip Levey expenditure with "<nationalExpLvy>"
    And   I enter value in Other Staff Costs with "<OtherStaffCosts>"
    And   I enter value in Depreciation with "<Depreciation>"
    And   I enter value in Amortisation with "<Amortisation>"
    And   I enter value in Impairment wit "<Impairment>"
    And   I enter value in Educational Supplies with "<EducationalSupp>"
    And   I enter value in Examination Fees with "<ExaminationFees>"
    And   I enter value in Staff Related Insurance with "<StaffRelatedInsurance>"
    And   I enter value in Technology Costs with "<TechnologyCosts>"
    And   I enter value in Educational Consultancy with "<EducationalConsultancy>"
    And   I enter value in Other Direct Costs with "<OtherDirectCosts>"
    Then  I can see the Total field is now populated with "<Total>"

    Examples:
      | TEducSupportStaff | StaffExp | OtherStaffCosts | Depreciation | Amortisation | Impairment | EducationalSupp | ExaminationFees | StaffRelatedInsurance | TechnologyCosts | EducationalConsultancy | OtherDirectCosts | Total       | nationalExpLvy |
      | 10                | 10       | 10              | 10           | 10           | 10         | 10              | 10              | 10                    | 10              | 10                     | 10               | 130         | 10             |
      | 500               | 500      | 500             | 500          | 500          | 500        | 500             | 500             | 500                   | 500             | 500                    | 500              | 6,500       | 500            |
      | 1                 | 1        | 1               | 1            | 1            | 1          | 1               | 1               | 1                     | 1               | 1                      | 1                | 13          | 1              |
      | 50                | 50       | 50              | 50           | 50           | 50         | 50              | 50              | 50                    | 50              | 50                     | 50               | 650         | 50             |
      | 200               | 200      | 200             | 200          | 200          | 200        | 200             | 200             | 200                   | 200             | 200                    | 200              | 2,600       | 200            |
      | 1000              | 1000     | 1000            | 1000         | 1000         | 1000       | 1000            | 1000            | 1000                  | 1000            | 1000                   | 1000             | 13,000      | 1000           |
      | 999998            | 999998   | 999998          | 999998       | 999998       | 999998     | 999998          | 999998          | 999998                | 999998          | 999998                 | 999998           | 12,999,974  | 999998         |
      | 999999            | 999999   | 999999          | 999999       | 999999       | 999999     | 999999          | 999999          | 999999                | 999999          | 999999                 | 999999           | 12,999,987  | 999999         |
      | -999998           | -999998  | -999998         | -999998      | -999998      | -999998    | -999998         | -999998         | -999998               | -999998         | -999998                | -999998          | -12,999,974 | -999998        |
      | -999999           | -999999  | -999999         | -999999      | -999999      | -999999    | -999999         | -999999         | -999999               | -999999         | -999999                | -999999          | -12,999,987 | -999999        |
      | 10                | 10       | 10              | 10           | 10           | 10         | 10              | 10              | 10                    | 10              | 10                     | 10               | 130         | 10             |
      | -500              | -500     | -500            | -500         | -500         | -500       | -500            | -500            | -500                  | -500            | -500                   | -500             | -6,500      | -500           |
      | -1                | -1       | -1              | -1           | -1           | -1         | -1              | -1              | -1                    | -1              | -1                     | -1               | -13         | -1             |
      | -50               | -50      | -50             | -50          | -50          | -50        | -50             | -50             | -50                   | -50             | -50                    | -50              | -650        | -50            |
      | -200              | -200     | -200            | -200         | -200         | -200       | -200            | -200            | -200                  | -200            | -200                   | -200             | -2,600      | -200           |
      | -1000             | -1000    | -1000           | -1000        | -1000        | -1000      | -1000           | -1000           | -1000                 | -1000           | -1000                  | -1000            | -13,000     | -1000          |

@sanity
  Scenario Outline: Testing Unhappy path for Charitable Activities Direct Cost Page : Invalid Entries

    Given I am on SoFA section
    When  I navigate to Charitable Activities Direct Cost Page
    Then  I enter value in Teaching and Educational Support Staff with "<TEducSupportStaff>"
    And   I enter value in Staff Expenses with "<StaffExp>"
    And   I enter value in field National Apprenticehip Levey expenditure with "<nationalExpLvy>"
    And   I enter value in Other Staff Costs with "<OtherStaffCosts>"
    And   I enter value in Depreciation with "<Depreciation>"
    And   I enter value in Amortisation with "<Amortisation>"
    And   I enter value in Impairment wit "<Impairment>"
    And   I enter value in Educational Supplies with "<EducationalSupp>"
    And   I enter value in Examination Fees with "<ExaminationFees>"
    And   I enter value in Staff Related Insurance with "<StaffRelatedInsurance>"
    And   I enter value in Technology Costs with "<TechnologyCosts>"
    And   I enter value in Educational Consultancy with "<EducationalConsultancy>"
    And   I enter value in Other Direct Costs with "<OtherDirectCosts>"
    Then  I can see the Total field is NOT populated with "<Total>" in Charitable Activities Direct Cost Page

    Examples: DATA: Charitable Activities Direct Cost Page: Invalid Entries
      | TEducSupportStaff | StaffExp | OtherStaffCosts | Depreciation | Amortisation | Impairment | EducationalSupp | ExaminationFees | StaffRelatedInsurance | TechnologyCosts | EducationalConsultancy | OtherDirectCosts | Total      | nationalExpLvy |
      | 10                | 10       | 10              | 10           | 10           | 10         | 10              | 10              | 10                    | 10              | 10                     | 10               | 13         | 10             |
      | 500               | 500      | 500             | 500          | 500          | 500        | 500             | 500             | 500                   | 500             | 500                    | 500              | 6,100      | 500            |
      | 1                 | 1        | 1               | 1            | 1            | 1          | 1               | 1               | 1                     | 1               | 1                      | 1                | 12         | 1              |
      | 50                | 50       | 50              | 50           | 50           | 50         | 50              | 50              | 50                    | 50              | 50                     | 50               | 654        | 50             |
      | 200               | 200      | 200             | 200          | 200          | 200        | 200             | 200             | 200                   | 200             | 200                    | 200              | 2,500      | 200            |
      | 1000              | 1000     | 1000            | 1000         | 1000         | 1000       | 1000            | 1000            | 1000                  | 1000            | 1000                   | 1000             | 13,500     | 1000           |
      | 999998            | 999998   | 999998          | 999998       | 999998       | 999998     | 999998          | 999998          | 999998                | 999998          | 999998                 | 999998           | 12,899,974 | 999998         |
      | 999999            | 999999   | 999999          | 999999       | 999999       | 999999     | 999999          | 999999          | 999999                | 999999          | 999999                 | 999999           | 12,99,987  | 999999         |
      | -999998           | -999998  | -999998         | -999998      | -999998      | -999998    | -999998         | -999998         | -999998               | -999998         | -999998                | -999998          | -12,99,974 | -999998        |
      | -999999           | -999999  | -999999         | -999999      | -999999      | -999999    | -999999         | -999999         | -999999               | -999999         | -999999                | -999999          | -12,99,987 | -999999        |
      | 10                | 10       | 10              | 10           | 10           | 10         | 10              | 10              | 10                    | 10              | 10                     | 10               | 13         | 10             |
      | -500              | -500     | -500            | -500         | -500         | -500       | -500            | -500            | -500                  | -500            | -500                   | -500             | -6,00      | -500           |
      | -1                | -1       | -1              | -1           | -1           | -1         | -1              | -1              | -1                    | -1              | -1                     | -1               | -3         | -1             |
      | -50               | -50      | -50             | -50          | -50          | -50        | -50             | -50             | -50                   | -50             | -50                    | -50              | -60        | -50            |
      | -200              | -200     | -200            | -200         | -200         | -200       | -200            | -200            | -200                  | -200            | -200                   | -200             | -2,00      | -200           |
      | -1000             | -1000    | -1000           | -1000        | -1000        | -1000      | -1000           | -1000           | -1000                 | -1000           | -1000                  | -1000            | -13,00     | -1000          |


@sanity
  Scenario Outline: Testing Happy path for Charitable Activities Direct Cost Page : Errors ; All Financial Data Range

    Given I am on SoFA section
    When  I navigate to Charitable Activities Direct Cost Page
    Then  I enter value in Teaching and Educational Support Staff with "<TEducSupportStaff>"
    And   I enter value in Staff Expenses with "<StaffExp>"
    And   I enter value in field National Apprenticehip Levey expenditure with "<nationalExpLvy>"
    And   I enter value in Other Staff Costs with "<OtherStaffCosts>"
    And   I enter value in Depreciation with "<Depreciation>"
    And   I enter value in Amortisation with "<Amortisation>"
    And   I enter value in Impairment wit "<Impairment>"
    And   I enter value in Educational Supplies with "<EducationalSupp>"
    And   I enter value in Examination Fees with "<ExaminationFees>"
    And   I enter value in Staff Related Insurance with "<StaffRelatedInsurance>"
    And   I enter value in Technology Costs with "<TechnologyCosts>"
    And   I enter value in Educational Consultancy with "<EducationalConsultancy>"
    And   I enter value in Other Direct Costs with "<OtherDirectCosts>"
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Data: Charitable Activities Direct Cost Page: All Financial Data Range
      | TEducSupportStaff | StaffExp | OtherStaffCosts | Depreciation | Amortisation | Impairment | EducationalSupp | ExaminationFees | StaffRelatedInsurance | TechnologyCosts | EducationalConsultancy | OtherDirectCosts | nationalExpLvy | error |
      | 9999999           | 9999999  | 9999999         | 9999999      | 9999999      | 9999999    | 9999999         | 9999999         | 9999999               | 9999999         | 9999999                | 9999999          | 9999999        | 13    |
      | 1000000           | 1000000  | 1000000         | 1000000      | 1000000      | 1000000    | 1000000         | 1000000         | 1000000               | 1000000         | 1000000                | 1000000          | 1000000        | 13    |
      | -1000000          | -1000000 | -1000000        | -1000000     | -1000000     | -1000000   | -1000000        | -1000000        | -1000000              | -1000000        | -1000000               | -1000000         | -1000000       | 13    |
      | -9999999          | -9999999 | -9999999        | -9999999     | -9999999     | -9999999   | -9999999        | -9999999        | -9999999              | -9999999        | -9999999               | -9999999         | -9999999       | 13    |


@sanity
  Scenario Outline: Testing Happy path for Charitable Activities Direct Cost Page : Errors ; Invalid Data Format

    Given I am on SoFA section
    When  I navigate to Charitable Activities Direct Cost Page
    Then  I enter value in Teaching and Educational Support Staff with "<TEducSupportStaff>"
    And   I enter value in Staff Expenses with "<StaffExp>"
    And   I enter value in field National Apprenticehip Levey expenditure with "<nationalExpLvy>"
    And   I enter value in Other Staff Costs with "<OtherStaffCosts>"
    And   I enter value in Depreciation with "<Depreciation>"
    And   I enter value in Amortisation with "<Amortisation>"
    And   I enter value in Impairment wit "<Impairment>"
    And   I enter value in Educational Supplies with "<EducationalSupp>"
    And   I enter value in Examination Fees with "<ExaminationFees>"
    And   I enter value in Staff Related Insurance with "<StaffRelatedInsurance>"
    And   I enter value in Technology Costs with "<TechnologyCosts>"
    And   I enter value in Educational Consultancy with "<EducationalConsultancy>"
    And   I enter value in Other Direct Costs with "<OtherDirectCosts>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Data: Charitable Activities Direct Cost Page: Invalid Data Format

      | TEducSupportStaff | StaffExp  | OtherStaffCosts | Depreciation | Amortisation | Impairment | EducationalSupp | ExaminationFees | StaffRelatedInsurance | TechnologyCosts | EducationalConsultancy | OtherDirectCosts | nationalExpLvy | error |
      | sample            | test      | 123£123         | £sample      | 1234&&45     | ^^^^^^^    | sample          | test            | 123£123               | £sample         | 1234&&45               | £sample          | £sample        | 13    |
      | £sample           | -8989sdds | 4545£$£         | $%^&*&       | !@£@SDS      | %%%%%%     | $$$$$           | ££££            | !!!!!                 | @@@@@           | ******                 | ((((((           | )))))          | 13    |
#-------------
  @smoke
  Scenario Outline: Testing Happy path for Charitable Activities Direct Cost Page : Valid entries

    Given I am on SoFA section
    When  I navigate to Charitable Activities Direct Cost Page
    Then  I enter value in Teaching and Educational Support Staff with "<TEducSupportStaff>"
    And   I enter value in Staff Expenses with "<StaffExp>"
    And   I enter value in field National Apprenticehip Levey expenditure with "<nationalExpLvy>"
    And   I enter value in Other Staff Costs with "<OtherStaffCosts>"
    And   I enter value in Depreciation with "<Depreciation>"
    And   I enter value in Amortisation with "<Amortisation>"
    And   I enter value in Impairment wit "<Impairment>"
    And   I enter value in Educational Supplies with "<EducationalSupp>"
    And   I enter value in Examination Fees with "<ExaminationFees>"
    And   I enter value in Staff Related Insurance with "<StaffRelatedInsurance>"
    And   I enter value in Technology Costs with "<TechnologyCosts>"
    And   I enter value in Educational Consultancy with "<EducationalConsultancy>"
    And   I enter value in Other Direct Costs with "<OtherDirectCosts>"
    Then  I can see the Total field is now populated with "<Total>"

    Examples:
      | TEducSupportStaff | StaffExp | OtherStaffCosts | Depreciation | Amortisation | Impairment | EducationalSupp | ExaminationFees | StaffRelatedInsurance | TechnologyCosts | EducationalConsultancy | OtherDirectCosts | Total       | nationalExpLvy |
      | 999999            | 999999   | 999999          | 999999       | 999999       | 999999     | 999999          | 999999          | 999999                | 999999          | 999999                 | 999999           | 12,999,987  | 999999         |

  @smoke
  Scenario Outline: Testing Unhappy path for Charitable Activities Direct Cost Page : Invalid Entries

    Given I am on SoFA section
    When  I navigate to Charitable Activities Direct Cost Page
    Then  I enter value in Teaching and Educational Support Staff with "<TEducSupportStaff>"
    And   I enter value in Staff Expenses with "<StaffExp>"
    And   I enter value in field National Apprenticehip Levey expenditure with "<nationalExpLvy>"
    And   I enter value in Other Staff Costs with "<OtherStaffCosts>"
    And   I enter value in Depreciation with "<Depreciation>"
    And   I enter value in Amortisation with "<Amortisation>"
    And   I enter value in Impairment wit "<Impairment>"
    And   I enter value in Educational Supplies with "<EducationalSupp>"
    And   I enter value in Examination Fees with "<ExaminationFees>"
    And   I enter value in Staff Related Insurance with "<StaffRelatedInsurance>"
    And   I enter value in Technology Costs with "<TechnologyCosts>"
    And   I enter value in Educational Consultancy with "<EducationalConsultancy>"
    And   I enter value in Other Direct Costs with "<OtherDirectCosts>"
    Then  I can see the Total field is NOT populated with "<Total>" in Charitable Activities Direct Cost Page

    Examples: DATA: Charitable Activities Direct Cost Page: Invalid Entries
      | TEducSupportStaff | StaffExp | OtherStaffCosts | Depreciation | Amortisation | Impairment | EducationalSupp | ExaminationFees | StaffRelatedInsurance | TechnologyCosts | EducationalConsultancy | OtherDirectCosts | Total      | nationalExpLvy |
      | 999998            | 999998   | 999998          | 999998       | 999998       | 999998     | 999998          | 999998          | 999998                | 999998          | 999998                 | 999998           | 12,899,974 | 999998         |


  @smoke
  Scenario Outline: Testing Happy path for Charitable Activities Direct Cost Page : Errors ; All Financial Data Range

    Given I am on SoFA section
    When  I navigate to Charitable Activities Direct Cost Page
    Then  I enter value in Teaching and Educational Support Staff with "<TEducSupportStaff>"
    And   I enter value in Staff Expenses with "<StaffExp>"
    And   I enter value in field National Apprenticehip Levey expenditure with "<nationalExpLvy>"
    And   I enter value in Other Staff Costs with "<OtherStaffCosts>"
    And   I enter value in Depreciation with "<Depreciation>"
    And   I enter value in Amortisation with "<Amortisation>"
    And   I enter value in Impairment wit "<Impairment>"
    And   I enter value in Educational Supplies with "<EducationalSupp>"
    And   I enter value in Examination Fees with "<ExaminationFees>"
    And   I enter value in Staff Related Insurance with "<StaffRelatedInsurance>"
    And   I enter value in Technology Costs with "<TechnologyCosts>"
    And   I enter value in Educational Consultancy with "<EducationalConsultancy>"
    And   I enter value in Other Direct Costs with "<OtherDirectCosts>"
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Data: Charitable Activities Direct Cost Page: All Financial Data Range
      | TEducSupportStaff | StaffExp | OtherStaffCosts | Depreciation | Amortisation | Impairment | EducationalSupp | ExaminationFees | StaffRelatedInsurance | TechnologyCosts | EducationalConsultancy | OtherDirectCosts | nationalExpLvy | error |
      | 9999999           | 9999999  | 9999999         | 9999999      | 9999999      | 9999999    | 9999999         | 9999999         | 9999999               | 9999999         | 9999999                | 9999999          | 9999999        | 13    |

  @smoke
  Scenario Outline: Testing Happy path for Charitable Activities Direct Cost Page : Errors ; Invalid Data Format

    Given I am on SoFA section
    When  I navigate to Charitable Activities Direct Cost Page
    Then  I enter value in Teaching and Educational Support Staff with "<TEducSupportStaff>"
    And   I enter value in Staff Expenses with "<StaffExp>"
    And   I enter value in field National Apprenticehip Levey expenditure with "<nationalExpLvy>"
    And   I enter value in Other Staff Costs with "<OtherStaffCosts>"
    And   I enter value in Depreciation with "<Depreciation>"
    And   I enter value in Amortisation with "<Amortisation>"
    And   I enter value in Impairment wit "<Impairment>"
    And   I enter value in Educational Supplies with "<EducationalSupp>"
    And   I enter value in Examination Fees with "<ExaminationFees>"
    And   I enter value in Staff Related Insurance with "<StaffRelatedInsurance>"
    And   I enter value in Technology Costs with "<TechnologyCosts>"
    And   I enter value in Educational Consultancy with "<EducationalConsultancy>"
    And   I enter value in Other Direct Costs with "<OtherDirectCosts>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Data: Charitable Activities Direct Cost Page: Invalid Data Format

      | TEducSupportStaff | StaffExp  | OtherStaffCosts | Depreciation | Amortisation | Impairment | EducationalSupp | ExaminationFees | StaffRelatedInsurance | TechnologyCosts | EducationalConsultancy | OtherDirectCosts | nationalExpLvy | error |
      | sample            | test      | 123£123         | £sample      | 1234&&45     | ^^^^^^^    | sample          | test            | 123£123               | £sample         | 1234&&45               | £sample          | £sample        | 13    |


