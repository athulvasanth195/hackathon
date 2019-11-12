package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
}