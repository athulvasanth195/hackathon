package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.loginPage;

public class loginPageSteps {

private TestContext testContext;
 private loginPage loginpage;

    public loginPageSteps(TestContext context) {
        testContext = context;
        loginpage = testContext.getPageObjectManager().getLoginPage();
    }
    @Given("^Jack is on the login page$")
    public void user_is_on_the_login_page() {
        loginpage.get_login_page();
    }

    @Then("header {string} is present in the page")
    public void checkWhetherHeaderIsPresentInThePage(String header) {
        loginpage.WhetherHeaderIsPresentInThePage(header);
    }

    @Then("header image Blue and white circles are present in the page")
    public void checkWhetherHeaderImageBlueAndWhiteCirclesArePresentInThePage() {
        loginpage.WhetherHeaderImageBlueAndWhiteCirclesArePresentInThePage();
    }

    @Then("username field is present")
    public void checksWhetherUsernameFieldIsPresent() {
        loginpage.WhetherUsernameFieldIsPresent();
    }

    @Then("password field is present")
    public void checksWhetherPasswordFieldIsPresent() {
        loginpage.WhetherPasswordFieldIsPresent();
    }

    @Then("{string} login button is present")
    public void checksWhetherButtonIsPresent(String header) {
        loginpage.WhetherLoginButtonIsPresent(header);
    }

    @Then("{string} check box is present")
    public void checksWhetherCheckBoxIsPresent(String header) {
        loginpage.WhetherCheckBoxIsPresent(header);
    }

    @Then("all social media icons are present")
    public void checksWhetherAllSocialMediaIconsArePresent() {
        loginpage.WhetherAllSocialMediaIconsArePresent();
    }

    @Then("{string} password field header is present")
    public void checkWhetherPasswordFieldHeaderIsPresent(String header) {
        loginpage.WhetherPasswordFieldHeaderIsPresent(header);
    }

    @Then("{string} username field header is present")
    public void checkWheatherUsernameFieldHeaderIsPresent(String header) {
        loginpage.WhetherUsernameFieldHeaderIsPresent(header);
    }

    @And("username image is present")
    public void checksWhetherUsernameImageIsPresent() {
        loginpage.WhetherUsernameImageIsPresent();
    }

    @And("password image is present")
    public void checksWhetherPasswordImageIsPresent() {
        loginpage.WhetherPasswordImageIsPresent();
    }

    @And("login page screenshot is in align with applitools baseline")
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

    @And("enter username {string} in username field")
    public void enterUsernameInUsernameField(String username) {
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

    @Then("Jack is on website dashboard")
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

    @Then("compare username is mandatory screenshot")
    public void compareUsernameIsMandatoryScreenshot() {
        loginpage.UsenameIsMandatoryScreenshot();
    }

    @Then("user is logged in by comparing dashboard layout")
    public void userIsLoggedInByComparingDashboardLayout() {
        loginpage.LoggedInByComparingDashboardLayout();
    }

    @And("clear username field")
    public void clearUsernameFeild() {
        loginpage.UsernameFieldclear();}

}