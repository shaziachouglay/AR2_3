package stepsDefinitions.stpes_sofa_staffAndTrustees;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;


public class Steps_NumberOfEmployeesWhoseEmolumentsExceed60K extends BaseTest {



    @When("^I navigate to Numbers of Employees Whose Emoluments Exceed £(\\d+)k section$")
    public void iNavigateToNumbersOfEmployeesWhoseEmolumentsExceed£KSection(int arg0) throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.StaffAndTrustees, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.NumbersofEmployeesWhose);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA));
        hardAssertion.assertTrue(numberExceedClass.isHeaderPresentAndDisplayedForNumbersOfEmployeesWhoseEmolumentsExceed_60kPage());
    }

    @And("^I select drop down value in ROW (\\d+) and column named Annualised emolument bands with \"([^\"]*)\"$")
    public void iSelectDropDownValueInROWAndColumnNamedAnnualisedEmolumentBandsWith(int arg0, String arg1) throws Throwable {
        numberExceedClass.selectDropDownOptionByRowNumber(arg0 , arg1 );
    }

    @And("^I enter value in ROW (\\d+) and column named Number with \"([^\"]*)\"$")
    public void iEnterValueInROWAndColumnNamedNumberWith(int arg0, String arg1) throws Throwable {
        numberExceedClass.setValueInNumberField(arg1);
    }

    @Then("^I can see the Total to be as \"([^\"]*)\"$")
    public void iCanSeeTheTotalToBeAs(String arg0) throws Throwable {
        numberExceedClass.getValueFromTotalButton();
        numberExceedClass.explicitWait(5000);
    }
}
