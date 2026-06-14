package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.ForexPage;
import testdata.TestDataProvider;

public class ForexTests extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return forexPage;
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/forex", expectedTitle,
                forexPage, ForexPage::clickCreateAccountBanner, "Forex");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/forex", expectedTitle,
                forexPage, ForexPage::clickTryDemoBanner, "Forex");
    }

    @Test(dataProvider = "allLanguagesWithoutChineseSimplified", dataProviderClass = TestDataProvider.class)
    public void testSignUpNowLink(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/forex", expectedTitle,
                forexPage, ForexPage::clickSignUpNowLink, "Forex");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/forex", expectedTitle,
                forexPage, ForexPage::clickCreateAccountButton, "Forex");
    }

    @Test(dataProvider = "onlyFrenchAndSpanish", dataProviderClass = TestDataProvider.class)
    public void testTryDemoButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/forex", expectedTitle,
                forexPage, ForexPage::clickTryDemoButton, "Forex");
    }
}