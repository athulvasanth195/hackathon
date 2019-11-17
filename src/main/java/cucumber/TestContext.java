package cucumber;

import managers.ApplitoolManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    private ApplitoolManager applitoolManager;

    public TestContext() {
        webDriverManager = new WebDriverManager();
        applitoolManager = new ApplitoolManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver(),applitoolManager.getEyes());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ApplitoolManager getApplitoolManager() {
        return applitoolManager;
    }
}