package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.After;

public class Hooks {

	private TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@After
	public void AfterSteps() {
		try {
			testContext.getApplitoolManager().getEyes().close();
		} catch (Exception e) {
		} finally {
			testContext.getApplitoolManager().getEyes().abortIfNotClosed();
			testContext.getWebDriverManager().closeDriver();
		}
		testContext.getWebDriverManager().closeDriver();
	}

}
