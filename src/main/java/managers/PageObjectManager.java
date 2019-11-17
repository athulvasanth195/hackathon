package managers;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {

    private WebDriver driver;
    private Eyes eyes;
    private loginPage loginPage;
    private dashboard dashboard;

    public PageObjectManager(WebDriver driver,Eyes eyes) {
        this.driver = driver;
        this.eyes=eyes;
    }
    public loginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new loginPage(driver,eyes) : loginPage;
    }

    public dashboard getDashboard() {
        return (dashboard == null) ? dashboard = new dashboard(driver,eyes) : dashboard;
    }
}