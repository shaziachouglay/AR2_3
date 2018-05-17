@fullAndFinal
Feature: Testing the Charitable Activities Support Cost page

  @sanity
  Scenario Outline: Checking the Charitable Activities Support page with valid credentials

    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    And   I enter value in Support Staff Pay Costs with "<SSPC>"
    And   I enter value in Staff Related Insurance field with "<SRI>"
    And   I enter value in Other Staff costs with "<OSC>"
    And   I enter value in Depreciation field with "<Depri>"
    And   I enter value in Amortisation field with "<Amor>"
    And   I enter value in Impairment field with "<Impa>"
    And   I enter value in Maintenance of Premises with "<MOP>"
    And   I enter value in Special Facilities with "<SpFaci>"
    And   I enter value in Cleaning and CareTaking with "<CAC>"
    And   I enter value in Operating  Lease Rentals Land B with "<OpLR_LB>"
    And   I enter value in Operating Lease Rentals Others with "<OpLR_Other>"
    And   I enter value in Rates wit "<Rates>"
    And   I enter value in Energy with "<energy>"
    And   I enter value in Risk Protection Arrangement Fees with "<RPAF>"
    And   I enter value in Security with "<Security>"
    And   I enter value in Transport with "<Transport>"
    And   I enter value in Catering with "<cat>"
    And   I enter value in Technology Cost with "<TC>"
    And   I enter value in other premises cost with "<OPC>"
    And   I enter value in PFI_Services Costs with "<PFI>"
    And   I enter value in Loan Interest paid to Dfe_EFA Family with "<LI_Fam>"
    And   I enter value in  Loan Interest paid to others with "<LI_Oth>"
    And   I enter value in Finance Leases Interest with "<FLI>"
    And   I enter value in Non Educational Consultancy with "<NEC>"
    And   I enter value in Legal and Professional with "<LAP>"
    And   I enter value in Auditor Costs Audit Fees with "<ACAF>"
    And   I enter value in Auditor Costs Internal Audit Fees with "<ACIAF>"
    And   I enter value in Auditor Costs Other fees with "<ACOAF>"
    And   I enter value in Governors Reimbursement Travel and Subsistence with "<GRTS>"
    And   I enter value in Travel expenses Travel and Subsistence with "<TE_TS>"
    And   I enter value in Governors Reimbursement Other with "<GRO>"
    And   I enter value in Trustees  Expenses Others  with "<TEO>"
    And   I enter value in Net Movement in Provisions During the year with "<NMP>"
    And   I enter gain or loss on Disposal of Tangible Fixed Assets "<GL_TFA>"
    And   I enter gain or loss on Disposal of Intangible fixed assets "<GL_IFA>"
    And   I enter Gain Or Loss on Disposal of Investments "<GL_I>"
    And   I enter Other Support Costs with "<OSP>"
    Then  I can see the total to be "<TOTAL>"


    Examples:
      | SSPC    | SRI     | OSC     | Depri   | Amor    | Impa    | MOP     | SpFaci  | CAC     | OpLR_LB | OpLR_Other | Rates   | energy  | RPAF    | Security | Transport | cat     | TC      | OPC     | PFI     | LI_Fam  | LI_Oth  | FLI     | NEC     | LAP     | ACAF    | ACIAF   | ACOAF   | GRTS    | TE_TS   | GRO     | TEO     | NMP     | GL_TFA  | GL_IFA  | GL_I    | OSP     | TOTAL       |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1          | 1       | 1       | 1       | 1        | 1         | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 37          |
      | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2          | 2       | 2       | 2       | 2        | 2         | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 74          |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10         | 10      | 10      | 10      | 10       | 10        | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 370         |
      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50         | 50      | 50      | 50      | 50       | 50        | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 1,850       |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100        | 100     | 100     | 100     | 100      | 100       | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 3,700       |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000       | 1000    | 1000    | 1000    | 1000     | 1000      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 37,000      |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999     | 999999  | 999999  | 999999  | 999999   | 999999    | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 36,999,963  |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998     | 999998  | 999998  | 999998  | 999998   | 999998    | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 36,999,926  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1         | -1      | -1      | -1      | -1       | -1        | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -37         |
      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2         | -2      | -2      | -2      | -2       | -2        | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -74         |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10        | -10     | -10     | -10     | -10      | -10       | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -370        |
      | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50        | -50     | -50     | -50     | -50      | -50       | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -1,850      |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100       | -100    | -100    | -100    | -100     | -100      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -3,700      |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000      | -1000   | -1000   | -1000   | -1000    | -1000     | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -37,000     |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999    | -999999 | -999999 | -999999 | -999999  | -999999   | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -36,999,963 |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998    | -999998 | -999998 | -999998 | -999998  | -999998   | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -36,999,926 |

  @sanity
  Scenario Outline: Testing SoFA > Expenditure . Charitable Activities Support Cost Page > INVALID Entries

    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    And   I enter value in Support Staff Pay Costs with "<SSPC>"
    And   I enter value in Staff Related Insurance field with "<SRI>"
    And   I enter value in Other Staff costs with "<OSC>"
    And   I enter value in Depreciation field with "<Depri>"
    And   I enter value in Amortisation field with "<Amor>"
    And   I enter value in Impairment field with "<Impa>"
    And   I enter value in Maintenance of Premises with "<MOP>"
    And   I enter value in Special Facilities with "<SpFaci>"
    And   I enter value in Cleaning and CareTaking with "<CAC>"
    And   I enter value in Operating  Lease Rentals Land B with "<OpLR_LB>"
    And   I enter value in Operating Lease Rentals Others with "<OpLR_Other>"
    And   I enter value in Rates wit "<Rates>"
    And   I enter value in Energy with "<energy>"
    And   I enter value in Risk Protection Arrangement Fees with "<RPAF>"
    And   I enter value in Security with "<Security>"
    And   I enter value in Transport with "<Transport>"
    And   I enter value in Catering with "<cat>"
    And   I enter value in Technology Cost with "<TC>"
    And   I enter value in other premises cost with "<OPC>"
    And   I enter value in PFI_Services Costs with "<PFI>"
    And   I enter value in Loan Interest paid to Dfe_EFA Family with "<LI_Fam>"
    And   I enter value in  Loan Interest paid to others with "<LI_Oth>"
    And   I enter value in Finance Leases Interest with "<FLI>"
    And   I enter value in Non Educational Consultancy with "<NEC>"
    And   I enter value in Legal and Professional with "<LAP>"
    And   I enter value in Auditor Costs Audit Fees with "<ACAF>"
    And   I enter value in Auditor Costs Internal Audit Fees with "<ACIAF>"
    And   I enter value in Auditor Costs Other fees with "<ACOAF>"
    And   I enter value in Governors Reimbursement Travel and Subsistence with "<GRTS>"
    And   I enter value in Travel expenses Travel and Subsistence with "<TE_TS>"
    And   I enter value in Governors Reimbursement Other with "<GRO>"
    And   I enter value in Trustees  Expenses Others  with "<TEO>"
    And   I enter value in Net Movement in Provisions During the year with "<NMP>"
    And   I enter gain or loss on Disposal of Tangible Fixed Assets "<GL_TFA>"
    And   I enter gain or loss on Disposal of Intangible fixed assets "<GL_IFA>"
    And   I enter Gain Or Loss on Disposal of Investments "<GL_I>"
    And   I enter Other Support Costs with "<OSP>"
    Then  I can see the total is NOT "<TOTAL>" in Charitable Activities Support Cost Page


    Examples: DATA SoFA > Expenditure . Charitable Activities Support Cost Page > INVALID Entries
      | SSPC    | SRI     | OSC     | Depri   | Amor    | Impa    | MOP     | SpFaci  | CAC     | OpLR_LB | OpLR_Other | Rates   | energy  | RPAF    | Security | Transport | cat     | TC      | OPC     | PFI     | LI_Fam  | LI_Oth  | FLI     | NEC     | LAP     | ACAF    | ACIAF   | ACOAF   | GRTS    | TE_TS   | GRO     | TEO     | NMP     | GL_TFA  | GL_IFA  | GL_I    | OSP     | TOTAL       |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1          | 1       | 1       | 1       | 1        | 1         | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 7           |
      | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2          | 2       | 2       | 2       | 2        | 2         | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 2       | 4           |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10         | 10      | 10      | 10      | 10       | 10        | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 70          |
      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50         | 50      | 50      | 50      | 50       | 50        | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 50      | 1,550       |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100        | 100     | 100     | 100     | 100      | 100       | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 3,500       |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000       | 1000    | 1000    | 1000    | 1000     | 1000      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 37,100      |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999     | 999999  | 999999  | 999999  | 999999   | 999999    | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 36,289,963  |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998     | 999998  | 999998  | 999998  | 999998   | 999998    | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 36,289,926  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1         | -1      | -1      | -1      | -1       | -1        | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -3          |
      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2         | -2      | -2      | -2      | -2       | -2        | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -2      | -7          |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10        | -10     | -10     | -10     | -10      | -10       | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -30         |
      | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50        | -50     | -50     | -50     | -50      | -50       | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -50     | -850        |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100       | -100    | -100    | -100    | -100     | -100      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -700        |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000      | -1000   | -1000   | -1000   | -1000    | -1000     | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1,000      |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999    | -999999 | -999999 | -999999 | -999999  | -999999   | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -36,599,953 |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998    | -999998 | -999998 | -999998 | -999998  | -999998   | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999698     |


  @sanity
  Scenario Outline: Testing SoFA > Expenditure . Charitable Activities Support Cost Page > Invalid data format
    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    And   I enter value in Support Staff Pay Costs with "<SSPC>"
    And   I enter value in Staff Related Insurance field with "<SRI>"
    And   I enter value in Other Staff costs with "<OSC>"
    And   I enter value in Depreciation field with "<Depri>"
    And   I enter value in Amortisation field with "<Amor>"
    And   I enter value in Impairment field with "<Impa>"
    And   I enter value in Maintenance of Premises with "<MOP>"
    And   I enter value in Special Facilities with "<SpFaci>"
    And   I enter value in Cleaning and CareTaking with "<CAC>"
    And   I enter value in Operating  Lease Rentals Land B with "<OpLR_LB>"
    And   I enter value in Operating Lease Rentals Others with "<OpLR_Other>"
    And   I enter value in Rates wit "<Rates>"
    And   I enter value in Energy with "<energy>"
    And   I enter value in Risk Protection Arrangement Fees with "<RPAF>"
    And   I enter value in Security with "<Security>"
    And   I enter value in Transport with "<Transport>"
    And   I enter value in Catering with "<cat>"
    And   I enter value in Technology Cost with "<TC>"
    And   I enter value in other premises cost with "<OPC>"
    And   I enter value in PFI_Services Costs with "<PFI>"
    And   I enter value in Loan Interest paid to Dfe_EFA Family with "<LI_Fam>"
    And   I enter value in  Loan Interest paid to others with "<LI_Oth>"
    And   I enter value in Finance Leases Interest with "<FLI>"
    And   I enter value in Non Educational Consultancy with "<NEC>"
    And   I enter value in Legal and Professional with "<LAP>"
    And   I enter value in Auditor Costs Audit Fees with "<ACAF>"
    And   I enter value in Auditor Costs Internal Audit Fees with "<ACIAF>"
    And   I enter value in Auditor Costs Other fees with "<ACOAF>"
    And   I enter value in Governors Reimbursement Travel and Subsistence with "<GRTS>"
    And   I enter value in Travel expenses Travel and Subsistence with "<TE_TS>"
    And   I enter value in Governors Reimbursement Other with "<GRO>"
    And   I enter value in Trustees  Expenses Others  with "<TEO>"
    And   I enter value in Net Movement in Provisions During the year with "<NMP>"
    And   I enter gain or loss on Disposal of Tangible Fixed Assets "<GL_TFA>"
    And   I enter gain or loss on Disposal of Intangible fixed assets "<GL_IFA>"
    And   I enter Gain Or Loss on Disposal of Investments "<GL_I>"
    And   I enter Other Support Costs with "<OSP>"
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"


    Examples: Invalid format Error Checking Data Set
      | SSPC    | SRI     | OSC     | Depri   | Amor    | Impa    | MOP     | SpFaci  | CAC     | OpLR_LB | OpLR_Other | Rates   | energy  | RPAF    | Security | Transport | cat     | TC      | OPC     | PFI     | LI_Fam  | LI_Oth  | FLI     | NEC     | LAP     | ACAF    | ACIAF   | ACOAF   | GRTS    | TE_TS   | GRO     | TEO     | NMP     | GL_TFA  | GL_IFA  | GL_I    | OSP     | error |
      | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^     | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^   | 1@£$%^    | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 37    |
      | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | *******    | ******* | ******* | ******* | *******  | *******   | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | ******* | 37    |
      | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££    | £££££££ | £££££££ | £££££££ | £££££££  | £££££££   | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | £££££££ | 37    |
      | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^    | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^  | ^^^^^^^   | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | ^^^^^^^ | 37    |
      | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%%    | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%%  | %%%%%%%   | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | %%%%%%% | 37    |
      | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123    | test123 | test123 | test123 | test123  | test123   | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | test123 | 37    |



  @sanity
  Scenario Outline: Testing SoFA > Expenditure . Charitable Activities Support Cost Page > Financial Data Range Error Checking
    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    And   I enter value in Support Staff Pay Costs with "<SSPC>"
    And   I enter value in Staff Related Insurance field with "<SRI>"
    And   I enter value in Other Staff costs with "<OSC>"
    And   I enter value in Depreciation field with "<Depri>"
    And   I enter value in Amortisation field with "<Amor>"
    And   I enter value in Impairment field with "<Impa>"
    And   I enter value in Maintenance of Premises with "<MOP>"
    And   I enter value in Special Facilities with "<SpFaci>"
    And   I enter value in Cleaning and CareTaking with "<CAC>"
    And   I enter value in Operating  Lease Rentals Land B with "<OpLR_LB>"
    And   I enter value in Operating Lease Rentals Others with "<OpLR_Other>"
    And   I enter value in Rates wit "<Rates>"
    And   I enter value in Energy with "<energy>"
    And   I enter value in Risk Protection Arrangement Fees with "<RPAF>"
    And   I enter value in Security with "<Security>"
    And   I enter value in Transport with "<Transport>"
    And   I enter value in Catering with "<cat>"
    And   I enter value in Technology Cost with "<TC>"
    And   I enter value in other premises cost with "<OPC>"
    And   I enter value in PFI_Services Costs with "<PFI>"
    And   I enter value in Loan Interest paid to Dfe_EFA Family with "<LI_Fam>"
    And   I enter value in  Loan Interest paid to others with "<LI_Oth>"
    And   I enter value in Finance Leases Interest with "<FLI>"
    And   I enter value in Non Educational Consultancy with "<NEC>"
    And   I enter value in Legal and Professional with "<LAP>"
    And   I enter value in Auditor Costs Audit Fees with "<ACAF>"
    And   I enter value in Auditor Costs Internal Audit Fees with "<ACIAF>"
    And   I enter value in Auditor Costs Other fees with "<ACOAF>"
    And   I enter value in Governors Reimbursement Travel and Subsistence with "<GRTS>"
    And   I enter value in Travel expenses Travel and Subsistence with "<TE_TS>"
    And   I enter value in Governors Reimbursement Other with "<GRO>"
    And   I enter value in Trustees  Expenses Others  with "<TEO>"
    And   I enter value in Net Movement in Provisions During the year with "<NMP>"
    And   I enter gain or loss on Disposal of Tangible Fixed Assets "<GL_TFA>"
    And   I enter gain or loss on Disposal of Intangible fixed assets "<GL_IFA>"
    And   I enter Gain Or Loss on Disposal of Investments "<GL_I>"
    And   I enter Other Support Costs with "<OSP>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"


    Examples: Financial Data Range Error Checking Data Set
      | SSPC     | SRI      | OSC      | Depri    | Amor     | Impa     | MOP      | SpFaci   | CAC      | OpLR_LB  | OpLR_Other | Rates    | energy   | RPAF     | Security | Transport | cat      | TC       | OPC      | PFI      | LI_Fam   | LI_Oth   | FLI      | NEC      | LAP      | ACAF     | ACIAF    | ACOAF    | GRTS     | TE_TS    | GRO      | TEO      | NMP      | GL_TFA   | GL_IFA   | GL_I     | OSP      | error    |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999    | 9999999  | 9999999  | 9999999  | 9999999  | 9999999   | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 37  |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999   | -9999999 | -9999999 | -9999999 | -9999999 | -9999999  | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | 37 |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000    | 1000000  | 1000000  | 1000000  | 1000000  | 1000000   | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 37  |
      | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000   | -1000000 | -1000000 | -1000000 | -1000000 | -1000000  | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | 37 |
#----------------------
  @smoke
  Scenario Outline: Checking the Charitable Activities Support page with valid credentials

    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    And   I enter value in Support Staff Pay Costs with "<SSPC>"
    And   I enter value in Staff Related Insurance field with "<SRI>"
    And   I enter value in Other Staff costs with "<OSC>"
    And   I enter value in Depreciation field with "<Depri>"
    And   I enter value in Amortisation field with "<Amor>"
    And   I enter value in Impairment field with "<Impa>"
    And   I enter value in Maintenance of Premises with "<MOP>"
    And   I enter value in Special Facilities with "<SpFaci>"
    And   I enter value in Cleaning and CareTaking with "<CAC>"
    And   I enter value in Operating  Lease Rentals Land B with "<OpLR_LB>"
    And   I enter value in Operating Lease Rentals Others with "<OpLR_Other>"
    And   I enter value in Rates wit "<Rates>"
    And   I enter value in Energy with "<energy>"
    And   I enter value in Risk Protection Arrangement Fees with "<RPAF>"
    And   I enter value in Security with "<Security>"
    And   I enter value in Transport with "<Transport>"
    And   I enter value in Catering with "<cat>"
    And   I enter value in Technology Cost with "<TC>"
    And   I enter value in other premises cost with "<OPC>"
    And   I enter value in PFI_Services Costs with "<PFI>"
    And   I enter value in Loan Interest paid to Dfe_EFA Family with "<LI_Fam>"
    And   I enter value in  Loan Interest paid to others with "<LI_Oth>"
    And   I enter value in Finance Leases Interest with "<FLI>"
    And   I enter value in Non Educational Consultancy with "<NEC>"
    And   I enter value in Legal and Professional with "<LAP>"
    And   I enter value in Auditor Costs Audit Fees with "<ACAF>"
    And   I enter value in Auditor Costs Internal Audit Fees with "<ACIAF>"
    And   I enter value in Auditor Costs Other fees with "<ACOAF>"
    And   I enter value in Governors Reimbursement Travel and Subsistence with "<GRTS>"
    And   I enter value in Travel expenses Travel and Subsistence with "<TE_TS>"
    And   I enter value in Governors Reimbursement Other with "<GRO>"
    And   I enter value in Trustees  Expenses Others  with "<TEO>"
    And   I enter value in Net Movement in Provisions During the year with "<NMP>"
    And   I enter gain or loss on Disposal of Tangible Fixed Assets "<GL_TFA>"
    And   I enter gain or loss on Disposal of Intangible fixed assets "<GL_IFA>"
    And   I enter Gain Or Loss on Disposal of Investments "<GL_I>"
    And   I enter Other Support Costs with "<OSP>"
    Then  I can see the total to be "<TOTAL>"


    Examples:
      | SSPC    | SRI     | OSC     | Depri   | Amor    | Impa    | MOP     | SpFaci  | CAC     | OpLR_LB | OpLR_Other | Rates   | energy  | RPAF    | Security | Transport | cat     | TC      | OPC     | PFI     | LI_Fam  | LI_Oth  | FLI     | NEC     | LAP     | ACAF    | ACIAF   | ACOAF   | GRTS    | TE_TS   | GRO     | TEO     | NMP     | GL_TFA  | GL_IFA  | GL_I    | OSP     | TOTAL       |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999     | 999999  | 999999  | 999999  | 999999   | 999999    | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 36,999,963  |

  @smoke
  Scenario Outline: Testing SoFA > Expenditure . Charitable Activities Support Cost Page > INVALID Entries

    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    And   I enter value in Support Staff Pay Costs with "<SSPC>"
    And   I enter value in Staff Related Insurance field with "<SRI>"
    And   I enter value in Other Staff costs with "<OSC>"
    And   I enter value in Depreciation field with "<Depri>"
    And   I enter value in Amortisation field with "<Amor>"
    And   I enter value in Impairment field with "<Impa>"
    And   I enter value in Maintenance of Premises with "<MOP>"
    And   I enter value in Special Facilities with "<SpFaci>"
    And   I enter value in Cleaning and CareTaking with "<CAC>"
    And   I enter value in Operating  Lease Rentals Land B with "<OpLR_LB>"
    And   I enter value in Operating Lease Rentals Others with "<OpLR_Other>"
    And   I enter value in Rates wit "<Rates>"
    And   I enter value in Energy with "<energy>"
    And   I enter value in Risk Protection Arrangement Fees with "<RPAF>"
    And   I enter value in Security with "<Security>"
    And   I enter value in Transport with "<Transport>"
    And   I enter value in Catering with "<cat>"
    And   I enter value in Technology Cost with "<TC>"
    And   I enter value in other premises cost with "<OPC>"
    And   I enter value in PFI_Services Costs with "<PFI>"
    And   I enter value in Loan Interest paid to Dfe_EFA Family with "<LI_Fam>"
    And   I enter value in  Loan Interest paid to others with "<LI_Oth>"
    And   I enter value in Finance Leases Interest with "<FLI>"
    And   I enter value in Non Educational Consultancy with "<NEC>"
    And   I enter value in Legal and Professional with "<LAP>"
    And   I enter value in Auditor Costs Audit Fees with "<ACAF>"
    And   I enter value in Auditor Costs Internal Audit Fees with "<ACIAF>"
    And   I enter value in Auditor Costs Other fees with "<ACOAF>"
    And   I enter value in Governors Reimbursement Travel and Subsistence with "<GRTS>"
    And   I enter value in Travel expenses Travel and Subsistence with "<TE_TS>"
    And   I enter value in Governors Reimbursement Other with "<GRO>"
    And   I enter value in Trustees  Expenses Others  with "<TEO>"
    And   I enter value in Net Movement in Provisions During the year with "<NMP>"
    And   I enter gain or loss on Disposal of Tangible Fixed Assets "<GL_TFA>"
    And   I enter gain or loss on Disposal of Intangible fixed assets "<GL_IFA>"
    And   I enter Gain Or Loss on Disposal of Investments "<GL_I>"
    And   I enter Other Support Costs with "<OSP>"
    Then  I can see the total is NOT "<TOTAL>" in Charitable Activities Support Cost Page


    Examples: DATA SoFA > Expenditure . Charitable Activities Support Cost Page > INVALID Entries
      | SSPC    | SRI     | OSC     | Depri   | Amor    | Impa    | MOP     | SpFaci  | CAC     | OpLR_LB | OpLR_Other | Rates   | energy  | RPAF    | Security | Transport | cat     | TC      | OPC     | PFI     | LI_Fam  | LI_Oth  | FLI     | NEC     | LAP     | ACAF    | ACIAF   | ACOAF   | GRTS    | TE_TS   | GRO     | TEO     | NMP     | GL_TFA  | GL_IFA  | GL_I    | OSP     | TOTAL       |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998     | 999998  | 999998  | 999998  | 999998   | 999998    | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 36,289,926  |


  @smoke
  Scenario Outline: Testing SoFA > Expenditure . Charitable Activities Support Cost Page > Invalid data format
    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    And   I enter value in Support Staff Pay Costs with "<SSPC>"
    And   I enter value in Staff Related Insurance field with "<SRI>"
    And   I enter value in Other Staff costs with "<OSC>"
    And   I enter value in Depreciation field with "<Depri>"
    And   I enter value in Amortisation field with "<Amor>"
    And   I enter value in Impairment field with "<Impa>"
    And   I enter value in Maintenance of Premises with "<MOP>"
    And   I enter value in Special Facilities with "<SpFaci>"
    And   I enter value in Cleaning and CareTaking with "<CAC>"
    And   I enter value in Operating  Lease Rentals Land B with "<OpLR_LB>"
    And   I enter value in Operating Lease Rentals Others with "<OpLR_Other>"
    And   I enter value in Rates wit "<Rates>"
    And   I enter value in Energy with "<energy>"
    And   I enter value in Risk Protection Arrangement Fees with "<RPAF>"
    And   I enter value in Security with "<Security>"
    And   I enter value in Transport with "<Transport>"
    And   I enter value in Catering with "<cat>"
    And   I enter value in Technology Cost with "<TC>"
    And   I enter value in other premises cost with "<OPC>"
    And   I enter value in PFI_Services Costs with "<PFI>"
    And   I enter value in Loan Interest paid to Dfe_EFA Family with "<LI_Fam>"
    And   I enter value in  Loan Interest paid to others with "<LI_Oth>"
    And   I enter value in Finance Leases Interest with "<FLI>"
    And   I enter value in Non Educational Consultancy with "<NEC>"
    And   I enter value in Legal and Professional with "<LAP>"
    And   I enter value in Auditor Costs Audit Fees with "<ACAF>"
    And   I enter value in Auditor Costs Internal Audit Fees with "<ACIAF>"
    And   I enter value in Auditor Costs Other fees with "<ACOAF>"
    And   I enter value in Governors Reimbursement Travel and Subsistence with "<GRTS>"
    And   I enter value in Travel expenses Travel and Subsistence with "<TE_TS>"
    And   I enter value in Governors Reimbursement Other with "<GRO>"
    And   I enter value in Trustees  Expenses Others  with "<TEO>"
    And   I enter value in Net Movement in Provisions During the year with "<NMP>"
    And   I enter gain or loss on Disposal of Tangible Fixed Assets "<GL_TFA>"
    And   I enter gain or loss on Disposal of Intangible fixed assets "<GL_IFA>"
    And   I enter Gain Or Loss on Disposal of Investments "<GL_I>"
    And   I enter Other Support Costs with "<OSP>"
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Invalid format Error Checking Data Set
      | SSPC    | SRI     | OSC     | Depri   | Amor    | Impa    | MOP     | SpFaci  | CAC     | OpLR_LB | OpLR_Other | Rates   | energy  | RPAF    | Security | Transport | cat     | TC      | OPC     | PFI     | LI_Fam  | LI_Oth  | FLI     | NEC     | LAP     | ACAF    | ACIAF   | ACOAF   | GRTS    | TE_TS   | GRO     | TEO     | NMP     | GL_TFA  | GL_IFA  | GL_I    | OSP     | error |
      | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^     | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^   | 1@£$%^    | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 1@£$%^  | 37    |

  @smoke
  Scenario Outline: Testing SoFA > Expenditure . Charitable Activities Support Cost Page > Financial Data Range Error Checking
    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    And   I enter value in Support Staff Pay Costs with "<SSPC>"
    And   I enter value in Staff Related Insurance field with "<SRI>"
    And   I enter value in Other Staff costs with "<OSC>"
    And   I enter value in Depreciation field with "<Depri>"
    And   I enter value in Amortisation field with "<Amor>"
    And   I enter value in Impairment field with "<Impa>"
    And   I enter value in Maintenance of Premises with "<MOP>"
    And   I enter value in Special Facilities with "<SpFaci>"
    And   I enter value in Cleaning and CareTaking with "<CAC>"
    And   I enter value in Operating  Lease Rentals Land B with "<OpLR_LB>"
    And   I enter value in Operating Lease Rentals Others with "<OpLR_Other>"
    And   I enter value in Rates wit "<Rates>"
    And   I enter value in Energy with "<energy>"
    And   I enter value in Risk Protection Arrangement Fees with "<RPAF>"
    And   I enter value in Security with "<Security>"
    And   I enter value in Transport with "<Transport>"
    And   I enter value in Catering with "<cat>"
    And   I enter value in Technology Cost with "<TC>"
    And   I enter value in other premises cost with "<OPC>"
    And   I enter value in PFI_Services Costs with "<PFI>"
    And   I enter value in Loan Interest paid to Dfe_EFA Family with "<LI_Fam>"
    And   I enter value in  Loan Interest paid to others with "<LI_Oth>"
    And   I enter value in Finance Leases Interest with "<FLI>"
    And   I enter value in Non Educational Consultancy with "<NEC>"
    And   I enter value in Legal and Professional with "<LAP>"
    And   I enter value in Auditor Costs Audit Fees with "<ACAF>"
    And   I enter value in Auditor Costs Internal Audit Fees with "<ACIAF>"
    And   I enter value in Auditor Costs Other fees with "<ACOAF>"
    And   I enter value in Governors Reimbursement Travel and Subsistence with "<GRTS>"
    And   I enter value in Travel expenses Travel and Subsistence with "<TE_TS>"
    And   I enter value in Governors Reimbursement Other with "<GRO>"
    And   I enter value in Trustees  Expenses Others  with "<TEO>"
    And   I enter value in Net Movement in Provisions During the year with "<NMP>"
    And   I enter gain or loss on Disposal of Tangible Fixed Assets "<GL_TFA>"
    And   I enter gain or loss on Disposal of Intangible fixed assets "<GL_IFA>"
    And   I enter Gain Or Loss on Disposal of Investments "<GL_I>"
    And   I enter Other Support Costs with "<OSP>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"


    Examples: Financial Data Range Error Checking Data Set
      | SSPC     | SRI      | OSC      | Depri    | Amor     | Impa     | MOP      | SpFaci   | CAC      | OpLR_LB  | OpLR_Other | Rates    | energy   | RPAF     | Security | Transport | cat      | TC       | OPC      | PFI      | LI_Fam   | LI_Oth   | FLI      | NEC      | LAP      | ACAF     | ACIAF    | ACOAF    | GRTS     | TE_TS    | GRO      | TEO      | NMP      | GL_TFA   | GL_IFA   | GL_I     | OSP      | error    |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999    | 9999999  | 9999999  | 9999999  | 9999999  | 9999999   | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 37  |

  @sofa_references
  Scenario: Testing References for SoFA Expenditure Charitable Activity Support Cost Page

    Given I am on SoFA section
    When  I navigate to Charitable Activities Support Cost Page
    Then  I see the correct references are displayed for "s_ex_CharActSupport" page of type "Label"
