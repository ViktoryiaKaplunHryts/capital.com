package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

public class MarketAnalysisTests extends BaseMarketsTest {

    @Test(dataProvider = "withoutMongolianVietnamese", dataProviderClass = TestDataProvider.class)
    public void testTradeButton(String url, String expected) {
        openPage(url);
        closePopups();

        MarketsNavigator nav = new MarketsNavigator(driver, wait);
        nav.goToMarketAnalysis();

        WidgetPage widget = new WidgetPage(driver, wait);
        String actualText = widget.clickTradeButton();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "withoutMongolianVietnamese", dataProviderClass = TestDataProvider.class)
    public void testCreateYourAccount(String url, String expected) {
        openPage(url);
        closePopups();

        MarketsNavigator nav = new MarketsNavigator(driver, wait);
        nav.goToMarketAnalysis();

        ReadyToJoinBlockPage readyToJoinBlock = new ReadyToJoinBlockPage(driver, wait);
        String actualText = readyToJoinBlock.clickCreateYourAccount();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }
}