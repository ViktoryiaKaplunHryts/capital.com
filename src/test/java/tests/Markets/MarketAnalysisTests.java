package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.MarketAnalysisPage;
import testdata.TestDataProvider;

public class MarketAnalysisTests extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return marketAnalysisPage;
    }

    @Test(dataProvider = "analysisPages", dataProviderClass = TestDataProvider.class)
    public void testTryDemo(String url, String expectedTitle) {
        testSignUpFormOnPage(url, expectedTitle,
                marketAnalysisPage, MarketAnalysisPage::clickTryDemoButton, "Market Analysis");
    }

    @Test(dataProvider = "analysisPages", dataProviderClass = TestDataProvider.class)
    public void testStartTradingTrump(String url, String expectedTitle) {
        testSignUpFormOnPage(url, expectedTitle,
                marketAnalysisPage, MarketAnalysisPage::clickStartTradingTrumpButton, "Market Analysis");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTradeButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/analysis", expectedTitle,
                marketAnalysisPage, MarketAnalysisPage::clickTradeButton, "Market Analysis");
    }
}