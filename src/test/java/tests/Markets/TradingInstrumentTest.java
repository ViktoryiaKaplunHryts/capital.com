package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.TradingInstrumentPage;
import testdata.TestDataProvider;

public class TradingInstrumentTest extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return marketsPage;
    }

    private void testAction(String url, String expectedTitle,
                            Function<TradingInstrumentPage, SignUpPage> action) {
        testInstrumentAction(url + "/markets", expectedTitle, action);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testAddToFavourite(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::clickAddToFavouriteButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testNotification(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::clickNotificationButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testViewDetailedChart(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::clickViewDetailedChartButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testBuyButton(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::clickBuyButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testSellButton(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::clickSellButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testInfoLongIcon(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::hoverInfoLongAndClickGoToPlatform);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testInfoShortIcon(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::hoverInfoShortAndClickGoToPlatform);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTradeButton(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::clickTradeButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateYourAccountButton(String url, String expectedTitle) {
        testAction(url, expectedTitle, TradingInstrumentPage::clickCreateYourAccountButton);
    }
}