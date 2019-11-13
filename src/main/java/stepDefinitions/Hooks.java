package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.After;

public class gitHooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}
