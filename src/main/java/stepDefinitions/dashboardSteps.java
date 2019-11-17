package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.dashboard;

public class dashboardSteps {

   private  TestContext testContext;
    private dashboard dashboard;

    public dashboardSteps(TestContext context) {
        testContext = context;
        dashboard = testContext.getPageObjectManager().getDashboard();
    }

    @And("clicks on amount tab")
    public void clocksOnAmountTab() {
        dashboard.clickAmountTab();
    }

    @Then("amounts are in ascending order")
    public void assertAmountsAreInAscendingOrder() {
        dashboard.AmountsAreInAccendingOrder();
    }

    @Then("compare sorted data using applittols")
    public void compareSortedDataUsingApplittols() {
        dashboard.SortedDataUsingApplittols();
    }

    @Then("compare chart data using applittols")
    public void compareChartDataUsingApplittols() {
        dashboard.ChartDataUsingApplittols();
    }

    @And("click on show expense chart link")
    public void clickOnShowExpenceChartLink() {
        dashboard.clickShowExpenseChartLink();
    }

    @And("click on show data for next year button")
    public void clickOnShowDataForNextYearButton() {
        dashboard.clickShowDataForNextYearButton();
    }

    @Then("assert new chart data shown using applittols")
    public void assertChartDataShownUsingApplittols() {
        dashboard.newChartDataShownUsingApplittols();
    }
}