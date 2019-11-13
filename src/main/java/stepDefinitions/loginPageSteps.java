package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import managers.ApplitoolManager;
import pageObjects.loginPage;

public class loginPageSteps {

    TestContext testContext;
    loginPage loginpage;
    public loginPageSteps(TestContext context) {
        testContext = context;
        loginpage = testContext.getPageObjectManager().getLoginPage();
    }
    @Then("^the user is on the login page$")
    public void user_is_on_the_login_page() {
        loginpage.get_login_page();
    }

    @Then("the user is at login page")
    public void theUserIsAtLoginPage() {
        loginpage.assertLoginUrl();
    }

    @And("check whether header {string} is present in the page")
    public void checkWetherHeaderIsPresentInThePage(String header) {
        loginpage.WhetherHeaderIsPresentInThePage(header);
    }

    @And("check whether header image Blue and white circles are present in the page")
    public void checkWetherHeaderImageBlueAndWhiteCirclesArePresentInThePage() {
        loginpage.WhetherHeaderImageBlueAndWhiteCirclesArePresentInThePage();
    }

    @And("checks whether username field is present")
    public void checksWheatherUsernameFieldIsPresent() {
        loginpage.WhetherUsernameFieldIsPresent();
    }

    @And("checks whether password field is present")
    public void checksWheatherPasswordFieldIsPresent() {
        loginpage.WhetherPasswordFieldIsPresent();
    }

    @And("checks whether {string} login button is present")
    public void checksWhetherButtonIsPresent(String header) {
        loginpage.WhetherLoginButtonIsPresent(header);
    }

    @And("checks whether {string} check box is present")
    public void checksWhetherCheckBoxIsPresent(String header) {
        loginpage.WhetherCheckBoxIsPresent(header);
    }

    @And("checks whether all social media icons are present")
    public void checksWhetherAllSocialMediaIconsArePresent() {
        loginpage.WhetherAllSocialMediaIconsArePresent();
    }

    @And("check whether {string} password field header is present")
    public void checkWhetherPasswordFieldHeaderIsPresent(String header) {
        loginpage.WhetherPasswordFieldHeaderIsPresent(header);
    }

    @And("check whether {string} username field header is present")
    public void checkWheatherUsernameFieldHeaderIsPresent(String header) {
        loginpage.WhetherUsernameFieldHeaderIsPresent(header);
    }

    @And("checks whether username image is present")
    public void checksWhetherUsernameImageIsPresent() {
        loginpage.WhetherUsernameImageIsPresent();
    }

    @And("checks whether password image is present")
    public void checksWhetherPasswordImageIsPresent() {
        loginpage.WhetherPasswordImageIsPresent();
    }

    @And("compare login page UI using applitools")
    public void compareLoginPageScreenshotUsingApplitools() {
        loginpage.LoginPageScreenshotUsingApplitools();
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("password and username empty {string} error is shown")
    public void passwordAndUsernameEmptyErrorIsShown(String Warning) {
        loginpage.fieldEmtyWarmingIsShown(Warning);
    }

    @And("enter username {string} in username feild")
    public void enterUsernameInUsernameFeild(String username) {
        loginpage.enterUsername(username);
    }

    @Then("password is mandatory {string} error is shown")
    public void passwordIsMandatoryErrorIsShown(String Warning) {
        loginpage.passwordFeildEmptyWarningShown(Warning);
    }

    @And("enter password {string} in password field")
    public void enterPasswordInPasswordField(String password) {
        loginpage.enterPassword(password);
    }

    @Then("username is mandatory {string} error is shown")
    public void usernameIsMandatoryErrorIsShown(String Warning) {
        loginpage.usernameFeildEmptyWarningShown(Warning);
    }

    @Then("user is logged in")
    public void userIsLoggedIn() {
        loginpage.assertHomePageUrl();
    }

    @Then("compare password and username empty screenshot.")
    public void comparePasswordAndUsernameEmptyScreenshot() {
        loginpage.PasswordAndUsernameEmptyScreenshot();
    }

    @Then("compare password is mandatory screenshot")
    public void comparePasswordIsMandatoryScreenshot() {
        loginpage.PasswordIsMandatoryScreenshot();
    }

    @Then("compare usename is mandatory screenshot")
    public void compareUsenameIsMandatoryScreenshot() {
        loginpage.UsenameIsMandatoryScreenshot();
    }

    @Then("user is logged in by comparing dashboard layout")
    public void userIsLoggedInByComparingDashboardLayout() {
        loginpage.LoggedInByComparingDashboardLayout();
    }
}