package stepsDefinitions.steps_sofa_expenditure;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.expenditure.OtherExpenditure;

public class Steps_OtherExpenditure extends BaseTest {

    @When("^I enter value in field Other Expenditure not Attributable to a Specific Expenditure Heading with \"([^\"]*)\"$")
    public void iEnterValueInFieldOtherExpenditureNotAttributableToASpecificExpenditureHeadingWith(String arg0) {
        otherExpenditure.setValueInInputFieldByLabelNameInOtherExpenditurePage(OtherExpenditure.OtherExpenditureLabelNames.OtherExpenditureNotAttributableToSpecificExpenditureHeading,arg0);
    }

    @And("^I navigate to the Other Expenditure Page$")
    public void iNavigateToTheOtherExpenditurePage() {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.Expenditure, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.OtherExpenditure);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(otherExpenditure.isHeaderPresentAndDisplayedForOtherExpenditurePage(), "Failed to display the Header for Capital Grants DfE ESFA page");
    }
}
