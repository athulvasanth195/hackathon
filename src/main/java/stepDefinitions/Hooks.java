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
		testContext.getApplitoolManager().closeEyes();
		testContext.getWebDriverManager().closeDriver();
	}

}
