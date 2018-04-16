package stepsDefinitions.standigData_steps;

import baseTest.BaseTest;
import cucumber.api.java.en.Given;
import pageObjects.standingData.WelcomeScreen_dev;

public class StandingDataForDev extends BaseTest {

    @Given("^I am on dev environment as preparer$")
    public void iAmOnDevEnvironmentAsPreparer() {
        softAssert.assertTrue(welcomeScreen_dev.isUserNameDisplayed());
        hardAssertion.assertTrue(welcomeScreen_dev.isWelcomePageHeaderPresentAndDisplayed(), "The Welcome Screen Page Header was not displayed");
        welcomeScreen_dev.getUserNameFromInputFieldInWelcomeScreenPage();
        welcomeScreen_dev.getAccountReturnVersionNumber();

        welcomeScreen_dev.clickYesOnUserRole(WelcomeScreen_dev.USER_ROLE.PREPARER);
        welcomeScreen_dev.clickYesOnUserRoleNO(WelcomeScreen_dev.USER_ROLE.APPROVER);
        welcomeScreen_dev.clickYesOnUserRoleNO(WelcomeScreen_dev.USER_ROLE.EXTERNALAUDITOR);
        welcomeScreen_dev.clickYesOnUserRoleNO(WelcomeScreen_dev.USER_ROLE.HELPDESK);

        welcomeScreen_dev.clickOnSaveAndNextInWelcomePage();
        welcomeScreen_dev.waitForPageLoadToComplete();
        hardAssertion.assertTrue(academyTrustInformationPage.isHeaderPresentAndDisplayedForAcademyTrustInformationPage(),"The Academy Trust Information Page Header was not displayed");
        academyTrustInformationPage.selectDropDownAcademyTrustTypeInAcademyTrustInformationPage();
        academyTrustInformationPage.clickOnSaveAndNextInAcademyTrustInformationPage();

        hardAssertion.assertTrue(academy.isHeaderPresentAndDisplayedForAcademyPage(), "The Academy Page Header was not displayed");
        academy.explicitWait(2000);
        academy.clickOnSaveAndNextInAcademyPage();

        hardAssertion.assertTrue(academyInformation.isHeaderPresentAndDisplayedForAcademyInformationPage(), "The Academy Information Page Header was not displayed");
        academyInformation.selectDropDownInAcademyInformationPage();
        academyInformation.clickOnSaveAndNextInAcademyInformationPage();

        hardAssertion.assertTrue(questionnaire.isHeaderPresentAndDisplayedForQuestionnairePage());
        questionnaire.clickOnSaveAndNextInQuestionnairePage();
    }
}
