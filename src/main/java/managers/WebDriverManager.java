package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverManager {
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    private WebDriver driver;


    public WebDriver getDriver() {
        if (driver == null)
            driver = createDriver();
        return driver;
    }

    private WebDriver createDriver() {
        driver = createLocalDriver();
        return driver;
    }

    private WebDriver createLocalDriver() {
                System.setProperty(CHROME_DRIVER_PROPERTY, "chromedriver");
                driver = new ChromeDriver();
        return driver;
        }

    public void closeDriver() {
        driver.quit();
    }
}
