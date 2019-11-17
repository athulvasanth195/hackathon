package pageObjects;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.Eyes;
import com.google.common.collect.Ordering;
import managers.ApplitoolManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class dashboard {
    private WebDriver driver;
    private Eyes eyes;
    private static BatchInfo batch3;
    private static BatchInfo batch4;

    public dashboard(WebDriver driver,Eyes eyes) {
        this.driver = driver;
        this.eyes = eyes;

        PageFactory.initElements(driver, this);

        batch3=new BatchInfo("Table Sort Test");
        batch4=new BatchInfo("Canvas Chart Test");
    }
    @FindBy(id = "amount")
    private WebElement tab_amount;
    @FindBys(@FindBy(xpath = "//*[@id=\"transactionsTable\"]/tbody/tr/td[5]/span"))
    private List<WebElement> values_amount;
    @FindBy(id = "showExpensesChart")
    private WebElement lnk_compareExpense;
    @FindBy(id = "addDataset")
    private WebElement lnk_showDataNextYear;


    public void clickAmountTab() {
        tab_amount.click();
    }

    public void AmountsAreInAccendingOrder() {
        List<Integer> amounts = new ArrayList<Integer>();
        for (WebElement amount: values_amount) {
            System.out.println(amount.getText().replaceAll(" USD","").replaceAll(" ",""));
            amounts.add((int)(Double.parseDouble(amount.getText().replaceAll(" USD","").replaceAll(" ","").replace(",",""))));
        }
        boolean sorted = Ordering.natural().isOrdered(amounts);
        Assert.assertTrue(sorted, "Amount sort failed.Values are in random order");
    }


    public void SortedDataUsingApplittols() {
        eyes.setBatch(batch3);
        eyes.setForceFullPageScreenshot(true);
        eyes.open(driver, "Hackathon",
                "Dashboard amount sort functionality");
        eyes.checkWindow("sorting");
    }

    public void ChartDataUsingApplittols() {
        eyes.setBatch(batch4);
        eyes.setForceFullPageScreenshot(true);
        eyes.open(driver, "Hackathon",
                "Chart data 2018 and 2019");
        eyes.checkWindow("chart 2018");
    }

    public void clickShowExpenseChartLink() {
        lnk_compareExpense.click();
    }

    public void clickShowDataForNextYearButton() {
        lnk_showDataNextYear.click();
    }

    public void newChartDataShownUsingApplittols() {
        eyes.setBatch(batch4);
        eyes.setForceFullPageScreenshot(true);
        eyes.checkWindow("chart 2019");
    }
}
