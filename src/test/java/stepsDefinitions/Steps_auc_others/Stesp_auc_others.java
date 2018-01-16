package stepsDefinitions.Steps_auc_others;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.assetUnderConstruction.auc_others.AUC_Others;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Stesp_auc_others extends BaseTest {

    @And("^I have navigated to the Others Section for AUC$")
    public void iHaveNavigatedToTheOthersSectionForAUC() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.Other);
        hardAssertion.assertTrue(auc_others.isHeaderPresentAndDisplayedForDonationsAUCPage(), "Failed to display the Header for AUC Others page");
    }

    @And("^I enter value in instance (\\d+) column one with \"([^\"]*)\" and column two with \"([^\"]*)\"$")
    public void iEnterValueInInstanceColumnOneWithAndColumnTwoWith(int instanceNumber, String arg1, String arg2) {
        auc_others.setValueByInstanceAndColumnNumber(instanceNumber, AUC_Others.columConstants.columnOne,arg1);
        auc_others.setValueByInstanceAndColumnNumber(instanceNumber, AUC_Others.columConstants.columnTwo,arg1);
    }

    @And("^I click on add new instance$")
    public void iClickOnAddNewInstance() {
        auc_others.clickOnAddNewInstanceButton();
    }

    @Then("^I see another insance is created$")
    public void iSeeAnotherInsanceIsCreated() {
        hardAssertion.assertTrue(auc_others.addNewInstance(),"FAILED to add new Instance.");
    }

    @Then("^I see the total is \"([^\"]*)\"$")
    public void iSeeTheTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_others.getValueOfTotalField(),arg0);
    }

    @And("^I add (\\d+) instances$")
    public void iAddInstances(int arg0) {
        auc_others.addMultipleInstances(arg0,"1");
    }

    @And("^I remove (\\d+) instances$")
    public void iRemoveInstances(int arg0) {
        auc_others.removeMultipleInstances();
    }

    @Then("^I see I am left with (\\d+) instance$")
    public void iSeeIAmLeftWithInstance(int arg0) {
        hardAssertion.assertTrue(auc_others.getNumberOFInstances()==1);
    }
}
