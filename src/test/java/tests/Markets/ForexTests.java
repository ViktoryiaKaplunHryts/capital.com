package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import testdata.TestDataProvider;

public class ForexTests extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return marketsNavigation.goToForex();
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickCreateAccountBanner);
    }

    @Test(dataProvider = "allCombinationsWithoutChineseSimplified", dataProviderClass = TestDataProvider.class)
    public void testSignUpNow(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickSignUpLink);
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testCreateAccount(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickCreateAccountButton);
    }

    @Test(dataProvider = "onlyFrenchAndSpanish", dataProviderClass = TestDataProvider.class)
    public void testTryDemo(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickTryDemoButton);
    }
}