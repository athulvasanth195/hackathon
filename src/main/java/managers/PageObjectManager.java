package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {

    private WebDriver driver;
    private loginPage loginPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }
    public loginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new loginPage(driver) : loginPage;
    }

}