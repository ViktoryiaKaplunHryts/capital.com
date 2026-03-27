package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import testdata.TestDataProvider;

public class MarketAnalysisTests extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return marketsNavigation.goToMarketAnalysis();
    }

    @Test(dataProvider = "allCombinationsWithoutMongolianAndVietnamese", dataProviderClass = TestDataProvider.class)
    public void testTrade(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickTradeButton);
    }

    @Test(dataProvider = "allCombinationsWithoutMongolianAndVietnamese", dataProviderClass = TestDataProvider.class)
    public void testCreateYourAccount(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickCreateYourAccountButton);
    }

}