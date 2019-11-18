package pageObjects;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class loginPage {
    private WebDriver driver;
    private Eyes eyes;
    private static BatchInfo batch1;
    private static BatchInfo batch2;

    public loginPage(WebDriver driver,Eyes eyes) {
        this.driver = driver;
        this.eyes = eyes;

        PageFactory.initElements(driver, this);

        batch1=new BatchInfo("Login page UI");
        batch2=new BatchInfo("Login page functionality");
    }

    @FindBy(className = "auth-header")
    private WebElement header_login;
    @FindBy(xpath = "//a[@href=\"index.html\"]//img")
    private WebElement img_header;
    @FindBy(id = "username")
    private WebElement txt_bx_username;
    @FindBy(xpath = "//div[@class=\"pre-icon os-icon os-icon-user-male-circle\"]")
    private WebElement img_username;
    @FindBy(xpath = "//*[@id=\"username\"]/preceding-sibling::label")
    private WebElement header_username;
    @FindBy(id = "password")
    private WebElement txt_bx_password;
    @FindBy(xpath = "//*[@id=\"password\"]/preceding-sibling::label")
    private WebElement header_password;
    @FindBy(xpath = "//div[@class=\"pre-icon os-icon os-icon-fingerprint\"]")
    private WebElement img_password;
    @FindBy(id = "log-in")
    private WebElement btn_login;
    @FindBy(xpath = "//label[@class = \"form-check-label\"]/input")
    private WebElement chbox_remeberme_text;
    @FindBy(className = "form-check-label")
    private WebElement chbox_remeberme;
    @FindBy(xpath = "//*[@style=\"text-align:center\"]/a[1]/img")
    private WebElement img_twitter;
    @FindBy(xpath = "//*[@style=\"text-align:center\"]/a[2]/img")
    private WebElement img_facebook;
    @FindBy(xpath = "//*[@style=\"text-align:center\"]/a[3]/img")
    private WebElement img_linkdin;
    @FindBy(xpath = "//*[contains(@id, \"random_id\")]")
    private WebElement war_login;


    public void get_login_page() {
                driver.get("https://demo.applitools.com/hackathonV2.html");
    }

    public void WhetherHeaderIsPresentInThePage(String header) {
        Assert.assertTrue(header_login.isDisplayed(), "Missing login page header 'Login Form'");
        Assert.assertEquals(header_login.getText(), header, "Login page header text mismatch found");
    }

    public void WhetherHeaderImageBlueAndWhiteCirclesArePresentInThePage() {
        Assert.assertTrue(img_header.isDisplayed(), "Missing login page header image");
        Assert.assertNotEquals(img_header.getAttribute("naturalWidth"), "0", "Login page header image broken");
    }

    public void WhetherUsernameFieldIsPresent() {
        Assert.assertTrue(txt_bx_username.isDisplayed(), "Missing username text box");
    }

    public void WhetherPasswordFieldIsPresent() {
        Assert.assertTrue(txt_bx_password.isDisplayed(), "Missing password text box");
    }

    public void WhetherLoginButtonIsPresent(String header) {
        Assert.assertTrue(btn_login.isDisplayed(), "Missing log in button");
        Assert.assertEquals(btn_login.getText(), header, "Login button name mismatch found");
    }

    public void WhetherCheckBoxIsPresent(String header) {
        Assert.assertTrue(chbox_remeberme_text.isDisplayed(), "Missing remember me checkbox");
        Assert.assertTrue(chbox_remeberme_text.isDisplayed(), "Missing remember me checkbox description");
        Assert.assertEquals(chbox_remeberme.getText(), header, "remember me check box description in correct");
    }

    public void WhetherAllSocialMediaIconsArePresent() {
        Assert.assertTrue(img_twitter.isDisplayed(), "Missing twitter login image");
        Assert.assertNotEquals(img_twitter.getAttribute("naturalWidth"), "0", "twitter login image broken");
        Assert.assertTrue(img_facebook.isDisplayed(), "Missing facebook login image");
        Assert.assertNotEquals(img_facebook.getAttribute("naturalWidth"), "0", "facebook login image broken");
        Assert.assertTrue(img_linkdin.isDisplayed(), "Missing linkdin login image");
        Assert.assertNotEquals(img_linkdin.getAttribute("naturalWidth"), "0", "linkdin login image broken");
    }

    public void WhetherPasswordFieldHeaderIsPresent(String header) {
        Assert.assertTrue(header_password.isDisplayed(), "Missing password text box");
        Assert.assertEquals(header_password.getText(), header, "Password field header mismatch found");
    }

    public void WhetherUsernameFieldHeaderIsPresent(String header) {
        Assert.assertTrue(header_username.isDisplayed(), "Missing username text box");
        Assert.assertEquals(header_username.getText(), header, "username field header mismatch found");
    }

    public void WhetherUsernameImageIsPresent() {
        Assert.assertTrue(img_username.isDisplayed(), "Missing username login image");
    }

    public void WhetherPasswordImageIsPresent() {
        Assert.assertTrue(img_password.isDisplayed(), "Missing password image");
    }

    public void LoginPageScreenshotUsingApplitools() {
       eyes.setBatch(batch1);
        eyes.setForceFullPageScreenshot(true);
        eyes.open(driver, "Hackathon",
                "login UI components");
        eyes.checkWindow("Login Window");


    }

    public void clickLoginButton() {
        btn_login.click();
    }

    public void fieldEmtyWarmingIsShown(String warning) {
        Assert.assertEquals(war_login.getText(), warning, "username and password empty warning mismatch found");
    }

    public void enterUsername(String username) {
        txt_bx_username.clear();
        txt_bx_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_bx_password.clear();
        txt_bx_password.sendKeys(password);
    }

    public void passwordFeildEmptyWarningShown(String warning) {
        Assert.assertEquals(war_login.getText(), warning, "password field empty warning mismatch found");
    }

    public void usernameFeildEmptyWarningShown(String warning) {
        Assert.assertEquals(war_login.getText(), warning, "username field empty warning mismatch found");
        txt_bx_password.clear();
    }

    public void assertHomePageUrl() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.applitools.com/hackathonApp.html","User login failed. dashbord URL mismatch found");
    }

    public void PasswordAndUsernameEmptyScreenshot() {
       eyes.setBatch(batch2);
       eyes.setForceFullPageScreenshot(true);
       eyes.open(driver, "Hackathon",
                "Login page username and password empty");
       eyes.checkWindow("username and password empty");

    }

    public void PasswordIsMandatoryScreenshot() {
       eyes.setBatch(batch2);
       eyes.setForceFullPageScreenshot(true);
       eyes.checkWindow("password empty");

    }

    public void UsenameIsMandatoryScreenshot() {
       eyes.setBatch(batch2);
       eyes.setForceFullPageScreenshot(true);
       eyes.checkWindow("username empty");

    }

    public void LoggedInByComparingDashboardLayout() {
       eyes.setBatch(batch2);
       eyes.setForceFullPageScreenshot(true);
       eyes.checkWindow("dashboard layout");

    }

    public void UsernameFieldclear() {
        txt_bx_username.clear();
    }

}
